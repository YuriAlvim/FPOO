package If;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        
        //Maior valor

        System.out.println("Maior Valor");
        System.out.println(" ");
        System.out.println("Entre com o valor de X: ");
        int x = obj.nextInt();
        System.out.println("Entre com o valor de z: ");
        int z = obj.nextInt();
        if (x > z) {
            System.out.println("X é maior que Z");
        }
        else {
            System.out.println("Z é maior que X");
        }

        //Dia da Semana

        System.out.println("Dia da semana");
        System.out.println("Entre com um número de 1 a 7:");
        int dia = obj.nextInt();
        
        if ((dia >=1) && (dia <=7)){
            
            if(dia == 1){
                System.out.println("Domingo");
            }
            if(dia == 2){
                System.out.println("Segunda");
            }
            if(dia == 3){
                System.out.println("Terça");
            }
            if(dia == 4){
                System.out.println("Quarta");
            }
            if(dia == 5){
                System.out.println("Quinta");
            }
            if(dia == 6){
                System.out.println("Sexta");
            }
            if(dia == 7){
                System.out.println("Sábado");
            }

        } else {
            System.out.println("Valor fora da semana");
        }

        obj.close();
    }
}
