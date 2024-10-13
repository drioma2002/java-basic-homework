package ru.otus.drioma2002.java.basic.homeworks.homework22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Homework22Test {
    @ParameterizedTest
    @MethodSource("arrAfterLastOneEntryData")
    void arrAfterLastOneEntry(int[] arrIncoming, int[] arrExpected, boolean exceptionExpected) {
        if (exceptionExpected) {
            Assertions.assertThrowsExactly(RuntimeException.class, () -> Homework22.arrAfterLastOneEntry(arrIncoming));
        } else {
            Assertions.assertArrayEquals(arrExpected, Homework22.arrAfterLastOneEntry(arrIncoming));
        }
    }

    static Stream<Arguments> arrAfterLastOneEntryData() {
        List<Arguments> testData = new ArrayList<>();
        testData.add(Arguments.arguments(new int[]{}, new int[]{}, true));
        testData.add(Arguments.arguments(new int[]{3, 2, 1}, new int[]{}, false));
        testData.add(Arguments.arguments(new int[]{1, 2, 3, 1, 4, 5}, new int[]{4, 5}, false));
        testData.add(Arguments.arguments(new int[]{2, 3, 4, 5}, new int[]{}, true));
        return testData.stream();
    }

    @Test
    void arrContainsOneAndTwoOnly() {
        assertFalse(Homework22.arrContainsOneAndTwoOnly(new int[]{}));
        assertFalse(Homework22.arrContainsOneAndTwoOnly(new int[]{1, 1, 1}));
        assertFalse(Homework22.arrContainsOneAndTwoOnly(new int[]{2, 2, 2}));
        assertTrue(Homework22.arrContainsOneAndTwoOnly(new int[]{1, 1, 2}));
        assertFalse(Homework22.arrContainsOneAndTwoOnly(new int[]{1, 2, 3}));
    }
}