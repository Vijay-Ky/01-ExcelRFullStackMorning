package com.mainpackage.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect
{
    @Pointcut("execution(* com.mainpackage.dao.*.*(..))")
    private void forDaoPackage() {}

    @Pointcut("execution(* com.mainpackage.demo.*.*(..))")
    private void forDemoPackage() {}

    @Before("forDaoPackage()")
    public void beforeAddAccountAdviceDao()
    {
        System.out.println("\n=====>>> Executing @Before advice DAO on method");
    }

    @Before("forDemoPackage()")
    public void beforeAddAccountAdviceDemo()
    {
        System.out.println("\n=====>>> Executing @Before advice Demo on method");
    }
}

