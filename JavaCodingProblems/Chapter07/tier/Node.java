package org.example.tier;

import java.util.HashMap;
import java.util.Map;

public class Node {

    Map<Character, Node> children = new HashMap<>();
    boolean isEndOfWord;
}
