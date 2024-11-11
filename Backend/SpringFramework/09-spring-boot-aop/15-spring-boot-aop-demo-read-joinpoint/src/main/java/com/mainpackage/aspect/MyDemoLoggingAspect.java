package com.mainpackage.aspect;

import com.mainpackage.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//if you only have pointcuts then @Aspect is optional. only required if you add advices in this class: @Before, @After
@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect
{
    @Before("com.mainpackage.aspect.CompanyAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint)
    {
        System.out.println("\n=====>>> Executing @Before advice on method");

        // display the method signature
        MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();

        System.out.println("Method::::::::::::::::::: " + methodSignature);

        // display method arguments

        // get args
        //returns an array of arguments
        Object[] args = theJoinPoint.getArgs();

        // loop through args
        //Object obj = new Account();
        //  Account ref = (Account) obj;
        //Employee();

        for (Object tempArg : args)
        {
            System.out.println(tempArg);

            if (tempArg instanceof Account)
            {
                // downcast and print Account specific stuff
                Account theAccount = (Account) tempArg;

                System.out.println("account name: " + theAccount.getName());
                System.out.println("account level: " + theAccount.getLevel());
            }
        }
    }
}
/*
Reading Method Arguments with JoinPoints
 */
