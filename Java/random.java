import java.util.Random;

public class random {
    public static void main(String[] args){
        Random r = new Random();

        int numAleatorio = r.nextInt(10);
        System.out.println(numAleatorio);

        
    }
}