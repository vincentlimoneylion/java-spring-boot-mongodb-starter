package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class LoanInfoFee {
    private String name;
    private BigDecimal amount;
    private String status;
    private String processor;
    private Date effectiveDate;
    private Date processedDate;
    private Date successDate;

    //CC Payment Details
    private String orderid;
    private String invoiceID;
    private boolean isSubmitted;
    private String paymentSource;
    private String paymentStatusReason;
    private String paymentStatusReasonDetails;
    private Date settlementDateForCardConnect;

    private String paymentProfileId;
    private String paymentTranxId;
}
