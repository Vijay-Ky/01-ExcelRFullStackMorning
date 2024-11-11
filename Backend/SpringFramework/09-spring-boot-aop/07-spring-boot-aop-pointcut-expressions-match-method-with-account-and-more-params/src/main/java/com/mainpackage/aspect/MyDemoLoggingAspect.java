package com.mainpackage.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect
{
    //Account type and any parameters
    @Before("execution(* add*(com.mainpackage.Account, ..))")
    public void beforeAddAccountAdvice()
    {
        System.out.println("\n=====>>> Executing @Before advice on method");
    }
}
