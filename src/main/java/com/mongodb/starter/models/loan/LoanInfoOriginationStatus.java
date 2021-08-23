package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoOriginationStatus {
    private String originationStatus;
    private int renewalExtensions;
    private Date effectiveOn;
    private Date endedOn;
}
