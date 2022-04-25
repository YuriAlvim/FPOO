package Random;
import java.util.Scanner;
import java.util.Random;

public class randomGame {
    public static void main(String[] args){
        Random r = new Random();
        Scanner obj = new Scanner(System.in);

        int numAleatorio = r.nextInt(101);

        System.out.println("Tente adivinhar o número secreto");
        int num = obj.nextInt();
        
        while(num != numAleatorio){
            if (num < numAleatorio){
                System.out.println("O número secreto é MAIOR que " + num);
                num = obj.nextInt();
            }
            if (num > numAleatorio){
                System.out.println("O número secreto é MENOR que " + num);
                num = obj.nextInt();
            }
        }

        if (num == numAleatorio){
        
            System.out.println("Parabéns!!! Você descobriu o número secreto: " + numAleatorio);

            obj.close();
            
        }
    }
}