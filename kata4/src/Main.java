import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gallina gallina = new Gallina();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un ID para la gallina");
        gallina.setIdGallina(Integer.parseInt(sc.next()));

        System.out.println("Ingrese la edad de la gallina " + gallina.getIdGallina());
        gallina.setEdad(Integer.parseInt(sc.next()));

        System.out.println("Ingrese la cantidad de huevos que ha puesto: ");
        gallina.setCantidadHuevosPuestos(Integer.parseInt(sc.next()));

        System.out.println("A continuacion se muestra la info de la gallina recien creada: ");
        gallina.mostrarEstado();

        System.out.println("Al cabo de un año, la info avanzo de la siguiente manera");
        gallina.envejecer();
        gallina.ponerHuevo();
        gallina.ponerHuevo();
        gallina.ponerHuevo();
        gallina.ponerHuevo();
        gallina.ponerHuevo();
        gallina.ponerHuevo();
        gallina.ponerHuevo();
        gallina.mostrarEstado();
    }

}