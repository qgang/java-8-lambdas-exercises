package com.insightfullogic.java8.exercises.chapter2;

import java.util.function.Predicate;

/**
 * @author gang.qin
 * @date 2019-03-15.
 */
public class Question3 {

    static boolean check(Predicate<Integer> predicate) {
        return false;
    }

    static boolean check(IntPred predicate) {
        return false;
    }

    public static void main(String[] args) {
        check(x -> 2 > 4);
    }
}
