package io.greekn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2021-01-26 17:25
 * @package: io.greekn
 * @modified: Greekn
 * @description:
 */
public class ConfigurableListableBeanFactoryTest {
	public static ClassPathXmlApplicationContext context;
	private static String _paramString;
	private static Object _paramObject;
	static {
		context=new ClassPathXmlApplicationContext("configurableListableBeanFactoryTest.xml");
	}
}
