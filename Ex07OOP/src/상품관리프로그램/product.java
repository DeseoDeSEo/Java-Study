package 상품관리프로그램;
public class product {
	private String name;
	private int unitPrice;
	private int amount;
	
	public product ( String name, int unitPrice, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void setAmount(int amount) {
		if(amount>0) {
			this.amount = amount;
		}
	}
	public String getName() {
		return name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public int getAmount() {
		return amount;
	}

}
