package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanScore {
    private String scoreName;
    private String scoreValue;
    private String scoreVersion;
    private String scoreGrade;
    private String modelTransactionId;
    private Date createdOn = new Date();
}
