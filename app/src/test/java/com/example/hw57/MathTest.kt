package com.example.hw57

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MathTest {
    var math : Math? = null

    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAdd() {
        Assert.assertEquals("4", math?.add("2", "2"))
    }

    @Test
    fun symbolAdd(){
        Assert.assertEquals("4", math?.add("aa", "2"))
    }

    @Test
    fun doubleAdd(){
        Assert.assertEquals("4.4",math?.add("2.4","2.0"))
    }

    @Test
    fun minusAdd(){
        Assert.assertEquals("0",math?.add("-2","2"))
    }

    @Test
    fun simpleDivide(){
        Assert.assertEquals("2",math?.divide("4","2"))
    }

    @Test
    fun zeroDivide(){
        Assert.assertEquals("2",math?.divide("4","0"))
    }

    @After
    fun detach(){
        math = null
    }
}