package com.algodomain.algodomaintask1.dto;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductDetailsDto {
	@Id
	private int productId;
	private String productName;
	private String productType;
	private String productCategory;
	private int productPrice;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "ProductDetailsDto [productId=" + productId + ", productName=" + productName + ", productType="
				+ productType + ", productCategory=" + productCategory + ", productPrice=" + productPrice + "]";
	}
	

}
