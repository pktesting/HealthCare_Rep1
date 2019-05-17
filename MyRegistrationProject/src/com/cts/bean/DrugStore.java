package com.cts.bean;

import java.util.Date;

public class DrugStore
{
 private String drugname;
 private int in_stock;
 private Date exp_date1;
 private  Date exp_date2;
public DrugStore() {
	super();
	// TODO Auto-generated constructor stub
}
public DrugStore(String drugname, int in_stock, Date exp_date1, Date exp_date2) {
	super();
	this.drugname = drugname;
	this.in_stock = in_stock;
	this.exp_date1 = exp_date1;
	this.exp_date2 = exp_date2;
}
public String getDrugname() {
	return drugname;
}
public void setDrugname(String drugname) {
	this.drugname = drugname;
}
public int getIn_stock() {
	return in_stock;
}
public void setIn_stock(int in_stock) {
	this.in_stock = in_stock;
}
public Date getExp_date1() {
	return exp_date1;
}
public void setExp_date1(Date exp_date1) {
	this.exp_date1 = exp_date1;
}
public Date getExp_date2() {
	return exp_date2;
}
public void setExp_date2(Date exp_date2) {
	this.exp_date2 = exp_date2;
}
@Override
public String toString() {
	return "DrugStore [drugname=" + drugname + ", in_stock=" + in_stock + ", exp_date1=" + exp_date1 + ", exp_date2="
			+ exp_date2 + "]";
}
 
 
	
	
}
