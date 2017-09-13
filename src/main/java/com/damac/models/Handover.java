package com.damac.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement


public class Handover implements java.io.Serializable{
    
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
	private java.lang.String nationality;
	private java.lang.String nationalityGroup;
	private boolean mortgage;
	private java.lang.String customerType;
	private boolean recoveryUnit;
	private boolean pcc;
	private boolean servicesChargesPaid;
	private boolean poa;
	
	//added from other sheet
	private double areaVariationPercentage;
	private double typeVariation;
	private boolean recovery;
	private double paidPercentage;
	private double defaultPercentage;
	private java.lang.String modeOfRequest;
	
	private java.lang.String agreementStatus;
	private boolean defaultVal;
	private boolean underTermination;
	private boolean dispute;
	private boolean enforcement;
	private boolean litigation;
	private boolean underAssignment;
	private int noOfMajorSnagsInApartment;
	private boolean bccAvailable;
	private boolean accessPresent;
	private boolean utilitiesAvailable;
	private double percAptsSnagged;
	private java.lang.String tempA;
	private java.lang.String tempB;
	private java.lang.String tempC;
	
	//ACTION variable;
	private java.lang.String allowed;
	private java.lang.String message;
	private java.lang.String mortgageNOCfromBank;
	private java.lang.String ifPoaTakingHandoverColatePoaPassportResidence;
	private java.lang.String corporateValidTradeLicence;
	private java.lang.String corporateArticleMemorandumOfAssociation;
	private java.lang.String corporateBoardResolution;
	private java.lang.String corporatePoa;
	private java.lang.String signedForm;
	private java.lang.String clearAndValidPassportCopyOfOwner;
	private java.lang.String clearAndValidPassportCopyOfJointOwner;
	private java.lang.String visaOrEntryStampWithUid;
	private java.lang.String copyofValidEmiratesId;
	private java.lang.String copyofValidGccId;
	private java.lang.String handoverChecklistAndLod;
	private java.lang.String keyReleaseForm;
	private java.lang.String checkOriginalSpaAndtakeCopyOfFirstFourPagesOfSpa;
	private java.lang.String areaVariationAddendum;
	private java.lang.String tempOne;
	private java.lang.String tempTwo;
	private java.lang.String tempThree;
	//from sheet 1
	private java.lang.String handoverNoticeAllowed;
	private java.lang.String approvalQueueOne;
	private java.lang.String approvalQueueTwo;
	private java.lang.String approvalQueueThree;
	//from sheet 2
	private java.lang.String eligibleforRentalPool;
	
	
	public Handover(){
		
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


	public boolean isMortgage() {
		return mortgage;
	}


	public void setMortgage(boolean mortgage) {
		this.mortgage = mortgage;
	}


	public java.lang.String getCustomerType() {
		return customerType;
	}


	public void setCustomerType(java.lang.String customerType) {
		this.customerType = customerType;
	}


	public boolean isRecoveryUnit() {
		return recoveryUnit;
	}


	public void setRecoveryUnit(boolean recoveryUnit) {
		this.recoveryUnit = recoveryUnit;
	}


	public boolean isPcc() {
		return pcc;
	}


	public void setPcc(boolean pcc) {
		this.pcc = pcc;
	}


	public boolean isServicesChargesPaid() {
		return servicesChargesPaid;
	}


	public void setServicesChargesPaid(boolean servicesChargesPaid) {
		this.servicesChargesPaid = servicesChargesPaid;
	}


	public boolean isPoa() {
		return poa;
	}


	public void setPoa(boolean poa) {
		this.poa = poa;
	}


	public double getAreaVariationPercentage() {
		return areaVariationPercentage;
	}


	public void setAreaVariationPercentage(double areaVariationPercentage) {
		this.areaVariationPercentage = areaVariationPercentage;
	}


	public double getTypeVariation() {
		return typeVariation;
	}


	public void setTypeVariation(double typeVariation) {
		this.typeVariation = typeVariation;
	}


	public boolean isRecovery() {
		return recovery;
	}


	public void setRecovery(boolean recovery) {
		this.recovery = recovery;
	}


	public double getPaidPercentage() {
		return paidPercentage;
	}


	public void setPaidPercentage(double paidPercentage) {
		this.paidPercentage = paidPercentage;
	}


	public double getDefaultPercentage() {
		return defaultPercentage;
	}


	public void setDefaultPercentage(double defaultPercentage) {
		this.defaultPercentage = defaultPercentage;
	}


	public java.lang.String getModeOfRequest() {
		return modeOfRequest;
	}


	public void setModeOfRequest(java.lang.String modeOfRequest) {
		this.modeOfRequest = modeOfRequest;
	}


	public java.lang.String getAgreementStatus() {
		return agreementStatus;
	}


	public void setAgreementStatus(java.lang.String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}


	public boolean isDefaultVal() {
		return defaultVal;
	}


	public void setDefaultVal(boolean defaultVal) {
		this.defaultVal = defaultVal;
	}


	public boolean isUnderTermination() {
		return underTermination;
	}


	public void setUnderTermination(boolean underTermination) {
		this.underTermination = underTermination;
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


	public boolean isUnderAssignment() {
		return underAssignment;
	}


	public void setUnderAssignment(boolean underAssignment) {
		this.underAssignment = underAssignment;
	}


	public int getNoOfMajorSnagsInApartment() {
		return noOfMajorSnagsInApartment;
	}


	public void setNoOfMajorSnagsInApartment(int noOfMajorSnagsInApartment) {
		this.noOfMajorSnagsInApartment = noOfMajorSnagsInApartment;
	}


	public boolean isBccAvailable() {
		return bccAvailable;
	}


	public void setBccAvailable(boolean bccAvailable) {
		this.bccAvailable = bccAvailable;
	}


	public boolean isAccessPresent() {
		return accessPresent;
	}


	public void setAccessPresent(boolean accessPresent) {
		this.accessPresent = accessPresent;
	}


	public boolean isUtilitiesAvailable() {
		return utilitiesAvailable;
	}


	public void setUtilitiesAvailable(boolean utilitiesAvailable) {
		this.utilitiesAvailable = utilitiesAvailable;
	}


	public double getPercAptsSnagged() {
		return percAptsSnagged;
	}


	public void setPercAptsSnagged(double percAptsSnagged) {
		this.percAptsSnagged = percAptsSnagged;
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


	public java.lang.String getMortgageNOCfromBank() {
		return mortgageNOCfromBank;
	}


	public void setMortgageNOCfromBank(java.lang.String mortgageNOCfromBank) {
		this.mortgageNOCfromBank = mortgageNOCfromBank;
	}


	public java.lang.String getIfPoaTakingHandoverColatePoaPassportResidence() {
		return ifPoaTakingHandoverColatePoaPassportResidence;
	}


	public void setIfPoaTakingHandoverColatePoaPassportResidence(java.lang.String ifPoaTakingHandoverColatePoaPassportResidence) {
		this.ifPoaTakingHandoverColatePoaPassportResidence = ifPoaTakingHandoverColatePoaPassportResidence;
	}


	public java.lang.String getCorporateValidTradeLicence() {
		return corporateValidTradeLicence;
	}


	public void setCorporateValidTradeLicence(java.lang.String corporateValidTradeLicence) {
		this.corporateValidTradeLicence = corporateValidTradeLicence;
	}


	public java.lang.String getCorporateArticleMemorandumOfAssociation() {
		return corporateArticleMemorandumOfAssociation;
	}


	public void setCorporateArticleMemorandumOfAssociation(java.lang.String corporateArticleMemorandumOfAssociation) {
		this.corporateArticleMemorandumOfAssociation = corporateArticleMemorandumOfAssociation;
	}


	public java.lang.String getCorporateBoardResolution() {
		return corporateBoardResolution;
	}


	public void setCorporateBoardResolution(java.lang.String corporateBoardResolution) {
		this.corporateBoardResolution = corporateBoardResolution;
	}


	public java.lang.String getCorporatePoa() {
		return corporatePoa;
	}


	public void setCorporatePoa(java.lang.String corporatePoa) {
		this.corporatePoa = corporatePoa;
	}


	public java.lang.String getSignedForm() {
		return signedForm;
	}


	public void setSignedForm(java.lang.String signedForm) {
		this.signedForm = signedForm;
	}


	public java.lang.String getClearAndValidPassportCopyOfOwner() {
		return clearAndValidPassportCopyOfOwner;
	}


	public void setClearAndValidPassportCopyOfOwner(java.lang.String clearAndValidPassportCopyOfOwner) {
		this.clearAndValidPassportCopyOfOwner = clearAndValidPassportCopyOfOwner;
	}


	public java.lang.String getClearAndValidPassportCopyOfJointOwner() {
		return clearAndValidPassportCopyOfJointOwner;
	}


	public void setClearAndValidPassportCopyOfJointOwner(java.lang.String clearAndValidPassportCopyOfJointOwner) {
		this.clearAndValidPassportCopyOfJointOwner = clearAndValidPassportCopyOfJointOwner;
	}


	public java.lang.String getVisaOrEntryStampWithUid() {
		return visaOrEntryStampWithUid;
	}


	public void setVisaOrEntryStampWithUid(java.lang.String visaOrEntryStampWithUid) {
		this.visaOrEntryStampWithUid = visaOrEntryStampWithUid;
	}


	public java.lang.String getCopyofValidEmiratesId() {
		return copyofValidEmiratesId;
	}


	public void setCopyofValidEmiratesId(java.lang.String copyofValidEmiratesId) {
		this.copyofValidEmiratesId = copyofValidEmiratesId;
	}


	public java.lang.String getCopyofValidGccId() {
		return copyofValidGccId;
	}


	public void setCopyofValidGccId(java.lang.String copyofValidGccId) {
		this.copyofValidGccId = copyofValidGccId;
	}


	public java.lang.String getHandoverChecklistAndLod() {
		return handoverChecklistAndLod;
	}


	public void setHandoverChecklistAndLod(java.lang.String handoverChecklistAndLod) {
		this.handoverChecklistAndLod = handoverChecklistAndLod;
	}


	public java.lang.String getKeyReleaseForm() {
		return keyReleaseForm;
	}


	public void setKeyReleaseForm(java.lang.String keyReleaseForm) {
		this.keyReleaseForm = keyReleaseForm;
	}


	public java.lang.String getCheckOriginalSpaAndtakeCopyOfFirstFourPagesOfSpa() {
		return checkOriginalSpaAndtakeCopyOfFirstFourPagesOfSpa;
	}


	public void setCheckOriginalSpaAndtakeCopyOfFirstFourPagesOfSpa(
			java.lang.String checkOriginalSpaAndtakeCopyOfFirstFourPagesOfSpa) {
		this.checkOriginalSpaAndtakeCopyOfFirstFourPagesOfSpa = checkOriginalSpaAndtakeCopyOfFirstFourPagesOfSpa;
	}


	public java.lang.String getAreaVariationAddendum() {
		return areaVariationAddendum;
	}


	public void setAreaVariationAddendum(java.lang.String areaVariationAddendum) {
		this.areaVariationAddendum = areaVariationAddendum;
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


	public java.lang.String getHandoverNoticeAllowed() {
		return handoverNoticeAllowed;
	}


	public void setHandoverNoticeAllowed(java.lang.String handoverNoticeAllowed) {
		this.handoverNoticeAllowed = handoverNoticeAllowed;
	}


	public java.lang.String getApprovalQueueOne() {
		return approvalQueueOne;
	}


	public void setApprovalQueueOne(java.lang.String approvalQueueOne) {
		this.approvalQueueOne = approvalQueueOne;
	}


	public java.lang.String getApprovalQueueTwo() {
		return approvalQueueTwo;
	}


	public void setApprovalQueueTwo(java.lang.String approvalQueueTwo) {
		this.approvalQueueTwo = approvalQueueTwo;
	}


	public java.lang.String getApprovalQueueThree() {
		return approvalQueueThree;
	}


	public void setApprovalQueueThree(java.lang.String approvalQueueThree) {
		this.approvalQueueThree = approvalQueueThree;
	}


	public java.lang.String getEligibleforRentalPool() {
		return eligibleforRentalPool;
	}


	public void setEligibleforRentalPool(java.lang.String eligibleforRentalPool) {
		this.eligibleforRentalPool = eligibleforRentalPool;
	}


	public Handover(java.lang.String description, java.util.Date ruleValidityStart, java.util.Date ruleValidityEnd, java.lang.String processName,
			java.lang.String subProcessName, java.lang.String projectCity, java.lang.String project, java.lang.String buildingCode, java.lang.String permittedUse,
			java.lang.String bedroomType, java.lang.String applicableUnits, java.lang.String unitType, java.lang.String nationality, java.lang.String nationalityGroup,
			boolean mortgage, java.lang.String customerType, boolean recoveryUnit, boolean pcc, boolean servicesChargesPaid,
			boolean poa, double areaVariationPercentage, double typeVariation, boolean recovery, double paidPercentage,
			double defaultPercentage, java.lang.String modeOfRequest, java.lang.String agreementStatus, boolean defaultVal,
			boolean underTermination, boolean dispute, boolean enforcement, boolean litigation, boolean underAssignment,
			int noOfMajorSnagsInApartment, boolean bccAvailable, boolean accessPresent, boolean utilitiesAvailable,
			double percAptsSnagged, java.lang.String tempA, java.lang.String tempB, java.lang.String tempC, java.lang.String allowed, java.lang.String message,
			java.lang.String mortgageNOCfromBank, java.lang.String ifPoaTakingHandoverColatePoaPassportResidence,
			java.lang.String corporateValidTradeLicence, java.lang.String corporateArticleMemorandumOfAssociation,
			java.lang.String corporateBoardResolution, java.lang.String corporatePoa, java.lang.String signedForm,
			java.lang.String clearAndValidPassportCopyOfOwner, java.lang.String clearAndValidPassportCopyOfJointOwner,
			java.lang.String visaOrEntryStampWithUid, java.lang.String copyofValidEmiratesId, java.lang.String copyofValidGccId,
			java.lang.String handoverChecklistAndLod, java.lang.String keyReleaseForm,
			java.lang.String checkOriginalSpaAndtakeCopyOfFirstFourPagesOfSpa, java.lang.String areaVariationAddendum, java.lang.String tempOne,
			java.lang.String tempTwo, java.lang.String tempThree, java.lang.String handoverNoticeAllowed, java.lang.String approvalQueueOne,
			java.lang.String approvalQueueTwo, java.lang.String approvalQueueThree, java.lang.String eligibleforRentalPool) {
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
		this.nationality = nationality;
		this.nationalityGroup = nationalityGroup;
		this.mortgage = mortgage;
		this.customerType = customerType;
		this.recoveryUnit = recoveryUnit;
		this.pcc = pcc;
		this.servicesChargesPaid = servicesChargesPaid;
		this.poa = poa;
		this.areaVariationPercentage = areaVariationPercentage;
		this.typeVariation = typeVariation;
		this.recovery = recovery;
		this.paidPercentage = paidPercentage;
		this.defaultPercentage = defaultPercentage;
		this.modeOfRequest = modeOfRequest;
		this.agreementStatus = agreementStatus;
		this.defaultVal = defaultVal;
		this.underTermination = underTermination;
		this.dispute = dispute;
		this.enforcement = enforcement;
		this.litigation = litigation;
		this.underAssignment = underAssignment;
		this.noOfMajorSnagsInApartment = noOfMajorSnagsInApartment;
		this.bccAvailable = bccAvailable;
		this.accessPresent = accessPresent;
		this.utilitiesAvailable = utilitiesAvailable;
		this.percAptsSnagged = percAptsSnagged;
		this.tempA = tempA;
		this.tempB = tempB;
		this.tempC = tempC;
		this.allowed = allowed;
		this.message = message;
		this.mortgageNOCfromBank = mortgageNOCfromBank;
		this.ifPoaTakingHandoverColatePoaPassportResidence = ifPoaTakingHandoverColatePoaPassportResidence;
		this.corporateValidTradeLicence = corporateValidTradeLicence;
		this.corporateArticleMemorandumOfAssociation = corporateArticleMemorandumOfAssociation;
		this.corporateBoardResolution = corporateBoardResolution;
		this.corporatePoa = corporatePoa;
		this.signedForm = signedForm;
		this.clearAndValidPassportCopyOfOwner = clearAndValidPassportCopyOfOwner;
		this.clearAndValidPassportCopyOfJointOwner = clearAndValidPassportCopyOfJointOwner;
		this.visaOrEntryStampWithUid = visaOrEntryStampWithUid;
		this.copyofValidEmiratesId = copyofValidEmiratesId;
		this.copyofValidGccId = copyofValidGccId;
		this.handoverChecklistAndLod = handoverChecklistAndLod;
		this.keyReleaseForm = keyReleaseForm;
		this.checkOriginalSpaAndtakeCopyOfFirstFourPagesOfSpa = checkOriginalSpaAndtakeCopyOfFirstFourPagesOfSpa;
		this.areaVariationAddendum = areaVariationAddendum;
		this.tempOne = tempOne;
		this.tempTwo = tempTwo;
		this.tempThree = tempThree;
		this.handoverNoticeAllowed = handoverNoticeAllowed;
		this.approvalQueueOne = approvalQueueOne;
		this.approvalQueueTwo = approvalQueueTwo;
		this.approvalQueueThree = approvalQueueThree;
		this.eligibleforRentalPool = eligibleforRentalPool;
	}
	
	
    
}
