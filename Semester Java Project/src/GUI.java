
//***********************Graphical user Interface******************
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class GUI implements ItemListener, ActionListener {

	JFrame f;
	JTextField tf;
	JTextField tf1;
	JButton b1;
	String result;
	String decimal;
	JRadioButton rb1, rb2, rb3, rb4;
	JLabel label, label2, label3, label4;

	// complex number declaration
	JTextField t1;
	JTextField t2;
	JButton plus;
	JButton minus;
	JButton multiply;
	JButton divide;
	JButton reset1;
	String result1;
	JLabel jl1, jl2, jl3, jl4;

	// matrix declaration
	JTextField m1;
	JTextField m2;
	JTextField m3;
	JTextField m4;

	JTextField m21;
	JTextField m22;
	JTextField m23;
	JTextField m24;

	JTextField m31;
	JTextField m32;
	JTextField m33;
	JTextField m34;
	JButton bplus;
	JButton bmin;
	JButton bequal;
	JButton reset;
	JLabel j1;
	JLabel j2;
	JLabel j3;
	JLabel jmsg;
	double n1, n2, n3, n4, n21, n22, n23, n24, n31, n32, n33, n34;

	GUI() {

		f = new JFrame(" MCF CALCULATOR");
		JTabbedPane tp = new JTabbedPane();

		tp.setBounds(30, 20, 500, 500);
		JPanel panel2 = new JPanel();
		panel2.setSize(500, 500);
		panel2.setLayout(null);
		panel2.setBackground(Color.LIGHT_GRAY);
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.LIGHT_GRAY);
		JPanel panel3 = new JPanel();
		panel3.setSize(500, 500);
		panel3.setLayout(null);
		panel3.setBackground(Color.LIGHT_GRAY);
		// components of panel1
		label = new JLabel();
		label4 = new JLabel();
		label2 = new JLabel("Enter a 1st Fraction i.e 6/4");
		label3 = new JLabel("Enter a 2nd Fraction i.e 2/3");
		label.setFont(new Font("Times new roman", Font.BOLD, 25));
		label4.setFont(new Font("Times new roman", Font.BOLD, 25));
		label.setBounds(70, 320, 400, 20);
		label4.setBounds(70, 370, 400, 20);
		label2.setBounds(40, 25, 300, 20);
		label3.setBounds(40, 70, 300, 20);
		tf1 = new JTextField("");
		tf1.setBounds(300, 70, 130, 37);
		tf = new JTextField("");
		tf.setBounds(300, 20, 130, 35);
		tf.setFont(new Font("Times new roman", Font.PLAIN, 30));
		tf1.setFont(new Font("Times new roman", Font.PLAIN, 30));
		label2.setFont(new Font("Times new roman", Font.PLAIN, 20));
		label3.setFont(new Font("Times new roman", Font.PLAIN, 20));
		rb3 = new JRadioButton("+");
		rb3.setBounds(100, 110, 120, 50);
		rb4 = new JRadioButton("-");
		rb4.setBounds(100, 150, 120, 50);
		rb1 = new JRadioButton("*");

		rb1.setBounds(100, 200, 120, 50);

		b1 = new JButton("clear");
		b1.setBounds(170, 420, 70, 30);
		rb2 = new JRadioButton("/");

		rb2.setBounds(100, 250, 75, 50);
		rb1.setBackground(Color.LIGHT_GRAY);
		rb2.setBackground(Color.LIGHT_GRAY);
		rb3.setBackground(Color.LIGHT_GRAY);
		rb4.setBackground(Color.LIGHT_GRAY);
		rb1.setFont(new Font("Arial black", Font.BOLD, 20));
		rb2.setFont(new Font("Arial black", Font.BOLD, 20));
		rb3.setFont(new Font("Arial black", Font.BOLD, 20));
		rb4.setFont(new Font("Arial black", Font.BOLD, 20));
		ButtonGroup bg = new ButtonGroup();

		bg.add(rb3);
		bg.add(rb4);
		bg.add(rb1);
		bg.add(rb2);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);
		rb4.addItemListener(this);
		b1.addActionListener(this);
		// components of panel 2
		panel2.setSize(600, 600);
		panel2.setLayout(null);
		panel2.setBackground(Color.LIGHT_GRAY);

		jl1 = new JLabel();
		jl1.setFont(new Font("Arial black", Font.BOLD, 20));

		jl1.setBounds(70, 320, 400, 20);

		jl3 = new JLabel("ENTER 1st COMPLEX  NUMBER i.e 4+5i");
		jl3.setFont(new Font("Arial black", Font.BOLD, 12));
		jl3.setBounds(40, 30, 300, 20);

		jl4 = new JLabel("ENTER 2nd COMPLEX  NUMBER i.e 3+9i");
		jl4.setFont(new Font("Arial black", Font.BOLD, 12));
		jl4.setBounds(40, 80, 300, 20);

		t1 = new JTextField("");
		t1.setBounds(350, 70, 130, 37);
		t1.setFont(new Font("Arial black", Font.PLAIN, 12));

		t2 = new JTextField("");
		t2.setBounds(350, 20, 130, 35);
		t2.setFont(new Font("Arial black", Font.PLAIN, 12));

		plus = new JButton("+");
		plus.setBounds(150, 150, 50, 30);
		minus = new JButton("-");
		minus.setBounds(200, 150, 50, 30);
		multiply = new JButton("*");
		multiply.setBounds(250, 150, 50, 30);
		divide = new JButton("/");
		divide.setBounds(300, 150, 50, 30);
		reset1 = new JButton("Reset");
		reset1.setBounds(350, 400, 100, 30);

		// add components in panel1
		panel1.add(tf);
		panel1.add(tf1);
		panel1.add(rb1);
		panel1.add(rb2);
		panel1.add(rb3);
		panel1.add(rb4);
		panel1.add(b1);
		panel1.add(label);
		panel1.add(label2);
		panel1.add(label3);
		panel1.add(label4);
		// add components in panel 2
		panel2.add(jl1);
		// panel2.add(jl2);
		panel2.add(jl3);
		panel2.add(jl4);
		panel2.add(t1);
		panel2.add(t2);
		panel2.add(plus);
		panel2.add(minus);
		panel2.add(multiply);
		panel2.add(divide);
		panel2.add(reset1);
		f.add(panel2);

		panel2.setForeground(Color.BLUE);
		t1.addActionListener(this);
		t2.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
		reset1.addActionListener(this);

		// Matrix definition

		j1 = new JLabel("ENTER MARTIX 1");
		j1.setFont(new Font("Camberia", Font.BOLD, 14));
		j1.setBounds(100, 110, 120, 50);

		j2 = new JLabel("ENTER MARTIX 2");
		j2.setFont(new Font("Camberia", Font.BOLD, 14));
		j2.setBounds(300, 110, 120, 50);

		j3 = new JLabel("Resultent MARTIX");
		j3.setFont(new Font("Camberia", Font.BOLD, 13));
		j3.setBounds(200, 300, 130, 70);

		jmsg = new JLabel("NOTE: Please enter numbers only");
		jmsg.setFont(new Font("Camberia", Font.BOLD, 13));
		jmsg.setBounds(150, 120, 250, 100);
		m1 = new JTextField();
		m1.setBounds(100, 50, 50, 30);
		m2 = new JTextField();
		m2.setBounds(160, 50, 50, 30);
		m3 = new JTextField();
		m3.setBounds(100, 90, 50, 30);
		m4 = new JTextField();
		m4.setBounds(160, 90, 50, 30);

		m21 = new JTextField();
		m21.setBounds(300, 50, 50, 30);
		m22 = new JTextField();
		m22.setBounds(360, 50, 50, 30);
		m23 = new JTextField();
		m23.setBounds(300, 90, 50, 30);
		m24 = new JTextField();
		m24.setBounds(360, 90, 50, 30);

		m31 = new JTextField();
		m31.setBounds(200, 240, 50, 30);
		m32 = new JTextField();
		m32.setBounds(260, 240, 50, 30);
		m33 = new JTextField();
		m33.setBounds(200, 290, 50, 30);
		m34 = new JTextField();
		m34.setBounds(260, 290, 50, 30);

		bplus = new JButton("+");
		bplus.setBounds(180, 180, 50, 30);
		bmin = new JButton("-");
		bmin.setBounds(230, 180, 50, 30);
		bequal = new JButton("=");
		bequal.setBounds(280, 180, 50, 30);
		reset = new JButton("Reset");
		reset.setBounds(220, 370, 70, 40);

		// Matrix adders and actionlisteners
		panel3.add(j1);
		panel3.add(j2);
		panel3.add(j3);
		panel3.add(jmsg);
		panel3.add(m1);
		panel3.add(m2);
		panel3.add(m3);
		panel3.add(m4);
		panel3.add(m21);
		panel3.add(m22);
		panel3.add(m23);
		panel3.add(m24);
		panel3.add(m31);
		panel3.add(m32);
		panel3.add(m33);
		panel3.add(m34);
		panel3.add(bplus);
		panel3.add(bmin);
		panel3.add(bequal);
		panel3.add(reset);
		f.add(panel3);
		// panel3.setForeground(Color.BLUE);

		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);

		m21.addActionListener(this);
		m22.addActionListener(this);
		m23.addActionListener(this);
		m24.addActionListener(this);

		m31.addActionListener(this);
		m32.addActionListener(this);
		m33.addActionListener(this);
		m34.addActionListener(this);

		bplus.addActionListener(this);
		bmin.addActionListener(this);
		bequal.addActionListener(this);
		reset.addActionListener(this);

		tp.add("Fraction", panel1);
		tp.add("Complex No", panel2);
		tp.add("Matrix", panel3);
		f.add(tp);
		f.setLayout(null);
		f.setSize(600, 600);

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == reset) {
			m1.setText("");
			m2.setText("");
			m3.setText("");
			m4.setText("");

			m21.setText("");
			m22.setText("");
			m23.setText("");
			m24.setText("");

			m31.setText("");
			m32.setText("");
			m33.setText("");
			m34.setText("");

		}

		if (e.getSource() == bmin) {

			if ((m1.getText()).isEmpty() || (m2.getText()).isEmpty() || (m3.getText()).isEmpty()
					|| (m4.getText()).isEmpty() || (m21.getText()).isEmpty() || (m22.getText()).isEmpty()
					|| (m23.getText()).isEmpty() || (m24.getText()).isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter all the values in matrix 1 & matrix 2");

			} else {
				n1 = Double.parseDouble(m1.getText());
				n2 = Double.parseDouble(m2.getText());
				n3 = Double.parseDouble(m3.getText());
				n4 = Double.parseDouble(m4.getText());

				n21 = Double.parseDouble(m21.getText());
				n22 = Double.parseDouble(m22.getText());
				n23 = Double.parseDouble(m23.getText());
				n24 = Double.parseDouble(m24.getText());
				n31 = n1 - n21;
				n32 = n2 - n22;
				n33 = n3 - n23;
				n34 = n4 - n24;

			}

		}
		if (e.getSource() == bplus) {

			if (m1.getText().isEmpty() || m2.getText().isEmpty() || m3.getText().isEmpty() || m4.getText().isEmpty()
					|| m21.getText().isEmpty() || m22.getText().isEmpty() || m23.getText().isEmpty()
					|| m24.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter all the values in matrix 1 & matrix 2");

			} else {

				n1 = Double.parseDouble(m1.getText());
				n2 = Double.parseDouble(m2.getText());
				n3 = Double.parseDouble(m3.getText());
				n4 = Double.parseDouble(m4.getText());

				n21 = Double.parseDouble(m21.getText());
				n22 = Double.parseDouble(m22.getText());
				n23 = Double.parseDouble(m23.getText());
				n24 = Double.parseDouble(m24.getText());

				n31 = n1 + n21;
				n32 = n2 + n22;
				n33 = n3 + n23;
				n34 = n4 + n24;
			}

		}
		if (e.getSource() == bequal) {

			m31.setText(Double.toString(n31));
			m32.setText(Double.toString(n32));
			m33.setText(Double.toString(n33));
			m34.setText(Double.toString(n34));

		}
		// ******Action performed on clear button of FRACTION CLASS***********
		if (e.getSource() == b1) {
			tf.setText("");
			tf1.setText("");
			label.setText("");
			label4.setText("");

		}
		// *********************Complex Number Working***************************
		Complexno cn = new Complexno(t1.getText(), t2.getText());

		if (e.getSource() == plus) {
			if (t1.getText().isEmpty() || t2.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter both complex values");
			} else
				result1 = cn.Addition(t1.getText(), t2.getText());
			jl1.setText("Result= " + result1);
		} else if (e.getSource() == minus) {
			if (t1.getText().isEmpty() || t2.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter both complex values");
			} else
				result1 = cn.Subtractions(t1.getText(), t2.getText());
			jl1.setText("Result= " + result1);
		} else if (e.getSource() == multiply) {
			if (t1.getText().isEmpty() || t2.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter both complex values");
			} else
				result1 = cn.multiplication(t1.getText(), t2.getText());
			jl1.setText("Result= " + result1);
		} else if (e.getSource() == divide) {
			if (t1.getText().isEmpty() || t2.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter both complex values");
			} else
				result1 = cn.division(t2.getText(), t1.getText());
			jl1.setText("Result= " + result1);
		} else if (e.getSource() == reset1) {
			t1.setText("");
			t2.setText("");
			result1 = "";
		}

	}

	public void itemStateChanged(ItemEvent e) {
		Fraction frac = new Fraction(tf.getText(), tf1.getText());

		if (e.getSource() == rb1) {
			if (e.getStateChange() == 1) {
				if (tf.getText().isEmpty() || tf1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "please enter both fractions");
				} else {
					result = frac.MultiplyFraction(tf.getText(), tf1.getText());
					label.setText("Result : " + result);
					decimal = frac.decimalfraction();
					label4.setText("Result in Decimal form:  " + decimal);
				}

			}
		}
		if (e.getSource() == rb2) {
			if (tf.getText().isEmpty() || tf1.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "please enter both fractions");
			} else {
				result = frac.divideFraction(tf.getText(), tf1.getText());
				label.setText("Result : " + result);
				decimal = frac.decimalfraction();
				label4.setText("Result in Decimal form:  " + decimal);

			}
		}
		if (e.getSource() == rb3) {
			if (e.getStateChange() == 1) {
				if (tf.getText().isEmpty() || tf1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "please enter both fractions");
				} else {
					result = frac.AddFraction(tf.getText(), tf1.getText());
					label.setText("Result in Fraction form:  " + result);
					decimal = frac.decimalfraction();
					label4.setText("Result in Decimal form:  " + decimal);

				}

			}
		}
		if (e.getSource() == rb4) {
			if (e.getStateChange() == 1) {
				if (tf.getText().isEmpty() || tf1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "please enter both fractions");
				} else {
					result = frac.SubtractFraction(tf.getText(), tf1.getText());
					label.setText("Result : " + result);
					decimal = frac.decimalfraction();
					label4.setText("Result in Decimal form:  " + decimal);
				}

			}
		}

	}

	public static void main(String[] args) {
		new GUI();
	}
}
