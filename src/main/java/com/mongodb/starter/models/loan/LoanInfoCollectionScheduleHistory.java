package com.mongodb.starter.models.loan;

import lombok.*;
import org.bson.types.ObjectId;

import java.math.BigDecimal;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@With
public class LoanInfoCollectionScheduleHistory {
    private ObjectId id = new ObjectId();
    private String paymentId;
    private Date effectiveDate;
    private String paymentType;
    private BigDecimal paymentAmount;
    private String returnCode;
    private Date returnDate;
    private String paymentStatus;
    private Date successDate;
    private String processor;
    private String paymentBatchId;
    private String paymentReturnId;

    //CC Payment Details
    String orderid;
    String invoiceID;
    private boolean isSubmitted;
    private String paymentSource;
    private String paymentStatusReason;
    private String paymentStatusReasonDetails;
    private Date settlementDateForCardConnect;

    // Track payment details
    private String paymentProfileId;
    private String paymentTranxId;
    private Map<String, String> paymentDetails = new HashMap<>();

    private String agentEmail;
}
