package com.software.design.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SourceAspect {

    @After("execution(public com.software.design.proxy.SourceData.SourceData(int))")
    public void afterConstructSourceData(ProceedingJoinPoint joinPoint) throws Throwable {
        SourceData result = (SourceData) joinPoint.proceed();
        System.out.println("생성 된 데이터의 데이터 : " + result.getSourceString());
    }
}
