public class Cons2 {
    String idioma;

    Cons2 (String falado){
        idioma = falado;
        System.out.println(idioma + "é falado no mundo ");
    }
    public static void main(String[] args) {
        Cons2 obj1 = new Cons2("Alemão ");
        Cons2 obj2 = new Cons2("Inglês ");
        Cons2 obj3 = new Cons2("Português ");

        System.out.println(obj1.idioma);
        System.out.println(obj2.idioma);
        System.out.println(obj3.idioma);
        
    }
}
