package com.mongodb.starter.models.loan;

public enum ValueType {

    @Deprecated selfReportedNet("selfReportedNet"),
    @Deprecated selfReportedGross("selfReportedGross"),
    @Deprecated manualVerified("manualVerified"),
    @Deprecated bvVerified("bvVerified"),
    @Deprecated tuSoftPull("tuSoftPull"),
    @Deprecated tuHardPull("tuHardPull"),
    @Deprecated tuDebtG199S("tuDebtG199S");

//    SELF_REPORTED_NET("selfReportedNet"),
//    SELF_REPORTED_GROSS("selfReportedGross"),
//    MANUAL_VERIFIED("manualVerified"),
//    BV_VERIFIED("bvVerified"),
//    TU_SOFT_PULL("tuSoftPull"),
//    TU_HARD_PULL("tuHardPull"),
//    TU_DEBT_G199S("tuDebtG199S");

    private String key;

    ValueType(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }

    @Override
    public String toString() {
        return this.key();
    }
}

