public class Gallina {
    private int idGallina;
    private int edad;
    private int cantidadHuevosPuestos;

    public void ponerHuevo() {
        setCantidadHuevosPuestos(this.cantidadHuevosPuestos+=1);
    }

    public void envejecer () {
        setEdad(this.edad+=1);
    }

    public void mostrarEstado () {
        System.out.println("Info:");
        System.out.println("ID: " + getIdGallina());
        System.out.println("Edad: " + getEdad());
        System.out.println("Cantidad Huevos: " + getCantidadHuevosPuestos());
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadHuevosPuestos() {
        return cantidadHuevosPuestos;
    }

    public void setCantidadHuevosPuestos(int cantidadHuevosPuestos) {
        this.cantidadHuevosPuestos = cantidadHuevosPuestos;
    }
}
