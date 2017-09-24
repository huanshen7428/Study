package lh.study.enumTest;

public class EnumTest {
	public static void main(String[] args) {
//		Grade.A.localValue();
		A.a.run();
		System.out.println(A.a.name());
	}
}
enum Grade{
	A{
		public String localValue() {
			return "nice";
		}
	},
	B{
		public String localValue() {
			return "good";
		}
	},
	C{
		public String localValue() {
			return "so-so";
		}
	}
}
enum A{
	a;
	public void run() {
		System.out.println("hello,world");
	}
}
