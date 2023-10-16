package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void PositiveTest_Eins() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(1);
        assertEquals(value, "eins");
    }

    @Test
    void PositiveTest_Fuenf() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(5);
        assertEquals(value, "fünf");
    }

    @Test
    void PositiveTest_Zehn() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(10);
        assertEquals(value, "zehn");
    }

    @Test
    void PositiveTest_Null() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(0);
        assertEquals(value, "Übersetzung der Zahl 0 nicht möglich (1.0)");
    }

    @Test
    void PositiveTest_Elf() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(11);
        assertEquals(value, "Übersetzung der Zahl 11 nicht möglich (1.0)");
    }
}