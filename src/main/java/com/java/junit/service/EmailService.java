package com.java.junit.service;

import com.java.junit.domain.Order;

public class EmailService
{
    private static EmailService instance;

    public EmailService() {
    }

    public static EmailService getInstance() {
        if (instance == null) {
            instance = new EmailService();
        }
        return instance;
    }

    public void sendEmail(Order order) {
        order.setCustomerNotified(false);
        throw new RuntimeException("An Exception Occurred");
    }

    public boolean sendEmail(Order order, String cc) {
        order.setCustomerNotified(true);
        return true;
    }
}

