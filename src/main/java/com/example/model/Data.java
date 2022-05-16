package com.example.model;

public class Data {

    private String Type;

    private String Status;

    private String StartDate;

    private String EndDate;

    private String Language;

    private Long TariffPlanId;

    private String TariffPlan;

    private String CustomerType;

    private Balance[] Balance;

    private UsageCounterAndThreshold[] UsageCounterAndThreshold;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public Long getTariffPlanId() {
        return TariffPlanId;
    }

    public void setTariffPlanId(Long tariffPlanId) {
        TariffPlanId = tariffPlanId;
    }

    public String getTariffPlan() {
        return TariffPlan;
    }

    public void setTariffPlan(String tariffPlan) {
        TariffPlan = tariffPlan;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public Balance[] getBalance() {
        return Balance;
    }

    public void setBalance(Balance[] balance) {
        Balance = balance;
    }

    public UsageCounterAndThreshold[] getUsageCounterAndThreshold() {
        return UsageCounterAndThreshold;
    }

    public void setUsageCounterAndThreshold(UsageCounterAndThreshold[] usageCounterAndThreshold) {
        UsageCounterAndThreshold = usageCounterAndThreshold;
    }
}
