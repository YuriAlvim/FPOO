import java.time.*;
//java.time importa a classe de data
//* importa toda a classe e as subclasse

public class CalendarClass {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        int mes = data.getMonthValue();
        int hoje = data.getDayOfMonth();
        data = data.minusDays(hoje - 1);
        //Vai para o inicio do mês
        DayOfWeek weekday = data.getDayOfWeek();
        int valor = weekday.getValue();
        // De 1 a 7, começa na segunda
        System.out.println("Seg Ter Qua Qui Sex Sab Dom");
        for (int i = 1; i<valor; i++) {
            System.out.print("    "); //4 espaços
        }
        
        while(data.getMonthValue() == mes){
            System.out.printf("%3d", data.getDayOfMonth());
            if (data.getDayOfMonth() == hoje){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

            data = data.plusDays(1);
            if (data.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

        if (data.getDayOfWeek().getValue() != 1){
            System.out.println();
        }
        
    }
    
}
