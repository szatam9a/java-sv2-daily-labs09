package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void shortestWordsTest() {
        List<String> toTest = List.of("bbb", "bbb", "cccc", "aa");
        assertEquals("aa",new StringLists().shortestWords(toTest).get(0));
    }
}