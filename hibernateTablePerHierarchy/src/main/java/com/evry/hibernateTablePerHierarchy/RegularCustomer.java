package com.evry.hibernateTablePerHierarchy;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("regularcustomer")
@Table(name="regCustomer02")
@PrimaryKeyJoinColumn(name="ID")
/*@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})*/
public class RegularCustomer extends Customer {
	
	@Column(name="price")
	private float price;
	@Column(name="amount")
	private int amount;
	
	public RegularCustomer() {
		super();
	}
	
	public RegularCustomer(float price, int amount) {
		super();
		this.price = price;
		this.amount = amount;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
