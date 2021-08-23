package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LoanReqCustomer {
    private LoanReqCustomerPersonal personal = new LoanReqCustomerPersonal();
    private LoanReqCustomerEmployment employment = new LoanReqCustomerEmployment();
    private LoanReqCustomerBank bank = new LoanReqCustomerBank();
    private List<LoanReqCustomerReference> reference = new ArrayList<>();
}
