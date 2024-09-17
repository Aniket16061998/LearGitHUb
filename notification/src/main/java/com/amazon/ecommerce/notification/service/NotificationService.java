package com.amazon.ecommerce.notification.service;

import com.amazon.ecommerce.notification.Repository.NotificationRepository;
import com.amazon.ecommerce.notification.entity.NotificationEmail;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public record NotificationService(NotificationRepository notificationRepository) {

    public String sendEmail(String email) {
        return notificationRepository.save(NotificationEmail
                .builder()
                .customerEmail(email)
                .subject("I want to send email for successful registration")
                .content("Email has been registerd successfully")
                .timestamp(LocalDateTime.now())
                .build()).getCustomerEmail();

    }
}
