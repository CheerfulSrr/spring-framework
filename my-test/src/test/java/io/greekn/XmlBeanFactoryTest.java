package io.greekn;

import org.junit.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanFactoryTest {

	@Test
	public void t1() {
		//XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		int beanPostProcessorCount = beanFactory.getBeanPostProcessorCount();
	}

}
