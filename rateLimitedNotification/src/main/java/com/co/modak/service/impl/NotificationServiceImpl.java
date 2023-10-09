package com.co.modak.service.impl;

import com.co.modak.config.ConfigRule;
import com.co.modak.gateway.Gateway;
import java.util.HashMap;
import java.util.Map;
import com.co.modak.service.NotificationService;

/**
 *
 * @author javendano
 */
public class NotificationServiceImpl implements NotificationService {

    
    private final Gateway gateway;
    private Map<String, Map<ConfigRule, Long>> lastNotifications = new HashMap<>();
    private Map<String,Map<ConfigRule, Integer>> limitsPerUser=new HashMap<>();

    public NotificationServiceImpl(Gateway gateway) {

        this.gateway = gateway;

    }

    @Override
    public void send(ConfigRule type, String userId, String message) {

        Map<ConfigRule, Integer> limits=limitsPerUser.get(userId);
        if(limits==null){
            limits=new HashMap<>();
            limits.put(ConfigRule.STATE, 0);
            limits.put(ConfigRule.MARKETING, 0);
            limits.put(ConfigRule.NEWS, 0);
            limitsPerUser.put(userId,limits);
        }

        long currentTime = System.currentTimeMillis();
        Map<ConfigRule, Long> userLastNotification = lastNotifications.get(userId);
        if (userLastNotification == null) {
            userLastNotification = new HashMap<>();
            userLastNotification.put(type, currentTime);
            lastNotifications.put(userId, userLastNotification);
        }

        limits.put(type, limits.get(type) + 1);
        Long offSetCurrentTime = currentTime - lastNotifications.get(userId).get(type);
        if (offSetCurrentTime > type.getTime()) {
            limits.put(type, 0);
        } else {
            if (limits.get(type) > type.getQuantity()) {
                System.out.println("Notification limit reached for user: " + userId + " and type: " + type);
                return;
            }
        }
        gateway.send(userId, message);
    }


}