package com.algodomain.algodomaintask1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChargesDto {
	@Id
	private String productCategory;
	private double discount;
	private double gst;
	private double deliveryCharge;
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	
	@Override
	public String toString() {
		return "ChargesDto [productCategory=" + productCategory + ", discount=" + discount + ", gst=" + gst
				+ ", deliveryCharge=" + deliveryCharge + "]";
	}
	
}
