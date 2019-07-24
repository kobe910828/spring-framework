package source;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.io.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/7/23 14:04
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestResourceLoader2 {
	@Test
	public void testResourceLoader(){
//		DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
//		//函数式接口
//		ProtocolResolver myProtocolResolver = new ProtocolResolver() {
//			@Override
//			public Resource resolve(String location, ResourceLoader resourceLoader) {
//				return resourceLoader.getResource(location);
//			}
//		};
//		resourceLoader.addProtocolResolver(myProtocolResolver);
//		Resource resource = resourceLoader.getResource("D:/Users/chenming673/Documents/spark.txt");
//		System.out.println("fileResource1 is FileSystemResource:" + (resource instanceof FileSystemResource));

		ResourceLoader resourceLoader = new DefaultResourceLoader();

		Resource fileResource1 = resourceLoader.getResource("D:/Users/chenming673/Documents/spark.txt");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));
	}
}
