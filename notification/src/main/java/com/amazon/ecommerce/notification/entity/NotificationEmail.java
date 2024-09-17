package com.amazon.ecommerce.notification.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class NotificationEmail {
    @GeneratedValue
    @Id
    private Integer id;
    private String customerEmail;
    private String subject;
    private String content;
    private LocalDateTime timestamp;

}
