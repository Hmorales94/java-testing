package com.platzi.test.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_once_stringOnce() {
        Assert.assertEquals("hola", StringUtil.repeat("hola",1));
    }

    @Test
    public void repeat_threeTimes_stringMultipleTimes() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola",3));
    }

    @Test
    public void repeat_zero_StringZeroTimes() {
        Assert.assertEquals("", StringUtil.repeat("hola",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_minusOne_StringZeroTimes() {
        Assert.assertEquals("", StringUtil.repeat("hola",-1));
    }

    @Test
    public void isEmpty_nonNullString_false (){
        Assert.assertFalse(StringUtil.isEmpty("hola"));
    }

    @Test
    public void isEmpty_emptyString_true (){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void isEmpty_nullString_true (){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void isEmpty_onlySpacesString_true (){
        Assert.assertTrue(StringUtil.isEmpty("     "));
    }


}