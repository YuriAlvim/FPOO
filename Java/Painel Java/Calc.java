import javax.swing.JOptionPane;

public class Calc {
    static void mensagemR(String texto){
        JOptionPane.showMessageDialog(null, texto, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }

    static void soma(double num1, double num2, double resultado){
        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, "Resultado da soma: "+ resultado, "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    static void subtracao(double num1, double num2, double resultado){
        resultado = num1 - num2;
        JOptionPane.showMessageDialog(null, "Resultado da subtração: "+ resultado, "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    static void multi(double num1, double num2, double resultado){
        resultado = num1 * num2;
        JOptionPane.showMessageDialog(null, "Resultado da multiplicação: "+ resultado, "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    static void divisao(double num1, double num2, double resultado){
        resultado = num1 / num2;
        JOptionPane.showMessageDialog(null, "Resultado da divisão: "+ resultado, "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        
        mensagemR("Escolha uma operação usando números de 1 a 4: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
        int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação:"));
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o segundo número:"));
        double res = 0;

        switch(op){
            case 1:
            soma(n1, n2, res);
            break;

            case 2:
            subtracao(n1, n2, res);
            break;

            case 3:
            multi(n1, n2, res);
            break;

            case 4:
            divisao(n1, n2, res);
            break;

        }
    }
}
