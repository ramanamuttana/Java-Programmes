
package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Ratings {


        public static void main(String[] args) {
            // Keys and corresponding ratings
            Map<Character, Integer> ratingsMap = new HashMap<>();
            ratingsMap.put('a', 3);
            ratingsMap.put('b', 5);
            ratingsMap.put('c', 2);
            ratingsMap.put('d', 1);
            ratingsMap.put('e', 4);

            // PriorityQueue to sort keys by their rating in descending order
            PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> ratingsMap.get(b) - ratingsMap.get(a));

            pq.addAll(ratingsMap.keySet());

            System.out.println("Keys sorted by rating (high to low):"+pq.poll());
            while (!pq.isEmpty()) {
                char key = pq.poll();
                System.out.println("Key: " + key + ", Rating: " + ratingsMap.get(key));
            }
        }
