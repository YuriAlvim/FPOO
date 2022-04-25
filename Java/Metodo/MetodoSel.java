package Metodo;
import java.util.Scanner;

public class MetodoSel {
    //Usuário e Senha
    static void user(){
        Scanner login = new Scanner(System.in);
        
        System.out.println("Digite seu usuário:");
        String us = login.nextLine();
        System.out.println("Digite sua senha:");
        int sen = login.nextInt();

        if (us.contains("carlinda")){
            System.out.println("O login foi um sucesso");
        
        }
        else{
            System.out.println("Usuário não autorizado");
        }

        login.close();
        
    }
    
    //Cálculo de média de 4 notas
    static void median(){
        Scanner cal1 = new Scanner(System.in);

        System.out.println("1° nota:");
        int n1 = cal1.nextInt();
        System.out.println("2° nota:");
        int n2 = cal1.nextInt();
        System.out.println("3° nota:");
        int n3 = cal1.nextInt();
        System.out.println("4° nota:");
        int n4 = cal1.nextInt();

        double media = (n1 + n2 + n3 + n4)/4;

        System.out.println(media);

        cal1.close();
    }

    //Boas-vindas
    static void boasvindas(){
        System.out.println("Seja bem-vindo(a)!");
    }

    //Calculo de velocidade média
    static void mediav(){
        Scanner cal2 = new Scanner(System.in);

        System.out.println("Entre com o espaço percorrido:");
        int S = cal2.nextInt();
        System.out.println("Entre com o tempo decorrido:");
        int T = cal2.nextInt();

        double V = S/T;

        System.out.println("A velocidade média é: " + V);

        cal2.close();
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Escolha uma opção de 1 a 4:");
        System.out.println("1 - Login");
        System.out.println("2 - Cálculo de média de 4 notas:");
        System.out.println("3 - Boas-vindas:");
        System.out.println("4 - Calculo de velocidade média:");
        int op = obj.nextInt();

        switch(op){
            case 1:
            user();
            break;

            case 2:
            median();
            break;

            case 3:
            boasvindas();
            break;

            case 4:
            mediav();
            break;
        }

        obj.close();
        
        
    }
    
}