import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("SpringBoot", "Curso de SpringBoot", 70);
        Mentoria mentoria1 = new Mentoria("Mentoria Pancante", "Mentoria da boa", LocalDate.now());

        System.out.println(curso1.toString());
        System.out.println(mentoria1.toString());

    }
}