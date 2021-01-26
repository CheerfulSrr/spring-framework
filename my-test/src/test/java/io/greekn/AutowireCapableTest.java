package io.greekn;

import org.junit.Test;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2021-01-26 16:22
 * @package: io.greekn
 * @modified: Greekn
 * @description:
 */
public class AutowireCapableTest {
	@Test
	public void autowireTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowireCapableTest.xml");
		AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
		User user = (User) beanFactory.createBean(User.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);
		System.out.println(user);
	}
}
