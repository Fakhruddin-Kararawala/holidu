package com.holidu.interview.assignment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.holidu.interview.assignment.model.TreeData;
import com.holidu.interview.assignment.service.TreeDataService;

/**
 * Data Source Impl
 */
@Service
public class TreeDataServiceImpl implements TreeDataService {

	/**
	 * Get Source URL from properties file
	 */
	@Value("${tree.data.url}")
	private String treeDataUrl;

	/**
	 * if data is frequently updated on the source, this must cached
	 */
	@Override
	public List<TreeData> getData() throws IllegalArgumentException {
		return new RestTemplate()
				.exchange(
						treeDataUrl, 
						HttpMethod.GET, 
						null, 
						new ParameterizedTypeReference<List<TreeData>>() {
				}).getBody();
	}

}
