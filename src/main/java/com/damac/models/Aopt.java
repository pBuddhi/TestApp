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
	private java.lang.Boolean eho;
	private java.lang.Boolean dispute;
	private java.lang.Boolean enforcement;
	private java.lang.Boolean litigation;
	private java.lang.String project;
	private java.lang.String buildingCode;
	private java.lang.String bedroomType;
	private java.lang.Boolean ho;
	private java.lang.String applicableNationality;
	private java.lang.Boolean bulk;
	private java.lang.String originalPaymentPlanType;
	private java.lang.String proposedPaymentPlanType;
	private java.lang.Boolean paymentsEquallyDistributed;
	private java.lang.Boolean paymentPlanExtendedBeyondAcd;
	private java.lang.String tempFive;
	private java.lang.String tempSix;
	private java.lang.Boolean defaultVal;
	private java.lang.String previousWaivers;
	private java.lang.Integer currentConstructionStatusCompletePercentage;
	private java.lang.Integer currentReraConstructionStatusCompletePercentage;
	private java.lang.Integer delayExpectedFromOriginalAcdDays;
	private java.lang.Integer portfolioValue;
	private java.lang.Integer areaVariationPercentage;
	private java.lang.Integer otherRecharges;
	private java.lang.Integer percOverdue;
	private java.lang.Integer numberOfTimesCustomerHasDefaultedOnInstallments;
	private java.lang.Integer percPdcCoverageOrPertPaymentPaidWhicheverIsHigher;
	private java.lang.Integer differencePaymentAndReraPercentage;
	private java.lang.Integer completionInstallmentPrecProposedPlan;
	private java.lang.Integer diffCurAcdAndLastNonCompletionInstallmentInProposedPlan;
	private java.lang.Integer diffCurAcdAndLastPaymentMilestoneInProposedPlan;
	private java.lang.Integer maximumMovementInAnInstallmentDays;
	private java.lang.Integer numberOfInstallmentsMoved;
	private java.lang.Integer furniturePaymentPlanDelayMonths;
	private java.lang.Integer differenceBetweenCurrentAcdAndAoptDateDays;
	private java.lang.Double tempOne;
	private java.lang.Double tempTwo;
	private java.lang.Double tempThree;
	private java.lang.Double tempFour;
	private java.lang.String priorAopt;

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
	private java.lang.Double paymentDpPercentage;
	private java.lang.String paymentGateOne;
	private java.lang.String paymentGateTwo;
	private java.lang.String paymentGateThree;
	private java.lang.String paymentGateFour;
	private java.lang.String paymentGateFive;
	private java.lang.String paymentGateSix;
	private java.lang.String paymentGateSeven;
	private java.lang.String paymentGateOneDate;
	private java.lang.Integer paymentGateOnePercentage;
	private java.lang.String paymentGateTwoDate;
	private java.lang.Integer paymentGateTwoPercentage;
	private java.lang.String paymentGateThreeDate;
	private java.lang.Integer paymentGateThreePercentage;
	private java.lang.String paymentGateFourDate;
	private java.lang.Integer paymentGateFourPercentage;
	private java.lang.Integer paymentGateCompletionPercentage;
	private java.lang.String paymentGateFiveDate;
	private java.lang.Integer paymentGateFivePercentage;
	private java.lang.String paymentGateSixDate;
	private java.lang.Integer paymentGateSixPercentage;
	private java.lang.String paymentGateSevenDate;
	private java.lang.Integer paymentGateSevenPercentage;

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

	public java.lang.Boolean getEho() {
		return eho;
	}

	public void setEho(java.lang.Boolean eho) {
		this.eho = eho;
	}

	public java.lang.Boolean getDispute() {
		return dispute;
	}

	public void setDispute(java.lang.Boolean dispute) {
		this.dispute = dispute;
	}

	public java.lang.Boolean getEnforcement() {
		return enforcement;
	}

	public void setEnforcement(java.lang.Boolean enforcement) {
		this.enforcement = enforcement;
	}

	public java.lang.Boolean getLitigation() {
		return litigation;
	}

	public void setLitigation(java.lang.Boolean litigation) {
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

	public java.lang.Boolean getHo() {
		return ho;
	}

	public void setHo(java.lang.Boolean ho) {
		this.ho = ho;
	}

	public java.lang.String getApplicableNationality() {
		return applicableNationality;
	}

	public void setApplicableNationality(java.lang.String applicableNationality) {
		this.applicableNationality = applicableNationality;
	}

	public java.lang.Boolean getBulk() {
		return bulk;
	}

	public void setBulk(java.lang.Boolean bulk) {
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

	public java.lang.Boolean getPaymentsEquallyDistributed() {
		return paymentsEquallyDistributed;
	}

	public void setPaymentsEquallyDistributed(java.lang.Boolean paymentsEquallyDistributed) {
		this.paymentsEquallyDistributed = paymentsEquallyDistributed;
	}

	public java.lang.Boolean getPaymentPlanExtendedBeyondAcd() {
		return paymentPlanExtendedBeyondAcd;
	}

	public void setPaymentPlanExtendedBeyondAcd(java.lang.Boolean paymentPlanExtendedBeyondAcd) {
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

	public java.lang.Boolean getDefaultVal() {
		return defaultVal;
	}

	public void setDefaultVal(java.lang.Boolean defaultVal) {
		this.defaultVal = defaultVal;
	}

	public java.lang.String getPreviousWaivers() {
		return previousWaivers;
	}

	public void setPreviousWaivers(java.lang.String previousWaivers) {
		this.previousWaivers = previousWaivers;
	}

	public java.lang.Integer getCurrentConstructionStatusCompletePercentage() {
		return currentConstructionStatusCompletePercentage;
	}

	public void setCurrentConstructionStatusCompletePercentage(java.lang.Integer currentConstructionStatusCompletePercentage) {
		this.currentConstructionStatusCompletePercentage = currentConstructionStatusCompletePercentage;
	}

	public java.lang.Integer getCurrentReraConstructionStatusCompletePercentage() {
		return currentReraConstructionStatusCompletePercentage;
	}

	public void setCurrentReraConstructionStatusCompletePercentage(
			java.lang.Integer currentReraConstructionStatusCompletePercentage) {
		this.currentReraConstructionStatusCompletePercentage = currentReraConstructionStatusCompletePercentage;
	}

	public java.lang.Integer getDelayExpectedFromOriginalAcdDays() {
		return delayExpectedFromOriginalAcdDays;
	}

	public void setDelayExpectedFromOriginalAcdDays(java.lang.Integer delayExpectedFromOriginalAcdDays) {
		this.delayExpectedFromOriginalAcdDays = delayExpectedFromOriginalAcdDays;
	}

	public java.lang.Integer getPortfolioValue() {
		return portfolioValue;
	}

	public void setPortfolioValue(java.lang.Integer portfolioValue) {
		this.portfolioValue = portfolioValue;
	}

	public java.lang.Integer getAreaVariationPercentage() {
		return areaVariationPercentage;
	}

	public void setAreaVariationPercentage(java.lang.Integer areaVariationPercentage) {
		this.areaVariationPercentage = areaVariationPercentage;
	}

	public java.lang.Integer getOtherRecharges() {
		return otherRecharges;
	}

	public void setOtherRecharges(java.lang.Integer otherRecharges) {
		this.otherRecharges = otherRecharges;
	}

	public java.lang.Integer getPercOverdue() {
		return percOverdue;
	}

	public void setPercOverdue(java.lang.Integer percOverdue) {
		this.percOverdue = percOverdue;
	}

	public java.lang.Integer getNumberOfTimesCustomerHasDefaultedOnInstallments() {
		return numberOfTimesCustomerHasDefaultedOnInstallments;
	}

	public void setNumberOfTimesCustomerHasDefaultedOnInstallments(
			java.lang.Integer numberOfTimesCustomerHasDefaultedOnInstallments) {
		this.numberOfTimesCustomerHasDefaultedOnInstallments = numberOfTimesCustomerHasDefaultedOnInstallments;
	}

	public java.lang.Integer getPercPdcCoverageOrPertPaymentPaidWhicheverIsHigher() {
		return percPdcCoverageOrPertPaymentPaidWhicheverIsHigher;
	}

	public void setPercPdcCoverageOrPertPaymentPaidWhicheverIsHigher(
			java.lang.Integer percPdcCoverageOrPertPaymentPaidWhicheverIsHigher) {
		this.percPdcCoverageOrPertPaymentPaidWhicheverIsHigher = percPdcCoverageOrPertPaymentPaidWhicheverIsHigher;
	}

	public java.lang.Integer getDifferencePaymentAndReraPercentage() {
		return differencePaymentAndReraPercentage;
	}

	public void setDifferencePaymentAndReraPercentage(java.lang.Integer differencePaymentAndReraPercentage) {
		this.differencePaymentAndReraPercentage = differencePaymentAndReraPercentage;
	}

	public java.lang.Integer getCompletionInstallmentPrecProposedPlan() {
		return completionInstallmentPrecProposedPlan;
	}

	public void setCompletionInstallmentPrecProposedPlan(java.lang.Integer completionInstallmentPrecProposedPlan) {
		this.completionInstallmentPrecProposedPlan = completionInstallmentPrecProposedPlan;
	}

	public java.lang.Integer getDiffCurAcdAndLastNonCompletionInstallmentInProposedPlan() {
		return diffCurAcdAndLastNonCompletionInstallmentInProposedPlan;
	}

	public void setDiffCurAcdAndLastNonCompletionInstallmentInProposedPlan(
			java.lang.Integer diffCurAcdAndLastNonCompletionInstallmentInProposedPlan) {
		this.diffCurAcdAndLastNonCompletionInstallmentInProposedPlan = diffCurAcdAndLastNonCompletionInstallmentInProposedPlan;
	}

	public java.lang.Integer getDiffCurAcdAndLastPaymentMilestoneInProposedPlan() {
		return diffCurAcdAndLastPaymentMilestoneInProposedPlan;
	}

	public void setDiffCurAcdAndLastPaymentMilestoneInProposedPlan(
			java.lang.Integer diffCurAcdAndLastPaymentMilestoneInProposedPlan) {
		this.diffCurAcdAndLastPaymentMilestoneInProposedPlan = diffCurAcdAndLastPaymentMilestoneInProposedPlan;
	}

	public java.lang.Integer getMaximumMovementInAnInstallmentDays() {
		return maximumMovementInAnInstallmentDays;
	}

	public void setMaximumMovementInAnInstallmentDays(java.lang.Integer maximumMovementInAnInstallmentDays) {
		this.maximumMovementInAnInstallmentDays = maximumMovementInAnInstallmentDays;
	}

	public java.lang.Integer getNumberOfInstallmentsMoved() {
		return numberOfInstallmentsMoved;
	}

	public void setNumberOfInstallmentsMoved(java.lang.Integer numberOfInstallmentsMoved) {
		this.numberOfInstallmentsMoved = numberOfInstallmentsMoved;
	}

	public java.lang.Integer getFurniturePaymentPlanDelayMonths() {
		return furniturePaymentPlanDelayMonths;
	}

	public void setFurniturePaymentPlanDelayMonths(java.lang.Integer furniturePaymentPlanDelayMonths) {
		this.furniturePaymentPlanDelayMonths = furniturePaymentPlanDelayMonths;
	}

	public java.lang.Integer getDifferenceBetweenCurrentAcdAndAoptDateDays() {
		return differenceBetweenCurrentAcdAndAoptDateDays;
	}

	public void setDifferenceBetweenCurrentAcdAndAoptDateDays(java.lang.Integer differenceBetweenCurrentAcdAndAoptDateDays) {
		this.differenceBetweenCurrentAcdAndAoptDateDays = differenceBetweenCurrentAcdAndAoptDateDays;
	}

	public java.lang.Double getTempOne() {
		return tempOne;
	}

	public void setTempOne(java.lang.Double tempOne) {
		this.tempOne = tempOne;
	}

	public java.lang.Double getTempTwo() {
		return tempTwo;
	}

	public void setTempTwo(java.lang.Double tempTwo) {
		this.tempTwo = tempTwo;
	}

	public java.lang.Double getTempThree() {
		return tempThree;
	}

	public void setTempThree(java.lang.Double tempThree) {
		this.tempThree = tempThree;
	}

	public java.lang.Double getTempFour() {
		return tempFour;
	}

	public void setTempFour(java.lang.Double tempFour) {
		this.tempFour = tempFour;
	}

	public java.lang.String getPriorAopt() {
		return priorAopt;
	}

	public void setPriorAopt(java.lang.String priorAopt) {
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

	public java.lang.Double getPaymentDpPercentage() {
		return paymentDpPercentage;
	}

	public void setPaymentDpPercentage(java.lang.Double paymentDpPercentage) {
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

	public java.lang.Integer getPaymentGateOnePercentage() {
		return paymentGateOnePercentage;
	}

	public void setPaymentGateOnePercentage(java.lang.Integer paymentGateOnePercentage) {
		this.paymentGateOnePercentage = paymentGateOnePercentage;
	}

	public java.lang.String getPaymentGateTwoDate() {
		return paymentGateTwoDate;
	}

	public void setPaymentGateTwoDate(java.lang.String paymentGateTwoDate) {
		this.paymentGateTwoDate = paymentGateTwoDate;
	}

	public java.lang.Integer getPaymentGateTwoPercentage() {
		return paymentGateTwoPercentage;
	}

	public void setPaymentGateTwoPercentage(java.lang.Integer paymentGateTwoPercentage) {
		this.paymentGateTwoPercentage = paymentGateTwoPercentage;
	}

	public java.lang.String getPaymentGateThreeDate() {
		return paymentGateThreeDate;
	}

	public void setPaymentGateThreeDate(java.lang.String paymentGateThreeDate) {
		this.paymentGateThreeDate = paymentGateThreeDate;
	}

	public java.lang.Integer getPaymentGateThreePercentage() {
		return paymentGateThreePercentage;
	}

	public void setPaymentGateThreePercentage(java.lang.Integer paymentGateThreePercentage) {
		this.paymentGateThreePercentage = paymentGateThreePercentage;
	}

	public java.lang.String getPaymentGateFourDate() {
		return paymentGateFourDate;
	}

	public void setPaymentGateFourDate(java.lang.String paymentGateFourDate) {
		this.paymentGateFourDate = paymentGateFourDate;
	}

	public java.lang.Integer getPaymentGateFourPercentage() {
		return paymentGateFourPercentage;
	}

	public void setPaymentGateFourPercentage(java.lang.Integer paymentGateFourPercentage) {
		this.paymentGateFourPercentage = paymentGateFourPercentage;
	}

	public java.lang.Integer getPaymentGateCompletionPercentage() {
		return paymentGateCompletionPercentage;
	}

	public void setPaymentGateCompletionPercentage(java.lang.Integer paymentGateCompletionPercentage) {
		this.paymentGateCompletionPercentage = paymentGateCompletionPercentage;
	}

	public java.lang.String getPaymentGateFiveDate() {
		return paymentGateFiveDate;
	}

	public void setPaymentGateFiveDate(java.lang.String paymentGateFiveDate) {
		this.paymentGateFiveDate = paymentGateFiveDate;
	}

	public java.lang.Integer getPaymentGateFivePercentage() {
		return paymentGateFivePercentage;
	}

	public void setPaymentGateFivePercentage(java.lang.Integer paymentGateFivePercentage) {
		this.paymentGateFivePercentage = paymentGateFivePercentage;
	}

	public java.lang.String getPaymentGateSixDate() {
		return paymentGateSixDate;
	}

	public void setPaymentGateSixDate(java.lang.String paymentGateSixDate) {
		this.paymentGateSixDate = paymentGateSixDate;
	}

	public java.lang.Integer getPaymentGateSixPercentage() {
		return paymentGateSixPercentage;
	}

	public void setPaymentGateSixPercentage(java.lang.Integer paymentGateSixPercentage) {
		this.paymentGateSixPercentage = paymentGateSixPercentage;
	}

	public java.lang.String getPaymentGateSevenDate() {
		return paymentGateSevenDate;
	}

	public void setPaymentGateSevenDate(java.lang.String paymentGateSevenDate) {
		this.paymentGateSevenDate = paymentGateSevenDate;
	}

	public java.lang.Integer getPaymentGateSevenPercentage() {
		return paymentGateSevenPercentage;
	}

	public void setPaymentGateSevenPercentage(java.lang.Integer paymentGateSevenPercentage) {
		this.paymentGateSevenPercentage = paymentGateSevenPercentage;
	}

	public Aopt(java.lang.String description, java.util.Date ruleValidityStartDate, java.util.Date ruleValidityEndDate, java.lang.String subProcessName,
			java.lang.String projectCity, java.lang.String unitType, java.lang.String permittedUse, java.lang.Boolean eho, java.lang.Boolean dispute, java.lang.Boolean enforcement,
			java.lang.Boolean litigation, java.lang.String project, java.lang.String buildingCode, java.lang.String bedroomType, java.lang.Boolean ho,
			java.lang.String applicableNationality, java.lang.Boolean bulk, java.lang.String originalPaymentPlanType, java.lang.String proposedPaymentPlanType,
			java.lang.Boolean paymentsEquallyDistributed, java.lang.Boolean paymentPlanExtendedBeyondAcd, java.lang.String tempFive, java.lang.String tempSix,
			java.lang.Boolean defaultVal, java.lang.String previousWaivers, java.lang.Integer currentConstructionStatusCompletePercentage,
			java.lang.Integer currentReraConstructionStatusCompletePercentage, java.lang.Integer delayExpectedFromOriginalAcdDays,
			java.lang.Integer portfolioValue, java.lang.Integer areaVariationPercentage, java.lang.Integer otherRecharges, java.lang.Integer percOverdue,
			java.lang.Integer numberOfTimesCustomerHasDefaultedOnInstallments,
			java.lang.Integer percPdcCoverageOrPertPaymentPaidWhicheverIsHigher, java.lang.Integer differencePaymentAndReraPercentage,
			java.lang.Integer completionInstallmentPrecProposedPlan,
			java.lang.Integer diffCurAcdAndLastNonCompletionInstallmentInProposedPlan,
			java.lang.Integer diffCurAcdAndLastPaymentMilestoneInProposedPlan, java.lang.Integer maximumMovementInAnInstallmentDays,
			java.lang.Integer numberOfInstallmentsMoved, java.lang.Integer furniturePaymentPlanDelayMonths,
			java.lang.Integer differenceBetweenCurrentAcdAndAoptDateDays, java.lang.Double tempOne, java.lang.Double tempTwo, java.lang.Double tempThree,
			java.lang.Double tempFour, java.lang.String priorAopt, java.lang.String allowed, java.lang.String message, java.lang.String firstRecommendingAuthority,
			java.lang.String secondRecommendingAuthority, java.lang.String thirdRecommendingAuthority, java.lang.String fourthRecommendingAuthority,
			java.lang.String firstApprovingAuthority, java.lang.String secondApprovingAuthority, java.lang.String thirdApprovingAuthority,
			java.lang.Double paymentDpPercentage, java.lang.String paymentGateOne, java.lang.String paymentGateTwo, java.lang.String paymentGateThree,
			java.lang.String paymentGateFour, java.lang.String paymentGateFive, java.lang.String paymentGateSix, java.lang.String paymentGateSeven,
			java.lang.String paymentGateOneDate, java.lang.Integer paymentGateOnePercentage, java.lang.String paymentGateTwoDate,
			java.lang.Integer paymentGateTwoPercentage, java.lang.String paymentGateThreeDate, java.lang.Integer paymentGateThreePercentage,
			java.lang.String paymentGateFourDate, java.lang.Integer paymentGateFourPercentage, java.lang.Integer paymentGateCompletionPercentage,
			java.lang.String paymentGateFiveDate, java.lang.Integer paymentGateFivePercentage, java.lang.String paymentGateSixDate,
			java.lang.Integer paymentGateSixPercentage, java.lang.String paymentGateSevenDate, java.lang.Integer paymentGateSevenPercentage) {
		
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
