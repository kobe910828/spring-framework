package source.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/14 15:30
 */
public class InstanceFactory {

	private Map<String, Car> cars = null;

	public InstanceFactory() {
		cars = new HashMap<>();
		cars.put("aodi", new Car("aodi", 300000));
		cars.put("baoma", new Car("baoma", 1000000));
	}

	public Car getCar(String name){
		return cars.get(name);
	}
}
