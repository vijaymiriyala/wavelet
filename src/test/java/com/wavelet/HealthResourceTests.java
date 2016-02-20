package com.wavelet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@IntegrationTest("server.port=9000")
@SpringApplicationConfiguration(classes = ApiApplication.class)
public class HealthResourceTests {

	private RestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void health() {
//		ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:9000/api/health/1", String.class);
//		assert(entity.getStatusCode().is2xxSuccessful());
//		assert(entity.getBody()).equals("");
	}

}
