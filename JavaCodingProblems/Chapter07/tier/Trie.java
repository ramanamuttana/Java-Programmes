package org.example.tier;

public class Trie {

    private final Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;

        for (char ch : word.toCharArray()) {
            curr = curr.children.computeIfAbsent(ch, n -> new Node());
        }
        curr.isEndOfWord = true;

    }

    // Search for a word in the trie
    public boolean search(String word) {
         Node node = root;
        for (char ch : word.toCharArray()) {
            node = node.children.get(ch);
            if (node == null)
                return false;
        }
        return node.isEndOfWord;
    }
    // Check if any word in the trie starts with the given prefix
    public boolean startsWith(String prefix) {
        Node node = root;
        for (char ch : prefix.toCharArray()) {
            node = node.children.get(ch);
            if (node == null)
                return false;
        }
        return true;
    }

    // Optional: Delete a word from the trie
    public boolean delete(String word) {
        return delete(root, word, 0);
    }

    private boolean delete(Node current, String word, int index) {
        if (index == word.length()) {
            if (!current.isEndOfWord)
                return false;
            current.isEndOfWord = false;
            return current.children.isEmpty();
        }

        char ch = word.charAt(index);
        Node node = current.children.get(ch);
        if (node == null)
            return false;

        boolean shouldDeleteCurrentNode = delete(node, word, index + 1);

        if (shouldDeleteCurrentNode) {
            current.children.remove(ch);
            return current.children.isEmpty() && !current.isEndOfWord;
        }

        return false;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("car");
        trie.insert("dog");


        System.out.println(trie.search("car"));      // true
        System.out.println(trie.search("cap"));      // false
        System.out.println(trie.startsWith("ca"));   // true
        System.out.println(trie.startsWith("do"));

        trie.delete("car");
        System.out.println(trie.search("car"));
    }
}
