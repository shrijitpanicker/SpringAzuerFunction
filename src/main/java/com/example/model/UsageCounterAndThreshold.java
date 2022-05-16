package com.example.model;

public class UsageCounterAndThreshold {

    private UsageCounterAndThresholdData UsageCounter;

    private UsageCounterAndThresholdData UsageThreshold;

    public UsageCounterAndThresholdData getUsageCounter() {
        return UsageCounter;
    }

    public void setUsageCounter(UsageCounterAndThresholdData usageCounter) {
        UsageCounter = usageCounter;
    }

    public UsageCounterAndThresholdData getUsageThreshold() {
        return UsageThreshold;
    }

    public void setUsageThreshold(UsageCounterAndThresholdData usageThreshold) {
        UsageThreshold = usageThreshold;
    }
}
