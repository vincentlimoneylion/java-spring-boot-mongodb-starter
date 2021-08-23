package com.mongodb.starter.models.loan;

import lombok.*;
import org.bson.types.ObjectId;

import java.math.BigDecimal;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@With
public class LoanInfoRepaymentSchedule {
    private ObjectId id = new ObjectId();
    private Date createdOn = new Date();
    private Date updatedOn = new Date();

    private Date disclosureDate;
    private Date datePayment;
    private String paymentMode;
    private BigDecimal principal;
    private BigDecimal financeFee;
    private BigDecimal csoFee;
    private BigDecimal tipAmount;
    private BigDecimal deferralFee;

    private BigDecimal lateFee;
    private Boolean lateFeeWaived;
    private BigDecimal nsfFee;
    private Boolean nsfFeeWaived;

    private BigDecimal amtPayment;
    private String scheduleStatus; //Active, Cancelled
    private List<LoanInfoRepaymentScheduleHistory> histories = new ArrayList<>();
}
