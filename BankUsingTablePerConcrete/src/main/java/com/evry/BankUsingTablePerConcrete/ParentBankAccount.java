package com.evry.BankUsingTablePerConcrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="parentAccount")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class ParentBankAccount {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="parentname")
	private String parentname;
	@Column(name="parentBalance")
	private int parentBalance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getParentname() {
		return parentname;
	}
	public void setParentname(String parentname) {
		this.parentname = parentname;
	}
	public int getParentBalance() {
		return parentBalance;
	}
	public void setParentBalance(int parentBalance) {
		this.parentBalance = parentBalance;
	}
	
}
