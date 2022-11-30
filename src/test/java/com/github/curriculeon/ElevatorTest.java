package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class ElevatorTest {
    // given
    private void test(int left, int right, int call, String expected) {
        Elevator elevator = new Elevator();

        // when
        String actual = elevator.elevates(left, right, call);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        test(0, 1, 0, "left");
    }
    @Test
    public void test2() {
        test(0, 1, 1, "right");
    }

    @Test
    public void test3() {
        test(0, 1, 2, "right");
    }

    @Test
    public void test4() {
        test(0, 0, 0, "right");
    }

    @Test
    public void test5() {
        test(0, 2, 1, "right");
    }
}
