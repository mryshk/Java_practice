package java12;

public abstract class Plant {
	
	protected String name;
	protected int hp;
	
	public Plant(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	
	public abstract void care(Character c) ;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		System.out.print(this.name);
		this.name = name;
		System.out.println("が" + name + "に変更になりました。");
	}

}
