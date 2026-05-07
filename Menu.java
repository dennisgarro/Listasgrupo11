import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Validaciones v = new Validaciones();
        LinkedList<ObjEstudiante> l = new LinkedList<>();
        boolean bandera = true;
        while (bandera) {
            System.out.println("Bienvenidos estudiantes");
            System.out.println("Que accion desea realizar");
            System.out.println("1. ingresar Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Actualizar Estudiante");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Mostrar Estudiantes");
            System.out.println("6. Exportar");
            System.out.println("7. Importar");
            System.out.println("8. Ordenar");
            System.out.println("8. Salir");
            int opt = v.ValidarEntero(sc);
            switch (opt) {
                case 1:
                    l = m.LLenarLista(l, sc, m);
                    break;
                case 2:
                    m.Consultar(l, v, sc);
                    break;
                case 3:
                    l = m.Modificar(l, v, sc);
                    break;
                case 4:
                    l = m.Eliminar(l, v, sc);
                    break;
                case 5:
                    m.MostrarEstudiates(l);
                    break;
                case 6:
                    Exportar i = new Exportar();
                    i.exportarArchivo(l);
                    break;
                case 7:
                    System.out.println("pagina en mantenimiento");
                    break;
                case 8:
                    m.Ordenar(l);
                    break;
                case 8:
                    System.out.println("chao chao");
                    bandera = false;
                    break;
                default:
                    System.out.println("Esta Opción no es valida");
            }
        }
    }
}