
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            System.out.println("Bienvenidos estudiantes");
            System.out.println("Que accion desea realizar");
            System.out.println("1. ingresar Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Actualizar Estudiante");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Mostrar Estudiantes");
            System.out.println("6. Exportar ");
            System.out.println("7. Importar");
            System.out.println("8. Salir");
            int opt = sc.nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("pagina en mantenimiento");
                }
                case 2 -> {
                    System.out.println("pagina en mantenimiento");
                }
                case 3 -> {
                    System.out.println("pagina en mantenimiento");
                }
                case 4 -> {
                    System.out.println("pagina en mantenimiento");
                }
                case 5 -> {
                    System.out.println("pagina en mantenimiento");
                }
                case 6 -> {
                    System.out.println("pagina en mantenimiento");
                }
                case 7 -> {
                    System.out.println("pagina en mantenimiento");
                }
                case 8 -> {
                    System.out.println("chao chao");
                    bandera = false;
                }
                default -> System.out.println("Esta Opción no es valida");
            }

        }
    }
}
