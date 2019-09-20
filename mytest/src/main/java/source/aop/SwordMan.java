package source.aop;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/30 16:27
 */
public class SwordMan {
	public void block(String enemy) {
		System.out.println(this.getClass().getSimpleName() + "格挡" + enemy);
	}

	public void chop(String enemy) {
		System.out.println(this.getClass().getSimpleName() + "砍劈攻击" + enemy);
	}
}
