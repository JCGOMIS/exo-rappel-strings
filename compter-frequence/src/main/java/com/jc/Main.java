package com.jc;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      int[] arr = {1, 2, 2, 3, 3, 3, 5,5,5,5,5,6,6,5};
    compterEtAfficherFrequence(arr);

    }
    public static void compterEtAfficherFrequence(int[] tableau) {
    Map<Integer, Integer> frequence = new HashMap<>();
    for (int element : tableau) {
        frequence.put(element, frequence.getOrDefault(element, 0) + 1);
    }

    String resultat = frequence.entrySet().stream()
            .map(e -> e.getKey() + "=" + e.getValue())
            .collect(Collectors.joining(", ", "{", "}"));

    System.out.println(resultat);
}

}
