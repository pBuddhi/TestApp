package com.damac.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement


public class RentalPool implements java.io.Serializable {
	static final long serialVersionUID = 1L;
	
	private java.lang.String description;
	private java.util.Date ruleValidityStart;
	private java.util.Date ruleValidityEnd;
	private java.lang.String processName;
	private java.lang.String subProcessName;
	private java.lang.String projectCity;
	private java.lang.String project;
	private java.lang.String buildingCode;
	private java.lang.String bedroomType;
	private java.lang.String applicableViews;
	private java.lang.String unitType;
	private java.lang.String permittedUse;
	private java.lang.String units;
	private java.lang.String readyOffPlan;
	private double price;
	private double area;
	private boolean eho;
	private boolean ho;
	private java.lang.String applicableNationality;
	private java.lang.String customerClassification;
	private int portfolioValue;
	private boolean defaultVal;
	private java.lang.String agreementStatus;
	private boolean overdue;
	private boolean ftlSent;
	private boolean dispute;
	private boolean enforcement;
	private boolean litigation;
	private boolean mortgage;
	private boolean courtCase;
	private int numberOfTimesCustomerHasDefaultedOnInstallments;
	private double percPdcCoveragePercPaymentPaidWhicheverIsHigher;
	private boolean bccReceived;
	
	//ACTION variables;
	private java.lang.String allowed;
	private java.lang.String message;
	private java.lang.String recommendingAuthorityOne;
	private java.lang.String recommendingAuthorityTwo;
	private java.lang.String recommendingAuthorityThree;
	private java.lang.String recommendingAuthorityFour;
	private java.lang.String approvingAuthorityOne;
	private java.lang.String approvingAuthorityTwo;
	private java.lang.String approvingAuthorityThree;
	private java.lang.String adminFeePsf;
	private java.lang.String adminFeeFlat;
	private java.lang.String adminFeePercentage;
	
	public RentalPool(){
		
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.util.Date getRuleValidityStart() {
		return ruleValidityStart;
	}

	public void setRuleValidityStart(java.util.Date ruleValidityStart) {
		this.ruleValidityStart = ruleValidityStart;
	}

	public java.util.Date getRuleValidityEnd() {
		return ruleValidityEnd;
	}

	public void setRuleValidityEnd(java.util.Date ruleValidityEnd) {
		this.ruleValidityEnd = ruleValidityEnd;
	}

	public java.lang.String getProcessName() {
		return processName;
	}

	public void setProcessName(java.lang.String processName) {
		this.processName = processName;
	}

	public java.lang.String getSubProcessName() {
		return subProcessName;
	}

	public void setSubProcessName(java.lang.String subProcessName) {
		this.subProcessName = subProcessName;
	}

	public java.lang.String getProjectCity() {
		return projectCity;
	}

	public void setProjectCity(java.lang.String projectCity) {
		this.projectCity = projectCity;
	}

	public java.lang.String getProject() {
		return project;
	}

	public void setProject(java.lang.String project) {
		this.project = project;
	}

	public java.lang.String getBuildingCode() {
		return buildingCode;
	}

	public void setBuildingCode(java.lang.String buildingCode) {
		this.buildingCode = buildingCode;
	}

	public java.lang.String getBedroomType() {
		return bedroomType;
	}

	public void setBedroomType(java.lang.String bedroomType) {
		this.bedroomType = bedroomType;
	}

	public java.lang.String getApplicableViews() {
		return applicableViews;
	}

	public void setApplicableViews(java.lang.String applicableViews) {
		this.applicableViews = applicableViews;
	}

	public java.lang.String getUnitType() {
		return unitType;
	}

	public void setUnitType(java.lang.String unitType) {
		this.unitType = unitType;
	}

	public java.lang.String getPermittedUse() {
		return permittedUse;
	}

	public void setPermittedUse(java.lang.String permittedUse) {
		this.permittedUse = permittedUse;
	}

	public java.lang.String getUnits() {
		return units;
	}

	public void setUnits(java.lang.String units) {
		this.units = units;
	}

	public java.lang.String getReadyOffPlan() {
		return readyOffPlan;
	}

	public void setReadyOffPlan(java.lang.String readyOffPlan) {
		this.readyOffPlan = readyOffPlan;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isEho() {
		return eho;
	}

	public void setEho(boolean eho) {
		this.eho = eho;
	}

	public boolean isHo() {
		return ho;
	}

	public void setHo(boolean ho) {
		this.ho = ho;
	}

	public java.lang.String getApplicableNationality() {
		return applicableNationality;
	}

	public void setApplicableNationality(java.lang.String applicableNationality) {
		this.applicableNationality = applicableNationality;
	}

	public java.lang.String getCustomerClassification() {
		return customerClassification;
	}

	public void setCustomerClassification(java.lang.String customerClassification) {
		this.customerClassification = customerClassification;
	}

	public int getPortfolioValue() {
		return portfolioValue;
	}

	public void setPortfolioValue(int portfolioValue) {
		this.portfolioValue = portfolioValue;
	}

	public boolean isDefaultVal() {
		return defaultVal;
	}

	public void setDefaultVal(boolean defaultVal) {
		this.defaultVal = defaultVal;
	}

	public java.lang.String getAgreementStatus() {
		return agreementStatus;
	}

	public void setAgreementStatus(java.lang.String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}

	public boolean isOverdue() {
		return overdue;
	}

	public void setOverdue(boolean overdue) {
		this.overdue = overdue;
	}

	public boolean isFtlSent() {
		return ftlSent;
	}

	public void setFtlSent(boolean ftlSent) {
		this.ftlSent = ftlSent;
	}

	public boolean isDispute() {
		return dispute;
	}

	public void setDispute(boolean dispute) {
		this.dispute = dispute;
	}

	public boolean isEnforcement() {
		return enforcement;
	}

	public void setEnforcement(boolean enforcement) {
		this.enforcement = enforcement;
	}

	public boolean isLitigation() {
		return litigation;
	}

	public void setLitigation(boolean litigation) {
		this.litigation = litigation;
	}

	public boolean isMortgage() {
		return mortgage;
	}

	public void setMortgage(boolean mortgage) {
		this.mortgage = mortgage;
	}

	public boolean isCourtCase() {
		return courtCase;
	}

	public void setCourtCase(boolean courtCase) {
		this.courtCase = courtCase;
	}

	public int getNumberOfTimesCustomerHasDefaultedOnInstallments() {
		return numberOfTimesCustomerHasDefaultedOnInstallments;
	}

	public void setNumberOfTimesCustomerHasDefaultedOnInstallments(int numberOfTimesCustomerHasDefaultedOnInstallments) {
		this.numberOfTimesCustomerHasDefaultedOnInstallments = numberOfTimesCustomerHasDefaultedOnInstallments;
	}

	public double getPercPdcCoveragePercPaymentPaidWhicheverIsHigher() {
		return percPdcCoveragePercPaymentPaidWhicheverIsHigher;
	}

	public void setPercPdcCoveragePercPaymentPaidWhicheverIsHigher(double percPdcCoveragePercPaymentPaidWhicheverIsHigher) {
		this.percPdcCoveragePercPaymentPaidWhicheverIsHigher = percPdcCoveragePercPaymentPaidWhicheverIsHigher;
	}

	public boolean isBccReceived() {
		return bccReceived;
	}

	public void setBccReceived(boolean bccReceived) {
		this.bccReceived = bccReceived;
	}

	public java.lang.String getAllowed() {
		return allowed;
	}

	public void setAllowed(java.lang.String allowed) {
		this.allowed = allowed;
	}

	public java.lang.String getMessage() {
		return message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public java.lang.String getRecommendingAuthorityOne() {
		return recommendingAuthorityOne;
	}

	public void setRecommendingAuthorityOne(java.lang.String recommendingAuthorityOne) {
		this.recommendingAuthorityOne = recommendingAuthorityOne;
	}

	public java.lang.String getRecommendingAuthorityTwo() {
		return recommendingAuthorityTwo;
	}

	public void setRecommendingAuthorityTwo(java.lang.String recommendingAuthorityTwo) {
		this.recommendingAuthorityTwo = recommendingAuthorityTwo;
	}

	public java.lang.String getRecommendingAuthorityThree() {
		return recommendingAuthorityThree;
	}

	public void setRecommendingAuthorityThree(java.lang.String recommendingAuthorityThree) {
		this.recommendingAuthorityThree = recommendingAuthorityThree;
	}

	public java.lang.String getRecommendingAuthorityFour() {
		return recommendingAuthorityFour;
	}

	public void setRecommendingAuthorityFour(java.lang.String recommendingAuthorityFour) {
		this.recommendingAuthorityFour = recommendingAuthorityFour;
	}

	public java.lang.String getApprovingAuthorityOne() {
		return approvingAuthorityOne;
	}

	public void setApprovingAuthorityOne(java.lang.String approvingAuthorityOne) {
		this.approvingAuthorityOne = approvingAuthorityOne;
	}

	public java.lang.String getApprovingAuthorityTwo() {
		return approvingAuthorityTwo;
	}

	public void setApprovingAuthorityTwo(java.lang.String approvingAuthorityTwo) {
		this.approvingAuthorityTwo = approvingAuthorityTwo;
	}

	public java.lang.String getApprovingAuthorityThree() {
		return approvingAuthorityThree;
	}

	public void setApprovingAuthorityThree(java.lang.String approvingAuthorityThree) {
		this.approvingAuthorityThree = approvingAuthorityThree;
	}

	public java.lang.String getAdminFeePsf() {
		return adminFeePsf;
	}

	public void setAdminFeePsf(java.lang.String adminFeePsf) {
		this.adminFeePsf = adminFeePsf;
	}

	public java.lang.String getAdminFeeFlat() {
		return adminFeeFlat;
	}

	public void setAdminFeeFlat(java.lang.String adminFeeFlat) {
		this.adminFeeFlat = adminFeeFlat;
	}

	public java.lang.String getAdminFeePercentage() {
		return adminFeePercentage;
	}

	public void setAdminFeePercentage(java.lang.String adminFeePercentage) {
		this.adminFeePercentage = adminFeePercentage;
	}

	public RentalPool(java.lang.String description, java.util.Date ruleValidityStart, java.util.Date ruleValidityEnd, java.lang.String processName,
			java.lang.String subProcessName, java.lang.String projectCity, java.lang.String project, java.lang.String buildingCode, java.lang.String bedroomType,
			java.lang.String applicableViews, java.lang.String unitType, java.lang.String permittedUse, java.lang.String units, java.lang.String readyOffPlan,
			double price, double area, boolean eho, boolean ho, java.lang.String applicableNationality,
			java.lang.String customerClassification, int portfolioValue, boolean defaultVal, java.lang.String agreementStatus,
			boolean overdue, boolean ftlSent, boolean dispute, boolean enforcement, boolean litigation,
			boolean mortgage, boolean courtCase, int numberOfTimesCustomerHasDefaultedOnInstallments,
			double percPdcCoveragePercPaymentPaidWhicheverIsHigher, boolean bccReceived, java.lang.String allowed, java.lang.String message,
			java.lang.String recommendingAuthorityOne, java.lang.String recommendingAuthorityTwo, java.lang.String recommendingAuthorityThree,
			java.lang.String recommendingAuthorityFour, java.lang.String approvingAuthorityOne, java.lang.String approvingAuthorityTwo,
			java.lang.String approvingAuthorityThree, java.lang.String adminFeePsf, java.lang.String adminFeeFlat, java.lang.String adminFeePercentage) {
		super();
		this.description = description;
		this.ruleValidityStart = ruleValidityStart;
		this.ruleValidityEnd = ruleValidityEnd;
		this.processName = processName;
		this.subProcessName = subProcessName;
		this.projectCity = projectCity;
		this.project = project;
		this.buildingCode = buildingCode;
		this.bedroomType = bedroomType;
		this.applicableViews = applicableViews;
		this.unitType = unitType;
		this.permittedUse = permittedUse;
		this.units = units;
		this.readyOffPlan = readyOffPlan;
		this.price = price;
		this.area = area;
		this.eho = eho;
		this.ho = ho;
		this.applicableNationality = applicableNationality;
		this.customerClassification = customerClassification;
		this.portfolioValue = portfolioValue;
		this.defaultVal = defaultVal;
		this.agreementStatus = agreementStatus;
		this.overdue = overdue;
		this.ftlSent = ftlSent;
		this.dispute = dispute;
		this.enforcement = enforcement;
		this.litigation = litigation;
		this.mortgage = mortgage;
		this.courtCase = courtCase;
		this.numberOfTimesCustomerHasDefaultedOnInstallments = numberOfTimesCustomerHasDefaultedOnInstallments;
		this.percPdcCoveragePercPaymentPaidWhicheverIsHigher = percPdcCoveragePercPaymentPaidWhicheverIsHigher;
		this.bccReceived = bccReceived;
		this.allowed = allowed;
		this.message = message;
		this.recommendingAuthorityOne = recommendingAuthorityOne;
		this.recommendingAuthorityTwo = recommendingAuthorityTwo;
		this.recommendingAuthorityThree = recommendingAuthorityThree;
		this.recommendingAuthorityFour = recommendingAuthorityFour;
		this.approvingAuthorityOne = approvingAuthorityOne;
		this.approvingAuthorityTwo = approvingAuthorityTwo;
		this.approvingAuthorityThree = approvingAuthorityThree;
		this.adminFeePsf = adminFeePsf;
		this.adminFeeFlat = adminFeeFlat;
		this.adminFeePercentage = adminFeePercentage;
	}

	
	
	
}
