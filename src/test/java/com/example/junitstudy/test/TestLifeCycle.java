package com.example.junitstudy.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
public class TestLifeCycle {

    /**
     * 전체 테스트가 시작하기 전에 한 번만 실행된다.
     */
    @BeforeAll
    static void beforeAll() {
        log.info("BeforeAll 호출");
    }

    /**
     * 모든 테스트가 종료된 후 한 번만 실행된다.
     */
    @AfterAll
    static void afterAll() {
        log.info("AfterAll 호출");
    }

    /**
     * 각 테스트 메소드가 실행되기전에 실행되는 메소드의 명시.
     * (@Test , @RepeatedTest , @ParameterizedTest , @TestFactory)
     */
    @BeforeEach
    void beforeEach() {
        log.info("BeforeEach 호출");
    }

    /**
     * 각 테스트 메소드가 종료된 후 실행되는 메소드의 명시.
     * (@Test , @RepeatedTest , @ParameterizedTest , @TestFactory)
     */
    @AfterEach
    void afterEach() {
        log.info("AfterEach 호출");
    }

    @Test
    void test1() {
        log.info("Test1 호출");
    }

    @Test
    @DisplayName("test2") // 해당 테스트 클래스, 메소드에 이름을 붙여줄 때 사용.
    void test() {
        log.info("Test2 호출");
    }

    @Test
    @Disabled("") // 해당 테스트 메소드를 비활성화 한다.
    void test3() {
        log.info("Test3 호출");
    }

}
