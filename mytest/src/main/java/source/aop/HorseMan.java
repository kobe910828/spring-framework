package source.aop;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/30 16:27
 */
public class HorseMan implements HorseManApi {
	@Override
	public void rush(String enemy) {
		System.out.println(this.getClass().getSimpleName() + "冲刺攻击" + enemy);
	}

	@Override
	public void chop(String enemy) {
		System.out.println(this.getClass().getSimpleName() + "砍劈攻击" + enemy);
	}

}
