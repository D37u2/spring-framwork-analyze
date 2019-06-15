/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context.annotation;

/**
 * Enumerates the various scoped-proxy options.
 *
 * <p>For a more complete discussion of exactly what a scoped proxy is, see the
 * section of the Spring reference documentation entitled '<em>Scoped beans as
 * dependencies</em>'.
 *
 * @author Mark Fisher
 * @since 2.5
 * @see ScopeMetadata
 */

/**
 * 设置动态代理类型
 *
 * 1、DEFAULT 使用默认的，这种情况其他组件扫描指令中配置好，延续使用其他组件配置好的就OK。若在其他组件中未设置则 = NO
 * 2、NO 无代理
 * 3、INTERFACES 使用JDK动态代理
 * 4、TARGET_CLASS 使用cglib动态代理
 *
 */

public enum ScopedProxyMode {

	/**
	 * 默认值通常等于{@link #NO}，除非有不同的默认值
	 * Default typically equals {@link #NO}, unless a different default
	 *
	 * has been configured at the component-scan instruction level.
	 * 已在组件扫描指令级配置。
	 */
	DEFAULT,

	/**
	 * Do not create a scoped proxy.
	 * <p>This proxy-mode is not typically useful when used with a
	 * non-singleton scoped instance, which should favor the use of the
	 * {@link #INTERFACES} or {@link #TARGET_CLASS} proxy-modes instead if it
	 * is to be used as a dependency.
	 *
	 * 当与非单例范围的实例一起使用时，这种代理模式通常不太有用，如果要将其用作依赖项，则应该使用{@link #INTERFACES}或{@link #TARGET_CLASS}代理模式。
	 */
	NO,

	/**
	 * Create a JDK dynamic proxy implementing <i>all</i> interfaces exposed by
	 * the class of the target object.
	 *
	 * 创建一个JDK动态代理来实现<i>所有由目标对象的类公开的</i>接口
	 */
	INTERFACES,

	/**
	 * Create a class-based proxy (uses CGLIB).
	 *
	 * 创建一个基于类的代理(使用CGLIB)。
	 */
	TARGET_CLASS;

}
