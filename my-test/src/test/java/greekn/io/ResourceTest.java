package greekn.io;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

public class ResourceTest {

	@Test
	public void testClassPathResource() throws Exception {
		ClassPathResource resource = new ClassPathResource("beanFactoryTest.xml");
		System.out.println(resource.getURL());
		System.out.println(resource.getDescription());
		System.out.println(resource.getPath());
		System.out.println(resource.getURI());
	}
}
