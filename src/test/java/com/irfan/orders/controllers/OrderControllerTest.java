package com.irfan.orders.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
    
    private OrderController orderController;
    
    @Before
    public void setUp(){
        orderController = new OrderController();
    }
    
    @Test
    public void getMessageTest(){
        String result = orderController.testMethod();
        Assert.assertEquals("this is my first example", result);
    }

    @Test
    public void getMessageTestNegative(){
        String result = orderController.testMethod();
        Assert.assertNotEquals("this is my first", result);
    }
}
