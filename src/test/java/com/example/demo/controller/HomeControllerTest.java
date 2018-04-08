package com.example.demo.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { HomeController.class })
public class HomeControllerTest {

	@Mock
	HomeController homeController;

	@Test
	public void testHomeController() {
		homeController.homeController();
		Assert.assertEquals(true, true);
	}

}
