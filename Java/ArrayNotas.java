import java.util.Scanner;

public class ArrayNotas {
    public static void main(String[] args) {
        
        try (Scanner obj = new Scanner(System.in)) {
            //Entra com a quantidade de notas
            System.out.println("Entre a quantidade de notas: ");
            int qua = obj.nextInt();
            double[] notas = new double[qua];
            

            //Entra com as notas em si
            int i = 0;
            System.out.println("Entre com as notas");
            for (i = 0; i < notas.length; i++){
                notas[i] = obj.nextInt();
            }

            //Calcula a média
            int j = 0;
            double media = 0;
            for (j = 0; j < notas.length; j++){
                media = media + notas[j];
            }
            media = media/qua;

            //Mostra a média
            System.out.println("A sua média é: " + media);

            obj.close();
        }
    }
    

}

