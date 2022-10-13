package com.algodomain.algodomaintask1.dto;

import java.util.Map;

public class ProductChargesDetails {
	private int productId;
	private String name;
	private String type;
	private String category;
	private double basePrice;
	private double discount;
	private Map<String , Double> charges;
	private double finalCharges;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Map<String, Double> getCharges() {
		return charges;
	}
	public void setCharges(Map<String, Double> charges) {
		this.charges = charges;
	}
	public double getFinalCharges() {
		return finalCharges;
	}
	public void setFinalCharges(double finalCharges) {
		this.finalCharges = finalCharges;
	}
	@Override
	public String toString() {
		return "ProductChargesDetails [productId=" + productId + ", name=" + name + ", type=" + type + ", category="
				+ category + ", basePrice=" + basePrice + ", discount=" + discount + ", charges=" + charges
				+ ", finalCharges=" + finalCharges + "]";
	}
	

}
