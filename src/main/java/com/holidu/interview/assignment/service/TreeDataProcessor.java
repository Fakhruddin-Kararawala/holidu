package com.holidu.interview.assignment.service;

import java.util.Map;

/**
 * Data Processor for Trees
 */
public interface TreeDataProcessor {

	/**
	 * Find all trees inside a circle with the given coordinates and radius
	 * @param coordinates
	 * @param radius
	 * @return tree's common name with number of counts under that area
	 */
	Map<String, Long> countInArea(String coordinates, double radius);

}
