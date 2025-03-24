public class Mascota {

    private String nombre;
    private String especie;
    private int edad;

    public void mostrarInfo(){
        System.out.println("Info del animal: "+ this.nombre + " " + this.especie + " " + this.edad);

    }

    public void cumplirAnios() {
        this.edad++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
