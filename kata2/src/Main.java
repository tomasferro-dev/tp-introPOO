//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mascota mascota = new Mascota();

        mascota.setNombre("Lara");
        mascota.setEspecie("Perro");
        mascota.setEdad(3);

        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.mostrarInfo();
    }
}