package com.bootcamp.credit.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document

public class Credit {
    @Id
    private String  id;
    private String  clientId;
    private String  creditId;
    private String  clientType;
    private Date    creditDate;
    private Double  loanAmount;
    private Integer loanTermInMonths;
    private Double  annualInterestRate;
}