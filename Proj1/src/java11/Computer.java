package java11;

public class Computer extends TangibleAsset implements Thing{
	
	
	String makerName;
	
	public Computer(String name, int price, String color, String makerName) {
		super(name,price,color);
		this.makerName = makerName;
		
	}
	
	public String getMakerName() {
		return this.makerName;
	}
	

	public void setWeight(double weight) {
		this.weight = weight;
		
	}

}
