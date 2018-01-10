package com.didispace;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.didispace.rabbit.Sender;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = HelloApplication.class)
@SpringBootTest(classes = HelloApplication.class)
public class HelloApplicationTests {

	@Autowired
	private Sender sender;

	@Test
	public void hello() throws Exception {
		sender.send();
	}

}
