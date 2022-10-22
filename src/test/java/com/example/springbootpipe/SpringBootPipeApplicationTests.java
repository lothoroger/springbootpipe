package com.example.springbootpipe;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootPipeApplicationTests {

	
	@Autowired
	NewsController newControllertest;
	Integer ref;
	
	
	
	
	@Test
	void contextLoads() {
		assertThat(newControllertest).isNotNull();
	}
	
	

}
