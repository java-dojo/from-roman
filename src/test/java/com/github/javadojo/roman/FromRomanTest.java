package com.github.javadojo.roman;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FromRomanTest {

    private final FromRoman objectToTest = new FromRoman();

    @Test(enabled = false)
    public void test1() {
        Assert.assertEquals(objectToTest.fromRoman("I"), 1,
            "Expected I to be converted into 1.");
    }

    @Test(enabled = false)
    public void test3() {
        Assert.assertEquals(objectToTest.fromRoman("III"), 3,
            "Expected III to be converted into 3.");
    }

    @Test(enabled = false)
    public void test5() {
        Assert.assertEquals(objectToTest.fromRoman("V"), 5,
            "Expected V to be converted into 5.");
    }

    @Test(enabled = false)
    public void test4() {
        Assert.assertEquals(objectToTest.fromRoman("IV"), 4,
            "Expected IV to be converted into 4.");
    }

    @Test(enabled = false)
    public void test8() {
        Assert.assertEquals(objectToTest.fromRoman("VIII"), 8,
            "Expected VIII to be converted into 8.");
    }

    @Test(enabled = false)
    public void test10() {
        Assert.assertEquals(objectToTest.fromRoman("X"), 10,
            "Expected X to be converted into 10.");
    }

    @Test(enabled = false)
    public void test9() {
        Assert.assertEquals(objectToTest.fromRoman("IX"), 9,
            "Expected 9 to be converted into IX.");
    }

    @Test(enabled = false)
    public void test13() {
        Assert.assertEquals(objectToTest.fromRoman("XIII"), 13,
            "Expected XIII to be converted into 13.");
    }

    @Test(enabled = false)
    public void test14() {
        Assert.assertEquals(objectToTest.fromRoman("XIV"), 14,
            "Expected XIV to be converted into 14.");
    }

    @Test(enabled = false)
    public void test29() {
        Assert.assertEquals(objectToTest.fromRoman("XXIX"), 29,
            "Expected XXIX to be converted into 29.");
    }

    @Test(enabled = false)
    public void test50() {
        Assert.assertEquals(objectToTest.fromRoman("L"), 50,
            "Expected L to be converted into 50.");
    }

    @Test(enabled = false)
    public void test49() {
        Assert.assertEquals(objectToTest.fromRoman("XLIX"), 49,
            "Expected XLIX to be converted into 49.");
    }

    @Test(enabled = false)
    public void test44() {
        Assert.assertEquals(objectToTest.fromRoman("XLIV"), 44,
            "Expected XLIV to be converted into 44.");
    }

    @Test(enabled = false)
    public void test80() {
        Assert.assertEquals(objectToTest.fromRoman("LXXX"), 80,
            "Expected LXXX to be converted into 80.");
    }

    @Test(enabled = false)
    public void test100() {
        Assert.assertEquals(objectToTest.fromRoman("C"), 100,
            "Expected C to be converted into 100.");
    }

    @Test(enabled = false)
    public void test90() {
        Assert.assertEquals(objectToTest.fromRoman("XC"), 90,
            "Expected XC to be converted into 90.");
    }

    @Test(enabled = false)
    public void test99() {
        Assert.assertEquals(objectToTest.fromRoman("XCIX"), 99,
            "Expected XCIX to be converted into 99.");
    }

    @Test(enabled = false)
    public void test150() {
        Assert.assertEquals(objectToTest.fromRoman("CL"), 150,
            "Expected CL to be converted into 150.");
    }

    @Test(enabled = false)
    public void test500() {
        Assert.assertEquals(objectToTest.fromRoman("D"), 500,
            "Expected 500 to be converted into D.");
    }

    @Test(enabled = false)
    public void test400() {
        Assert.assertEquals(objectToTest.fromRoman("CD"), 400,
            "Expected CD to be converted into 400.");
    }

    @Test(enabled = false)
    public void test440() {
        Assert.assertEquals(objectToTest.fromRoman("CDXL"), 440,
            "Expected CDXL to be converted into 440.");
    }

    @Test(enabled = false)
    public void test444() {
        Assert.assertEquals(objectToTest.fromRoman("CDXLIV"), 444,
            "Expected CDXLIV to be converted into 444.");
    }

    @Test(enabled = false)
    public void test490() {
        Assert.assertEquals(objectToTest.fromRoman("CDXC"), 490,
            "Expected CDXC to be converted into 490.");
    }

    @Test(enabled = false)
    public void test494() {
        Assert.assertEquals(objectToTest.fromRoman("CDXCIV"), 494,
            "Expected CDXCIV to be converted into 494.");
    }

    @Test(enabled = false)
    public void test499() {
        Assert.assertEquals(objectToTest.fromRoman("CDXCIX"), 499,
            "Expected CDXCIX to be converted into 499.");
    }

    @Test(enabled = false)
    public void test1000() {
        Assert.assertEquals(objectToTest.fromRoman("M"), 1000,
            "Expected M to be converted into 1000.");
    }

    @Test(enabled = false)
    public void test900() {
        Assert.assertEquals(objectToTest.fromRoman("CM"), 900,
            "Expected CM to be converted into 900.");
    }

    @Test(enabled = false)
    public void test990() {
        Assert.assertEquals(objectToTest.fromRoman("CMXC"), 990,
            "Expected CMXC to be converted into 990.");
    }

    @Test(enabled = false)
    public void test999() {
        Assert.assertEquals(objectToTest.fromRoman("CMXCIX"), 999,
            "Expected CMXCIX to be converted into 999.");
    }

    @Test(enabled = false)
    public void test1999() {
        Assert.assertEquals(objectToTest.fromRoman("MCMXCIX"), 1999,
            "Expected MCMXCIX to be converted into 1999.");
    }

    @Test(enabled = false)
    public void test2015() {
        Assert.assertEquals(objectToTest.fromRoman("MMXV"), 2015,
            "Expected MMXV to be converted into 2015.");
    }

}
