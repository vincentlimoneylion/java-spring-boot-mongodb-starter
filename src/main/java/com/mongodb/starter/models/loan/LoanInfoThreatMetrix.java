package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanInfoThreatMetrix {
    private ThreatMetrixSession esign = new ThreatMetrixSession();
}
