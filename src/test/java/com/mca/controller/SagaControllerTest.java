package com.mca.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.mca.infrastructure.shared.McaApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = McaApplication.class)
@WebAppConfiguration
class SagaControllerTest {
	@Autowired
	private WebApplicationContext webApplicationContext;
	private MockMvc mockMvc;
	private static String URL_SAGA = "/game-saga/{sagaId}/related-sagas";


	@BeforeEach
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	}

	@Test
	void testRelatedSaga1() throws Exception {
		mockMvc.perform(get(URL_SAGA, 1))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$", hasSize(3)))
			.andExpect(jsonPath("$[0].videoGameId", is(2)))
			.andExpect(jsonPath("$[0].price", is(19.99)))
			.andExpect(jsonPath("$[0].title", is("Nebulas Descent: Awakening")))
			.andExpect(jsonPath("$[0].stock", is(false)))
			.andExpect(jsonPath("$[1].videoGameId", is(3)))
			.andExpect(jsonPath("$[1].price", is(29.99)))
			.andExpect(jsonPath("$[1].title", is("Whispers of the Void: Echoes")))
			.andExpect(jsonPath("$[1].stock", is(true)))
			.andExpect(jsonPath("$[2].videoGameId", is(4)))
			.andExpect(jsonPath("$[2].price", is(39.99)))
			.andExpect(jsonPath("$[2].title", is("Titans of the Ancients: Reawakened")))
			.andExpect(jsonPath("$[2].stock", is(false)));
	}

	@Test
	void testSagaNotFound() throws Exception {
		int sagaIdNotFound = -1;

		mockMvc.perform(get(URL_SAGA, sagaIdNotFound))
			.andExpect(status().isNotFound())
			.andExpect(jsonPath("$.status", is(404)))
			.andExpect(jsonPath("$.message", is("Saga not found")));
	}

}



