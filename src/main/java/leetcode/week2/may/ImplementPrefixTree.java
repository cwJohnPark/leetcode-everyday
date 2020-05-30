package leetcode.week2.may;

import leetcode.util.annotation.InProgress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@InProgress
public class ImplementPrefixTree {
    static class Trie {
        private String value;
        private Map<String, Trie> children= new HashMap<>();

        /** Initialize your data structure here. */
        public Trie() {
            value = null;
        }

        public Trie(String value) {
            this.value = value;
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            char[] words = word.toCharArray();
            String prefix = "";
            for(int i = 0; i < words.length; i++) {
                prefix += words[i];
                if(children.containsKey(prefix)) {
                    children.get(prefix).insert(prefix);
                } else {
                    children.put(prefix, new Trie(prefix));
                    children.get(prefix).insert(word);
                }
            }
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            char[] words = word.toCharArray();
            String prefix = "";
            for(int i = 0; i <words.length; i++) {
                prefix += words[i];
                if(children.containsKey(prefix)) {
                    if(children.get(prefix).equals(word))  {
                        return search(prefix);
                    }
                }
            }
            return false;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            char[] words = prefix.toCharArray();
            String prefixes = "";
            for(int i = 0; i < words.length; i++) {
                prefixes += words[i];
                if(children.containsKey(prefixes)) {
                    if(children.get(prefixes).equals(prefix)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("a");
        boolean result = obj.search("a");
        System.out.println(result);
    }
}
