import java.util.Scanner;

public class Texto {
    public static void main(String[] args){
        Scanner txt = new Scanner(System.in);

        //Quan. de caracteres

        System.out.println("Quantidade de Caracteres");
        
        System.out.println("Entre com um texto: ");
        String qua = txt.nextLine();
        System.out.println("A quantidade de caracteres de \"" + qua + "\" é: " + qua.length());

        //Maiúscula

        System.out.println("Uppercase");
        
        System.out.println("Entre com um texto: ");
        String upper = txt.nextLine();
        System.out.println(upper.toUpperCase());
        

        txt.close();
    }
     
}
