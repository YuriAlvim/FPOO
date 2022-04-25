package Construtor;
public class Cons3 {
    int a;
    boolean b;

    private Cons3() {
        a = 0;
        b = false;
    }
        
    public static void main(String[] args) {
        Cons3 obj = new Cons3();
        
        System.out.println("Valores Padrão:");
        System.out.println("a = " + obj.b);
        System.out.println("b = " + obj.a);
        
    }
}

