import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Área retângulo
    
        Scanner obj = new Scanner(System.in);

        System.out.println("Retângulo");
        
        System.out.println("Entre com o valor do primeiro lado: ");
        Double l1 = obj.nextDouble();
        System.out.println("Entre com o valor do segundo lado: ");
        Double l2 = obj.nextDouble();
        Double area = l1 * l2;
        System.out.println("A área do retângulo é " + area);
    
        // Área triângulo

        System.out.println("-----");
        System.out.println("Triângulo");
        
        System.out.println("Entre com o valor da base: ");
        Double ba = obj.nextDouble();
        System.out.println("Entre com o valor da altura: ");
        Double alt = obj.nextDouble();
        Double areatri = (ba * alt)/2;
        System.out.println("A área do triângulo é " + areatri);

        //Celsius -> Fahrenheit

        System.out.println("-----");
        System.out.println("Celcius para Fahrenheit");
        
        System.out.println("Entre com o valor em celsius: ");
        Double cel = obj.nextDouble();
        Double fah = (cel * 1.8) + 32;
        System.out.println("A temperatura em fahrenheit é " + fah);

        obj.close();
    }

}