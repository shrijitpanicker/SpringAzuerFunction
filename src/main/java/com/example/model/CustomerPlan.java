package com.example.model;

public class CustomerPlan {

    private String StatusCode;

    private String StatusMessage;

    private Long TransactionId;

    private Data Data;

    public String getStatusCode(){
        return StatusCode;
    }

    public void setStatusCode(String statusCode){
        StatusCode = statusCode;
    }

    public String getStatusMessage() { return StatusMessage; }

    public void setStatusMessage(String statusMessage) { StatusMessage = statusMessage; }

    public Long getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(Long transactionId) {
        TransactionId = transactionId;
    }

    public Data getData() {
        return Data;
    }

    public void setData(Data data) {
        Data = data;
    }


}
