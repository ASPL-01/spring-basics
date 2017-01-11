package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateANewInstanceOfHello() throws Exception {
        Hello h = new Hello("Hello JUnit");
        assertEquals("Hello JUnit", h.getMessage());
    }
}
