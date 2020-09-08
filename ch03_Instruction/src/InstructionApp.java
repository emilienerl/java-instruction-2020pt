import java.math.BigDecimal;
import java.text.NumberFormat;

public class InstructionApp {
	public static void main(String[] args) {
		BigDecimal pi = new BigDecimal(3.1459);
		BigDecimal myBD = new BigDecimal(56.0);

		myBD = myBD.add(pi);

		System.out.println(myBD);
	}
}

//	public static void main(String[] args) {
//		double percent = 0.505;
//		NumberFormat perFormatter = NumberFormat.getPercentInstance();
//		String formattedPercent = perFormatter.format(percent);
//		System.out.println(formattedPercent);
//	}
//}

// long result = Math.round(1.667);
// System.out.println(result);
// int result = Math.round(1.49F);
// System.out.println(result);

//		double x = 10.315;
//		x = Math.round(x * 100) / 100.0;
//		System.out.println(x);

//	public static void main(String[] args) {
//
//		int parsedInt = Integer.parseInt("123");
//		System.out.println(parsedInt);
//
//		// Double amt = new Double(1.2);
//
//	}
//}

//	public static void main(String[] args) {
//		int i = 86, j = 91;
//		double result = (double) i / (double) j;
//
//		System.out.println(result);
//
//		int k = 4;
//		double d = 4.5;
//		k += d;
//
//		System.out.println(k);
//	}
//}

//	public static void main(String[] args) {
//		double curVal = 5000.00;
//		double monthInv = 100.00;
//		double yearlyIntRate = 0.12;
//
//		curVal = (curVal + monthInv) * (1 + (yearlyIntRate / 12));
//		System.out.println(curVal);
//
//	}
//}

//	public static void main(String[] args) {
//		int x = 5;
//		x -= 3;
//
//		System.out.println(x);
//	}

//	public static void main(String[] args) {
//		char letter1 = 'C';
//
//		letter1++;
//
//		System.out.println(letter1);
//	}

//	public static void main(String[] args) {
//		int x = 10;
//
//		// x++;
//		int y = x++;
//
//		System.out.println("x = " + x);
//		System.out.println("y = " + y);
//	}

//	public static void main(String[] args) {
//		int x = 7;
//		int y = 3;
//		// mod operator
//		int remainder = x % y;
//		System.out.println(remainder);
//
//		double db1x = 7.0;
//		double db1y = 3.0;
//
//		double divResult = db1x / db1y;
//		System.out.println(divResult);
//
//	}
