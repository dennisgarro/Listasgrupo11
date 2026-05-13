import java.util.Scanner;
import java.time.LocalDate;
import java.util.Comparator;
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
            o.setCedula(v.ValidarCedula(sc));
            System.out.println("Ingrese El numero de carnet");
            sc.nextLine();
            String carnet = sc.nextLine();
            while (!v.ValidarTexto(carnet)) {
                System.out.println("No se permiten caracteres especiales");
                carnet = sc.nextLine();
            }
            o.setCarnet(carnet);
            System.out.println("Ingrese El nombre del estudiante");
            String nombre = sc.nextLine();
            while (!v.ValidarTexto(nombre)) {
                System.out.println("No se permiten caracteres especiales");
                nombre = sc.nextLine();
            }
            o.setNombre(nombre);
            o.setFechaIngreso(LocalDate.now());
            l.add(o);
            System.out.println("Desea seguir Ingresando estudiantes Y/N");
            opt = sc.nextLine();
            while (!v.ValidarDimension(opt)) {
                opt = sc.nextLine();
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
            System.out.println("fechaIngreso: " + o.getFechaIngreso());
            System.out.println("------------------------------");
        }
    }

    public LinkedList<ObjEstudiante> Modificar(LinkedList<ObjEstudiante> l, Validaciones v, Scanner sc) {
        System.out.println("Por favor Ingrese la cedula a modificar");
        int cedula = v.ValidarEntero(sc);
        for (ObjEstudiante o : l) {
            if (o.getCedula() == cedula) {
                System.out.println("Ingrese el nombre");
                sc.nextLine();
                String nombre = sc.nextLine();
                while (!v.ValidarTexto(nombre)) {
                    System.out.println("No se permiten caracteres especiales");
                    nombre = sc.nextLine();
                }
                o.setNombre(nombre);
                System.out.println("Ingrese el carnet");
                String carnet = sc.nextLine();
                while (!v.ValidarTexto(carnet)) {
                    System.out.println("No se permiten caracteres especiales");
                    carnet = sc.nextLine();
                }
                o.setCarnet(carnet);
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

    public void Consultar(LinkedList<ObjEstudiante> l, Validaciones v, Scanner sc) {
        System.out.println("Por favor Ingrese la cedula a buscar");
        int cedula = v.ValidarEntero(sc);
        for (ObjEstudiante o : l) {
            if (o.getCedula() == cedula) {
                System.out.println("Nombre: " + o.getNombre());
                System.out.println("Carnet: " + o.getCarnet());
                System.out.println("Cedula: " + o.getCedula());
                System.out.println("------------------------------");
            }
        }
    }

    public void Ordenar(LinkedList<ObjEstudiante> l) {
        // l.sort(Comparator.comparing(ObjEstudiante::getFecha));
    }
}