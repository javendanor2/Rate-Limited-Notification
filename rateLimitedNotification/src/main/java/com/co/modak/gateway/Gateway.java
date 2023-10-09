package com.co.modak.gateway;

/**
 * Gateway to send the message
 */
public class Gateway {
    public Gateway(){}

    public void send(String userId, String message) {

        System.out.println("sending message to user " + userId + " with message:" + message);

    }

}
