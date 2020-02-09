package org.kin.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class timeAdvice {

	long proxyTime;
	
	public long getProxyTime() {
		return proxyTime;
	}

	@Around("execution(public * org.kin.service..*(..))")
	public Object logAroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		 String signatureString = joinPoint.getSignature().toShortString();
		    System.out.println("Around [" + signatureString + "] 시작");

		    long start = System.currentTimeMillis()/1000;

		    try {
		      Object result = joinPoint.proceed();
		      return result;
		    } finally {
		      long finish = System.currentTimeMillis()/1000;
		      long time = finish - start;
		      proxyTime = time;
		      System.out.println("Around [" + signatureString + "] 종료");
		      System.out.println("Around [" + signatureString + "] 실행시간 : " + time + "초");
		    }
	}
	
}
