package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoCollectionStatus {
    private String collectionStatus;
    private int renewalExtensions;
    private Date effectiveOn;
    private Date endedOn;
}
