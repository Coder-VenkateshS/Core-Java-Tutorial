package abstraction;

public class InheritedInterface implements InterfaceExample,InterfaceExampleMI {

	public void div(int a, int b) {
		System.out.println(a/b);
	}
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
	}

}
