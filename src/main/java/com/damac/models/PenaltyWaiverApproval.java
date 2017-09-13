package com.damac.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class PenaltyWaiverApproval {
	
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
		private java.lang.String adminFeePsf;
		private java.lang.String adminFeeFlat;
		private java.lang.String adminFeePercentage;
		
		public PenaltyWaiverApproval(){
			
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
		
		

}
