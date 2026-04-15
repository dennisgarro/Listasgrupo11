public class ObjEstudiante {
    private String Nombre;
    private String Carnet;
    private int Cedula;

    public ObjEstudiante() {
    }

    public ObjEstudiante(String Carnet, int Cedula, String Nombre) {
        this.Carnet = Carnet;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
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

}