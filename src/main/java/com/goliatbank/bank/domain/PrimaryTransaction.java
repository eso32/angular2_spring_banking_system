package com.goliatbank.bank.domain;

import java.math.BigDecimal;
import java.util.Date;

public class PrimaryTransaction {

    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private BigDecimal avaliableBalance;
    private PrimaryAccount primaryAccount;

    public PrimaryTransaction() {};

    public PrimaryTransaction(Date date, String description, String type, String status, double amount, BigDecimal avaliableBalance, PrimaryAccount primaryAccount) {
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.avaliableBalance = avaliableBalance;
        this.primaryAccount = primaryAccount;
    }
}
