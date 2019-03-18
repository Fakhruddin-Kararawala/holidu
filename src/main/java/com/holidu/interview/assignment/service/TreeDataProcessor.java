package com.holidu.interview.assignment.service;

import java.util.Map;

/**
 * Data Processor for Trees
 */
public interface TreeDataProcessor {

	/**
	 * Find all trees inside a circle with the given coordinates and radius
	 * 
	 * @param x
	 *            x coordinate of the center of circle
	 * @param y
	 *            y coordinate of the center of circle
	 * @param radius
	 *            radius of circle
	 * @return tree's common name with number of counts under that area
	 */
	Map<String, Long> countInArea(String coordinates, double radius);

}
