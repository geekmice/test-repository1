package com.bkcomm.instructions_system.pojo;

import java.util.List;

public class User {
	private int userId;
	private String userName;
	private String userPwd;
	private List<Account> userAccounts;
	
	/**
	 * 无参构造方法
	 */
	public User() {
		
	}
	/**
	 * @param userId
	 * @param userName
	 * @param userPwd
	 * @param userAccounts
	 */
	public User(int userId, String userName, String userPwd, List<Account> userAccounts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userAccounts = userAccounts;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public List<Account> getUserAccounts() {
		return userAccounts;
	}
	public void setUserAccounts(List<Account> userAccounts) {
		this.userAccounts = userAccounts;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userAccounts="
				+ userAccounts + "]";
	}
	
	
}
