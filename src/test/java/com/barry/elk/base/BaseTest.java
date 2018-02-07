package com.barry.elk.base;

import com.barry.elk.service.ESQueryServiceTest;
import com.barry.elk.starter.ApplicationStarter;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
@WebAppConfiguration
public class BaseTest {

	private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
	
    @Ignore
    @Test
    public void baseTest(){
    }
    
    @Test
    public void baseExceptionTest(){
        try {
            throw new Exception("This is an exception");
        } catch (Exception e) {
            logger.error("====> This is an error log with stack trace", e);
        }
    }

}