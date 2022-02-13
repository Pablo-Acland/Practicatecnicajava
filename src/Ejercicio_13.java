import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio_13 {
    public static void main(String[] args) {
        DateTimeFormatter fh = DateTimeFormatter.ofPattern("(YYYY/MM/dd) (HH:mm:ss)");
        System.out.println(" La fecha y hora es "+ fh.format(LocalDateTime.now()));
    }
}
