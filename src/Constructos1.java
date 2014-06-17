class Test {

	private String name;

	public static void print(String name) {
		System.out.println(name);
	}

	public static int count = 0;
	
	public void Test1(String name) {
		this.name = name;
		System.out.println("Second Constructor Running");
		System.out.println(name);
	}
	public void Test2(int age){
		System.out.println(age);
	}
	
	Test() {
		count++;
	}

}

public class Constructos1 {
	public static void main(String[] args) {
		Test.print("Thilakanda");
		System.out.println(Test.count);
		Test basha = new Test();
		//Test basha1 = new Test();
		basha.Test2(54);
		//basha1.Test1("Rama");
		System.out.println(Test.count);
	}

}
