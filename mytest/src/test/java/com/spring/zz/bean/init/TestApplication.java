package com.spring.zz.bean.init;

import com.spring.zz.config.BeanInitSpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhoujiong
 * @description: spring 启动
 * @className: TestApplication
 * @date: 2019/6/15 15:37
 */
public class TestApplication {


	@Test
	public void testInit(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(BeanInitSpringConfig.class);

		annotationConfigApplicationContext.refresh();

		System.out.println(annotationConfigApplicationContext.getBean("userService"));

	}

}
