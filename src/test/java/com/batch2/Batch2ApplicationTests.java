package com.batch2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.enrichservice.Batch2Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Batch2Application.class)
@WebAppConfiguration
public class Batch2ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
