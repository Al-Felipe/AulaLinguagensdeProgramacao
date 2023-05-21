import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField display;

    private JButton zero, um, dois, tres, quatro, cinco, seis, sete, oito, nove;
    private JButton adicao, subtracao, multiplicacao, divisao, igual, botaoLimpar;

    private double num1, num2;
    private String operador;

    public Calculadora() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        sete = new JButton("7");
        oito = new JButton("8");
        nove = new JButton("9");
        divisao = new JButton("/");
        quatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        multiplicacao = new JButton("*");
        um = new JButton("1");
        dois = new JButton("2");
        tres = new JButton("3");
        subtracao = new JButton("-");
        zero = new JButton("0");
        botaoLimpar = new JButton("C");
        igual = new JButton("=");
        adicao = new JButton("+");

        buttonPanel.add(sete);
        buttonPanel.add(oito);
        buttonPanel.add(nove);
        buttonPanel.add(divisao);
        buttonPanel.add(quatro);
        buttonPanel.add(cinco);
        buttonPanel.add(seis);
        buttonPanel.add(multiplicacao);
        buttonPanel.add(um);
        buttonPanel.add(dois);
        buttonPanel.add(tres);
        buttonPanel.add(subtracao);
        buttonPanel.add(zero);
        buttonPanel.add(botaoLimpar);
        buttonPanel.add(igual);
        buttonPanel.add(adicao);

        add(buttonPanel, BorderLayout.CENTER);

        sete.addActionListener(this);
        oito.addActionListener(this);
        nove.addActionListener(this);
        divisao.addActionListener(this);
        quatro.addActionListener(this);
        cinco.addActionListener(this);
        seis.addActionListener(this);
        multiplicacao.addActionListener(this);
        um.addActionListener(this);
        dois.addActionListener(this);
        tres.addActionListener(this);
        subtracao.addActionListener(this);
        zero.addActionListener(this);
        botaoLimpar.addActionListener(this);
        igual.addActionListener(this);
        adicao.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            display.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            double resultado = calcularResultado(num1, num2, operador);
            display.setText(String.valueOf(resultado));
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            num1 = Double.parseDouble(display.getText());
            operador = command;
            display.setText("");
        } else {
            display.setText(display.getText() + command);
        }
    }

    private double calcularResultado(double num1, double num2, String operador) {
        double resultado = 0.0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Calculadora calculator = new Calculadora();
        calculator.setSize(300, 300);
        calculator.setVisible(true);
    }
}
