package source;

import org.springframework.core.io.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/7/23 11:12
 */
public class TestResourceLoader {
	public static void main(String[] args) throws IOException {
//		ResourceLoader resourceLoader = new DefaultResourceLoader();
//
//		Resource fileResource1 = resourceLoader.getResource("D:/Users/chenming673/Documents/spark.txt");
//		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));
//
//		Resource fileResource2 = resourceLoader.getResource("/Users/chenming673/Documents/spark.txt");
//		System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));
//
//		Resource urlResource1 = resourceLoader.getResource("file:/Users/chenming673/Documents/spark.txt");
//		System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));
//
//		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
//		System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));
//
//		//对fileResource1进行改造，改为FileSystemResourceLoader实现
//		resourceLoader = new FileSystemResourceLoader();
//		fileResource1 = resourceLoader.getResource("D:/Users/chenming673/Documents/spark.txt");
//		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

		//PathMatchingResourcePatternResolver(ResourcePatternResolver的子类)
		ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = resourcePatternResolver.getResources("classpath*:applicationContext.xml");
		for (Resource resource : resources) {
			System.out.println(resource instanceof UrlResource);
		}

		List<String> list = new ArrayList<>();
		list.add("Alice");
		list.add("Bob");

		String[] strArray = list.toArray(new String[0]);
		for (String str : strArray) {
			System.out.println(str);
		}

		Object[] objArray = list.toArray();
		for (Object obj : objArray) {
			String str = (String) obj;
			System.out.println(str);
		}

	}
}
