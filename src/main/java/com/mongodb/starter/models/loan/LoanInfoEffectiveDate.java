package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoEffectiveDate {
    private Date effectiveDate;
    private String source;
    private Date createdOn = new Date();
    private Date endedOn;
}
