import java.io.IOException;

public class CustomTesterApp {

	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		method2();
	}

	public static void method2() {
		try {
			method3();
		} catch (TestException e) {
			System.out.println("Caught a TestException " + e.getMessage());
		}
	}

	public static void method3() throws TestException {

		throw new TestException("Test ExceptionIO");
	}
}
