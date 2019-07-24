package source;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/7/23 9:47
 */
public class LoginService {
	public String login(String username){
		System.out.println(username + "登录...");
		return "success";
	}
}
