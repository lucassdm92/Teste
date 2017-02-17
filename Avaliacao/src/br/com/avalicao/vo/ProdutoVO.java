package br.com.avalicao.vo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoVO {

	private String productName;
	private BigDecimal productPrice;
	private Integer amountProduct;
	private LocalDate date;

	public ProdutoVO(String productName, BigDecimal productPrice,
			Integer amountProduct, LocalDate date) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.amountProduct = amountProduct;
		this.date = date;
	}

	public String getProductName() {
		return productName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getAmountProduct() {
		return amountProduct;
	}

	public void setAmountProduct(Integer amountProduct) {
		this.amountProduct = amountProduct;
	}

}
