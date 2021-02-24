package com.bkcomm.instructions_system.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bkcomm.instructions_system.pojo.SecuBond;
import com.bkcomm.instructions_system.pojo.User;
import com.bkcomm.instructions_system.pojo.UserVO;

/**
 * @Description
 * @author Mingbo Ping	
 * @version
 * @date 2021年2月6日下午8:19:43
 * 
 */
public interface UserService {

	List<User> getAllUsers();
	
	/**
	 * @Description 验证是否存在该用户
	 * @author Mingbo Ping
	 * @date 2021年2月6日下午9:00:55
	 * @param userName
	 * @param password
	 * @return
	 */
	User isExistUser(String userName , String password);
	
	/**
	 * @Description 登录之后获取该用户账户信息
	 * @author Mingbo Ping
	 * @date 2021年2月8日上午10:18:27
	 * @param userName
	 * @return
	 */
	User getUserAccountInfo(String userName);
	

	
	//Map<String, Object> getUseAccFondInfo(String secuCode);
	
	//UserVO getUAS(Map<String, Object> params) ;
	//public HashMap<String, Object> getUAS(String secuCode , String accountName);
	SecuBond getSecuBondInfo(String secuCode);
	
	/**
	 * @Description 根据账户名字获取债券信息和持仓信息
	 * @author Mingbo Ping
	 * @date 2021年2月10日下午2:08:03
	 * @param accountName
	 * @return
	 */
	UserVO getAccBondPosi(String accountName);
	
}
