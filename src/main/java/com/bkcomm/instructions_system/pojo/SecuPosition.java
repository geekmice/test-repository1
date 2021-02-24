package com.bkcomm.instructions_system.pojo;

import java.math.BigDecimal;

import org.apache.naming.java.javaURLContextFactory;

/**
 * @Description
 * @author Mingbo Ping	
 * @version
 * @date 2021年2月8日下午4:35:04
 * 
 */
public class SecuPosition {
	// 账户id
	private int accountId ;
	
	// 债券信息id
	private int secuBondId ;
	
	// 持仓数量
	private int posiCounts ;
	
	// 质押数量
	private int pledgeCounts ;
	
	// 中证估值净价
	private BigDecimal debtAssess ;
	
	// 中证估值净价
	private BigDecimal secuAssess ;

	public SecuPosition() {
		
	}
	/**
	 * @param accountId
	 * @param secuBondId
	 * @param posiCounts
	 * @param pledgeCounts
	 * @param debtAssess
	 * @param secuAssess
	 */
	public SecuPosition(int accountId, int secuBondId, int posiCounts, int pledgeCounts, BigDecimal debtAssess,
			BigDecimal secuAssess) {
		super();
		this.accountId = accountId;
		this.secuBondId = secuBondId;
		this.posiCounts = posiCounts;
		this.pledgeCounts = pledgeCounts;
		this.debtAssess = debtAssess;
		this.secuAssess = secuAssess;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getSecuBondId() {
		return secuBondId;
	}

	public void setSecuBondId(int secuBondId) {
		this.secuBondId = secuBondId;
	}

	public int getPosiCounts() {
		return posiCounts;
	}

	public void setPosiCounts(int posiCounts) {
		this.posiCounts = posiCounts;
	}

	public int getPledgeCounts() {
		return pledgeCounts;
	}

	public void setPledgeCounts(int pledgeCounts) {
		this.pledgeCounts = pledgeCounts;
	}

	public BigDecimal getDebtAssess() {
		return debtAssess;
	}

	public void setDebtAssess(BigDecimal debtAssess) {
		this.debtAssess = debtAssess;
	}

	public BigDecimal getSecuAssess() {
		return secuAssess;
	}

	public void setSecuAssess(BigDecimal secuAssess) {
		this.secuAssess = secuAssess;
	}

	@Override
	public String toString() {
		return "SecuPosition [accountId=" + accountId + ", secuBondId=" + secuBondId + ", posiCounts=" + posiCounts
				+ ", pledgeCounts=" + pledgeCounts + ", debtAssess=" + debtAssess + ", secuAssess=" + secuAssess + "]";
	}
	
	
	
}
