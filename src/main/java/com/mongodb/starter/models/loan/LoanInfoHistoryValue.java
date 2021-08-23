package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanInfoHistoryValue {
    private String fieldName;
    private String fieldType;
    private Object oldValue;
    private Object newValue;
}
