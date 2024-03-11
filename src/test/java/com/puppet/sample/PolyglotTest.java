package com.puppet.sample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PolyglotTest
{
    @Test
    public void testEnMsg() {
        assertEquals("Well Come To My Tomcat Server!", new Polyglot().enMsg());
    }

    @Test
    public void testZhMsg() {
        assertEquals("Selamat Datang di Server Tomcat Saya!", new Polyglot().indonesianMsg());
    }

    @Test
    public void testSpMsg() {
        assertEquals("Bienvenido a mi servidor Tomcat!", new Polyglot().spMsg());
    }

    @Test
    public void testHiMsg() {
        assertEquals("मेरे टॉमकैट सर्वर में आपका स्वागत है!", new Polyglot().hiMsg());
    }

    @Test
    public void testArMsg() {
        assertEquals("నా టామ్‌క్యాట్ సర్వర్‌కు స్వాగతం!", new Polyglot().teluguMsg());
    }
}
