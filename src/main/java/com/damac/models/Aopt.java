package com.damac.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement


public class Aopt implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String description;
	private java.util.Date ruleValidityStartDate;
	private java.util.Date ruleValidityEndDate;
	private java.lang.String subProcessName;
	private java.lang.String projectCity;
	private java.lang.String unitType;
	private java.lang.String permittedUse;
	private boolean eho;
	private boolean dispute;
	private boolean enforcement;
	private boolean litigation;
	private java.lang.String project;
	private java.lang.String buildingCode;
	private java.lang.String bedroomType;
	private boolean ho;
	private java.lang.String applicableNationality;
	private boolean bulk;
	private java.lang.String originalPaymentPlanType;
	private java.lang.String proposedPaymentPlanType;
	private boolean paymentsEquallyDistributed;
	private boolean paymentPlanExtendedBeyondAcd;
	private java.lang.String tempFive;
	private java.lang.String tempSix;
	private boolean defaultVal;
	private java.lang.String previousWaivers;
	private int currentConstructionStatusCompletePercentage;
	private int currentReraConstructionStatusCompletePercentage;
	private int delayExpectedFromOriginalAcdDays;
	private int portfolioValue;
	private int areaVariationPercentage;
	private int otherRecharges;
	private int percOverdue;
	private int numberOfTimesCustomerHasDefaultedOnInstallments;
	private int percPdcCoverageOrPertPaymentPaidWhicheverIsHigher;
	private int differencePaymentAndReraPercentage;
	private int completionInstallmentPrecProposedPlan;
	private int diffCurAcdAndLastNonCompletionInstallmentInProposedPlan;
	private int diffCurAcdAndLastPaymentMilestoneInProposedPlan;
	private int maximumMovementInAnInstallmentDays;
	private int numberOfInstallmentsMoved;
	private int furniturePaymentPlanDelayMonths;
	private int differenceBetweenCurrentAcdAndAoptDateDays;
	private double tempOne;
	private double tempTwo;
	private double tempThree;
	private double tempFour;
	private boolean priorAopt;

	// Drool ACTION variable
	private java.lang.String allowed;
	private java.lang.String message;
	private java.lang.String firstRecommendingAuthority;
	private java.lang.String secondRecommendingAuthority;
	private java.lang.String thirdRecommendingAuthority;
	private java.lang.String fourthRecommendingAuthority;
	private java.lang.String firstApprovingAuthority;
	private java.lang.String secondApprovingAuthority;
	private java.lang.String thirdApprovingAuthority;
	private java.lang.String paymentDpPercentage;
	private java.lang.String paymentGateOne;
	private java.lang.String paymentGateTwo;
	private java.lang.String paymentGateThree;
	private java.lang.String paymentGateFour;
	private java.lang.String paymentGateFive;
	private java.lang.String paymentGateSix;
	private java.lang.String paymentGateSeven;
	private java.lang.String paymentGateOneDate;
	private java.lang.String paymentGateOnePercentage;
	private java.lang.String paymentGateTwoDate;
	private java.lang.String paymentGateTwoPercentage;
	private java.lang.String paymentGateThreeDate;
	private java.lang.String paymentGateThreePercentage;
	private java.lang.String paymentGateFourDate;
	private java.lang.String paymentGateFourPercentage;
	private java.lang.String paymentGateCompletionPercentage;
	private java.lang.String paymentGateFiveDate;
	private java.lang.String paymentGateFivePercentage;
	private java.lang.String paymentGateSixDate;
	private java.lang.String paymentGateSixPercentage;
	private java.lang.String paymentGateSevenDate;
	private java.lang.String paymentGateSevenPercentage;

	public Aopt(){
		
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.util.Date getRuleValidityStartDate() {
		return ruleValidityStartDate;
	}

	public void setRuleValidityStartDate(java.util.Date ruleValidityStartDate) {
		this.ruleValidityStartDate = ruleValidityStartDate;
	}

	public java.util.Date getRuleValidityEndDate() {
		return ruleValidityEndDate;
	}

	public void setRuleValidityEndDate(java.util.Date ruleValidityEndDate) {
		this.ruleValidityEndDate = ruleValidityEndDate;
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

	public boolean isEho() {
		return eho;
	}

	public void setEho(boolean eho) {
		this.eho = eho;
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

	public boolean isBulk() {
		return bulk;
	}

	public void setBulk(boolean bulk) {
		this.bulk = bulk;
	}

	public java.lang.String getOriginalPaymentPlanType() {
		return originalPaymentPlanType;
	}

	public void setOriginalPaymentPlanType(java.lang.String originalPaymentPlanType) {
		this.originalPaymentPlanType = originalPaymentPlanType;
	}

	public java.lang.String getProposedPaymentPlanType() {
		return proposedPaymentPlanType;
	}

	public void setProposedPaymentPlanType(java.lang.String proposedPaymentPlanType) {
		this.proposedPaymentPlanType = proposedPaymentPlanType;
	}

	public boolean isPaymentsEquallyDistributed() {
		return paymentsEquallyDistributed;
	}

	public void setPaymentsEquallyDistributed(boolean paymentsEquallyDistributed) {
		this.paymentsEquallyDistributed = paymentsEquallyDistributed;
	}

	public boolean isPaymentPlanExtendedBeyondAcd() {
		return paymentPlanExtendedBeyondAcd;
	}

	public void setPaymentPlanExtendedBeyondAcd(boolean paymentPlanExtendedBeyondAcd) {
		this.paymentPlanExtendedBeyondAcd = paymentPlanExtendedBeyondAcd;
	}

	public java.lang.String getTempFive() {
		return tempFive;
	}

	public void setTempFive(java.lang.String tempFive) {
		this.tempFive = tempFive;
	}

	public java.lang.String getTempSix() {
		return tempSix;
	}

	public void setTempSix(java.lang.String tempSix) {
		this.tempSix = tempSix;
	}

	public boolean isDefaultVal() {
		return defaultVal;
	}

	public void setDefaultVal(boolean defaultVal) {
		this.defaultVal = defaultVal;
	}

	public java.lang.String getPreviousWaivers() {
		return previousWaivers;
	}

	public void setPreviousWaivers(java.lang.String previousWaivers) {
		this.previousWaivers = previousWaivers;
	}

	public int getCurrentConstructionStatusCompletePercentage() {
		return currentConstructionStatusCompletePercentage;
	}

	public void setCurrentConstructionStatusCompletePercentage(int currentConstructionStatusCompletePercentage) {
		this.currentConstructionStatusCompletePercentage = currentConstructionStatusCompletePercentage;
	}

	public int getCurrentReraConstructionStatusCompletePercentage() {
		return currentReraConstructionStatusCompletePercentage;
	}

	public void setCurrentReraConstructionStatusCompletePercentage(int currentReraConstructionStatusCompletePercentage) {
		this.currentReraConstructionStatusCompletePercentage = currentReraConstructionStatusCompletePercentage;
	}

	public int getDelayExpectedFromOriginalAcdDays() {
		return delayExpectedFromOriginalAcdDays;
	}

	public void setDelayExpectedFromOriginalAcdDays(int delayExpectedFromOriginalAcdDays) {
		this.delayExpectedFromOriginalAcdDays = delayExpectedFromOriginalAcdDays;
	}

	public int getPortfolioValue() {
		return portfolioValue;
	}

	public void setPortfolioValue(int portfolioValue) {
		this.portfolioValue = portfolioValue;
	}

	public int getAreaVariationPercentage() {
		return areaVariationPercentage;
	}

	public void setAreaVariationPercentage(int areaVariationPercentage) {
		this.areaVariationPercentage = areaVariationPercentage;
	}

	public int getOtherRecharges() {
		return otherRecharges;
	}

	public void setOtherRecharges(int otherRecharges) {
		this.otherRecharges = otherRecharges;
	}

	public int getPercOverdue() {
		return percOverdue;
	}

	public void setPercOverdue(int percOverdue) {
		this.percOverdue = percOverdue;
	}

	public int getNumberOfTimesCustomerHasDefaultedOnInstallments() {
		return numberOfTimesCustomerHasDefaultedOnInstallments;
	}

	public void setNumberOfTimesCustomerHasDefaultedOnInstallments(int numberOfTimesCustomerHasDefaultedOnInstallments) {
		this.numberOfTimesCustomerHasDefaultedOnInstallments = numberOfTimesCustomerHasDefaultedOnInstallments;
	}

	public int getPercPdcCoverageOrPertPaymentPaidWhicheverIsHigher() {
		return percPdcCoverageOrPertPaymentPaidWhicheverIsHigher;
	}

	public void setPercPdcCoverageOrPertPaymentPaidWhicheverIsHigher(
			int percPdcCoverageOrPertPaymentPaidWhicheverIsHigher) {
		this.percPdcCoverageOrPertPaymentPaidWhicheverIsHigher = percPdcCoverageOrPertPaymentPaidWhicheverIsHigher;
	}

	public int getDifferencePaymentAndReraPercentage() {
		return differencePaymentAndReraPercentage;
	}

	public void setDifferencePaymentAndReraPercentage(int differencePaymentAndReraPercentage) {
		this.differencePaymentAndReraPercentage = differencePaymentAndReraPercentage;
	}

	public int getCompletionInstallmentPrecProposedPlan() {
		return completionInstallmentPrecProposedPlan;
	}

	public void setCompletionInstallmentPrecProposedPlan(int completionInstallmentPrecProposedPlan) {
		this.completionInstallmentPrecProposedPlan = completionInstallmentPrecProposedPlan;
	}

	public int getDiffCurAcdAndLastNonCompletionInstallmentInProposedPlan() {
		return diffCurAcdAndLastNonCompletionInstallmentInProposedPlan;
	}

	public void setDiffCurAcdAndLastNonCompletionInstallmentInProposedPlan(
			int diffCurAcdAndLastNonCompletionInstallmentInProposedPlan) {
		this.diffCurAcdAndLastNonCompletionInstallmentInProposedPlan = diffCurAcdAndLastNonCompletionInstallmentInProposedPlan;
	}

	public int getDiffCurAcdAndLastPaymentMilestoneInProposedPlan() {
		return diffCurAcdAndLastPaymentMilestoneInProposedPlan;
	}

	public void setDiffCurAcdAndLastPaymentMilestoneInProposedPlan(int diffCurAcdAndLastPaymentMilestoneInProposedPlan) {
		this.diffCurAcdAndLastPaymentMilestoneInProposedPlan = diffCurAcdAndLastPaymentMilestoneInProposedPlan;
	}

	public int getMaximumMovementInAnInstallmentDays() {
		return maximumMovementInAnInstallmentDays;
	}

	public void setMaximumMovementInAnInstallmentDays(int maximumMovementInAnInstallmentDays) {
		this.maximumMovementInAnInstallmentDays = maximumMovementInAnInstallmentDays;
	}

	public int getNumberOfInstallmentsMoved() {
		return numberOfInstallmentsMoved;
	}

	public void setNumberOfInstallmentsMoved(int numberOfInstallmentsMoved) {
		this.numberOfInstallmentsMoved = numberOfInstallmentsMoved;
	}

	public int getFurniturePaymentPlanDelayMonths() {
		return furniturePaymentPlanDelayMonths;
	}

	public void setFurniturePaymentPlanDelayMonths(int furniturePaymentPlanDelayMonths) {
		this.furniturePaymentPlanDelayMonths = furniturePaymentPlanDelayMonths;
	}

	public int getDifferenceBetweenCurrentAcdAndAoptDateDays() {
		return differenceBetweenCurrentAcdAndAoptDateDays;
	}

	public void setDifferenceBetweenCurrentAcdAndAoptDateDays(int differenceBetweenCurrentAcdAndAoptDateDays) {
		this.differenceBetweenCurrentAcdAndAoptDateDays = differenceBetweenCurrentAcdAndAoptDateDays;
	}

	public double getTempOne() {
		return tempOne;
	}

	public void setTempOne(double tempOne) {
		this.tempOne = tempOne;
	}

	public double getTempTwo() {
		return tempTwo;
	}

	public void setTempTwo(double tempTwo) {
		this.tempTwo = tempTwo;
	}

	public double getTempThree() {
		return tempThree;
	}

	public void setTempThree(double tempThree) {
		this.tempThree = tempThree;
	}

	public double getTempFour() {
		return tempFour;
	}

	public void setTempFour(double tempFour) {
		this.tempFour = tempFour;
	}

	public boolean getPriorAopt() {
		return priorAopt;
	}

	public void setPriorAopt(boolean priorAopt) {
		this.priorAopt = priorAopt;
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

	public java.lang.String getFirstRecommendingAuthority() {
		return firstRecommendingAuthority;
	}

	public void setFirstRecommendingAuthority(java.lang.String firstRecommendingAuthority) {
		this.firstRecommendingAuthority = firstRecommendingAuthority;
	}

	public java.lang.String getSecondRecommendingAuthority() {
		return secondRecommendingAuthority;
	}

	public void setSecondRecommendingAuthority(java.lang.String secondRecommendingAuthority) {
		this.secondRecommendingAuthority = secondRecommendingAuthority;
	}

	public java.lang.String getThirdRecommendingAuthority() {
		return thirdRecommendingAuthority;
	}

	public void setThirdRecommendingAuthority(java.lang.String thirdRecommendingAuthority) {
		this.thirdRecommendingAuthority = thirdRecommendingAuthority;
	}

	public java.lang.String getFourthRecommendingAuthority() {
		return fourthRecommendingAuthority;
	}

	public void setFourthRecommendingAuthority(java.lang.String fourthRecommendingAuthority) {
		this.fourthRecommendingAuthority = fourthRecommendingAuthority;
	}

	public java.lang.String getFirstApprovingAuthority() {
		return firstApprovingAuthority;
	}

	public void setFirstApprovingAuthority(java.lang.String firstApprovingAuthority) {
		this.firstApprovingAuthority = firstApprovingAuthority;
	}

	public java.lang.String getSecondApprovingAuthority() {
		return secondApprovingAuthority;
	}

	public void setSecondApprovingAuthority(java.lang.String secondApprovingAuthority) {
		this.secondApprovingAuthority = secondApprovingAuthority;
	}

	public java.lang.String getThirdApprovingAuthority() {
		return thirdApprovingAuthority;
	}

	public void setThirdApprovingAuthority(java.lang.String thirdApprovingAuthority) {
		this.thirdApprovingAuthority = thirdApprovingAuthority;
	}

	public java.lang.String getPaymentDpPercentage() {
		return paymentDpPercentage;
	}

	public void setPaymentDpPercentage(java.lang.String paymentDpPercentage) {
		this.paymentDpPercentage = paymentDpPercentage;
	}

	public java.lang.String getPaymentGateOne() {
		return paymentGateOne;
	}

	public void setPaymentGateOne(java.lang.String paymentGateOne) {
		this.paymentGateOne = paymentGateOne;
	}

	public java.lang.String getPaymentGateTwo() {
		return paymentGateTwo;
	}

	public void setPaymentGateTwo(java.lang.String paymentGateTwo) {
		this.paymentGateTwo = paymentGateTwo;
	}

	public java.lang.String getPaymentGateThree() {
		return paymentGateThree;
	}

	public void setPaymentGateThree(java.lang.String paymentGateThree) {
		this.paymentGateThree = paymentGateThree;
	}

	public java.lang.String getPaymentGateFour() {
		return paymentGateFour;
	}

	public void setPaymentGateFour(java.lang.String paymentGateFour) {
		this.paymentGateFour = paymentGateFour;
	}

	public java.lang.String getPaymentGateFive() {
		return paymentGateFive;
	}

	public void setPaymentGateFive(java.lang.String paymentGateFive) {
		this.paymentGateFive = paymentGateFive;
	}

	public java.lang.String getPaymentGateSix() {
		return paymentGateSix;
	}

	public void setPaymentGateSix(java.lang.String paymentGateSix) {
		this.paymentGateSix = paymentGateSix;
	}

	public java.lang.String getPaymentGateSeven() {
		return paymentGateSeven;
	}

	public void setPaymentGateSeven(java.lang.String paymentGateSeven) {
		this.paymentGateSeven = paymentGateSeven;
	}

	public java.lang.String getPaymentGateOneDate() {
		return paymentGateOneDate;
	}

	public void setPaymentGateOneDate(java.lang.String paymentGateOneDate) {
		this.paymentGateOneDate = paymentGateOneDate;
	}

	public java.lang.String getPaymentGateOnePercentage() {
		return paymentGateOnePercentage;
	}

	public void setPaymentGateOnePercentage(java.lang.String paymentGateOnePercentage) {
		this.paymentGateOnePercentage = paymentGateOnePercentage;
	}

	public java.lang.String getPaymentGateTwoDate() {
		return paymentGateTwoDate;
	}

	public void setPaymentGateTwoDate(java.lang.String paymentGateTwoDate) {
		this.paymentGateTwoDate = paymentGateTwoDate;
	}

	public java.lang.String getPaymentGateTwoPercentage() {
		return paymentGateTwoPercentage;
	}

	public void setPaymentGateTwoPercentage(java.lang.String paymentGateTwoPercentage) {
		this.paymentGateTwoPercentage = paymentGateTwoPercentage;
	}

	public java.lang.String getPaymentGateThreeDate() {
		return paymentGateThreeDate;
	}

	public void setPaymentGateThreeDate(java.lang.String paymentGateThreeDate) {
		this.paymentGateThreeDate = paymentGateThreeDate;
	}

	public java.lang.String getPaymentGateThreePercentage() {
		return paymentGateThreePercentage;
	}

	public void setPaymentGateThreePercentage(java.lang.String paymentGateThreePercentage) {
		this.paymentGateThreePercentage = paymentGateThreePercentage;
	}

	public java.lang.String getPaymentGateFourDate() {
		return paymentGateFourDate;
	}

	public void setPaymentGateFourDate(java.lang.String paymentGateFourDate) {
		this.paymentGateFourDate = paymentGateFourDate;
	}

	public java.lang.String getPaymentGateFourPercentage() {
		return paymentGateFourPercentage;
	}

	public void setPaymentGateFourPercentage(java.lang.String paymentGateFourPercentage) {
		this.paymentGateFourPercentage = paymentGateFourPercentage;
	}

	public java.lang.String getPaymentGateCompletionPercentage() {
		return paymentGateCompletionPercentage;
	}

	public void setPaymentGateCompletionPercentage(java.lang.String paymentGateCompletionPercentage) {
		this.paymentGateCompletionPercentage = paymentGateCompletionPercentage;
	}

	public java.lang.String getPaymentGateFiveDate() {
		return paymentGateFiveDate;
	}

	public void setPaymentGateFiveDate(java.lang.String paymentGateFiveDate) {
		this.paymentGateFiveDate = paymentGateFiveDate;
	}

	public java.lang.String getPaymentGateFivePercentage() {
		return paymentGateFivePercentage;
	}

	public void setPaymentGateFivePercentage(java.lang.String paymentGateFivePercentage) {
		this.paymentGateFivePercentage = paymentGateFivePercentage;
	}

	public java.lang.String getPaymentGateSixDate() {
		return paymentGateSixDate;
	}

	public void setPaymentGateSixDate(java.lang.String paymentGateSixDate) {
		this.paymentGateSixDate = paymentGateSixDate;
	}

	public java.lang.String getPaymentGateSixPercentage() {
		return paymentGateSixPercentage;
	}

	public void setPaymentGateSixPercentage(java.lang.String paymentGateSixPercentage) {
		this.paymentGateSixPercentage = paymentGateSixPercentage;
	}

	public java.lang.String getPaymentGateSevenDate() {
		return paymentGateSevenDate;
	}

	public void setPaymentGateSevenDate(java.lang.String paymentGateSevenDate) {
		this.paymentGateSevenDate = paymentGateSevenDate;
	}

	public java.lang.String getPaymentGateSevenPercentage() {
		return paymentGateSevenPercentage;
	}

	public void setPaymentGateSevenPercentage(java.lang.String paymentGateSevenPercentage) {
		this.paymentGateSevenPercentage = paymentGateSevenPercentage;
	}

	public Aopt(java.lang.String description, java.util.Date ruleValidityStartDate, java.util.Date ruleValidityEndDate, java.lang.String subProcessName,
			java.lang.String projectCity, java.lang.String unitType, java.lang.String permittedUse, boolean eho, boolean dispute, boolean enforcement,
			boolean litigation, java.lang.String project, java.lang.String buildingCode, java.lang.String bedroomType, boolean ho,
			java.lang.String applicableNationality, boolean bulk, java.lang.String originalPaymentPlanType, java.lang.String proposedPaymentPlanType,
			boolean paymentsEquallyDistributed, boolean paymentPlanExtendedBeyondAcd, java.lang.String tempFive, java.lang.String tempSix,
			boolean defaultVal, java.lang.String previousWaivers, int currentConstructionStatusCompletePercentage,
			int currentReraConstructionStatusCompletePercentage, int delayExpectedFromOriginalAcdDays,
			int portfolioValue, int areaVariationPercentage, int otherRecharges, int percOverdue,
			int numberOfTimesCustomerHasDefaultedOnInstallments, int percPdcCoverageOrPertPaymentPaidWhicheverIsHigher,
			int differencePaymentAndReraPercentage, int completionInstallmentPrecProposedPlan,
			int diffCurAcdAndLastNonCompletionInstallmentInProposedPlan,
			int diffCurAcdAndLastPaymentMilestoneInProposedPlan, int maximumMovementInAnInstallmentDays,
			int numberOfInstallmentsMoved, int furniturePaymentPlanDelayMonths,
			int differenceBetweenCurrentAcdAndAoptDateDays, double tempOne, double tempTwo, double tempThree,
			double tempFour, boolean priorAopt, java.lang.String allowed, java.lang.String message, java.lang.String firstRecommendingAuthority,
			java.lang.String secondRecommendingAuthority, java.lang.String thirdRecommendingAuthority, java.lang.String fourthRecommendingAuthority,
			java.lang.String firstApprovingAuthority, java.lang.String secondApprovingAuthority, java.lang.String thirdApprovingAuthority,
			java.lang.String paymentDpPercentage, java.lang.String paymentGateOne, java.lang.String paymentGateTwo, java.lang.String paymentGateThree,
			java.lang.String paymentGateFour, java.lang.String paymentGateFive, java.lang.String paymentGateSix, java.lang.String paymentGateSeven,
			java.lang.String paymentGateOneDate, java.lang.String paymentGateOnePercentage, java.lang.String paymentGateTwoDate,
			java.lang.String paymentGateTwoPercentage, java.lang.String paymentGateThreeDate, java.lang.String paymentGateThreePercentage,
			java.lang.String paymentGateFourDate, java.lang.String paymentGateFourPercentage, java.lang.String paymentGateCompletionPercentage,
			java.lang.String paymentGateFiveDate, java.lang.String paymentGateFivePercentage, java.lang.String paymentGateSixDate,
			java.lang.String paymentGateSixPercentage, java.lang.String paymentGateSevenDate, java.lang.String paymentGateSevenPercentage) {
		super();
		this.description = description;
		this.ruleValidityStartDate = ruleValidityStartDate;
		this.ruleValidityEndDate = ruleValidityEndDate;
		this.subProcessName = subProcessName;
		this.projectCity = projectCity;
		this.unitType = unitType;
		this.permittedUse = permittedUse;
		this.eho = eho;
		this.dispute = dispute;
		this.enforcement = enforcement;
		this.litigation = litigation;
		this.project = project;
		this.buildingCode = buildingCode;
		this.bedroomType = bedroomType;
		this.ho = ho;
		this.applicableNationality = applicableNationality;
		this.bulk = bulk;
		this.originalPaymentPlanType = originalPaymentPlanType;
		this.proposedPaymentPlanType = proposedPaymentPlanType;
		this.paymentsEquallyDistributed = paymentsEquallyDistributed;
		this.paymentPlanExtendedBeyondAcd = paymentPlanExtendedBeyondAcd;
		this.tempFive = tempFive;
		this.tempSix = tempSix;
		this.defaultVal = defaultVal;
		this.previousWaivers = previousWaivers;
		this.currentConstructionStatusCompletePercentage = currentConstructionStatusCompletePercentage;
		this.currentReraConstructionStatusCompletePercentage = currentReraConstructionStatusCompletePercentage;
		this.delayExpectedFromOriginalAcdDays = delayExpectedFromOriginalAcdDays;
		this.portfolioValue = portfolioValue;
		this.areaVariationPercentage = areaVariationPercentage;
		this.otherRecharges = otherRecharges;
		this.percOverdue = percOverdue;
		this.numberOfTimesCustomerHasDefaultedOnInstallments = numberOfTimesCustomerHasDefaultedOnInstallments;
		this.percPdcCoverageOrPertPaymentPaidWhicheverIsHigher = percPdcCoverageOrPertPaymentPaidWhicheverIsHigher;
		this.differencePaymentAndReraPercentage = differencePaymentAndReraPercentage;
		this.completionInstallmentPrecProposedPlan = completionInstallmentPrecProposedPlan;
		this.diffCurAcdAndLastNonCompletionInstallmentInProposedPlan = diffCurAcdAndLastNonCompletionInstallmentInProposedPlan;
		this.diffCurAcdAndLastPaymentMilestoneInProposedPlan = diffCurAcdAndLastPaymentMilestoneInProposedPlan;
		this.maximumMovementInAnInstallmentDays = maximumMovementInAnInstallmentDays;
		this.numberOfInstallmentsMoved = numberOfInstallmentsMoved;
		this.furniturePaymentPlanDelayMonths = furniturePaymentPlanDelayMonths;
		this.differenceBetweenCurrentAcdAndAoptDateDays = differenceBetweenCurrentAcdAndAoptDateDays;
		this.tempOne = tempOne;
		this.tempTwo = tempTwo;
		this.tempThree = tempThree;
		this.tempFour = tempFour;
		this.priorAopt = priorAopt;
		this.allowed = allowed;
		this.message = message;
		this.firstRecommendingAuthority = firstRecommendingAuthority;
		this.secondRecommendingAuthority = secondRecommendingAuthority;
		this.thirdRecommendingAuthority = thirdRecommendingAuthority;
		this.fourthRecommendingAuthority = fourthRecommendingAuthority;
		this.firstApprovingAuthority = firstApprovingAuthority;
		this.secondApprovingAuthority = secondApprovingAuthority;
		this.thirdApprovingAuthority = thirdApprovingAuthority;
		this.paymentDpPercentage = paymentDpPercentage;
		this.paymentGateOne = paymentGateOne;
		this.paymentGateTwo = paymentGateTwo;
		this.paymentGateThree = paymentGateThree;
		this.paymentGateFour = paymentGateFour;
		this.paymentGateFive = paymentGateFive;
		this.paymentGateSix = paymentGateSix;
		this.paymentGateSeven = paymentGateSeven;
		this.paymentGateOneDate = paymentGateOneDate;
		this.paymentGateOnePercentage = paymentGateOnePercentage;
		this.paymentGateTwoDate = paymentGateTwoDate;
		this.paymentGateTwoPercentage = paymentGateTwoPercentage;
		this.paymentGateThreeDate = paymentGateThreeDate;
		this.paymentGateThreePercentage = paymentGateThreePercentage;
		this.paymentGateFourDate = paymentGateFourDate;
		this.paymentGateFourPercentage = paymentGateFourPercentage;
		this.paymentGateCompletionPercentage = paymentGateCompletionPercentage;
		this.paymentGateFiveDate = paymentGateFiveDate;
		this.paymentGateFivePercentage = paymentGateFivePercentage;
		this.paymentGateSixDate = paymentGateSixDate;
		this.paymentGateSixPercentage = paymentGateSixPercentage;
		this.paymentGateSevenDate = paymentGateSevenDate;
		this.paymentGateSevenPercentage = paymentGateSevenPercentage;
	}

	

}
