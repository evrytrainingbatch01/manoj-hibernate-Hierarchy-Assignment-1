package com.evry.hibernateTablePerHierarchy;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("partialcustomer")
@Table(name="parCustomer02")

@PrimaryKeyJoinColumn(name="ID")
//
/*@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})*/
public class PartialCustomer extends Customer {
	@Column(name="parPrice")
	private float parPrice;
	@Column(name="paramount")
	private int paramount;
	public float getParPrice() {
		return parPrice;
	}
	public void setParPrice(float parPrice) {
		this.parPrice = parPrice;
	}
	public int getParamount() {
		return paramount;
	}
	public void setParamount(int paramount) {
		this.paramount = paramount;
	}

}
