package com.example.model;

public class Balance {

    private String BalanceType;

    private String Category;

    private BalanceDetail BalanceDetail;

    private Wallets[] Wallets;

    public String getBalanceType() {
        return BalanceType;
    }

    public void setBalanceType(String balanceType) {
        BalanceType = balanceType;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public BalanceDetail getBalanceDetail() {
        return BalanceDetail;
    }

    public void setBalanceDetail(BalanceDetail balanceDetail) {
        BalanceDetail = balanceDetail;
    }

    public Wallets[] getWallets() {
        return Wallets;
    }

    public void setWallets(Wallets[] wallets) {
        Wallets = wallets;
    }
}
