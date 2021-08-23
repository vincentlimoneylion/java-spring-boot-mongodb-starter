package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoFlag {
    private String code;
    private String title;
    private Date activatedDate;
    private boolean activated;
    private String updatedBy;
}
