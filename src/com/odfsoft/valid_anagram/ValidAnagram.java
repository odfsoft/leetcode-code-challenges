package com.odfsoft.valid_anagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> charOcurrences = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            charOcurrences.put(s.charAt(i), charOcurrences.getOrDefault(s.charAt(i), 0) + 1);
            charOcurrences.put(t.charAt(i), charOcurrences.getOrDefault(t.charAt(i), 0) - 1);
        }
        for(Map.Entry<Character, Integer> entry: charOcurrences.entrySet()) {
            if(entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
