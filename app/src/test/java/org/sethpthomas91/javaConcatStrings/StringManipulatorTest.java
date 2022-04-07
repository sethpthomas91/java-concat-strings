package org.sethpthomas91.javaConcatStrings;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulatorTest {
    private StringManipulator stringManipulator;

    @Before
    public void setUp() throws Exception {
        stringManipulator = new StringManipulator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeBlankSpacesShouldReturnBlankStringWithEmptyString() {
        Assert.assertEquals("Should return a blank string if it is given an empty string", "", stringManipulator.removeBlankSpaces(""));
    }

    @Test
    public void removeBlankSpacesShouldReturnNoBlanksAtTheBeginningOfAString() {
        Assert.assertEquals("Should return a blank string if it is given an empty string", "HELLO", stringManipulator.removeBlankSpaces("     HELLO"));
    }

    @Test
    public void generateArrayFromStringHELLOReturnsCorrectArray() {
        char[] expected = new char[]{'H', 'E', 'L', 'L', 'O'};
        Assert.assertArrayEquals("Should return an array that is the broken down version of the string passed in", expected , stringManipulator.generateArrayOfString("HELLO"));
    }

    @Test
    public void generateArrayFromBlankString() {
        char[] expected = new char[]{};
        Assert.assertArrayEquals("Should return a blank array", expected , stringManipulator.generateArrayOfString(""));
    }

}