package com.damac.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement



public class Assignment implements java.io.Serializable{
	static final long serialVersionUID = 1L;
	
	
	private java.lang.String description;
	private java.util.Date ruleValidityStart;
	private java.util.Date ruleValidityEnd;
	private java.lang.String sourceOfRequest;
	private java.lang.String processName;
	private java.lang.String subProcessName;
	private java.lang.String projectCity;
	private java.lang.String project;
	private java.lang.String buildingCode;
	private java.lang.String permittedUse;
	private java.lang.String bedroomType;
	private java.lang.String applicableUnits;
	private java.lang.String unitType;
	private double areaVariationPercentage;
	private double typeVariation;
	private boolean recovery;
	private double paidPercentage;
	private double defaultPercentage;
	private java.lang.String customerType;
	private java.lang.String agreementStatus;
	private boolean defaultVal;
	private boolean underTermination;
	private boolean bulk;
	private boolean dispute;
	private boolean enforcement;
	private boolean litigation;
	private boolean mortgage;
	private boolean underAssignment;
	private java.lang.String readyOffPlan;
	private boolean eho;
	private boolean rentalPool;
	private boolean ho;
	private java.lang.String applicableNationality;
	private boolean poa;
	private boolean poaAssigner;
	private boolean poaAssignor;
	private boolean courtOrderForDeceasedCase;
	private boolean deceasedCase;
	private boolean nocIssuanceInLastFifteenDays;
	private boolean pcc;
	private int purchaserAgeYears;
	private double waiverPercentage;
	private java.lang.String tempA;
	private java.lang.String tempB;
	private java.lang.String tempC;
	

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
	private java.lang.String tempOne;
	private java.lang.String tempTwo;
	private java.lang.String tempThree;
	
	private java.lang.String adminFeePsf;
	private java.lang.String adminFeeFlat;
	private java.lang.String adminFeePercentage;
	
	private java.lang.String originalSaleAgreementOriginalTitleDeed;
	private java.lang.String nocRequestLetterOfAssignment;
	private java.lang.String passportOfAssigneeJointAssignee;
	private java.lang.String passportOfAssignorJointAssignor;
	private java.lang.String passportCopyOftheWitness;
	private java.lang.String courtOrderAndSuccessionCertificateListingAllHeirs;
	private java.lang.String powerOfAttorneyIfApplicableGuardianCertificate;
	private java.lang.String validOriginalPassportsOfHeirs;
	private java.lang.String originalLetterfromDubaiCourtAddressedToDamacStatingUnitBelongsToTheDeceased;
	private java.lang.String passportCopyOfDeceasedOwner;
	private java.lang.String courtOrderIfThepurchaserIsMinor;
	private java.lang.String originalPowerofAttorney;
	private java.lang.String poaOnBehalfOfAssignee;
	private java.lang.String emiratesIdForUaeResidentAssignor;
	private java.lang.String emiratesIdForUaeResidentAssignee;
	private java.lang.String ifUnitInRentalpoolAssigneeMustSignRentalPoolUndertakingAndCrf;
	private java.lang.String ifUnitInRentalpoolAssignorMustReturnRentalPoolAgreementAndSignCrf;
	private java.lang.String originalBankNocLoanSettlementConfirmationAddressedToTheSellerCompany;
	private java.lang.String utilityClearanceChillerChargeFinalInvoice;
	private java.lang.String letterOfAssignment;
	private java.lang.String originalAndCopyOfTradeLicense;
	private java.lang.String originalAndCopyOfIncorporationCertificate;
	private java.lang.String originalAndCopyOfMemorandumAndArticlesOfAssociation;
	private java.lang.String originalAndCopyOfBoardResolution;
	private java.lang.String originalAndCopyOfPoaNominatingAuthorizedIndividual;
	private java.lang.String originalAndCopyofCertificateOfGoodStanding;
	private java.lang.String selfAttestedPassportCopiesOfShareholdersAndPoaHolder;
	private java.lang.String anyOtherCompanySupportingDocuments;
	private java.lang.String returnExecutedLeaseAgreementAndAddendum;
	private java.lang.String letterOfDischargeOnlyApplicableForQatarThePiazza;
	private java.lang.String passportCopyofLawFirmRepresentative;
	private java.lang.String selfAttestedIdOfAssignor;
	private java.lang.String selfAttestedIdOfAssignee;
	private java.lang.String originalBankNocLoanSettlementConfirmationAddressedToSellerCompany;
	private java.lang.String originalDeathCertificate;
	private java.lang.String financialInstitutionConsentletterIfPropertyIsMortgaged;
	
	
	public Assignment(){
		
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


	public java.lang.String getSourceOfRequest() {
		return sourceOfRequest;
	}


	public void setSourceOfRequest(java.lang.String sourceOfRequest) {
		this.sourceOfRequest = sourceOfRequest;
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


	public java.lang.String getCustomerType() {
		return customerType;
	}


	public void setCustomerType(java.lang.String customerType) {
		this.customerType = customerType;
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


	public boolean isBulk() {
		return bulk;
	}


	public void setBulk(boolean bulk) {
		this.bulk = bulk;
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


	public boolean isUnderAssignment() {
		return underAssignment;
	}


	public void setUnderAssignment(boolean underAssignment) {
		this.underAssignment = underAssignment;
	}


	public java.lang.String getReadyOffPlan() {
		return readyOffPlan;
	}


	public void setReadyOffPlan(java.lang.String readyOffPlan) {
		this.readyOffPlan = readyOffPlan;
	}


	public boolean isEho() {
		return eho;
	}


	public void setEho(boolean eho) {
		this.eho = eho;
	}


	public boolean isRentalPool() {
		return rentalPool;
	}


	public void setRentalPool(boolean rentalPool) {
		this.rentalPool = rentalPool;
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


	public boolean isPoa() {
		return poa;
	}


	public void setPoa(boolean poa) {
		this.poa = poa;
	}


	public boolean isPoaAssigner() {
		return poaAssigner;
	}


	public void setPoaAssigner(boolean poaAssigner) {
		this.poaAssigner = poaAssigner;
	}


	public boolean isPoaAssignor() {
		return poaAssignor;
	}


	public void setPoaAssignor(boolean poaAssignor) {
		this.poaAssignor = poaAssignor;
	}


	public boolean isCourtOrderForDeceasedCase() {
		return courtOrderForDeceasedCase;
	}


	public void setCourtOrderForDeceasedCase(boolean courtOrderForDeceasedCase) {
		this.courtOrderForDeceasedCase = courtOrderForDeceasedCase;
	}


	public boolean isDeceasedCase() {
		return deceasedCase;
	}


	public void setDeceasedCase(boolean deceasedCase) {
		this.deceasedCase = deceasedCase;
	}


	public boolean isNocIssuanceInLastFifteenDays() {
		return nocIssuanceInLastFifteenDays;
	}


	public void setNocIssuanceInLastFifteenDays(boolean nocIssuanceInLastFifteenDays) {
		this.nocIssuanceInLastFifteenDays = nocIssuanceInLastFifteenDays;
	}


	public boolean isPcc() {
		return pcc;
	}


	public void setPcc(boolean pcc) {
		this.pcc = pcc;
	}


	public int getPurchaserAgeYears() {
		return purchaserAgeYears;
	}


	public void setPurchaserAgeYears(int purchaserAgeYears) {
		this.purchaserAgeYears = purchaserAgeYears;
	}

    	
	public double getWaiverPercentage() {
		return waiverPercentage;
	}


	public void setWaiverPercentage(double waiverPercentage) {
		this.waiverPercentage = waiverPercentage;
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


	public java.lang.String getOriginalSaleAgreementOriginalTitleDeed() {
		return originalSaleAgreementOriginalTitleDeed;
	}


	public void setOriginalSaleAgreementOriginalTitleDeed(java.lang.String originalSaleAgreementOriginalTitleDeed) {
		this.originalSaleAgreementOriginalTitleDeed = originalSaleAgreementOriginalTitleDeed;
	}


	public java.lang.String getNocRequestLetterOfAssignment() {
		return nocRequestLetterOfAssignment;
	}


	public void setNocRequestLetterOfAssignment(java.lang.String nocRequestLetterOfAssignment) {
		this.nocRequestLetterOfAssignment = nocRequestLetterOfAssignment;
	}


	public java.lang.String getPassportOfAssigneeJointAssignee() {
		return passportOfAssigneeJointAssignee;
	}


	public void setPassportOfAssigneeJointAssignee(java.lang.String passportOfAssigneeJointAssignee) {
		this.passportOfAssigneeJointAssignee = passportOfAssigneeJointAssignee;
	}


	public java.lang.String getPassportOfAssignorJointAssignor() {
		return passportOfAssignorJointAssignor;
	}


	public void setPassportOfAssignorJointAssignor(java.lang.String passportOfAssignorJointAssignor) {
		this.passportOfAssignorJointAssignor = passportOfAssignorJointAssignor;
	}


	public java.lang.String getPassportCopyOftheWitness() {
		return passportCopyOftheWitness;
	}


	public void setPassportCopyOftheWitness(java.lang.String passportCopyOftheWitness) {
		this.passportCopyOftheWitness = passportCopyOftheWitness;
	}


	public java.lang.String getCourtOrderAndSuccessionCertificateListingAllHeirs() {
		return courtOrderAndSuccessionCertificateListingAllHeirs;
	}


	public void setCourtOrderAndSuccessionCertificateListingAllHeirs(
			java.lang.String courtOrderAndSuccessionCertificateListingAllHeirs) {
		this.courtOrderAndSuccessionCertificateListingAllHeirs = courtOrderAndSuccessionCertificateListingAllHeirs;
	}


	public java.lang.String getPowerOfAttorneyIfApplicableGuardianCertificate() {
		return powerOfAttorneyIfApplicableGuardianCertificate;
	}


	public void setPowerOfAttorneyIfApplicableGuardianCertificate(java.lang.String powerOfAttorneyIfApplicableGuardianCertificate) {
		this.powerOfAttorneyIfApplicableGuardianCertificate = powerOfAttorneyIfApplicableGuardianCertificate;
	}


	public java.lang.String getValidOriginalPassportsOfHeirs() {
		return validOriginalPassportsOfHeirs;
	}


	public void setValidOriginalPassportsOfHeirs(java.lang.String validOriginalPassportsOfHeirs) {
		this.validOriginalPassportsOfHeirs = validOriginalPassportsOfHeirs;
	}


	public java.lang.String getOriginalLetterfromDubaiCourtAddressedToDamacStatingUnitBelongsToTheDeceased() {
		return originalLetterfromDubaiCourtAddressedToDamacStatingUnitBelongsToTheDeceased;
	}


	public void setOriginalLetterfromDubaiCourtAddressedToDamacStatingUnitBelongsToTheDeceased(
			java.lang.String originalLetterfromDubaiCourtAddressedToDamacStatingUnitBelongsToTheDeceased) {
		this.originalLetterfromDubaiCourtAddressedToDamacStatingUnitBelongsToTheDeceased = originalLetterfromDubaiCourtAddressedToDamacStatingUnitBelongsToTheDeceased;
	}


	public java.lang.String getPassportCopyOfDeceasedOwner() {
		return passportCopyOfDeceasedOwner;
	}


	public void setPassportCopyOfDeceasedOwner(java.lang.String passportCopyOfDeceasedOwner) {
		this.passportCopyOfDeceasedOwner = passportCopyOfDeceasedOwner;
	}


	public java.lang.String getCourtOrderIfThepurchaserIsMinor() {
		return courtOrderIfThepurchaserIsMinor;
	}


	public void setCourtOrderIfThepurchaserIsMinor(java.lang.String courtOrderIfThepurchaserIsMinor) {
		this.courtOrderIfThepurchaserIsMinor = courtOrderIfThepurchaserIsMinor;
	}


	public java.lang.String getOriginalPowerofAttorney() {
		return originalPowerofAttorney;
	}


	public void setOriginalPowerofAttorney(java.lang.String originalPowerofAttorney) {
		this.originalPowerofAttorney = originalPowerofAttorney;
	}


	public java.lang.String getPoaOnBehalfOfAssignee() {
		return poaOnBehalfOfAssignee;
	}


	public void setPoaOnBehalfOfAssignee(java.lang.String poaOnBehalfOfAssignee) {
		this.poaOnBehalfOfAssignee = poaOnBehalfOfAssignee;
	}


	public java.lang.String getEmiratesIdForUaeResidentAssignor() {
		return emiratesIdForUaeResidentAssignor;
	}


	public void setEmiratesIdForUaeResidentAssignor(java.lang.String emiratesIdForUaeResidentAssignor) {
		this.emiratesIdForUaeResidentAssignor = emiratesIdForUaeResidentAssignor;
	}


	public java.lang.String getEmiratesIdForUaeResidentAssignee() {
		return emiratesIdForUaeResidentAssignee;
	}


	public void setEmiratesIdForUaeResidentAssignee(java.lang.String emiratesIdForUaeResidentAssignee) {
		this.emiratesIdForUaeResidentAssignee = emiratesIdForUaeResidentAssignee;
	}


	public java.lang.String getIfUnitInRentalpoolAssigneeMustSignRentalPoolUndertakingAndCrf() {
		return ifUnitInRentalpoolAssigneeMustSignRentalPoolUndertakingAndCrf;
	}


	public void setIfUnitInRentalpoolAssigneeMustSignRentalPoolUndertakingAndCrf(
			java.lang.String ifUnitInRentalpoolAssigneeMustSignRentalPoolUndertakingAndCrf) {
		this.ifUnitInRentalpoolAssigneeMustSignRentalPoolUndertakingAndCrf = ifUnitInRentalpoolAssigneeMustSignRentalPoolUndertakingAndCrf;
	}


	public java.lang.String getIfUnitInRentalpoolAssignorMustReturnRentalPoolAgreementAndSignCrf() {
		return ifUnitInRentalpoolAssignorMustReturnRentalPoolAgreementAndSignCrf;
	}


	public void setIfUnitInRentalpoolAssignorMustReturnRentalPoolAgreementAndSignCrf(
			java.lang.String ifUnitInRentalpoolAssignorMustReturnRentalPoolAgreementAndSignCrf) {
		this.ifUnitInRentalpoolAssignorMustReturnRentalPoolAgreementAndSignCrf = ifUnitInRentalpoolAssignorMustReturnRentalPoolAgreementAndSignCrf;
	}


	public java.lang.String getOriginalBankNocLoanSettlementConfirmationAddressedToTheSellerCompany() {
		return originalBankNocLoanSettlementConfirmationAddressedToTheSellerCompany;
	}


	public void setOriginalBankNocLoanSettlementConfirmationAddressedToTheSellerCompany(
			java.lang.String originalBankNocLoanSettlementConfirmationAddressedToTheSellerCompany) {
		this.originalBankNocLoanSettlementConfirmationAddressedToTheSellerCompany = originalBankNocLoanSettlementConfirmationAddressedToTheSellerCompany;
	}


	public java.lang.String getUtilityClearanceChillerChargeFinalInvoice() {
		return utilityClearanceChillerChargeFinalInvoice;
	}


	public void setUtilityClearanceChillerChargeFinalInvoice(java.lang.String utilityClearanceChillerChargeFinalInvoice) {
		this.utilityClearanceChillerChargeFinalInvoice = utilityClearanceChillerChargeFinalInvoice;
	}


	public java.lang.String getLetterOfAssignment() {
		return letterOfAssignment;
	}


	public void setLetterOfAssignment(java.lang.String letterOfAssignment) {
		this.letterOfAssignment = letterOfAssignment;
	}


	public java.lang.String getOriginalAndCopyOfTradeLicense() {
		return originalAndCopyOfTradeLicense;
	}


	public void setOriginalAndCopyOfTradeLicense(java.lang.String originalAndCopyOfTradeLicense) {
		this.originalAndCopyOfTradeLicense = originalAndCopyOfTradeLicense;
	}


	public java.lang.String getOriginalAndCopyOfIncorporationCertificate() {
		return originalAndCopyOfIncorporationCertificate;
	}


	public void setOriginalAndCopyOfIncorporationCertificate(java.lang.String originalAndCopyOfIncorporationCertificate) {
		this.originalAndCopyOfIncorporationCertificate = originalAndCopyOfIncorporationCertificate;
	}


	public java.lang.String getOriginalAndCopyOfMemorandumAndArticlesOfAssociation() {
		return originalAndCopyOfMemorandumAndArticlesOfAssociation;
	}


	public void setOriginalAndCopyOfMemorandumAndArticlesOfAssociation(
			java.lang.String originalAndCopyOfMemorandumAndArticlesOfAssociation) {
		this.originalAndCopyOfMemorandumAndArticlesOfAssociation = originalAndCopyOfMemorandumAndArticlesOfAssociation;
	}


	public java.lang.String getOriginalAndCopyOfBoardResolution() {
		return originalAndCopyOfBoardResolution;
	}


	public void setOriginalAndCopyOfBoardResolution(java.lang.String originalAndCopyOfBoardResolution) {
		this.originalAndCopyOfBoardResolution = originalAndCopyOfBoardResolution;
	}


	public java.lang.String getOriginalAndCopyOfPoaNominatingAuthorizedIndividual() {
		return originalAndCopyOfPoaNominatingAuthorizedIndividual;
	}


	public void setOriginalAndCopyOfPoaNominatingAuthorizedIndividual(
			java.lang.String originalAndCopyOfPoaNominatingAuthorizedIndividual) {
		this.originalAndCopyOfPoaNominatingAuthorizedIndividual = originalAndCopyOfPoaNominatingAuthorizedIndividual;
	}


	public java.lang.String getOriginalAndCopyofCertificateOfGoodStanding() {
		return originalAndCopyofCertificateOfGoodStanding;
	}


	public void setOriginalAndCopyofCertificateOfGoodStanding(java.lang.String originalAndCopyofCertificateOfGoodStanding) {
		this.originalAndCopyofCertificateOfGoodStanding = originalAndCopyofCertificateOfGoodStanding;
	}


	public java.lang.String getSelfAttestedPassportCopiesOfShareholdersAndPoaHolder() {
		return selfAttestedPassportCopiesOfShareholdersAndPoaHolder;
	}


	public void setSelfAttestedPassportCopiesOfShareholdersAndPoaHolder(
			java.lang.String selfAttestedPassportCopiesOfShareholdersAndPoaHolder) {
		this.selfAttestedPassportCopiesOfShareholdersAndPoaHolder = selfAttestedPassportCopiesOfShareholdersAndPoaHolder;
	}


	public java.lang.String getAnyOtherCompanySupportingDocuments() {
		return anyOtherCompanySupportingDocuments;
	}


	public void setAnyOtherCompanySupportingDocuments(java.lang.String anyOtherCompanySupportingDocuments) {
		this.anyOtherCompanySupportingDocuments = anyOtherCompanySupportingDocuments;
	}


	public java.lang.String getReturnExecutedLeaseAgreementAndAddendum() {
		return returnExecutedLeaseAgreementAndAddendum;
	}


	public void setReturnExecutedLeaseAgreementAndAddendum(java.lang.String returnExecutedLeaseAgreementAndAddendum) {
		this.returnExecutedLeaseAgreementAndAddendum = returnExecutedLeaseAgreementAndAddendum;
	}


	public java.lang.String getLetterOfDischargeOnlyApplicableForQatarThePiazza() {
		return letterOfDischargeOnlyApplicableForQatarThePiazza;
	}


	public void setLetterOfDischargeOnlyApplicableForQatarThePiazza(
			java.lang.String letterOfDischargeOnlyApplicableForQatarThePiazza) {
		this.letterOfDischargeOnlyApplicableForQatarThePiazza = letterOfDischargeOnlyApplicableForQatarThePiazza;
	}


	public java.lang.String getPassportCopyofLawFirmRepresentative() {
		return passportCopyofLawFirmRepresentative;
	}


	public void setPassportCopyofLawFirmRepresentative(java.lang.String passportCopyofLawFirmRepresentative) {
		this.passportCopyofLawFirmRepresentative = passportCopyofLawFirmRepresentative;
	}


	public java.lang.String getSelfAttestedIdOfAssignor() {
		return selfAttestedIdOfAssignor;
	}


	public void setSelfAttestedIdOfAssignor(java.lang.String selfAttestedIdOfAssignor) {
		this.selfAttestedIdOfAssignor = selfAttestedIdOfAssignor;
	}


	public java.lang.String getSelfAttestedIdOfAssignee() {
		return selfAttestedIdOfAssignee;
	}


	public void setSelfAttestedIdOfAssignee(java.lang.String selfAttestedIdOfAssignee) {
		this.selfAttestedIdOfAssignee = selfAttestedIdOfAssignee;
	}


	public java.lang.String getOriginalBankNocLoanSettlementConfirmationAddressedToSellerCompany() {
		return originalBankNocLoanSettlementConfirmationAddressedToSellerCompany;
	}


	public void setOriginalBankNocLoanSettlementConfirmationAddressedToSellerCompany(
			java.lang.String originalBankNocLoanSettlementConfirmationAddressedToSellerCompany) {
		this.originalBankNocLoanSettlementConfirmationAddressedToSellerCompany = originalBankNocLoanSettlementConfirmationAddressedToSellerCompany;
	}


	public java.lang.String getOriginalDeathCertificate() {
		return originalDeathCertificate;
	}


	public void setOriginalDeathCertificate(java.lang.String originalDeathCertificate) {
		this.originalDeathCertificate = originalDeathCertificate;
	}


	public java.lang.String getFinancialInstitutionConsentletterIfPropertyIsMortgaged() {
		return financialInstitutionConsentletterIfPropertyIsMortgaged;
	}


	public void setFinancialInstitutionConsentletterIfPropertyIsMortgaged(
			java.lang.String financialInstitutionConsentletterIfPropertyIsMortgaged) {
		this.financialInstitutionConsentletterIfPropertyIsMortgaged = financialInstitutionConsentletterIfPropertyIsMortgaged;
	}


	public Assignment(java.lang.String description, java.util.Date ruleValidityStart, java.util.Date ruleValidityEnd, java.lang.String sourceOfRequest,
			java.lang.String processName, java.lang.String subProcessName, java.lang.String projectCity, java.lang.String project, java.lang.String buildingCode,
			java.lang.String permittedUse, java.lang.String bedroomType, java.lang.String applicableUnits, java.lang.String unitType,
			double areaVariationPercentage, double typeVariation, boolean recovery, double paidPercentage,
			double defaultPercentage, java.lang.String customerType, java.lang.String agreementStatus, boolean defaultVal,
			boolean underTermination, boolean bulk, boolean dispute, boolean enforcement, boolean litigation,
			boolean mortgage, boolean underAssignment, java.lang.String readyOffPlan, boolean eho, boolean rentalPool, boolean ho,
			java.lang.String applicableNationality, boolean poa, boolean poaAssigner, boolean poaAssignor,
			boolean courtOrderForDeceasedCase, boolean deceasedCase, boolean nocIssuanceInLastFifteenDays, boolean pcc,
			int purchaserAgeYears, double waiverPercentage, java.lang.String tempA, java.lang.String tempB, java.lang.String tempC, java.lang.String allowed, java.lang.String message,
			java.lang.String recommendingAuthorityOne, java.lang.String recommendingAuthorityTwo, java.lang.String recommendingAuthorityThree,
			java.lang.String recommendingAuthorityFour, java.lang.String approvingAuthorityOne, java.lang.String approvingAuthorityTwo,
			java.lang.String approvingAuthorityThree, java.lang.String tempOne, java.lang.String tempTwo, java.lang.String tempThree, java.lang.String adminFeePsf,
			java.lang.String adminFeeFlat, java.lang.String adminFeePercentage, java.lang.String originalSaleAgreementOriginalTitleDeed,
			java.lang.String nocRequestLetterOfAssignment, java.lang.String passportOfAssigneeJointAssignee,
			java.lang.String passportOfAssignorJointAssignor, java.lang.String passportCopyOftheWitness,
			java.lang.String courtOrderAndSuccessionCertificateListingAllHeirs,
			java.lang.String powerOfAttorneyIfApplicableGuardianCertificate, java.lang.String validOriginalPassportsOfHeirs,
			java.lang.String originalLetterfromDubaiCourtAddressedToDamacStatingUnitBelongsToTheDeceased,
			java.lang.String passportCopyOfDeceasedOwner, java.lang.String courtOrderIfThepurchaserIsMinor, java.lang.String originalPowerofAttorney,
			java.lang.String poaOnBehalfOfAssignee, java.lang.String emiratesIdForUaeResidentAssignor,
			java.lang.String emiratesIdForUaeResidentAssignee,
			java.lang.String ifUnitInRentalpoolAssigneeMustSignRentalPoolUndertakingAndCrf,
			java.lang.String ifUnitInRentalpoolAssignorMustReturnRentalPoolAgreementAndSignCrf,
			java.lang.String originalBankNocLoanSettlementConfirmationAddressedToTheSellerCompany,
			java.lang.String utilityClearanceChillerChargeFinalInvoice, java.lang.String letterOfAssignment,
			java.lang.String originalAndCopyOfTradeLicense, java.lang.String originalAndCopyOfIncorporationCertificate,
			java.lang.String originalAndCopyOfMemorandumAndArticlesOfAssociation, java.lang.String originalAndCopyOfBoardResolution,
			java.lang.String originalAndCopyOfPoaNominatingAuthorizedIndividual,
			java.lang.String originalAndCopyofCertificateOfGoodStanding,
			java.lang.String selfAttestedPassportCopiesOfShareholdersAndPoaHolder, java.lang.String anyOtherCompanySupportingDocuments,
			java.lang.String returnExecutedLeaseAgreementAndAddendum, java.lang.String letterOfDischargeOnlyApplicableForQatarThePiazza,
			java.lang.String passportCopyofLawFirmRepresentative, java.lang.String selfAttestedIdOfAssignor,
			java.lang.String selfAttestedIdOfAssignee, java.lang.String originalBankNocLoanSettlementConfirmationAddressedToSellerCompany,
			java.lang.String originalDeathCertificate, java.lang.String financialInstitutionConsentletterIfPropertyIsMortgaged) {
		super();
		this.description = description;
		this.ruleValidityStart = ruleValidityStart;
		this.ruleValidityEnd = ruleValidityEnd;
		this.sourceOfRequest = sourceOfRequest;
		this.processName = processName;
		this.subProcessName = subProcessName;
		this.projectCity = projectCity;
		this.project = project;
		this.buildingCode = buildingCode;
		this.permittedUse = permittedUse;
		this.bedroomType = bedroomType;
		this.applicableUnits = applicableUnits;
		this.unitType = unitType;
		this.areaVariationPercentage = areaVariationPercentage;
		this.typeVariation = typeVariation;
		this.recovery = recovery;
		this.paidPercentage = paidPercentage;
		this.defaultPercentage = defaultPercentage;
		this.customerType = customerType;
		this.agreementStatus = agreementStatus;
		this.defaultVal = defaultVal;
		this.underTermination = underTermination;
		this.bulk = bulk;
		this.dispute = dispute;
		this.enforcement = enforcement;
		this.litigation = litigation;
		this.mortgage = mortgage;
		this.underAssignment = underAssignment;
		this.readyOffPlan = readyOffPlan;
		this.eho = eho;
		this.rentalPool = rentalPool;
		this.ho = ho;
		this.applicableNationality = applicableNationality;
		this.poa = poa;
		this.poaAssigner = poaAssigner;
		this.poaAssignor = poaAssignor;
		this.courtOrderForDeceasedCase = courtOrderForDeceasedCase;
		this.deceasedCase = deceasedCase;
		this.nocIssuanceInLastFifteenDays = nocIssuanceInLastFifteenDays;
		this.pcc = pcc;
		this.purchaserAgeYears = purchaserAgeYears;
		this.waiverPercentage = waiverPercentage;
		this.tempA = tempA;
		this.tempB = tempB;
		this.tempC = tempC;
		this.allowed = allowed;
		this.message = message;
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
		this.adminFeePsf = adminFeePsf;
		this.adminFeeFlat = adminFeeFlat;
		this.adminFeePercentage = adminFeePercentage;
		this.originalSaleAgreementOriginalTitleDeed = originalSaleAgreementOriginalTitleDeed;
		this.nocRequestLetterOfAssignment = nocRequestLetterOfAssignment;
		this.passportOfAssigneeJointAssignee = passportOfAssigneeJointAssignee;
		this.passportOfAssignorJointAssignor = passportOfAssignorJointAssignor;
		this.passportCopyOftheWitness = passportCopyOftheWitness;
		this.courtOrderAndSuccessionCertificateListingAllHeirs = courtOrderAndSuccessionCertificateListingAllHeirs;
		this.powerOfAttorneyIfApplicableGuardianCertificate = powerOfAttorneyIfApplicableGuardianCertificate;
		this.validOriginalPassportsOfHeirs = validOriginalPassportsOfHeirs;
		this.originalLetterfromDubaiCourtAddressedToDamacStatingUnitBelongsToTheDeceased = originalLetterfromDubaiCourtAddressedToDamacStatingUnitBelongsToTheDeceased;
		this.passportCopyOfDeceasedOwner = passportCopyOfDeceasedOwner;
		this.courtOrderIfThepurchaserIsMinor = courtOrderIfThepurchaserIsMinor;
		this.originalPowerofAttorney = originalPowerofAttorney;
		this.poaOnBehalfOfAssignee = poaOnBehalfOfAssignee;
		this.emiratesIdForUaeResidentAssignor = emiratesIdForUaeResidentAssignor;
		this.emiratesIdForUaeResidentAssignee = emiratesIdForUaeResidentAssignee;
		this.ifUnitInRentalpoolAssigneeMustSignRentalPoolUndertakingAndCrf = ifUnitInRentalpoolAssigneeMustSignRentalPoolUndertakingAndCrf;
		this.ifUnitInRentalpoolAssignorMustReturnRentalPoolAgreementAndSignCrf = ifUnitInRentalpoolAssignorMustReturnRentalPoolAgreementAndSignCrf;
		this.originalBankNocLoanSettlementConfirmationAddressedToTheSellerCompany = originalBankNocLoanSettlementConfirmationAddressedToTheSellerCompany;
		this.utilityClearanceChillerChargeFinalInvoice = utilityClearanceChillerChargeFinalInvoice;
		this.letterOfAssignment = letterOfAssignment;
		this.originalAndCopyOfTradeLicense = originalAndCopyOfTradeLicense;
		this.originalAndCopyOfIncorporationCertificate = originalAndCopyOfIncorporationCertificate;
		this.originalAndCopyOfMemorandumAndArticlesOfAssociation = originalAndCopyOfMemorandumAndArticlesOfAssociation;
		this.originalAndCopyOfBoardResolution = originalAndCopyOfBoardResolution;
		this.originalAndCopyOfPoaNominatingAuthorizedIndividual = originalAndCopyOfPoaNominatingAuthorizedIndividual;
		this.originalAndCopyofCertificateOfGoodStanding = originalAndCopyofCertificateOfGoodStanding;
		this.selfAttestedPassportCopiesOfShareholdersAndPoaHolder = selfAttestedPassportCopiesOfShareholdersAndPoaHolder;
		this.anyOtherCompanySupportingDocuments = anyOtherCompanySupportingDocuments;
		this.returnExecutedLeaseAgreementAndAddendum = returnExecutedLeaseAgreementAndAddendum;
		this.letterOfDischargeOnlyApplicableForQatarThePiazza = letterOfDischargeOnlyApplicableForQatarThePiazza;
		this.passportCopyofLawFirmRepresentative = passportCopyofLawFirmRepresentative;
		this.selfAttestedIdOfAssignor = selfAttestedIdOfAssignor;
		this.selfAttestedIdOfAssignee = selfAttestedIdOfAssignee;
		this.originalBankNocLoanSettlementConfirmationAddressedToSellerCompany = originalBankNocLoanSettlementConfirmationAddressedToSellerCompany;
		this.originalDeathCertificate = originalDeathCertificate;
		this.financialInstitutionConsentletterIfPropertyIsMortgaged = financialInstitutionConsentletterIfPropertyIsMortgaged;
	}

	
    
}
