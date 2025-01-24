package com.design.Splitwise.models;

import java.util.Date;
import java.util.List;

public class Expense {

    private String description;
    private String currency;
    private int amount;
    private User createdBy;
    private List<User> participation;
    private Date createdAt;

}
