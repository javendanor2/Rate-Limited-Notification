package com.co.modak;

import com.co.modak.config.ConfigRule;
import com.co.modak.gateway.Gateway;
import com.co.modak.service.impl.NotificationServiceImpl;


class RateLimitedNotification {

    /**
     * You can run 
     * @param args
     */
    public static void main(String[] args) {

        NotificationServiceImpl service = new NotificationServiceImpl(new Gateway());

        service.send(ConfigRule.STATE, "user1", "news 1");
        service.send(ConfigRule.STATE, "user1", "news 1");
        service.send(ConfigRule.STATE, "user1", "news 1");
        service.send(ConfigRule.STATE, "user1", "news 1");

        service.send(ConfigRule.NEWS, "user2", "news 2");
        service.send(ConfigRule.NEWS, "user2", "news 2");
        service.send(ConfigRule.NEWS, "user2", "news 2");

        service.send(ConfigRule.MARKETING, "user3", "news 3");


    }

}






