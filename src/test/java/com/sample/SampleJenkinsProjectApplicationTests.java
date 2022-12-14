package com.sample;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleJenkinsProjectApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SampleJenkinsProjectApplicationTests.class);

    @Test
    public void contextLoads() {
        logger.info("Test case executing...");
        assertEquals(true, true);
    }

}