package com.sut.strategy;

import com.sut.strategy.service.TsUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyApplicationTests {

	@Autowired
    TsUserService userService;
	@Test
	public void contextLoads() {
		userService.findByUserId(12);
		System.out.println("");
	}

}
