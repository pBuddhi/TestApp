package com.damac.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class CocdCojbNnc implements java.io.Serializable {
	static final long serialVersionUID = 1L;
	
	private java.lang.String description;
	private java.util.Date ruleValidityStart;
	private java.util.Date ruleValidityEnd;
	private java.lang.String sourceofRequest;
	private java.lang.String processName;
	private java.lang.String subProcessName;
	private java.lang.String projectCity;
	private java.lang.String project;
	private java.lang.String buildingCode;
	private java.lang.String permittedUse;
	private java.lang.String bedroomType;
	private java.lang.String readyOffPlan;
	private java.lang.Boolean eho;
	private java.lang.Boolean ho;
	private java.lang.Boolean rentalPool;
	private java.lang.String customerType;
	private java.lang.Boolean registeredWithOqood;
	private java.lang.String applicableNationality;
	private java.lang.Boolean bulk;
	private java.lang.Boolean defaultVal;
	private java.lang.String agreementStatus;
	private java.lang.Boolean overdue;
	private java.lang.Boolean ftlSent;
	private java.lang.Boolean dispute;
	private java.lang.Boolean enforcement;
	private java.lang.Boolean litigation;
	private java.lang.Boolean mortgage;
	private java.lang.Boolean underAssignment;
	private java.lang.Boolean poa;
	private java.lang.String tempA;
	private java.lang.String tempB;
	private java.lang.String tempC;
	
	//ACTION variables
	private java.lang.String adminFee;
	private java.lang.String allowed;
	private java.lang.String message;
	private java.lang.String signedRequestForm;
	private java.lang.String cocdForm;
	private java.lang.String selfAttestedPassportCopy;
	private java.lang.String selfattestedPPCopy;
	private java.lang.String selfAttestedEmiratesID;
	private java.lang.String selfAttestedGccID;
	private java.lang.String letterOfDecleration;
	private java.lang.String courtOrder;
	private java.lang.String companyAuthorisedSignatorySupportingDocuments;
	private java.lang.String tempOne;
	private java.lang.String tempTwo;
	private java.lang.String tempThree;
	
    private java.lang.String firstRecommendingAuthority; 
	private java.lang.String secondRecommendingAuthority;
	private java.lang.String thirdRecommendingAuthority;
	private java.lang.String fourthRecommendingAuthority;
	
	private java.lang.String firstApprovingAuthority;
	private java.lang.String secondApprovingAuthority;
	private java.lang.String thirdApprovingAuthority;
	
	
	public CocdCojbNnc(){
		
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


	public java.lang.String getSourceofRequest() {
		return sourceofRequest;
	}


	public void setSourceofRequest(java.lang.String sourceofRequest) {
		this.sourceofRequest = sourceofRequest;
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


	public java.lang.String getReadyOffPlan() {
		return readyOffPlan;
	}


	public void setReadyOffPlan(java.lang.String readyOffPlan) {
		this.readyOffPlan = readyOffPlan;
	}


	public java.lang.Boolean getEho() {
		return eho;
	}


	public void setEho(java.lang.Boolean eho) {
		this.eho = eho;
	}


	public java.lang.Boolean getHo() {
		return ho;
	}


	public void setHo(java.lang.Boolean ho) {
		this.ho = ho;
	}


	public java.lang.Boolean getRentalPool() {
		return rentalPool;
	}


	public void setRentalPool(java.lang.Boolean rentalPool) {
		this.rentalPool = rentalPool;
	}


	public java.lang.String getCustomerType() {
		return customerType;
	}


	public void setCustomerType(java.lang.String customerType) {
		this.customerType = customerType;
	}


	public java.lang.Boolean getRegisteredWithOqood() {
		return registeredWithOqood;
	}


	public void setRegisteredWithOqood(java.lang.Boolean registeredWithOqood) {
		this.registeredWithOqood = registeredWithOqood;
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


	public java.lang.Boolean getDefaultVal() {
		return defaultVal;
	}


	public void setDefaultVal(java.lang.Boolean defaultVal) {
		this.defaultVal = defaultVal;
	}


	public java.lang.String getAgreementStatus() {
		return agreementStatus;
	}


	public void setAgreementStatus(java.lang.String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}


	public java.lang.Boolean getOverdue() {
		return overdue;
	}


	public void setOverdue(java.lang.Boolean overdue) {
		this.overdue = overdue;
	}


	public java.lang.Boolean getFtlSent() {
		return ftlSent;
	}


	public void setFtlSent(java.lang.Boolean ftlSent) {
		this.ftlSent = ftlSent;
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


	public java.lang.Boolean getMortgage() {
		return mortgage;
	}


	public void setMortgage(java.lang.Boolean mortgage) {
		this.mortgage = mortgage;
	}


	public java.lang.Boolean getUnderAssignment() {
		return underAssignment;
	}


	public void setUnderAssignment(java.lang.Boolean underAssignment) {
		this.underAssignment = underAssignment;
	}


	public java.lang.Boolean getPoa() {
		return poa;
	}


	public void setPoa(java.lang.Boolean poa) {
		this.poa = poa;
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

	
	public java.lang.String getAdminFee() {
		return adminFee;
	}


	public void setAdminFee(java.lang.String adminFee) {
		this.adminFee = adminFee;
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


	public java.lang.String getSignedRequestForm() {
		return signedRequestForm;
	}


	public void setSignedRequestForm(java.lang.String signedRequestForm) {
		this.signedRequestForm = signedRequestForm;
	}


	public java.lang.String getCocdForm() {
		return cocdForm;
	}


	public void setCocdForm(java.lang.String cocdForm) {
		this.cocdForm = cocdForm;
	}


	public java.lang.String getSelfAttestedPassportCopy() {
		return selfAttestedPassportCopy;
	}


	public void setSelfAttestedPassportCopy(java.lang.String selfAttestedPassportCopy) {
		this.selfAttestedPassportCopy = selfAttestedPassportCopy;
	}


	public java.lang.String getSelfattestedPPCopy() {
		return selfattestedPPCopy;
	}


	public void setSelfattestedPPCopy(java.lang.String selfattestedPPCopy) {
		this.selfattestedPPCopy = selfattestedPPCopy;
	}


	public java.lang.String getSelfAttestedEmiratesID() {
		return selfAttestedEmiratesID;
	}


	public void setSelfAttestedEmiratesID(java.lang.String selfAttestedEmiratesID) {
		this.selfAttestedEmiratesID = selfAttestedEmiratesID;
	}


	public java.lang.String getSelfAttestedGccID() {
		return selfAttestedGccID;
	}


	public void setSelfAttestedGccID(java.lang.String selfAttestedGccID) {
		this.selfAttestedGccID = selfAttestedGccID;
	}


	public java.lang.String getLetterOfDecleration() {
		return letterOfDecleration;
	}


	public void setLetterOfDecleration(java.lang.String letterOfDecleration) {
		this.letterOfDecleration = letterOfDecleration;
	}


	public java.lang.String getCourtOrder() {
		return courtOrder;
	}


	public void setCourtOrder(java.lang.String courtOrder) {
		this.courtOrder = courtOrder;
	}


	public java.lang.String getCompanyAuthorisedSignatorySupportingDocuments() {
		return companyAuthorisedSignatorySupportingDocuments;
	}


	public void setCompanyAuthorisedSignatorySupportingDocuments(java.lang.String companyAuthorisedSignatorySupportingDocuments) {
		this.companyAuthorisedSignatorySupportingDocuments = companyAuthorisedSignatorySupportingDocuments;
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


	public CocdCojbNnc(java.lang.String description, java.util.Date ruleValidityStart, java.util.Date ruleValidityEnd, java.lang.String sourceofRequest,
			java.lang.String processName, java.lang.String subProcessName, java.lang.String projectCity, java.lang.String project, java.lang.String buildingCode,
			java.lang.String permittedUse, java.lang.String bedroomType, java.lang.String readyOffPlan, java.lang.Boolean eho, java.lang.Boolean ho, java.lang.Boolean rentalPool,
			java.lang.String customerType, java.lang.Boolean registeredWithOqood, java.lang.String applicableNationality, java.lang.Boolean bulk,
			java.lang.Boolean defaultVal, java.lang.String agreementStatus, java.lang.Boolean overdue, java.lang.Boolean ftlSent, java.lang.Boolean dispute,
			java.lang.Boolean enforcement, java.lang.Boolean litigation, java.lang.Boolean mortgage, java.lang.Boolean underAssignment, java.lang.Boolean poa,
			java.lang.String tempA, java.lang.String tempB, java.lang.String tempC,java.lang.String adminFee, java.lang.String allowed, java.lang.String message, java.lang.String signedRequestForm,
			java.lang.String cocdForm, java.lang.String selfAttestedPassportCopy, java.lang.String selfattestedPPCopy, java.lang.String selfAttestedEmiratesID,
			java.lang.String selfAttestedGccID, java.lang.String letterOfDecleration, java.lang.String courtOrder,
			java.lang.String companyAuthorisedSignatorySupportingDocuments, java.lang.String tempOne, java.lang.String tempTwo, java.lang.String tempThree,
			java.lang.String firstRecommendingAuthority, java.lang.String secondRecommendingAuthority, java.lang.String thirdRecommendingAuthority,
			java.lang.String fourthRecommendingAuthority, java.lang.String firstApprovingAuthority, java.lang.String secondApprovingAuthority,
			java.lang.String thirdApprovingAuthority) {
		
		this.description = description;
		this.ruleValidityStart = ruleValidityStart;
		this.ruleValidityEnd = ruleValidityEnd;
		this.sourceofRequest = sourceofRequest;
		this.processName = processName;
		this.subProcessName = subProcessName;
		this.projectCity = projectCity;
		this.project = project;
		this.buildingCode = buildingCode;
		this.permittedUse = permittedUse;
		this.bedroomType = bedroomType;
		this.readyOffPlan = readyOffPlan;
		this.eho = eho;
		this.ho = ho;
		this.rentalPool = rentalPool;
		this.customerType = customerType;
		this.registeredWithOqood = registeredWithOqood;
		this.applicableNationality = applicableNationality;
		this.bulk = bulk;
		this.defaultVal = defaultVal;
		this.agreementStatus = agreementStatus;
		this.overdue = overdue;
		this.ftlSent = ftlSent;
		this.dispute = dispute;
		this.enforcement = enforcement;
		this.litigation = litigation;
		this.mortgage = mortgage;
		this.underAssignment = underAssignment;
		this.poa = poa;
		this.tempA = tempA;
		this.tempB = tempB;
		this.tempC = tempC;
		this.adminFee = adminFee;
		this.allowed = allowed;
		this.message = message;
		this.signedRequestForm = signedRequestForm;
		this.cocdForm = cocdForm;
		this.selfAttestedPassportCopy = selfAttestedPassportCopy;
		this.selfattestedPPCopy = selfattestedPPCopy;
		this.selfAttestedEmiratesID = selfAttestedEmiratesID;
		this.selfAttestedGccID = selfAttestedGccID;
		this.letterOfDecleration = letterOfDecleration;
		this.courtOrder = courtOrder;
		this.companyAuthorisedSignatorySupportingDocuments = companyAuthorisedSignatorySupportingDocuments;
		this.tempOne = tempOne;
		this.tempTwo = tempTwo;
		this.tempThree = tempThree;
		this.firstRecommendingAuthority = firstRecommendingAuthority;
		this.secondRecommendingAuthority = secondRecommendingAuthority;
		this.thirdRecommendingAuthority = thirdRecommendingAuthority;
		this.fourthRecommendingAuthority = fourthRecommendingAuthority;
		this.firstApprovingAuthority = firstApprovingAuthority;
		this.secondApprovingAuthority = secondApprovingAuthority;
		this.thirdApprovingAuthority = thirdApprovingAuthority;
	}

    
    
}
