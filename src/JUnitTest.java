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
		File file = new File("lib/test.txt");
		System.out.println(file.length());
	}

	@Test
	public void test6() {
		int[] arr1 = new int[] {1,2,2,2,3,3,3,4,5,6};
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			if(!list.contains(arr1[i])) {
				list.add(arr1[i]);
			}
		}
	}
	@Test
	public void test_trim7() {
		String str = " hehe '  ";
		String str_res = str.replace("(^s)", "");
		System.out.println(str_res);
	}
}
