package com.damac.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement


public class TitleDeed implements java.io.Serializable{
	
	static final long serialVersionUID = 1L;
	
	private java.lang.String description;
	private java.util.Date ruleValidityStart;
	private java.util.Date ruleValidityEnd;
	private java.lang.String processName;
	private java.lang.String subProcessName;
	private java.lang.String projectCity;
	private java.lang.String project;
	private java.lang.String buildingCode;
	private java.lang.String permittedUse;
	private java.lang.String bedroomType;
	private java.lang.String applicableUnits;
	private java.lang.String unitType;
	private java.lang.String customerType;
	private java.lang.String modeofRequest;
	private java.lang.String dispute;
	private boolean enforcement;
	private boolean litigation;
	private boolean mortgage;
	private boolean underAssignment;
	private boolean pcc;
	private boolean bccAvailable;
	private java.lang.String tempA;
	private java.lang.String tempB;
	private java.lang.String tempC;
	//added from other sheet
	private java.lang.String nationality;	
	private java.lang.String nationalityGroup;
	private double areaVariation;
	
	//ACTION variables
	private java.lang.String eligbleforTitleDeed;
	private java.lang.String message;
	private java.lang.String fees;
	private java.lang.String recommendingAuthorityOne;
	private java.lang.String recommendingAuthorityTwo;
	private java.lang.String recommendingAuthorityThree;
	private java.lang.String recommendingAuthorityFour;
	private java.lang.String approvingAuthorityOne;
	private java.lang.String approvingAuthorityTwo;
	private java.lang.String approvingAuthorityThree;
	private java.lang.String tempOne;
	private java.lang.String tempTwo;
	private java.lang.String tempThree;
	private java.lang.String tempFour;
	
	//added from other sheet
	private java.lang.String clearAndValidPassportCopyOfOwnerOrJointOwners;
	private java.lang.String copyOfValidEmiratesID;
	private java.lang.String paymentClearanceCertificate;
	private java.lang.String copyOfFirstPageOfSPA;
	private java.lang.String areaVariationAddendum;
	private java.lang.String copyOfValidGccID;
	private java.lang.String visaOrEntryStampWithUID;
	private java.lang.String copyOfValidTradeLicense;
	private java.lang.String obtainMortgageDocs;
	private java.lang.String noObjectionLetter;
	private java.lang.String copyOfValidCompanyDocs;
	private java.lang.String bankGuaranteeLetterFromMortgageManagerInCaseNotFullyPaid;
	private java.lang.String originalCompanyDocs;
	
	public TitleDeed(){
		
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

	public java.lang.String getPermittedUse() {
		return permittedUse;
	}

	public void setPermittedUse(java.lang.String permittedUse) {
		this.permittedUse = permittedUse;
	}

	public java.lang.String getBedroomType() {
		return bedroomType;
	}

	public void setBedroomType(java.lang.String bedroomType) {
		this.bedroomType = bedroomType;
	}

	public java.lang.String getApplicableUnits() {
		return applicableUnits;
	}

	public void setApplicableUnits(java.lang.String applicableUnits) {
		this.applicableUnits = applicableUnits;
	}

	public java.lang.String getUnitType() {
		return unitType;
	}

	public void setUnitType(java.lang.String unitType) {
		this.unitType = unitType;
	}

	public java.lang.String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(java.lang.String customerType) {
		this.customerType = customerType;
	}

	public java.lang.String getModeofRequest() {
		return modeofRequest;
	}

	public void setModeofRequest(java.lang.String modeofRequest) {
		this.modeofRequest = modeofRequest;
	}

	public java.lang.String getdispute() {
		return dispute;
	}

	public void setdispute(java.lang.String dispute) {
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

	public boolean isUnderAssignment() {
		return underAssignment;
	}

	public void setUnderAssignment(boolean underAssignment) {
		this.underAssignment = underAssignment;
	}

	public boolean isPcc() {
		return pcc;
	}

	public void setPcc(boolean pcc) {
		this.pcc = pcc;
	}

	public boolean isBccAvailable() {
		return bccAvailable;
	}

	public void setBccAvailable(boolean bccAvailable) {
		this.bccAvailable = bccAvailable;
	}

	public java.lang.String getTempA() {
		return tempA;
	}

	public void setTempA(java.lang.String tempA) {
		this.tempA = tempA;
	}

	public java.lang.String getTempB() {
		return tempB;
	}

	public void setTempB(java.lang.String tempB) {
		this.tempB = tempB;
	}

	public java.lang.String getTempC() {
		return tempC;
	}

	public void setTempC(java.lang.String tempC) {
		this.tempC = tempC;
	}

	public java.lang.String getNationality() {
		return nationality;
	}

	public void setNationality(java.lang.String nationality) {
		this.nationality = nationality;
	}

	public java.lang.String getNationalityGroup() {
		return nationalityGroup;
	}

	public void setNationalityGroup(java.lang.String nationalityGroup) {
		this.nationalityGroup = nationalityGroup;
	}

	public double getAreaVariation() {
		return areaVariation;
	}

	public void setAreaVariation(double areaVariation) {
		this.areaVariation = areaVariation;
	}

	public java.lang.String getEligbleforTitleDeed() {
		return eligbleforTitleDeed;
	}

	public void setEligbleforTitleDeed(java.lang.String eligbleforTitleDeed) {
		this.eligbleforTitleDeed = eligbleforTitleDeed;
	}

	public java.lang.String getMessage() {
		return message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public java.lang.String getFees() {
		return fees;
	}

	public void setFees(java.lang.String fees) {
		this.fees = fees;
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

	public java.lang.String getTempOne() {
		return tempOne;
	}

	public void setTempOne(java.lang.String tempOne) {
		this.tempOne = tempOne;
	}

	public java.lang.String getTempTwo() {
		return tempTwo;
	}

	public void setTempTwo(java.lang.String tempTwo) {
		this.tempTwo = tempTwo;
	}

	public java.lang.String getTempThree() {
		return tempThree;
	}

	public void setTempThree(java.lang.String tempThree) {
		this.tempThree = tempThree;
	}

	public java.lang.String getTempFour() {
		return tempFour;
	}

	public void setTempFour(java.lang.String tempFour) {
		this.tempFour = tempFour;
	}

	public java.lang.String getClearAndValidPassportCopyOfOwnerOrJointOwners() {
		return clearAndValidPassportCopyOfOwnerOrJointOwners;
	}

	public void setClearAndValidPassportCopyOfOwnerOrJointOwners(java.lang.String clearAndValidPassportCopyOfOwnerOrJointOwners) {
		this.clearAndValidPassportCopyOfOwnerOrJointOwners = clearAndValidPassportCopyOfOwnerOrJointOwners;
	}

	public java.lang.String getCopyOfValidEmiratesID() {
		return copyOfValidEmiratesID;
	}

	public void setCopyOfValidEmiratesID(java.lang.String copyOfValidEmiratesID) {
		this.copyOfValidEmiratesID = copyOfValidEmiratesID;
	}

	public java.lang.String getPaymentClearanceCertificate() {
		return paymentClearanceCertificate;
	}

	public void setPaymentClearanceCertificate(java.lang.String paymentClearanceCertificate) {
		this.paymentClearanceCertificate = paymentClearanceCertificate;
	}

	public java.lang.String getCopyOfFirstPageOfSPA() {
		return copyOfFirstPageOfSPA;
	}

	public void setCopyOfFirstPageOfSPA(java.lang.String copyOfFirstPageOfSPA) {
		this.copyOfFirstPageOfSPA = copyOfFirstPageOfSPA;
	}

	public java.lang.String getAreaVariationAddendum() {
		return areaVariationAddendum;
	}

	public void setAreaVariationAddendum(java.lang.String areaVariationAddendum) {
		this.areaVariationAddendum = areaVariationAddendum;
	}

	public java.lang.String getCopyOfValidGccID() {
		return copyOfValidGccID;
	}

	public void setCopyOfValidGccID(java.lang.String copyOfValidGccID) {
		this.copyOfValidGccID = copyOfValidGccID;
	}

	public java.lang.String getVisaOrEntryStampWithUID() {
		return visaOrEntryStampWithUID;
	}

	public void setVisaOrEntryStampWithUID(java.lang.String visaOrEntryStampWithUID) {
		this.visaOrEntryStampWithUID = visaOrEntryStampWithUID;
	}

	public java.lang.String getCopyOfValidTradeLicense() {
		return copyOfValidTradeLicense;
	}

	public void setCopyOfValidTradeLicense(java.lang.String copyOfValidTradeLicense) {
		this.copyOfValidTradeLicense = copyOfValidTradeLicense;
	}

	public java.lang.String getObtainMortgageDocs() {
		return obtainMortgageDocs;
	}

	public void setObtainMortgageDocs(java.lang.String obtainMortgageDocs) {
		this.obtainMortgageDocs = obtainMortgageDocs;
	}

	public java.lang.String getNoObjectionLetter() {
		return noObjectionLetter;
	}

	public void setNoObjectionLetter(java.lang.String noObjectionLetter) {
		this.noObjectionLetter = noObjectionLetter;
	}

	public java.lang.String getCopyOfValidCompanyDocs() {
		return copyOfValidCompanyDocs;
	}

	public void setCopyOfValidCompanyDocs(java.lang.String copyOfValidCompanyDocs) {
		this.copyOfValidCompanyDocs = copyOfValidCompanyDocs;
	}

	public java.lang.String getBankGuaranteeLetterFromMortgageManagerInCaseNotFullyPaid() {
		return bankGuaranteeLetterFromMortgageManagerInCaseNotFullyPaid;
	}

	public void setBankGuaranteeLetterFromMortgageManagerInCaseNotFullyPaid(
			java.lang.String bankGuaranteeLetterFromMortgageManagerInCaseNotFullyPaid) {
		this.bankGuaranteeLetterFromMortgageManagerInCaseNotFullyPaid = bankGuaranteeLetterFromMortgageManagerInCaseNotFullyPaid;
	}

	public java.lang.String getOriginalCompanyDocs() {
		return originalCompanyDocs;
	}

	public void setOriginalCompanyDocs(java.lang.String originalCompanyDocs) {
		this.originalCompanyDocs = originalCompanyDocs;
	}

	public TitleDeed(java.lang.String description, java.util.Date ruleValidityStart, java.util.Date ruleValidityEnd, java.lang.String processName,
			java.lang.String subProcessName, java.lang.String projectCity, java.lang.String project, java.lang.String buildingCode, java.lang.String permittedUse,
			java.lang.String bedroomType, java.lang.String applicableUnits, java.lang.String unitType, java.lang.String customerType, java.lang.String modeofRequest,
			java.lang.String dispute, boolean enforcement, boolean litigation, boolean mortgage, boolean underAssignment,
			boolean pcc, boolean bccAvailable, java.lang.String tempA, java.lang.String tempB, java.lang.String tempC, java.lang.String nationality,
			java.lang.String nationalityGroup, double areaVariation, java.lang.String eligbleforTitleDeed, java.lang.String message, java.lang.String fees,
			java.lang.String recommendingAuthorityOne, java.lang.String recommendingAuthorityTwo, java.lang.String recommendingAuthorityThree,
			java.lang.String recommendingAuthorityFour, java.lang.String approvingAuthorityOne, java.lang.String approvingAuthorityTwo,
			java.lang.String approvingAuthorityThree, java.lang.String tempOne, java.lang.String tempTwo, java.lang.String tempThree, java.lang.String tempFour,
			java.lang.String clearAndValidPassportCopyOfOwnerOrJointOwners, java.lang.String copyOfValidEmiratesID,
			java.lang.String paymentClearanceCertificate, java.lang.String copyOfFirstPageOfSPA, java.lang.String areaVariationAddendum,
			java.lang.String copyOfValidGccID, java.lang.String visaOrEntryStampWithUID, java.lang.String copyOfValidTradeLicense,
			java.lang.String obtainMortgageDocs, java.lang.String noObjectionLetter, java.lang.String copyOfValidCompanyDocs,
			java.lang.String bankGuaranteeLetterFromMortgageManagerInCaseNotFullyPaid, java.lang.String originalCompanyDocs) {
		super();
		this.description = description;
		this.ruleValidityStart = ruleValidityStart;
		this.ruleValidityEnd = ruleValidityEnd;
		this.processName = processName;
		this.subProcessName = subProcessName;
		this.projectCity = projectCity;
		this.project = project;
		this.buildingCode = buildingCode;
		this.permittedUse = permittedUse;
		this.bedroomType = bedroomType;
		this.applicableUnits = applicableUnits;
		this.unitType = unitType;
		this.customerType = customerType;
		this.modeofRequest = modeofRequest;
		this.dispute = dispute;
		this.enforcement = enforcement;
		this.litigation = litigation;
		this.mortgage = mortgage;
		this.underAssignment = underAssignment;
		this.pcc = pcc;
		this.bccAvailable = bccAvailable;
		this.tempA = tempA;
		this.tempB = tempB;
		this.tempC = tempC;
		this.nationality = nationality;
		this.nationalityGroup = nationalityGroup;
		this.areaVariation = areaVariation;
		this.eligbleforTitleDeed = eligbleforTitleDeed;
		this.message = message;
		this.fees = fees;
		this.recommendingAuthorityOne = recommendingAuthorityOne;
		this.recommendingAuthorityTwo = recommendingAuthorityTwo;
		this.recommendingAuthorityThree = recommendingAuthorityThree;
		this.recommendingAuthorityFour = recommendingAuthorityFour;
		this.approvingAuthorityOne = approvingAuthorityOne;
		this.approvingAuthorityTwo = approvingAuthorityTwo;
		this.approvingAuthorityThree = approvingAuthorityThree;
		this.tempOne = tempOne;
		this.tempTwo = tempTwo;
		this.tempThree = tempThree;
		this.tempFour = tempFour;
		this.clearAndValidPassportCopyOfOwnerOrJointOwners = clearAndValidPassportCopyOfOwnerOrJointOwners;
		this.copyOfValidEmiratesID = copyOfValidEmiratesID;
		this.paymentClearanceCertificate = paymentClearanceCertificate;
		this.copyOfFirstPageOfSPA = copyOfFirstPageOfSPA;
		this.areaVariationAddendum = areaVariationAddendum;
		this.copyOfValidGccID = copyOfValidGccID;
		this.visaOrEntryStampWithUID = visaOrEntryStampWithUID;
		this.copyOfValidTradeLicense = copyOfValidTradeLicense;
		this.obtainMortgageDocs = obtainMortgageDocs;
		this.noObjectionLetter = noObjectionLetter;
		this.copyOfValidCompanyDocs = copyOfValidCompanyDocs;
		this.bankGuaranteeLetterFromMortgageManagerInCaseNotFullyPaid = bankGuaranteeLetterFromMortgageManagerInCaseNotFullyPaid;
		this.originalCompanyDocs = originalCompanyDocs;
	}

	

}
