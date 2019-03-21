package com.holidu.interview;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.holidu.interview.assignment.App;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = {App.class})
@AutoConfigureMockMvc
public class TreeDataIntegrationTest {

	@Autowired
    private MockMvc mockMvc;
    
	@Test
	public void testSophora() throws Exception {
		mockMvc.perform(
				MockMvcRequestBuilders.get("/tree/filter/100,500/1000000").
				contentType(MediaType.APPLICATION_JSON)).
				andExpect(status().isOk()).
				andExpect(MockMvcResultMatchers.jsonPath("$.Sophora", is(6)));
	}
}
