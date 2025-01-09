package com.bhavya.strings;

import java.util.*;

public class SortCharByFrequency {
    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(sorted(s));
        System.out.println(freqSorted(s));
        System.out.println(frequencySort(s));
    }

    public static String sorted(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(hm.entrySet());
        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return result.toString();
    }

    public static String freqSorted(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        StringBuilder builder = new StringBuilder();

        for (char a : s.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        while (!map.isEmpty()) {
            int max = 0;
            char maxChar = 'a';
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() > max) {
                    maxChar = e.getKey();
                    max = e.getValue();
                }
            }
            for (int i = 0; i < max; i++) {
                builder.append(maxChar);
            }
            map.remove(maxChar);
        }
        return builder.toString();
    }


// now it is the most optimized solution using bucket sort
    public static String frequencySort(String s) {
        int[] freq = new int[128];
        int maxFreq = 0;

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - '0']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(i) - '0']);
        }
        List<List<Character>> characterList = new ArrayList<>(maxFreq + 1);

        for (int i = 0; i <= maxFreq; i++) {
            characterList.add(new ArrayList<>());
        }

        for (int i = 0; i < 128; i++) {
            characterList.get(freq[i]).add((char) (i + 48));
        }
        StringBuilder sortedBuilder = new StringBuilder(s.length());

        for (int i = maxFreq; i > 0; i--) {
            List<Character> chars = characterList.get(i);

            for (char c : chars) {

                for (int j = 0; j < i; j++) {
                    sortedBuilder.append(c);
                }
            }
        }
        return sortedBuilder.toString();
    }
}