package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LoanInfoExperiment {
    private String name;
    private List<String> tags = new ArrayList<>();
}
