package kr.java.coffee.dto;

public class Sale {
	private int no;
	private Product product;
	private int saleCnt;
	private int marginRate;

	public Sale() {
	}

	public Sale(int no) {
		this.no = no;
	}

	public Sale(int no, Product product, int saleCnt, int marginRate) {
		this.no = no;
		this.product = product;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getSaleCnt() {
		return saleCnt;
	}

	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}

	public int getMarginRate() {
		return marginRate;
	}

	public void setMarginRate(int marginRate) {
		this.marginRate = marginRate;
	}

	@Override
	public String toString() {
		return String.format("Sale [%s, %s, %s, %s]", no, product, saleCnt, marginRate);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + marginRate;
		result = prime * result + no;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + saleCnt;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		if (marginRate != other.marginRate)
			return false;
		if (no != other.no)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (saleCnt != other.saleCnt)
			return false;
		return true;
	}

}
