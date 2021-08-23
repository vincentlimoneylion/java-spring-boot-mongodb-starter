package com.mongodb.starter.models.loan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import org.bson.types.ObjectId;

import java.math.BigDecimal;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@With
public class LoanInfoRepaymentEscrowHistory {
    private ObjectId id = new ObjectId();

    private String paymentId;
    private BigDecimal amount;
    private BigDecimal interestAmount;
    private String type; // refer to EscrowPaymentTypes enum
    private String subType; // refer to EscrowPaymentSubTypes enum
    private String paymentStatus; // refer to EscrowPaymentStatuses enum
    private Date effectiveDate;
    private Date successDate;
    private Date returnDate;
    private String returnCode;
    private Map<String, String> paymentDetails = new HashMap<>(); // refer to EscrowPaymentDetails enum for possible keys

    private Date updatedOn = new Date();
    private Date createdOn = new Date();
    private int deleted;
}
