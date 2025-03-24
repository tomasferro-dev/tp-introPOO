public class NaveEspacial {

    private String nombreDeLaNave;
    private int cantidadCombustible;

    public void despegar() {
        if (this.cantidadCombustible < 10) {
            System.out.println("Imposible despegar con tan poco combustible");
        } else {
            System.out.println("Despegando");
            setCantidadCombustible(this.cantidadCombustible-=10);
            System.out.println("Despegue exitoso");
        }
    }

    public void avanzar(int distancia) {
        if (this.cantidadCombustible < distancia) {
            System.out.println("No vamos a llegar tan lejos...");
        } else {
            System.out.println("Avanzando");
            setCantidadCombustible(this.cantidadCombustible-=distancia);
            System.out.println("Hemos llegado");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 100) {
            System.out.println("El tanque no es tan grande...");
        } else {
            System.out.println("Cargando combustible");
            setCantidadCombustible(this.cantidadCombustible+=cantidad);
            System.out.println("combustible recargado");
        }
    }

    public void mostrarEstado() {
        System.out.println("Informacion de la nave: ");
        System.out.println("Nombre: " + getNombreDeLaNave());
        System.out.println("Combustible: " + getCantidadCombustible());
    }

    public String getNombreDeLaNave() {
        return nombreDeLaNave;
    }

    public void setNombreDeLaNave(String nombreDeLaNave) {
        this.nombreDeLaNave = nombreDeLaNave;
    }

    public int getCantidadCombustible() {
        return cantidadCombustible;
    }

    public void setCantidadCombustible(int cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }
}
