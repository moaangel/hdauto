package com.hd;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayName("Test Sequence")
public class Junit_Seq {
    private static final Logger log = LoggerFactory.getLogger(Junit_Seq.class);
    @BeforeEach
    public void beforeEach(){
        log.info("beforeEach");
    }
    @AfterEach
    public void afterEach(){
        log.info("afterEach");
    }

    @Test
    @DisplayName("Test1")
    public void test1(){
        log.info("test1");
    }
    @Test
    @DisplayName("Test2")
    public void test2(){
        log.info("test2");
    }
    @Test
    @DisplayName("Test3")
    public void test3(){
        log.info("test3");
    }
}
