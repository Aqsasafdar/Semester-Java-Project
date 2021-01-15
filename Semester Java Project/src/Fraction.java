

//****************Fraction**************
import javax.swing.JOptionPane;

public class Fraction {

	String fist_fraction;
	String second_fraction;
	int num1 = 0, num2 = 0, denom1 = 0, denom2 = 0;
	int answernum = 0;
	int answerdenom = 0;
	String temp = "", temp1 = "", result = "";
	int found = 0;

	Fraction(String f1, String f2) {
		fist_fraction = f1;
		second_fraction = f2;
	}

	String divideFraction(String fist_fraction, String second_fraction) {
		try {
			separateFraction(fist_fraction);

			if (found == 0) {

				num1 = Integer.parseInt(temp);
				denom1 = Integer.parseInt(temp1);
				separateFraction(second_fraction);
				if (found == 0) {
					num2 = Integer.parseInt(temp);
					denom2 = Integer.parseInt(temp1);

					if (denom1 != 0 && num2 != 0 && denom2 != 0) {
						answernum = num1 * denom2;
						answerdenom = denom1 * num2;

						result = reducefraction(answernum, answerdenom);
						return result;
					}

					else {

						return "Denominator can not be 0";
					}
				} else {
					JOptionPane.showMessageDialog(null, "please enter proper fraction");
					return "";
				}
			} else {
				JOptionPane.showMessageDialog(null, "please enter proper fraction");
				return "";
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "only digit allow");
		}
		return "";
	}

	String MultiplyFraction(String fist_fraction, String second_fraction) {
		try {
			separateFraction(fist_fraction);

			if (found == 0) {

				num1 = Integer.parseInt(temp);
				denom1 = Integer.parseInt(temp1);
				separateFraction(second_fraction);
				if (found == 0) {
					num2 = Integer.parseInt(temp);
					denom2 = Integer.parseInt(temp1);
					if (denom1 != 0 && denom2 != 0) {
						answernum = num1 * num2;
						answerdenom = denom1 * denom2;
						result = reducefraction(answernum, answerdenom);
						return result;
					} else {

						return "Denominator can not be 0";
					}
				} else {
					JOptionPane.showMessageDialog(null, "please enter proper fraction");
					return "";
				}
			} else {
				JOptionPane.showMessageDialog(null, "please enter proper fraction");
				return "";
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "only digit allow");
		}
		return "";

	}

	String AddFraction(String fist_fraction, String second_fraction) {
		try {
			separateFraction(fist_fraction);

			if (found == 0) {

				num1 = Integer.parseInt(temp);
				denom1 = Integer.parseInt(temp1);
				separateFraction(second_fraction);
				if (found == 0) {
					num2 = Integer.parseInt(temp);
					denom2 = Integer.parseInt(temp1);
					if (denom1 != 0 && denom2 != 0) {
						answernum = (num1 * denom2) + (denom1 * num2);
						answerdenom = denom1 * denom2;
						result = reducefraction(answernum, answerdenom);
						return result;
					} else {

						return ("Denominator can not be 0");
					}
				} else {
					JOptionPane.showMessageDialog(null, "please enter proper fraction");
					return "";
				}
			} else {
				JOptionPane.showMessageDialog(null, "please enter proper fraction");
				return "";
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "only digit allow");
		}
		return "";

	}

	String SubtractFraction(String fist_fraction, String second_fraction) {
		try {
			separateFraction(fist_fraction);

			if (found == 0) {

				num1 = Integer.parseInt(temp);
				denom1 = Integer.parseInt(temp1);
				separateFraction(second_fraction);
				if (found == 0) {
					num2 = Integer.parseInt(temp);
					denom2 = Integer.parseInt(temp1);
					if (denom1 != 0 && denom2 != 0) {
						answernum = (num1 * denom2) - (denom1 * num2);
						answerdenom = denom1 * denom2;
						result = reducefraction(answernum, answerdenom);

						return result;
					} else {
						return "Denominator can not be 0";
					}
				} else {
					
					
					JOptionPane.showMessageDialog(null, "please enter proper fraction");
					return "";
				}
			} else {
				JOptionPane.showMessageDialog(null, "please enter proper fraction");
				return "";
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "only digit allowed ");
		}
		return "";
	}

	String reducefraction(int num, int deno) {
		if (num != 0) {
			int gcd = 0, n1 = 0, n2 = 0;
			int found = 0, c = 0;
			int s = 0, p = 0;
			if (num < 0 && deno < 0) {
				s = Math.abs(num);
				found++;
				p = Math.abs(deno);
				c++;
				for (int i = 1; i <= s; i++) {
					if (s % i == 0 && p % i == 0) {
						gcd = i;
					}
				}
				n1 = s / gcd;
				n2 = p / gcd;
			} else if (deno < 0 && num > 0) {
				p = Math.abs(deno);
				c++;
				for (int i = 1; i <= num; i++) {
					if (num % i == 0 && p % i == 0) {
						gcd = i;
					}
				}
				n1 = num / gcd;
				n2 = p / gcd;
			} else if (deno > 0 && num < 0) {
				s = Math.abs(num);
				c++;
				for (int i = 1; i <= s; i++) {
					if (s % i == 0 && deno % i == 0) {
						gcd = i;
					}
				}
				n1 = s / gcd;
				n2 = deno / gcd;
			} else {
				for (int i = 1; i <= num; i++) {
					if (num % i == 0 && deno % i == 0) {
						gcd = i;
					}
				}
				n1 = num / gcd;
				n2 = deno / gcd;
			}
			if (found == 1 && c == 1) {

				return  +n1 +"/" + n2;

			} else if (found == 1 && c == 0) {

				return "-" + n1 + "/" + n2;

			} else if (found == 0 && c == 1) {
				return +n1 + "/" + "-" + n2;
			} else {
				return +n1 + "/" + n2;
			}

		} else {
			return +num + "/" + deno;
		}
	}

	void separateFraction(String str) {

		try {
			String[] n = str.split("/");

			temp = n[0];
			temp1 = n[1];

		} catch (ArrayIndexOutOfBoundsException e) {

			found++;
		}

	}

	float convertfraction(int n, int d) {
		double f = (double) n / d;
		float a = (float) f;
		return a;
	}

	String decimalfraction() {
		if (found == 0) {
			float r = convertfraction(answernum, answerdenom);
			String d = String.valueOf(r);
			return d;
		} else {
			return "";
		}
	}
}
