package java08;

public class Hero {
	String name;
	int hp;
	Sword sword;
	
	
	public void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した。");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った。");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ。");
		System.out.println("5のダメージ！");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAMWOVER");
		System.out.println("最終HPは、" + this.hp + "でした。");
	}
	
//	コンストラクタ　newした直後に自動的に実行される。
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
//	this（引数）によって、引数ありのHeroコントラクタを呼び出した。
//	これは、Heroコンストラクタの引数ありなしの中で共通項が存在し、いちいち打つのがめんどくさいから。
//	あと、その共通項に変更がある場合、両方変更しないといけないため。
	public Hero() {
		this("なし");
	}

}
