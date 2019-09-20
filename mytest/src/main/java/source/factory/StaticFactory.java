package source.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/14 15:30
 */
public class StaticFactory {

	private static Map<String, Car> cars = new HashMap<>();

	static {
		cars.put("aodi", new Car("aodi", 300000));
		cars.put("baoma", new Car("baoma", 1000000));
	}

	public static Car getCar(String name){
		return cars.get(name);
	}
}
