package com.apd.purchase.core;

import java.time.ZonedDateTime;
import java.util.Objects;

public class PurchaseCore {

    private Long id;

    private Long userId;

    private Long courseId;

    private String title;

    private Double price;

    private ZonedDateTime purchaseTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ZonedDateTime getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(ZonedDateTime purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    @Override
    public boolean equals(Object obj) {
        boolean response = true;

        if (this == obj) {
            response = true;
        }

        if (obj instanceof PurchaseCore) {
            PurchaseCore other = (PurchaseCore) obj;
            response = Objects.equals(this.id, other.id);
        }
        return response;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
