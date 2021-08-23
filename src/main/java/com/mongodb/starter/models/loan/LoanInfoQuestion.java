package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LoanInfoQuestion {
    private String category;
    private String question;
    private List<String> answers = new ArrayList<>();
}
