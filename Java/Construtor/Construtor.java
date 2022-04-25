package Construtor;
public class Construtor {
    private String nome;
    int x, y, z;

    Construtor() {
        System.out.println("Construtor chamado:");
        nome = "Programa Java";
        x = 5;
        y = 6;
        z = x + y;

    }
    public static void main(String[] args) {
        Construtor obj = new Construtor();
        System.out.println("Qual construtor foi chamado? " + obj.nome);
        System.out.println(obj.z);
        
    }
}
