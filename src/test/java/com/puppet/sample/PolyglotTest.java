package com.puppet.sample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PolyglotTest
{
    @Test
    public void testEnMsg() {
        assertEquals("welcome to my tomcat server !", new Polyglot().enMsg());
    }

    @Test
    public void testZhMsg() {
        assertEquals("Bienvenida a mi servidor tomcat !", new Polyglot().spMsg());
    }

    @Test
    public void testSpMsg() {
        assertEquals("مرحبًا بك في خادم Tomcat الخاص بي !", new Polyglot().arMsg());
    }

    @Test
    public void testHiMsg() {
        assertEquals("मेरे टॉमकैट सर्वर में आपका स्वागत है !", new Polyglot().hiMsg());
    }

    @Test
    public void testArMsg() {
        assertEquals("నా టామ్‌క్యాట్ సర్వర్‌కు స్వాగతం !", new Polyglot().tlMsg());
    }
}
