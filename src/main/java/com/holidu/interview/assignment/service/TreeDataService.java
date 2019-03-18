package com.holidu.interview.assignment.service;

import java.util.List;

import com.holidu.interview.assignment.model.TreeData;

/**
 * Data Source
 */
public interface TreeDataService {
	
	/**
	 * @return Trees Data from source
	 */
	List<TreeData> getData();

}
