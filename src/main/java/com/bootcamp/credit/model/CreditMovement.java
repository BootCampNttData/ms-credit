package com.bootcamp.credit.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class CreditMovement {
    @Id
    private String id;
    private String creditId;
    private Date movementDate;
    private Double amount;
}
    