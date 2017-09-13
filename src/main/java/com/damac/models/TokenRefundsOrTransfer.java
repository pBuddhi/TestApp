package com.damac.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement


public class TokenRefundsOrTransfer implements java.io.Serializable{
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
	private java.lang.String unitType;
	private java.lang.String permittedUse;
	private java.lang.String units;
	private java.lang.String readyOffPlan;
	private double  price;
	private double area;
	private double currentReraConstructionStatusPercComplete;
	private boolean eho;
	private boolean ho;
	private java.lang.String applicableNationality;
	private java.lang.String customerClassification;
	private int portfolioValue;
	private boolean defaultVal;
	private java.lang.String agreementStatus;
	private boolean overdue;
	private boolean ftlSent;
	private boolean disputeOnAnyCustomerFlat;
	private boolean enforcementOnAnyCustomerFlat;
	private java.lang.String litigationOnAnyCustomerFlat;
	private java.lang.String courtCaseOnAnyCustomerFlat;
	private int numberOfTimesCustomerHasDefaultedOnInstallments;
	private boolean signedUrc;
	private boolean signedSpa;
	private int tokenRefundTokenTransfer;
	private int numberOfDaysFromBooking;
	
	//ACTION variables
	private java.lang.String allowed;
	private java.lang.String message;
	private java.lang.String recommendingAuthorityOne;
	private java.lang.String recommendingAuthorityTwo;
	private java.lang.String recommendingAuthorityThree;
	private java.lang.String recommendingAuthorityFour;
	private java.lang.String approvingAuthorityOne;
	private java.lang.String approvingAuthorityTwo;
	private java.lang.String approvingAuthorityThree;
	private java.lang.String percToBeRefundedTransferred;
	private java.lang.String deductionFeePsf;
	private java.lang.String deductionFeeFlat;
	private java.lang.String deductionFeePercentage;
	
	public TokenRefundsOrTransfer(){
		
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

	public double getCurrentReraConstructionStatusPercComplete() {
		return currentReraConstructionStatusPercComplete;
	}

	public void setCurrentReraConstructionStatusPercComplete(double currentReraConstructionStatusPercComplete) {
		this.currentReraConstructionStatusPercComplete = currentReraConstructionStatusPercComplete;
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

	public boolean isDisputeOnAnyCustomerFlat() {
		return disputeOnAnyCustomerFlat;
	}

	public void setDisputeOnAnyCustomerFlat(boolean disputeOnAnyCustomerFlat) {
		this.disputeOnAnyCustomerFlat = disputeOnAnyCustomerFlat;
	}

	public boolean isEnforcementOnAnyCustomerFlat() {
		return enforcementOnAnyCustomerFlat;
	}

	public void setEnforcementOnAnyCustomerFlat(boolean enforcementOnAnyCustomerFlat) {
		this.enforcementOnAnyCustomerFlat = enforcementOnAnyCustomerFlat;
	}

	public java.lang.String getLitigationOnAnyCustomerFlat() {
		return litigationOnAnyCustomerFlat;
	}

	public void setLitigationOnAnyCustomerFlat(java.lang.String litigationOnAnyCustomerFlat) {
		this.litigationOnAnyCustomerFlat = litigationOnAnyCustomerFlat;
	}

	public java.lang.String getCourtCaseOnAnyCustomerFlat() {
		return courtCaseOnAnyCustomerFlat;
	}

	public void setCourtCaseOnAnyCustomerFlat(java.lang.String courtCaseOnAnyCustomerFlat) {
		this.courtCaseOnAnyCustomerFlat = courtCaseOnAnyCustomerFlat;
	}

	public int getNumberOfTimesCustomerHasDefaultedOnInstallments() {
		return numberOfTimesCustomerHasDefaultedOnInstallments;
	}

	public void setNumberOfTimesCustomerHasDefaultedOnInstallments(int numberOfTimesCustomerHasDefaultedOnInstallments) {
		this.numberOfTimesCustomerHasDefaultedOnInstallments = numberOfTimesCustomerHasDefaultedOnInstallments;
	}

	public boolean isSignedUrc() {
		return signedUrc;
	}

	public void setSignedUrc(boolean signedUrc) {
		this.signedUrc = signedUrc;
	}

	public boolean isSignedSpa() {
		return signedSpa;
	}

	public void setSignedSpa(boolean signedSpa) {
		this.signedSpa = signedSpa;
	}

	public int getTokenRefundTokenTransfer() {
		return tokenRefundTokenTransfer;
	}

	public void setTokenRefundTokenTransfer(int tokenRefundTokenTransfer) {
		this.tokenRefundTokenTransfer = tokenRefundTokenTransfer;
	}

	public int getNumberOfDaysFromBooking() {
		return numberOfDaysFromBooking;
	}

	public void setNumberOfDaysFromBooking(int numberOfDaysFromBooking) {
		this.numberOfDaysFromBooking = numberOfDaysFromBooking;
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

	public java.lang.String getPercToBeRefundedTransferred() {
		return percToBeRefundedTransferred;
	}

	public void setPercToBeRefundedTransferred(java.lang.String percToBeRefundedTransferred) {
		this.percToBeRefundedTransferred = percToBeRefundedTransferred;
	}

	public java.lang.String getDeductionFeePsf() {
		return deductionFeePsf;
	}

	public void setDeductionFeePsf(java.lang.String deductionFeePsf) {
		this.deductionFeePsf = deductionFeePsf;
	}

	public java.lang.String getDeductionFeeFlat() {
		return deductionFeeFlat;
	}

	public void setDeductionFeeFlat(java.lang.String deductionFeeFlat) {
		this.deductionFeeFlat = deductionFeeFlat;
	}

	public java.lang.String getDeductionFeePercentage() {
		return deductionFeePercentage;
	}

	public void setDeductionFeePercentage(java.lang.String deductionFeePercentage) {
		this.deductionFeePercentage = deductionFeePercentage;
	}

	public TokenRefundsOrTransfer(java.lang.String description, java.util.Date ruleValidityStart, java.util.Date ruleValidityEnd, java.lang.String processName,
			java.lang.String subProcessName, java.lang.String projectCity, java.lang.String project, java.lang.String buildingCode, java.lang.String bedroomType,
			java.lang.String unitType, java.lang.String permittedUse, java.lang.String units, java.lang.String readyOffPlan, double price, double area,
			double currentReraConstructionStatusPercComplete, boolean eho, boolean ho, java.lang.String applicableNationality,
			java.lang.String customerClassification, int portfolioValue, boolean defaultVal, java.lang.String agreementStatus,
			boolean overdue, boolean ftlSent, boolean disputeOnAnyCustomerFlat, boolean enforcementOnAnyCustomerFlat,
			java.lang.String litigationOnAnyCustomerFlat, java.lang.String courtCaseOnAnyCustomerFlat,
			int numberOfTimesCustomerHasDefaultedOnInstallments, boolean signedUrc, boolean signedSpa,
			int tokenRefundTokenTransfer, int numberOfDaysFromBooking, java.lang.String allowed, java.lang.String message,
			java.lang.String recommendingAuthorityOne, java.lang.String recommendingAuthorityTwo, java.lang.String recommendingAuthorityThree,
			java.lang.String recommendingAuthorityFour, java.lang.String approvingAuthorityOne, java.lang.String approvingAuthorityTwo,
			java.lang.String approvingAuthorityThree, java.lang.String percToBeRefundedTransferred, java.lang.String deductionFeePsf,
			java.lang.String deductionFeeFlat, java.lang.String deductionFeePercentage) {
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
		this.unitType = unitType;
		this.permittedUse = permittedUse;
		this.units = units;
		this.readyOffPlan = readyOffPlan;
		this.price = price;
		this.area = area;
		this.currentReraConstructionStatusPercComplete = currentReraConstructionStatusPercComplete;
		this.eho = eho;
		this.ho = ho;
		this.applicableNationality = applicableNationality;
		this.customerClassification = customerClassification;
		this.portfolioValue = portfolioValue;
		this.defaultVal = defaultVal;
		this.agreementStatus = agreementStatus;
		this.overdue = overdue;
		this.ftlSent = ftlSent;
		this.disputeOnAnyCustomerFlat = disputeOnAnyCustomerFlat;
		this.enforcementOnAnyCustomerFlat = enforcementOnAnyCustomerFlat;
		this.litigationOnAnyCustomerFlat = litigationOnAnyCustomerFlat;
		this.courtCaseOnAnyCustomerFlat = courtCaseOnAnyCustomerFlat;
		this.numberOfTimesCustomerHasDefaultedOnInstallments = numberOfTimesCustomerHasDefaultedOnInstallments;
		this.signedUrc = signedUrc;
		this.signedSpa = signedSpa;
		this.tokenRefundTokenTransfer = tokenRefundTokenTransfer;
		this.numberOfDaysFromBooking = numberOfDaysFromBooking;
		this.allowed = allowed;
		this.message = message;
		this.recommendingAuthorityOne = recommendingAuthorityOne;
		this.recommendingAuthorityTwo = recommendingAuthorityTwo;
		this.recommendingAuthorityThree = recommendingAuthorityThree;
		this.recommendingAuthorityFour = recommendingAuthorityFour;
		this.approvingAuthorityOne = approvingAuthorityOne;
		this.approvingAuthorityTwo = approvingAuthorityTwo;
		this.approvingAuthorityThree = approvingAuthorityThree;
		this.percToBeRefundedTransferred = percToBeRefundedTransferred;
		this.deductionFeePsf = deductionFeePsf;
		this.deductionFeeFlat = deductionFeeFlat;
		this.deductionFeePercentage = deductionFeePercentage;
	}

	
	
}
