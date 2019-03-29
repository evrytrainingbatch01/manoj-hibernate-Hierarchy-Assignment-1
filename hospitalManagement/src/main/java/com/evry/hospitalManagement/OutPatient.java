package com.evry.hospitalManagement;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("outPatient")
public class OutPatient extends Patient{

	@Column(name="OutPatientBill")
	private int OutPatientBill ;
	@Column(name="OutPatientTest")
	private String OutPatientTest;
	public int getOutPatientBill() {
		return OutPatientBill;
	}
	public void setOutPatientBill(int outPatientBill) {
		OutPatientBill = outPatientBill;
	}
	public String getOutPatientTest() {
		return OutPatientTest;
	}
	public void setOutPatientTest(String outPatientTest) {
		OutPatientTest = outPatientTest;
	}
	
}
