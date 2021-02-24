package com.bkcomm.instructions_system.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bkcomm.instructions_system.dao.UserDao;
import com.bkcomm.instructions_system.pojo.SecuBond;
import com.bkcomm.instructions_system.pojo.User;
import com.bkcomm.instructions_system.pojo.UserVO;
import com.bkcomm.instructions_system.service.UserService;

/**
 * @Description
 * @author Mingbo Ping	
 * @version
 * @date 2021年2月5日下午5:34:23
 * 
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	/* (non-Javadoc)
	 * @see com.bkcomm.instructions_system.service.UserService#isExistUser(java.lang.String, java.lang.String)
	 */
	@Override
	public User isExistUser(String userName, String password) {
		return userDao.isExistUser(userName, password);
	}

	/* (non-Javadoc)
	 * @see com.bkcomm.instructions_system.service.UserService#getUserAccountInfo(java.lang.String)
	 */
	@Override
	public User getUserAccountInfo(String userName) {
		return userDao.getUserAccountInfo(userName);
	}

	/* (non-Javadoc)
	 * @see com.bkcomm.instructions_system.service.UserService#getSecuBondInfo(java.lang.String)
	 */
	@Override
	public SecuBond getSecuBondInfo(String secuCode) {
		// TODO Auto-generated method stub
		return userDao.getSecuBondInfo(secuCode);
	}

	/* (non-Javadoc)
	 * @see com.bkcomm.instructions_system.service.UserService#getAccBondPosi(java.lang.String)
	 */
	@Override
	public UserVO getAccBondPosi(String accountName) {
		// TODO Auto-generated method stub
		return userDao.getAccBondPosi(accountName);
	}
}
