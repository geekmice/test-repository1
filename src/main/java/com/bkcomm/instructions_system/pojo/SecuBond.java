package com.bkcomm.instructions_system.pojo;

import java.math.BigDecimal;

/**
 * @Description
 * @author Mingbo Ping	
 * @version
 * @date 2021年2月8日下午2:39:37
 * 
 */
public class SecuBond {
	// 主键ID
	private int secuBondId ;
	
	// 债券代码
	private String secuCode ;
	
	// 债券简称
	private String secuName ;
	
	// 结算日
	private String closeDay ;
	
	// 登记机构
	private String registerOrg ;
	
	// 中债估值
	private BigDecimal assessment ;
	
	// 应计利息
	private BigDecimal interest ;
	
	// 票面利率
	private BigDecimal faceRate ;
	
	// 债券评级
	private String secuGrade ;
	
	// 主体评级
	private String mainGrade ;

	/**
	 * 无参构造
	 */
	public SecuBond() {
		
	}
	/**
	 * @param secuBondId
	 * @param secuCode
	 * @param secuName
	 * @param closeDay
	 * @param registerOrg
	 * @param assessment
	 * @param interest
	 * @param faceRate
	 * @param secuGrade
	 * @param mainGrade
	 */
	public SecuBond(int secuBondId, String secuCode, String secuName, String closeDay, String registerOrg,
			BigDecimal assessment, BigDecimal interest, BigDecimal faceRate, String secuGrade, String mainGrade) {
		super();
		this.secuBondId = secuBondId;
		this.secuCode = secuCode;
		this.secuName = secuName;
		this.closeDay = closeDay;
		this.registerOrg = registerOrg;
		this.assessment = assessment;
		this.interest = interest;
		this.faceRate = faceRate;
		this.secuGrade = secuGrade;
		this.mainGrade = mainGrade;
	}

	public int getSecuBondId() {
		return secuBondId;
	}

	public void setSecuBondId(int secuBondId) {
		this.secuBondId = secuBondId;
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

	@Override
	public String toString() {
		return "SecuBond [secuBondId=" + secuBondId + ", secuCode=" + secuCode + ", secuName=" + secuName
				+ ", closeDay=" + closeDay + ", registerOrg=" + registerOrg + ", assessment=" + assessment
				+ ", interest=" + interest + ", faceRate=" + faceRate + ", secuGrade=" + secuGrade + ", mainGrade="
				+ mainGrade + "]";
	}
	
	
}
