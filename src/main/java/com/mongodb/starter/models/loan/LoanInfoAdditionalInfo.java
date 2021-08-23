package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoAdditionalInfo {
    private String name;
    private Date createdDate = new Date();
}
