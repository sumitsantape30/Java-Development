package ref;

public class A {
	private int x;
	private B obj;//A object ko refer krha hai
	//yaha A dependent hai B pe
	public int getX() {
		return x;
	}
	public A(int x, B obj) {
		super();
		this.x = x;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObj() {
		return obj;
	}
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setObj(B obj) {
		this.obj = obj;
	}

}
