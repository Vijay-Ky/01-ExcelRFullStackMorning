package com.mainpackage.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CompanyAopExpressions {

    @Pointcut("execution(* com.mainpackage.dao.*.*(..))")
    public void forDaoPackage() {}

    // create a pointcut for getter methods
    @Pointcut("execution(* com.mainpackage.dao.*.get*(..))")
    public void getter() {}

    // create a pointcut for setter methods
    @Pointcut("execution(* com.mainpackage.dao.*.set*(..))")
    public void setter() {}

    // create pointcut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}
}
