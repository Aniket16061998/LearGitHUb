package com.amazon.ecommerce.client.notification;

import com.amazon.ecommerce.client.response.SuccessResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        value = "notification-application",
        path = "api/v1/notificationEmail"
)
public interface NotificationClient {
    @GetMapping(path = "")
    public SuccessResponse checkForNotification(
            @RequestParam(name = "email") String email);

}
