public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        while (true) {
            if (anioPublicacion <= 1900) {
                System.out.println("Año invalido, debe ser mayor a 1900");
            } else {
                this.anioPublicacion = anioPublicacion;
                break;
            }
        }

    }
}
