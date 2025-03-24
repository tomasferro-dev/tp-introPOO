public class Main {
    public static void main(String[] args) {
        Estudiante tomas = new Estudiante();

        tomas.setNombre("Tomas");
        tomas.setApellido("Ferro");
        tomas.setCurso("Prog II");
        tomas.setCalificacion(10.0);

        tomas.mostrarInfo();
        tomas.bajarCalificacion(2);
        tomas.mostrarInfo();
        tomas.subirCalificacion(1);
        tomas.mostrarInfo();

    }
}