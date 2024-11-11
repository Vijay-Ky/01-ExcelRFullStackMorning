package com.mainpackage.dao;

import com.mainpackage.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO {

    private String name;
    private String serviceCode;

    @Override
    public List<Account> findAccounts()
    {
        return findAccounts(true);
    }

    @Override
    public void addAccount(Account theAccount, boolean vipFlag) {

        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    @Override
    public boolean doWork() {

        System.out.println(getClass() + ": doWork()");
        return false;
    }

    public String getName() {
        System.out.println(getClass() + ": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": in setServiceCode()");
        this.serviceCode = serviceCode;
    }

    @Override
    public List<Account> findAccounts(boolean tripWire)
    {
        // for academic purposes ... simulate an exception
        if (tripWire)
        {
            throw new RuntimeException("No soup for you!!!");
        }
        List<Account> myAccounts = new ArrayList<>();

        // create sample accounts
        Account temp1 = new Account("Vijay", "Kumar");
        Account temp2 = new Account("Yash", "Vaishnav");
        Account temp3 = new Account("Suman", "Yadav");

        // add them to our accounts list
        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);

        System.out.println("::::::::::::Returning from findAccounts():::::::");
        return myAccounts;
    }
}