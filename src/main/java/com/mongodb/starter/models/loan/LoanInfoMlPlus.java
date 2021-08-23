package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanInfoMlPlus {
    private String doneBvUnderwritingId;
    // null if the user gets rejected before the rule that sets it
    private Boolean hasRecentApprovedAndPaidOffRejectedLoan;
    private Boolean returningPlusCustomer;
}
