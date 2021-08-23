package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class LoanProcessBv {
    private String bvProvider;
    private String bankName;
    private Integer attemptCount;
    private String linkSource;
    private String linkStatus;
    private List<Date> dateAttempts;
}
