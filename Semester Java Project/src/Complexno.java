

//*********************Complex Number*****************
//import javax.swing.JOptionPane;
public class Complexno {
	String n1;
	String n2;
	String result;

	Complexno(String a, String b) {
		n1 = a;
		n2 = b;

	}

	String multiplication(String a, String b) {

		String x[] = a.split("\\+|i");
		String y[] = b.split("\\+|i");
		int real1 = Integer.parseInt(x[0]);
		int img1 = Integer.parseInt(x[1]);
		int real2 = Integer.parseInt(y[0]);
		int img2 = Integer.parseInt(y[1]);
		return (real1 * real2 - img1 * img2) + "+" + (real1 * img2 + img1 * real2) + "i";

	}

	String Addition(String a, String b) {
		String x[] = a.split("\\+|i");
		String y[] = b.split("\\+|i");
		int real1 = Integer.parseInt(x[0]);
		int img1 = Integer.parseInt(x[1]);
		int real2 = Integer.parseInt(y[0]);
		int img2 = Integer.parseInt(y[1]);
		int temp = real1 + real2;
		int temp2 = img1 + img2;
		return temp + "+" + temp2 + "i";

	}

	public String Subtractions(String a, String b) {
		String x[] = a.split("\\+|i");
		String y[] = b.split("\\+|i");
		int real1 = Integer.parseInt(x[0]);
		int img1 = Integer.parseInt(x[1]);
		int real2 = Integer.parseInt(y[0]);
		int img2 = Integer.parseInt(y[1]);
		int temp = real2 - real1;
		int temp2 = img2 - img1;
		return temp + temp2 + "i";

	}

	String division(String a, String b) {

		String x[] = a.split("\\+|i");
		String y[] = b.split("\\+|i");
		int real1 = Integer.parseInt(x[0]);
		int img1 = Integer.parseInt(x[1]);
		int real2 = Integer.parseInt(y[0]);
		int img2 = Integer.parseInt(y[1]);
		int n = (real2 * real2) + (img2 * img2);
		int temp1 = (real1 * real2 + img1 * img2);
		int temp2 = (real1 * img2 - img1 * real2);
		return temp1 + "  " + temp2 + "i  /" + n;
		// String s = (real1 * real2 + img1 * img2) + (img1 * real2- real1 * img2 ) +
		// "i";
//	return s + "/" + n;

	}

}
