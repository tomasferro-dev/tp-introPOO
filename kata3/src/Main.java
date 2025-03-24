public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();

        libro.setAutor("Edgar Allan Poe");
        libro.setTitulo("El cuervo");
        libro.setAnioPublicacion(2010);

        System.out.println("informacion del libro: " + libro.getTitulo() + " " +libro.getAutor() + " " + libro.getAnioPublicacion());

    }
}