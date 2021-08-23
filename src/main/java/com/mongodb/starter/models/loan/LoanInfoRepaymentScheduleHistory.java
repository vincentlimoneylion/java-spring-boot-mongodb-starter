package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class LoanInfoRepaymentScheduleHistory {
    private String paymentScheduleId;
    private String paymentId;
    private Date effectiveDate;
    private String paymentType;
    private BigDecimal principle;
    private BigDecimal lateFee;
    private BigDecimal nsfFee;
    private String returnCode;
    private Date returnDate;
    private String paymentStatus; // Pending, Returned, Checked
    private boolean isDebit;
    private Date successDate;
    private boolean isOrigination;
    private String creditReason;
    private BigDecimal financeFee;
    private BigDecimal feesAmount;
    private BigDecimal paymentAmount;
    private String processor;
    private String processorStatus;
    private boolean isLateFeeWaived;

    //CC Payment Details
    String orderid;
    String invoiceID;
    private boolean isSubmitted;
    private String paymentSource;
    private String paymentStatusReason;
    private String paymentStatusReasonDetails;
    private Date settlementDateForCardConnect;

    private String paymentProfileId;
    private String paymentTranxId;
}
