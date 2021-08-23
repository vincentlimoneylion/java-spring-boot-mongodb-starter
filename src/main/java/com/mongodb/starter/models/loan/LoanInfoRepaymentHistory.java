package com.mongodb.starter.models.loan;

import lombok.*;
import org.bson.types.ObjectId;

import java.math.BigDecimal;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@With
public class LoanInfoRepaymentHistory {
    private ObjectId id = new ObjectId();
    private Date createdOn = new Date();
    private Date updatedOn = new Date();

    private String paymentScheduleId;
    private String paymentId;
    private Date effectiveDate;
    private List<LoanInfoEffectiveDate> effectiveDateHistories = new ArrayList<>();
    private String paymentType;
    private List<String> makeUpIds = new ArrayList<>();
    private BigDecimal principle;
    private BigDecimal lateFee;
    private BigDecimal nsfFee;
    private String returnCode;
    private Date returnDate;
    private String paymentStatus;
    private boolean isDebit;
    private Date successDate;
    private boolean isOrigination;
    private String creditReason;
    private BigDecimal financeFee;
    private BigDecimal feesAmount;
    private BigDecimal paymentAmount;
    private BigDecimal cumulativePayment;
    private String processor;
    private String processorStatus;
    private boolean isLateFeeWaived;
    private boolean isNsfFeeWaived;
    private boolean isRetried;
    private String paymentBatchId;
    private String paymentReturnId;
    private List<String> tags = new ArrayList<>();
    private BigDecimal deferralFee;
    private BigDecimal tipAmount;

    // Track payment details
    private String paymentProfileId;
    private String paymentTranxId;
    private Map<String, String> paymentDetails = new HashMap<>();
}
