package com.amazon.ecommerce.notification.controller;

import com.amazon.ecommerce.client.response.SuccessResponse;
import com.amazon.ecommerce.notification.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
@Slf4j
@RequestMapping(path = "/api/v1/notificationEmail")
@RestController
 record NotificationController(NotificationService notificationService) {

    @GetMapping(path = "")
    public SuccessResponse checkForNotification(
            @RequestParam(name = "email") String email){
        log.info("Getting the email of the customer to send email");
        String emilOfReceiver = notificationService.sendEmail(email);
        log.info("sent the mail to the customer, as registration is done");

        return SuccessResponse.builder()
                .message("Customer has sent the mail")
                .data(emilOfReceiver)
                .status(HttpStatus.OK)
                .timestamp(LocalDateTime.now())
        .build();
    }





}
