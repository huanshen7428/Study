package lh.study.reflect;

public class Person {
	public String name;
	public int age;
	public void sayHello() {
		System.out.println("Hello,I am "+name);
	}
	public Person() {
		name = "mike";
	}
	public static void main(String[] args) {
		System.out.println("main!!");
	}
}
