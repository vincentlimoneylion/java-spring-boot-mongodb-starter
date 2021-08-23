package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class LoanInfoCollection {
    private List<LoanInfoCollectionSchedule> schedules = new ArrayList<>();

    private String lastReturnCode;
    private Date lastReturnedDate;
    private Date inCollectionDate;
    private String csrRetention;

    // Snapshot of repayment info from origination
    private BigDecimal totalOutstandingFromOrigination;
    private BigDecimal outstandingPrincipalFromOrigination;
    private BigDecimal outstandingFinanceFeeFromOrigination;
    private BigDecimal outstandingLateFeeFromOrigination;
    private BigDecimal outstandingNsfFeeFromOrigination;

    // 'Settlement - Paid Off' when balanceCollected is equal to this value
    private BigDecimal settlementAmount;

    private int numPaymentsLeft;

// DYNAMIC FIELDS: The three following sets of amounts sum up to their respective outstandingFromOrigination values
// i.e. totalOutstandingFromOrigination = balanceScheduled + balanceUnscheduled + balanceCollected;

    // Amounts assigned in schedules
    private BigDecimal balanceScheduled;
    private BigDecimal principalScheduled;
    private BigDecimal financeFeeScheduled;
    private BigDecimal nsfFeeScheduled;
    private BigDecimal lateFeeScheduled;

    // Amounts unassigned in schedules
    private BigDecimal balanceUnscheduled;
    private BigDecimal principalUnscheduled;
    private BigDecimal financeFeeUnscheduled;
    private BigDecimal lateFeeUnscheduled;
    private BigDecimal nsfFeeUnscheduled;

    // Amounts recovered in collections. 'Paid Off' when these values equal outstandingFromOrigination counterparts
    private BigDecimal balanceCollected;
    private BigDecimal principalCollected;
    private BigDecimal financeFeeCollected;
    private BigDecimal lateFeeCollected;
    private BigDecimal nsfFeeCollected;

    private BigDecimal balanceCollectedExternal;
    private BigDecimal principalCollectedExternal;
    private BigDecimal financeFeeCollectedExternal;
    private BigDecimal lateFeeCollectedExternal;
    private BigDecimal nsfFeeCollectedExternal;

    private int daysPastDue;

    // Days Past Due
    private Date collectionDpdDate;
}
