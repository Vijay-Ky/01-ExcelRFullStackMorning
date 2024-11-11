package com.mainpackage.dao;

import com.mainpackage.Account;

import java.util.List;

public interface AccountDAO
{
    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);

    // add a new method: findAccounts()

    List<Account> findAccounts();

    List<Account> findAccounts(boolean tripWire);

}

