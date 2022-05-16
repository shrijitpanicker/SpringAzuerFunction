package com.example.model;

public class BalanceDetail {

    private String Type;

    private String ActiveValue;

    private String ActiveUnit;

    private String UnusedValue;

    private String UnusedUnit;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getActiveValue() {
        return ActiveValue;
    }

    public void setActiveValue(String activeValue) {
        ActiveValue = activeValue;
    }

    public String getActiveUnit() {
        return ActiveUnit;
    }

    public void setActiveUnit(String activeUnit) {
        ActiveUnit = activeUnit;
    }

    public String getUnusedValue() {
        return UnusedValue;
    }

    public void setUnusedValue(String unusedValue) {
        UnusedValue = unusedValue;
    }

    public String getUnusedUnit() {
        return UnusedUnit;
    }

    public void setUnusedUnit(String unusedUnit) {
        UnusedUnit = unusedUnit;
    }
}
