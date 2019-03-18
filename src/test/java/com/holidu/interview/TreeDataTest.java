package com.holidu.interview;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.holidu.interview.assignment.service.TreeDataProcessor;
import com.holidu.interview.assignment.service.TreeDataService;
import com.holidu.interview.assignment.service.impl.TreeDataProcessorImpl;
import com.holidu.interview.assignment.service.impl.TreeDataServiceImpl;

/**
 * Test Services
 * 
 * @TODO check if two separate cases are required for testing source and
 *       processor
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { TreeDataServiceImpl.class, TreeDataProcessorImpl.class })
public class TreeDataTest {

	@Autowired
	private TreeDataService treeDataService;

	@Autowired
	private TreeDataProcessor treeDataProcessor;

	/**
	 * Test data source of trees
	 */
	@Test
	public void dataSourceTest() {
		Assert.assertNotNull(this.treeDataService.getData());
	}

	/**
	 * Test data processor
	 */
	@Test
	public void mockRadius() {
		Assert.assertNotNull(this.treeDataProcessor.countInArea(0, 0, 10000000));
	}
}
