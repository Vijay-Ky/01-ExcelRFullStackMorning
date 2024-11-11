package com.mainpackage.demo;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAODemoImpl implements MembershipDAODemo
{

    @Override
    public boolean addSillyMember()
    {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
        return  false;
    }

    @Override
    public void goToSleep()
    {
        System.out.println(getClass() + ": I'm going to sleep now...");
    }
}