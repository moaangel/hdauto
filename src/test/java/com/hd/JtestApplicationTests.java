package com.hd;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JtestApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(JtestApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("test log");
	}

}
