package greekn.io;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-10-14 14:40
 * @package greekn.io
 * @modified Greekn
 * @description
 */
public class PlaceHolderTest {

	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		User bean = context.getBean(User.class);
		Assert.assertEquals(bean.getName(), "aaa");
		Assert.assertEquals(bean.getAddress(), "bbb");
	}

}
