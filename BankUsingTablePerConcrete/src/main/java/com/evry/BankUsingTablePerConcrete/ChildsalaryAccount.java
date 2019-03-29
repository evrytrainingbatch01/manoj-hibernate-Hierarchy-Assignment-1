package com.evry.BankUsingTablePerConcrete;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ChildSalaryAccount")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="parentId")),
	@AttributeOverride(name="parentname",column=@Column(name="parentname")),
	@AttributeOverride(name="parentBalance",column=@Column(name="parentBalance"))
})
public class ChildsalaryAccount extends ParentBankAccount{
	
	@Column(name="salaryBalance")
	private int salaryBalance;
	@Column(name="AccName")
	private String AccName;
	public int getSalaryBalance() {
		return salaryBalance;
	}
	public void setSalaryBalance(int salaryBalance) {
		this.salaryBalance = salaryBalance;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}

}
