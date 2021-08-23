package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class LoanInfoEpic {
    private String assignedLoanManager;
    private String assignedCollectionAgent;
    private Date applicationReceivedDate;
    private Date lastEpicDataUpdateDate;
    private String rejectedReason;
    private String epicClientId;
    private String currentHistory;
    private BigDecimal buyPrice;
    private boolean isExpressLoan;
    private boolean textPermission;
}
