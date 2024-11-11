package com.mainpackage.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect
{
    //Match method on any  param
    @Before("execution(* add*(..))")
    public void beforeAddAccountAdvice()
    {
        System.out.println("\n=====>>> Executing @Before advice on method");
    }
}
