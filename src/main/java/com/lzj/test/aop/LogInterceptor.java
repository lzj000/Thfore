package com.lzj.test.aop;



import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.alibaba.druid.support.logging.Log;

//@Aspect  
@Component  
public class LogInterceptor {  
	//private final Logger logger = LoggerFactory.getLogger(LogInterceptor.class);
	private Logger logger = LoggerFactory.getLogger(LogInterceptor.class);
	public LogInterceptor(){
		System.out.println("LOgInterceptor");
	}
	//@Pointcut("execution(* com.lzj.test.web.*.*(..))")
	//@Pointcut("execution(* com.lzj.test.service.UserServiceImpl.userlogin(..))")
    public void pointCut(int id)
    {
		 
    	System.out.println("point cut");
    }
   /* public int around(ProceedingJoinPoint jp){  
        
    	System.out.println("around");
    	Object[] args = jp.getArgs();  
    	try {
			int rvt = (Integer) jp.proceed(args);//执行该方法
			return rvt;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return 0;
    }  */
    //@Before(value = "execution(* com.lzj.test.web.*.*(..))")  
	//@Around(value = "execution(* com.lzj.test.service.*.*(..))")  
    public void before(JoinPoint point ) throws Throwable{  
        
    	System.out.println("start"+" "+point.getSignature().getDeclaringTypeName()+" "+Arrays.toString(point.getArgs()));
    }  
    //@After(value = "execution(* com.lzj.test.web.*.*(..))")  
	//@After(value = "execution(* com.lzj.test.service.UserServiceImpl.userlogin(..))")
    public void after(){  
        
    	System.out.println("end");
    }  
}  