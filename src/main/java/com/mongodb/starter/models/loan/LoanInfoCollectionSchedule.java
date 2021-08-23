package com.mongodb.starter.models.loan;

import lombok.*;
import org.bson.types.ObjectId;

import java.math.BigDecimal;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@With
public class LoanInfoCollectionSchedule {
    private ObjectId id = new ObjectId();
    private Date originalDate; // the original scheduled date
    private Date effectiveDate; // reflects the true date (after potential retries, skips, etc)
    private String processor;
    private String paymentStatus;
    private String paymentType;
    private BigDecimal principal;
    private BigDecimal financeFee;

    private int skipCount;
    private int retryCount;

    private BigDecimal lateFee;
    private Boolean lateFeeWaived;
    private BigDecimal nsfFee;
    private Boolean nsfFeeWaived;

    private BigDecimal amtPayment;
    private List<LoanInfoCollectionScheduleHistory> histories = new ArrayList<>();
    private Map<String, String> paymentDetails = new HashMap<>();
}
