package For;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    
        System.out.println("Entre com o valor inicial");
        int var = obj.nextInt();
        
        for (int i = var; i <= ( var + 200 ); i = i + 2){
            System.out.println( i );
        }

        obj.close();
        
    }
}