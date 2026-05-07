import java.sql.Date;
import java.time.LocalDate;

public class ObjEstudiante {
    private String Nombre;
    private String Carnet;
    private int Cedula;
    private LocalDate FechaIngreso;

    public ObjEstudiante() {
    }

    public ObjEstudiante(String nombre, String carnet, int cedula, LocalDate fechaIngreso) {
        Nombre = nombre;
        Carnet = carnet;
        Cedula = cedula;
        FechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

}