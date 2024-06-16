//  6/16/24
//  Zack Laine
//  Assignment 11

package com.codercampus.Assignment11.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction implements Serializable {
    private static final long serialVersionUID = 5489045104890844953L;

    private Long id;
    private String retailer;
    private String description;
    private LocalDateTime date;
    private BigDecimal amount;
    private String type;

    public Long getId() {
        return id;
    }

    public String getRetailer() {
        return retailer;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public BigDecimal getAmount() {
        return amount;
    }


    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transaction [id=" + id + ", retailer=" + retailer + ", description=" + description + ", date=" + date
                + ", amount=" + amount + ", type=" + type + "]";
    }

}
