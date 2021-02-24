package com.bkcomm.instructions_system.pojo;

import java.math.BigDecimal;

/**
 * @Description
 * @author Mingbo Ping	
 * @version
 * @date 2021年2月8日上午10:22:27
 * 
 */
public class Account {

	// 账户id
	private int accountId ;
	
	// 账户名称
	private String accountName ;
	
	// T0可用余额
	private BigDecimal tMoney ;
	
	// T1可用余额
	private BigDecimal t1Money;
	
	// 现金金额
	private BigDecimal cashMoney ;
	
	// 可买券面总额
	private BigDecimal faceMoney ;

	/**
	 * 无参构造
	 */
	public Account() {
		
	}

	/**
	 * @param accountId
	 * @param accountName
	 * @param tMoney
	 * @param t1Money
	 * @param cashMoney
	 * @param faceMoney
	 */
	public Account(int accountId, String accountName, BigDecimal tMoney, BigDecimal t1Money, BigDecimal cashMoney,
			BigDecimal faceMoney) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.tMoney = tMoney;
		this.t1Money = t1Money;
		this.cashMoney = cashMoney;
		this.faceMoney = faceMoney;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public BigDecimal gettMoney() {
		return tMoney;
	}

	public void settMoney(BigDecimal tMoney) {
		this.tMoney = tMoney;
	}

	public BigDecimal getT1Money() {
		return t1Money;
	}

	public void setT1Money(BigDecimal t1Money) {
		this.t1Money = t1Money;
	}

	public BigDecimal getCashMoney() {
		return cashMoney;
	}

	public void setCashMoney(BigDecimal cashMoney) {
		this.cashMoney = cashMoney;
	}

	public BigDecimal getFaceMoney() {
		return faceMoney;
	}

	public void setFaceMoney(BigDecimal faceMoney) {
		this.faceMoney = faceMoney;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", tMoney=" + tMoney + ", t1Money="
				+ t1Money + ", cashMoney=" + cashMoney + ", faceMoney=" + faceMoney + "]";
	}

	
}
