package greekn.io;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanFactoryTest {

	@Test
	public void t1() {
		//XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		new ClassPathXmlApplicationContext("beanFactoryTest.xml");
	}

}
