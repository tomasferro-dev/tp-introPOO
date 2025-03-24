public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public void mostrarInfo(){
        System.out.println("Info estudiante: ");
        System.out.println("Nombre completo: " + this.nombre+" "+this.apellido);
        System.out.println("Curso: " + this.curso);
        System.out.println("Calificacion: " + this.calificacion);
    }

    public void subirCalificacion(double puntos){
        this.calificacion += puntos;
    }

    public void bajarCalificacion(double puntos){
        this.calificacion -= puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
