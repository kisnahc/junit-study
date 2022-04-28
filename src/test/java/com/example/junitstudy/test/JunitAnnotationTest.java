package com.example.junitstudy.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

@Slf4j
public class JunitAnnotationTest {

    /**
     * @Timeout 은 테스트 소요 시간이 value로 지정된 시간 이내의 끝나지 않으면 fail
     */
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
    @Test
    void timeout_test() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 지정된 값 만큼 테스트 반복.
     */
    @RepeatedTest(5)
    void repeated_test() {
        log.info("repeat test");
    }

}
