package source.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/30 16:28
 */
@Aspect
public class StorageAdvisor {
	@Before("execution(* chop(..))")
	public void beforeAttack(JoinPoint point) {
		System.out.println("Advice: " + point.getTarget().getClass().getSimpleName() + "蓄力");
	}

	public void test(){}
}
