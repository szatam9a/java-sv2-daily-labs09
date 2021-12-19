package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        if (words.size() == 0) {
            throw new IllegalArgumentException("empty list");
        }
        List<String> result = new ArrayList<>();
        int shortestWords = Integer.MAX_VALUE;

        for (String actual : words) {
            if (actual.length() < shortestWords) {
                result.clear();
                result.add(actual);
            } else if (actual.length() == shortestWords) {
                result.add(actual);
            }
        }
        return result;
    }
}
