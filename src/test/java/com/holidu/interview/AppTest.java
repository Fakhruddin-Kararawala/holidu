package com.holidu.interview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.holidu.interview.assignment.App;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class})
public class AppTest {

	@Test
	public void contextLoads() {}
}
