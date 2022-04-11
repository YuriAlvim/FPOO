import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Entre com o valor de X: ");
        int x = obj.nextInt();
        System.out.println("Entre com o valor de Y: ");
        int y = obj.nextInt();
        System.out.println("Entre com o valor de Z: ");
        int z = obj.nextInt();
        if ((x > z) && (x > y)){
            System.out.println("X é o maior valor");
        }
        if ((y > z) && (y > x)){
            System.out.println("Y é o maior valor");
        }
        if ((z > y) && (z > x)){
            System.out.println("Z é o maior valor");
        }

        obj.close();
        
    }
    
}
