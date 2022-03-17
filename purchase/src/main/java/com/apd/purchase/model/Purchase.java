package com.apd.purchase.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Entity
@Table(name="purchase")
@Data
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pur_uid", nullable = false)
    private Long id;

    @Column(name="pur_user_id", nullable = false)
    private Long userId;

    @Column(name = "pur_course_id", nullable = false)
    private Long courseId;

    @Column(name="pur_title", nullable = false)
    private String title;

    @Column(name="pur_price", nullable = false)
    private Double price;

    @Column(name="pur_purchase_time", nullable = false)
    private ZonedDateTime purchaseTime;
}