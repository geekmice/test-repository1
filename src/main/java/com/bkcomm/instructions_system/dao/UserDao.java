package com.bkcomm.instructions_system.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bkcomm.instructions_system.pojo.SecuBond;
import com.bkcomm.instructions_system.pojo.User;
import com.bkcomm.instructions_system.pojo.UserVO;

/**
 * @Description
 * @author Mingbo Ping	
 * @version
 * @date 2021年2月5日下午5:31:11
 * 
 */
public interface UserDao {
	/**
	 * @Description 测试查询所有用户信息
	 * @author Mingbo Ping
	 * @date 2021年2月6日下午8:59:20
	 * @return
	 */
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
	/**
	 * @Description 获取用户-账户对应债券信息
	 * @author Mingbo Ping
	 * @date 2021年2月8日下午2:34:30
	 * @return
	 */
	//HashMap<String, Object> getUAS(@Param("secuCode") String secuCode , @Param("accountName") String accountName);
	

	/**
	 * @Description 根据债券代码查询债券信息
	 * @author Mingbo Ping
	 * @date 2021年2月10日下午1:58:12
	 * @param secuCode
	 * @return
	 */
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
