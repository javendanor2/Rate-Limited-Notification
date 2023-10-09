/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.co.modak.service;

import com.co.modak.config.ConfigRule;
import com.co.modak.gateway.Gateway;
import com.co.modak.service.impl.NotificationServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author javendano
 */
public class NotificationServiceImplTest {
    
    public NotificationServiceImplTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of send method, of class NotificationServiceImpl.
     */
    @org.junit.jupiter.api.Test
    public void testSend() {
        System.out.println("send");
        ConfigRule type = ConfigRule.STATE;
        String userId = "";
        String message = "";
        NotificationServiceImpl instance = new NotificationServiceImpl(new Gateway());
        instance.send(type, userId, message);
        
    }
    
}
