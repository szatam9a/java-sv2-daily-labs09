package day03;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void encryptsTest() {
        Caesar c = new Caesar(1);
        assertEquals("A",c.encrypts("Z"));
        assertEquals("bmnb".toUpperCase(Locale.ROOT),c.encrypts("alma"));


    }
    @Test
    void encryptsTest2() {
        Caesar c = new Caesar(2);
        assertEquals("B",c.encrypts("Z"));
        assertEquals("C",c.encrypts("A"));


    }
}