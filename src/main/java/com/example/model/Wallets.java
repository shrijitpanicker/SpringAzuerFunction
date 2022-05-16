package com.example.model;

public class Wallets {

    private Long Id;

    private String Name;

    private String Status;

    private String ExpiryDate;

    private Amount Amount;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
    }

    public Amount getAmount() {
        return Amount;
    }

    public void setAmount(Amount amount) {
        Amount = amount;
    }
}
