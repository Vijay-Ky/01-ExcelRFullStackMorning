package com.mainpackage.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect
{
    //(*{any return type}com.mainpackage.dao.*{any class}.*{any method}(..){any param})
    @Before("execution(* com.mainpackage.dao.*.*(..))")
    public void beforeAddAccountAdvice()
    {
        System.out.println("\n=====>>> Executing @Before advice on method");
    }
}

