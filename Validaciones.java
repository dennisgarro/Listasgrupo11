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

    public boolean ValidarTexto(String texto){
        return texto.matches("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ ]+");
    }
}
