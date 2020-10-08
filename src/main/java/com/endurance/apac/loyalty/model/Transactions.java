package com.endurance.apac.loyalty.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.UUID;

public class Transactions {
    private UUID uuid;
    private String customerId;
    private String resellerId;
    private String product;
    private double amount;
    private String invoiceId;
    private LocalDate dateOfTransaction;

    public Transactions(@JsonProperty("customerId") String customerId,
                        @JsonProperty("resellerId") String resellerId,
                        @JsonProperty("product") String product,
                        @JsonProperty("amount") double amount,
                        @JsonProperty("invoiceId") String invoiceId) {
        this.uuid = UUID.randomUUID();
        this.customerId = customerId;
        this.resellerId = resellerId;
        this.product = product;
        this.amount = amount;
        this.invoiceId = invoiceId;
        this.dateOfTransaction = LocalDate.now();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getResellerId() {
        return resellerId;
    }

    public void setResellerId(String resellerId) {
        this.resellerId = resellerId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public LocalDate getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(LocalDate dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }
}
