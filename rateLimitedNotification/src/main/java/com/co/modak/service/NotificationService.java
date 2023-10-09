package com.co.modak.service;

import com.co.modak.config.ConfigRule;

/**
 *
 * @author javendano
 */
public interface NotificationService {

    void send(ConfigRule type, String userId, String message);

}