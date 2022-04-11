import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Entre com o valor inicial: ");
        int i = obj.nextInt();
        System.out.println("Entre com o valor final: ");
        int f = obj.nextInt();

        if (i <= f) {
            while (i <= f) {
                System.out.println(i);
                i++;

            }
        }
        else {
            while (i >= f) {
                System.out.println(i);
                i--;

            }
        }
        obj.close();

        
        
    }
    
}
