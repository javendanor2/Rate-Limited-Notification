/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.co.modak.service;

import com.co.modak.config.ConfigRule;
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
public class NotificationServiceTest {
    
    public NotificationServiceTest() {
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
     * Test of send method, of class NotificationService.
     */
    @org.junit.jupiter.api.Test
    public void testSend() {
        System.out.println("send");
        ConfigRule type = null;
        String userId = "";
        String message = "";
        NotificationService instance = new NotificationServiceImpl();
        instance.send(type, userId, message);
        
    }

    public class NotificationServiceImpl implements NotificationService {

        public void send(ConfigRule type, String userId, String message) {
        }
    }
    
}
