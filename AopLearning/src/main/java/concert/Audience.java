package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by liujiajia on 2017/3/28.
 */
@Aspect
@Component
public class Audience {
    @Pointcut("execution(** concert.Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }

//    // 表演之前
//    @Before("performance()")
//    public void silenceCellPhones() {
//        System.out.println("Silencing cell phones");
//    }
//
//    // 表演之前
//    @Before("performance()")
//    public void takeSeats() {
//        System.out.println("Taking seats");
//    }
//
//    // 表演之后
//    @AfterReturning("performance()")
//    public void applause() {
//        System.out.println("CLAP CLAP CLAP!!!");
//    }
//
//    // 表演失败之后
//    @AfterThrowing("performance()")
//    public void demandRefund() {
//        System.out.println("Demanding a refund");
//    }
}
