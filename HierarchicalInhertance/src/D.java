
public class D extends A {
	public void dmethod()
	{
		System.out.println("This is dmethod method of class D");
	}
	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		D d=new D();
		b.show();
		b.display();
		c.show();
		c.my();
		d.show();
		d.dmethod();
	}
}
