package com.bol.controllers;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HomeTest {

	@Test
	public void testHome() throws Exception {
		HomeController home = new HomeController();
		MockMvc mock = MockMvcBuilders.standaloneSetup(home).build();
		mock.perform(MockMvcRequestBuilders.get("/")).andExpect(
				MockMvcResultMatchers.view().name("index"));
	}
}
