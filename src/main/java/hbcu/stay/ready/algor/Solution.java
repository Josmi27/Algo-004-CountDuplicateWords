package hbcu.stay.ready.algor;

import java.util.HashMap;

public class Solution {
    // 1. Solve the unique word problem
    // 2. Format it correctly

    public String countUniqueWords(String input){
        String solu = "";

        HashMap<String, Integer> tracker = new HashMap<String, Integer>();
        String modifiedInput = input.replace(".", "");
        String moreModifiedInput = modifiedInput.replaceAll("!", "");
        String[] stringedInput = moreModifiedInput.split(" ");

        for(String s : stringedInput) {
            if(!tracker.containsKey(s)) {
                tracker.put(s, 1);
            }
            else {
                int currentValue = tracker.get(s);
                currentValue++;
                tracker.put(s, currentValue);
            }
        }


        solu += String.format("The %d unique words are:\n", tracker.size());
        int size = 0;
        for (String s : tracker.keySet()) {
            size++;
            int value = tracker.get(s);
            if (size < tracker.size()) {
                solu += String.format("%s (Seen %d)\n", s, value);
            }
            else {
                solu += String.format("%s (Seen %d)", s, value);
            }
        }

        return solu;
    }
}
