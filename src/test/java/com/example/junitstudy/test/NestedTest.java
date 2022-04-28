package com.example.junitstudy.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
public class NestedTest {

    /**
     * 중첩 또는 계층구조의 테스트를 구성할 때 사용된다.
     */
    @Nested
    @DisplayName("테스트 A")
    class TestA {

        @Test
        void success() {
            log.info("success");
        }

        @Test
        void fail() {
            log.info("fail");
        }

        @Nested
        @DisplayName("테스트 B")
        class TestB {

            @Nested
            @DisplayName("테스트 C")
            class TestC {

                @Test
                void success() {
                    log.info("success");
                }

                @Test
                void fail() {
                    log.info("fail");
                }
            }

            @Nested
            @DisplayName("테스트 D")
            class TestD {
                @Test
                void success() {
                    log.info("success");
                }

                @Test
                void fail() {
                    log.info("fail");
                }
            }
        }
    }
}
