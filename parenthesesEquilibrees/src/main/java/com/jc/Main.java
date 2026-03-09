package com.jc;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
     private static final Map<Character, Character> PAIRES = Map.of(')', '(', ']', '[', '}', '{');

    public static void main(String[] args) {
        tester("({[]})");
        tester("({[})");
    }

    private static void tester(String expression) {
        System.out.printf("%-20s → %s%n", "\"" + expression + "\"", estEquilibrees(expression));
    }

    public static boolean estEquilibrees(String expression) {
        Stack<Character> pile = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (PAIRES.containsValue(c)) {
                pile.push(c);
            } else if (PAIRES.containsKey(c)) {
                if (pile.empty() || pile.pop() != PAIRES.get(c)) return false;
            }
        }
        return pile.empty();
    }
}
