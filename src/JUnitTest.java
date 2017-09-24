import static org.junit.Assert.*;

import org.junit.Test;
import java.io.*;
import java.util.*;
public class JUnitTest {

	@Test
	public void test() {
		fail("Not yet implemented");
		
	}

	enum A{
		a;
		public void run() {
			System.out.println("hello,world");
		}
	}
	@Test
	public void test1() {
		A.a.run();
	}
	@Test
	public void test2() {
		List<String> list = new ArrayList<String>();
		System.out.println(list.size());
	}
	
	public int number = 12345;
	@Test
	public void test3() {
		System.out.println(number);
	}
	
	class Student{
		public String toString() {
			return "hello";
		}
	}
	@Test
	public void test4() {
		Student st = new Student();
		System.out.println(st);
	}
	@Test
	public void test5() {
		System.out.println("for test git commit");
	}
	
}
