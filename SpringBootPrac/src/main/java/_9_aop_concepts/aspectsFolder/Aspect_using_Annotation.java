package _9_aop_concepts.aspectsFolder;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;


@Aspect
@Order(1)
@Component
public class Aspect_using_Annotation {
    public Logger logger = Logger.getLogger(Aspect_using_Annotation.class.getName());
    @Around("@annotation(_9_aop_concepts.interfaces.LogAnnotation)")
    public void logAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        var start = Instant.now();
        logger.log(Level.INFO, joinPoint.getSignature().toString() + " starts executed");
        joinPoint.proceed();
        var end = Instant.now();
        logger.log(Level.INFO, joinPoint.getSignature().toString() + " finished executed");
        var diff = Duration.between(start,end).toMillis();
        var timeTook = Long.toString(diff);
        logger.log(Level.INFO, joinPoint.getSignature().toString() + " took " + timeTook + " ms for execution");
    }
}
