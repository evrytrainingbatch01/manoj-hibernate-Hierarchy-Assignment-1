package com.evry.hospitalManagement;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("inPatient")
public class InPatient extends Patient{

	@Column(name="InPatientBill")
	private int InPatientBill ;
	@Column(name="InPatientTest")
	private String InPatientTest;
	public int getInPatientBill() {
		return InPatientBill;
	}
	public void setInPatientBill(int inPatientBill) {
		InPatientBill = inPatientBill;
	}
	public String getInPatientTest() {
		return InPatientTest;
	}
	public void setInPatientTest(String inPatientTest) {
		InPatientTest = inPatientTest;
	}
	
}
