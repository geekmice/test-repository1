package com.bkcomm.instructions_system.pojo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description
 * @author Mingbo Ping	
 * @version
 * @date 2021年2月8日下午4:34:21
 * 
 */
public class UserVO {
	private int userId;
	private String userName;
	private String userPwd;
	// 账户id
	private int accountId;

	// 账户名称
	private String accountName;

	// T0可用余额
	private BigDecimal tMoney;

	// T1可用余额
	private BigDecimal t1Money;

	// 现金金额
	private BigDecimal cashMoney;

	// 可买券面总额
	private BigDecimal faceMoney;

	// 债券代码
	private String secuCode;

	// 债券简称
	private String secuName;

	// 结算日
	private String closeDay;

	// 登记机构
	private String registerOrg;

	// 中债估值
	private BigDecimal assessment;

	// 应计利息
	private BigDecimal interest;

	// 票面利率
	private BigDecimal faceRate;

	// 债券评级
	private String secuGrade;

	// 主体评级
	private String mainGrade;

	// 债券信息id
	private int secuBondId;

	// 持仓数量
	private int posiCounts;

	// 质押数量
	private int pledgeCounts;

	// 中证估值净价
	private BigDecimal debtAssess;

	// 中证估值净价
	private BigDecimal secuAssess;

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

	public String getSecuCode() {
		return secuCode;
	}

	public void setSecuCode(String secuCode) {
		this.secuCode = secuCode;
	}

	public String getSecuName() {
		return secuName;
	}

	public void setSecuName(String secuName) {
		this.secuName = secuName;
	}

	public String getCloseDay() {
		return closeDay;
	}

	public void setCloseDay(String closeDay) {
		this.closeDay = closeDay;
	}

	public String getRegisterOrg() {
		return registerOrg;
	}

	public void setRegisterOrg(String registerOrg) {
		this.registerOrg = registerOrg;
	}

	public BigDecimal getAssessment() {
		return assessment;
	}

	public void setAssessment(BigDecimal assessment) {
		this.assessment = assessment;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getFaceRate() {
		return faceRate;
	}

	public void setFaceRate(BigDecimal faceRate) {
		this.faceRate = faceRate;
	}

	public String getSecuGrade() {
		return secuGrade;
	}

	public void setSecuGrade(String secuGrade) {
		this.secuGrade = secuGrade;
	}

	public String getMainGrade() {
		return mainGrade;
	}

	public void setMainGrade(String mainGrade) {
		this.mainGrade = mainGrade;
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
		return "UserVO [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", accountId="
				+ accountId + ", accountName=" + accountName + ", tMoney=" + tMoney + ", t1Money=" + t1Money
				+ ", cashMoney=" + cashMoney + ", faceMoney=" + faceMoney + ", secuCode=" + secuCode + ", secuName="
				+ secuName + ", closeDay=" + closeDay + ", registerOrg=" + registerOrg + ", assessment=" + assessment
				+ ", interest=" + interest + ", faceRate=" + faceRate + ", secuGrade=" + secuGrade + ", mainGrade="
				+ mainGrade + ", secuBondId=" + secuBondId + ", posiCounts=" + posiCounts + ", pledgeCounts="
				+ pledgeCounts + ", debtAssess=" + debtAssess + ", secuAssess=" + secuAssess + "]";
	}


}
