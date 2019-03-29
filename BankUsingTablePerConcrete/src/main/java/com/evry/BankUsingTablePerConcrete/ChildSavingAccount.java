package com.evry.BankUsingTablePerConcrete;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ChildSavingAccount")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="parentId")),
	@AttributeOverride(name="parentname",column=@Column(name="parentname")),
	@AttributeOverride(name="parentBalance",column=@Column(name="parentBalance"))
})
public class ChildSavingAccount extends ParentBankAccount{

	@Column(name="savingBalance")
	private int savingBalance;
	@Column(name="AccName")
	private String AccName;
	public int getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(int savingBalance) {
		this.savingBalance = savingBalance;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	
}
