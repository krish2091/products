package com.products.models;

import java.util.Date;

public class Product {
	private int product_id;
	private String product_name;
	private String product_cat;
	private double product_price;
	private Date product_exprire_date;
	private Date product_man_date;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_cat() {
		return product_cat;
	}

	public void setProduct_cat(String product_cat) {
		this.product_cat = product_cat;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public Date getProduct_exprire_date() {
		return product_exprire_date;
	}

	public void setProduct_exprire_date(Date product_exprire_date) {
		this.product_exprire_date = product_exprire_date;
	}

	public Date getProduct_man_date() {
		return product_man_date;
	}

	public void setProduct_man_date(Date product_man_date) {
		this.product_man_date = product_man_date;
	}
     
}
