package com.irfan.orders.integration;

import com.irfan.orders.OrdersApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderControllerSLT {
    
    @LocalServerPort
    private int port;
    
    HttpHeaders httpHeaders;
    
    TestRestTemplate testRestTemplate;
    
    @Before
    public void setUp(){
        httpHeaders = new HttpHeaders();
        testRestTemplate = new TestRestTemplate();
    }
    
    @Test
    public void getMessageSLT(){
        HttpEntity<String> httpEntity = new HttpEntity<String >(null,httpHeaders);
        ResponseEntity<String> responseEntity = testRestTemplate.exchange(createURL("/getMessage"),
                HttpMethod.GET,httpEntity,String.class);
        Assert.assertEquals("this is my first example", responseEntity.getBody());
        
    }
    
    private String createURL(String uri){
        return "http://localhost:"+port+"/orders"+uri;
    }
    
}