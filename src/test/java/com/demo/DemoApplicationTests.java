package com.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertTrue(true, String.valueOf(Boolean.parseBoolean("true")));
		log.info("Testing ");
	}

}
