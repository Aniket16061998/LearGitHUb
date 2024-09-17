package com.amazon.ecommerce.notification.Repository;

import com.amazon.ecommerce.notification.entity.NotificationEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<NotificationEmail, Integer> {
}
