import java.util.Scanner;
import java.util.LinkedList;

public class Metodos {
    public LinkedList<ObjEstudiante> LLenarLista(LinkedList<ObjEstudiante> l, Scanner sc, Metodos m) {
        boolean pedir = true;
        Validaciones v = new Validaciones();
        String opt = "";
        while (pedir) {
            ObjEstudiante o = new ObjEstudiante();
            System.out.println("Por favor Ingrese la cedula");
            o.setCedula(v.ValidarEntero(sc));
            System.out.println("Ingrese El numero de carnet");
            o.setCarnet(sc.next());
            System.out.println("Ingrese El nombre del estudiante");
            o.setNombre(sc.next());
            l.add(o);
            System.out.println("Desea seguir Ingresando estudiantes Y/N");
            opt = sc.next();
            while (!v.ValidarDimension(opt)) {
                sc.nextLine();
            }
            if (opt.equalsIgnoreCase("N")) {
                pedir = false;
            }
        }

        return l;
    }

    public void MostrarEstudiates(LinkedList<ObjEstudiante> l) {
        for (ObjEstudiante o : l) {
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Carnet: " + o.getCarnet());
            System.out.println("Cedula: " + o.getCedula());
            System.out.println("------------------------------");
        }
    }

    public LinkedList<ObjEstudiante> Modificar(LinkedList<ObjEstudiante> l, Validaciones v, Scanner sc) {
        int cedula = 0;
        System.out.println("Por favor Ingrese la cedula a modificar");
        cedula = v.ValidarEntero(sc);
        for (ObjEstudiante o : l) {
            if (o.getCedula() == cedula) {
                System.out.println("Ingrese el nombre");
                o.setNombre(sc.next());
                System.out.println("Ingrese el carnet");
                o.setCarnet(sc.next());
            }
        }
        return l;
    }

    public LinkedList<ObjEstudiante> Eliminar(LinkedList<ObjEstudiante> l, Validaciones v, Scanner sc) {
        System.out.println("Por favor Ingrese la cedula a eliminar");
        int cedula = v.ValidarEntero(sc);
        l.removeIf(x -> x.getCedula() == cedula);
        return l;
    }

    public LinkedList<ObjEstudiante> Consultar(LinkedList<ObjEstudiante> l, Validaciones v, Scanner sc) {
        int cedula = 0;
        System.out.println("Por favor Ingrese la cedula a buscar");
        cedula = v.ValidarEntero(sc);
        for (ObjEstudiante o : l) {
            if (o.getCedula() == cedula) {
                System.out.println("Nombre: " + o.getNombre());
                System.out.println("Carnet: " + o.getCarnet());
                System.out.println("Cedula: " + o.getCedula());
                System.out.println("------------------------------");
            }
        }
        return l;
    }
}
