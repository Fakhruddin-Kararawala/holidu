package com.holidu.interview.assignment.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holidu.interview.assignment.service.TreeDataProcessor;

/**
 * Rest controller to get get data regarding trees
 */
@RestController
public class TreeDataController {

	/**
	 * Processor
	 * */
	@Autowired
	private TreeDataProcessor treeDataProcessor;

	/**
	 * @see {@link TreeDataProcesser#countInArea}
	 */
	@RequestMapping("/tree/filter/{cordinates}/{radius}")
	public Map<String, Long> getData(@PathVariable String coordinates, @PathVariable double radius) {
		return treeDataProcessor.countInArea(coordinates, radius);
	}

}
