import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JPanel panel;
    JFrame frame;
    JLabel title;
    static JTextField screen;
    JButton plus, minus, multiply, divide, one, two, three, four, five, six, seven, eight, nine, zero, clear, enter;
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Calculator() {
        panel = new JPanel();
        frame = new JFrame("Calculator");
        title = new JLabel(" My Calculator");
        title.setBounds(110, 10, 100, 50);
        screen = new JTextField();
        screen.setEditable(false);
        screen.setBounds(15, 60, 280, 40);
        Font newTextFieldFont = new Font(screen.getFont().getName(), screen.getFont().getStyle(), 19);
        screen.setFont(newTextFieldFont);
        plus = new JButton("+");
        plus.setBounds(50, 130, 50, 40);
        minus = new JButton("-");
        minus.setBounds(105, 130, 50, 40);
        multiply = new JButton("X");
        multiply.setBounds(160, 130, 50, 40);
        divide = new JButton("÷");
        divide.setBounds(215, 130, 50, 40);

        one = new JButton("1");
        one.setBounds(50, 180, 50, 40);
        two = new JButton("2");
        two.setBounds(105, 180, 50, 40);
        three = new JButton("3");
        three.setBounds(160, 180, 50, 40);
        four = new JButton("4");
        four.setBounds(215, 180, 50, 40);

        five = new JButton("5");
        five.setBounds(50, 230, 50, 40);
        six = new JButton("6");
        six.setBounds(105, 230, 50, 40);
        seven = new JButton("7");
        seven.setBounds(160, 230, 50, 40);
        eight = new JButton("8");
        eight.setBounds(215, 230, 50, 40);

        nine = new JButton("9");
        nine.setBounds(50, 280, 50, 40);
        zero = new JButton("0");
        zero.setBounds(105, 280, 50, 40);

        clear = new JButton("C");
        clear.setBounds(160, 280, 50, 40);
        enter = new JButton("=");
        enter.setBounds(215, 280, 50, 40);

        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        clear.addActionListener(this);
        enter.addActionListener(this);

        panel.add(clear);
        panel.add(enter);
        panel.add(zero);
        panel.add(nine);
        panel.add(five);
        panel.add(six);
        panel.add(seven);
        panel.add(eight);
        panel.add(five);
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(four);
        panel.add(one);
        panel.add(divide);
        panel.add(multiply);
        panel.add(minus);
        panel.add(plus);
        panel.add(screen);
        panel.add(title);
        frame.add(panel);
        panel.setLayout(null);
        frame.setSize(330, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == plus) {
            num1 = Double.parseDouble(screen.getText());
            operator = '+';
            screen.setText("");
        }
        if (e.getSource() == minus) {
            num1 = Double.parseDouble(screen.getText());
            operator = '-';
            screen.setText("");
        }
        if (e.getSource() == multiply) {
            num1 = Double.parseDouble(screen.getText());
            operator = '*';
            screen.setText("");
        }
        if (e.getSource() == divide) {
            num1 = Double.parseDouble(screen.getText());
            operator = '/';
            screen.setText("");
        }
        if (e.getSource() == one) {
            screen.setText(screen.getText().concat("1"));
        }
        if (e.getSource() == two) {
            screen.setText(screen.getText().concat("2"));
        }
        if (e.getSource() == three) {
            screen.setText(screen.getText().concat("3"));
        }
        if (e.getSource() == four) {
            screen.setText(screen.getText().concat("4"));
        }
        if (e.getSource() == five) {
            screen.setText(screen.getText().concat("5"));
        }
        if (e.getSource() == six) {
            screen.setText(screen.getText().concat("6"));
        }
        if (e.getSource() == seven) {
            screen.setText(screen.getText().concat("7"));
        }
        if (e.getSource() == eight) {
            screen.setText(screen.getText().concat("8"));
        }
        if (e.getSource() == nine) {
            screen.setText(screen.getText().concat("9"));
        }
        if (e.getSource() == zero) {
            screen.setText(screen.getText().concat("0"));
        }
        if (e.getSource() == clear) {
            screen.setText("");
        }
        if (e.getSource() == enter) {
            num2 = Double.parseDouble(screen.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            screen.setText(String.valueOf(result));
            num1 = result;


        }
    }

    public static void main(String[] args) {
        new Calculator();

    }

}
