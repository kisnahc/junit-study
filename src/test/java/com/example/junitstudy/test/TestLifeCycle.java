package com.example.junitstudy.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
public class TestLifeCycle {

    @BeforeAll
    static void beforeAll() {
        log.info("BeforeAll 호출");
    }

    @AfterAll
    static void afterAll() {
        log.info("AfterAll 호출");
    }

    @BeforeEach
    void beforeEach() {
        log.info("BeforeEach 호출");
    }

    @AfterEach
    void afterEach() {
        log.info("AfterEach 호출");
    }

    @Test
    void test1() {
        log.info("Test1 호출");
    }

    @Test
    @DisplayName("test2")
    void test() {
        log.info("Test2 호출");
    }

    @Test
    @Disabled("")
    void test3() {
        log.info("Test3 호출");
    }

}
