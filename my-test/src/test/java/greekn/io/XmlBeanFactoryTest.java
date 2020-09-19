package greekn.io;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class XmlBeanFactoryTest {

	@Test
	public void t1() {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
	}

}
