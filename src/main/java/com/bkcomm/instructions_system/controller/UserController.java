package com.bkcomm.instructions_system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bkcomm.instructions_system.common.Result;
import com.bkcomm.instructions_system.pojo.SecuBond;
import com.bkcomm.instructions_system.pojo.User;
import com.bkcomm.instructions_system.pojo.UserVO;
import com.bkcomm.instructions_system.service.UserService;

/**
 * @Description
 * @author Mingbo Ping	
 * @version
 * @date 2021年2月5日下午5:35:43
 * 
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("users", allUsers);
		return "index";
	}

	/**
	 * @Description 登录验证
	 * @author Mingbo Ping
	 * @date 2021年2月7日上午8:39:34
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("/loginValidate")
	public String loginValidate(User user, Model model) {
		if (userService.isExistUser(user.getUserName(), user.getUserPwd()) != null) {
			//			model.addAttribute("username", user.getUserName());
			User user1 = userService.getUserAccountInfo(user.getUserName());
			System.out.println(user1);
			model.addAttribute("userAccountInfo", user1);
			return "index1";
		} else {

			return "index";
		}
	}

	/**
	 * @Description 注销当前用户
	 * @author Mingbo Ping
	 * @date 2021年2月7日上午8:42:02
	 * @param session
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		// 通过session.invalidate()方法注销
		session.invalidate();
		return "index";
	}

	/**
	 * @Description 获取用户-账户信息
	 * @author Mingbo Ping
	 * @date 2021年2月8日上午11:17:13
	 * @param userName
	 * @param model
	 * @return
	 */
	@RequestMapping("/getUserAccounts/{userName}")
	public String getUserAccounts(@PathVariable("userName") String userName, Model model) {
		User user = userService.getUserAccountInfo(userName);
		model.addAttribute("userAccountInfo", user);
		return "index2";
	}

	//	@RequestMapping("/getUseAccountFondInfo")
	//	public String getUseAccountFondInfo(Model model) {
	//		HashMap<String, Object> userMap = userService.getMapUseAccountFondInfo();
	//		System.out.println(userMap);
	//		model.addAttribute("usermap", userMap);
	//		return "index3";
	//	}

	/**
	 * @Description 账户对应债券信息，根据债券代码获取
	 * @author Mingbo Ping
	 * @date 2021年2月9日上午10:11:34
	 * @param secuCode
	 * @param model
	 * @return
	 */
	//	@RequestMapping("getUseAccFondInfo1/{secuCode}")
	//	@ResponseBody
	//	public Result getUseAccFondInfo(@PathVariable("secuCode") String secuCode) {
	//		Map<String, Object> list = userService.getUseAccFondInfo(secuCode);
	//		return Result.ok().data(list);
	//	}

	//	@RequestMapping("/getUAS")
	//	@ResponseBody
	//	public String getUAS() {
	//		HashMap<String,Object> map  = new HashMap<>();
	//		map.put("accountName", "pmb产品账户");
	//		map.put("secuCode", "010001");
	//		UserVO userVO = userService.getUAS(map);
	//		System.out.println(userVO+"--------------------");
	//		return userVO.toString();
	//	}

	/**
	 * @Description 根据债券代码查询债券信息
	 * @author Mingbo Ping
	 * @date 2021年2月10日上午9:46:53
	 * @return
	 */
	@RequestMapping("/getUAS/{secuCode}")
	@ResponseBody
	public Result getUAS(@PathVariable String secuCode) {
		SecuBond secuBond = userService.getSecuBondInfo(secuCode);
		HashMap<String, Object> map = new HashMap<>();
		map.put("getuas", secuBond);
		return Result.ok().data(map);
	}

	@RequestMapping("/getAccBondPosi/{accountName}")
	@ResponseBody
	public Result getAccBondPosi(@PathVariable String accountName) {
		UserVO u = userService.getAccBondPosi(accountName);
		HashMap<String, Object> map = new HashMap<>() ;
		map.put("u", u);
		System.out.println("---"+map+"-----------");
		return Result.ok().data(map);
	}
}
