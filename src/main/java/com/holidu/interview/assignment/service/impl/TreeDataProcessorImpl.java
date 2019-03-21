package com.holidu.interview.assignment.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holidu.interview.assignment.model.TreeData;
import com.holidu.interview.assignment.service.TreeDataProcessor;
import com.holidu.interview.assignment.service.TreeDataService;

/**
 * 
 * Process Tree Data
 *
 */
@Service
public class TreeDataProcessorImpl implements TreeDataProcessor {
	
	private static final Logger LOG = LoggerFactory.getLogger(TreeDataProcessorImpl.class);

	/**
	 * Data Source
	 */
	@Autowired
	private TreeDataService treeDataService;

	/**
	 * hold data in a list to avoid frequent calls to data source, caching can
	 * also be done or we can use solr to store this data to get frequent result.
	 */
	private List<TreeData> data;

	
	/* (non-Javadoc)
	 * @see com.holidu.interview.assignment.service.TreeDataProcessor#countInArea(double, double, double)
	 */
	@Override
	public Map<String, Long> countInArea(String coordinates, double radius) {
		// store data locally
		if (null == data) {
			this.data = treeDataService.getData();
		}
		// send square of radius to avoid calculating multiple times inside
		// stream
		double rad_sqr = Math.pow(radius, 2);
		// assume coordinates come in (x,y) format 
		String[] split = coordinates.split(",");
		double x = Double.parseDouble(split[0]);
		double y = Double.parseDouble(split[1]);
		LOG.debug("trees without common name: "
				+ this.data.parallelStream().filter(tree -> null == tree.getSpc_common()).count());
		// since some of the tree entries are missing common names, it would be
		// good to add a filter while fetching data
		return this.data.parallelStream() // create parallel stream for list
				.filter(treeData -> null != treeData.getSpc_common() // check if tree contains common name
						&& isInsideArea(treeData.getX_sp(), treeData.getY_sp(), x, y, rad_sqr)) // check if tree lies inside circle
				.collect(Collectors.groupingBy(TreeData::getSpc_common, Collectors.counting())); // convert the filtered data into map
	}

	/**
	 * Calculate if the tree lies inside the given circle.
	 * 
	 * @param tree_x
	 *            x coordinate of tree
	 * @param tree_y
	 *            y coordinate of tree
	 * @param circle_x
	 *            x coordinate of the center of circle
	 * @param circle_y
	 *            y coordinate of the center of circle
	 * @param circle_radius_sqr
	 *            square of the radius of the circle
	 * @return true if tree does, false otherwise
	 */
	private static final boolean isInsideArea(double tree_x, double tree_y, double circle_x, double circle_y,
			double circle_radius_sqr) {
		return Math.pow((tree_x - circle_x), 2) + Math.pow((tree_y - circle_y), 2) <= circle_radius_sqr;
	}

}
