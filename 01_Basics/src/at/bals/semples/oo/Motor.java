package at.bals.semples.oo;

public class Motor {
	private int hp;
	private int stovepipes;

	public Motor(int hp, int stovepipes) {
		super();
		this.hp = hp;
		this.stovepipes = stovepipes;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getStovepipes() {
		return stovepipes;
	}

	public void setStovepipes(int stovepipes) {
		this.stovepipes = stovepipes;
	}

	public void start() {
		System.out.println("I am started now");
	}

	public void move() {
		System.out.println("The motor is running with " + hp);
	}
}
