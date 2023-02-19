package _9_aop_concepts.aspectsFolder;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Order(2)
@Component
public class Aspect_using_Execution {

    public Logger logger = Logger.getLogger(Aspect_using_Execution.class.getName());
//_9_aop_concepts.beans.
    @Around("execution(* *(..)) && args(n,..)")
    public void LoggerAspect(ProceedingJoinPoint joinPoint,int n) throws Throwable {
        if(n < 0){
            throw new RuntimeException("Number should be positive");
        }else{
            var start  = Instant.now();
            logger.log(Level.INFO, joinPoint.getSignature().toString() + " gets executed");
            joinPoint.proceed();
            var end = Instant.now();
            var timeForExecution = Duration.between(start,end).toMillis();
            var stringTime = Long.toString(timeForExecution);
            logger.log(Level.INFO, joinPoint.getSignature().toString() + " took " + stringTime +" ms");
            logger.log(Level.INFO, joinPoint.getSignature().toString() + " finished execution");
        }
    }

    @Before("execution(* *(..))")
    public void BeforeLogger(JoinPoint joinPoint){
        logger.log(Level.INFO, "Before aspect gets executed for " +  joinPoint.getSignature().toString());
    }

    @AfterThrowing(value = "execution(* *(..))",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex){
        logger.log(Level.SEVERE, "Error for " +  joinPoint.getSignature().toString() + ex.getMessage().toString());
    }

    @AfterReturning(value = "execution(* *(..))",returning = "returnVal")
    public void returningAspect(JoinPoint joinPoint,Object returnVal){
        logger.log(Level.INFO, "Return values from " +  joinPoint.getSignature() + " "+ returnVal);
    }
}
