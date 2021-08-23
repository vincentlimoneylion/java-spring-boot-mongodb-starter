package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class LoanInfoHistory {
    private List<LoanInfoHistoryValue> values = new ArrayList<>();
    private Date updatedDate;
    private String source;
    private String sourceEmail;
    private String remark;
    private String purpose;
}
