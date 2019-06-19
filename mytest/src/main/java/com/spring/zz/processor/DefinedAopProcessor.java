package com.spring.zz.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author: zhoujiong
 * @description: 自定义processor处理器，参与Spring的bean初始化
 * @className: DefinedProcessor
 * @date: 2019/6/19 15:02
 */
@Component
public class DefinedAopProcessor implements BeanPostProcessor ,PriorityOrdered {

	/**
	 * bean初始化之前 。aop 就是在初始化bean的时候在这一步将bean进行代理
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {


		//实现代理

		System.out.println("before-----bean 初始化："+beanName);

		return bean;
	}

	/**
	 * bean初始化之后
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("after-----bean初始化："+beanName);
		return bean;
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
