import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Validaciones {
    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor Ingrese un digito Numérico");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public boolean ValidarDimension(String opt) {
        while (opt.length() > 1) {
            System.out.println("Solo puede agregar Y or N");
            return false;

        }
        return true;

    }

    public boolean ValidarTexto(String texto) {
        return texto.matches("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ ]+");
    }

    public boolean esFechaValida(String fecha, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        try {
            // Parse estricto: no permite fechas como 31/02/2023
            LocalDate.parse(fecha, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public int ValidarCedula(Scanner sc) {
        Validaciones v = new Validaciones();
        int cedulaE = ValidarEntero(sc);
        String cedulaAux = cedulaE + "";
        cedulaAux = cedulaAux.trim();
        while (cedulaAux.length() < 7 || cedulaAux.length() > 11) {
            System.out.println("error ingrese de 7 a 10 digitos");
            sc.next();
            cedulaAux = sc.next();
        }
        try {
            cedulaE = Integer.parseInt(cedulaAux);
        } catch (Exception e) {
            System.out.println("ingrese una cedula valida");
        }
        return cedulaE;
    }
}
