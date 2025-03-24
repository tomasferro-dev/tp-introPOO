import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NaveEspacial nave = new NaveEspacial();
        nave.setCantidadCombustible(20);
        System.out.println("Bienvenido a la nave, Capitan");
        System.out.println("Elija un nombre para la nave");
        nave.setNombreDeLaNave(sc.next());
        System.out.println("Perfecto, Capitan. Le informo que no tenemos mucho combustible. Vayamos a la estacion mas cercana");
        System.out.println("Corecto. Despeguemos");
        nave.despegar();
        System.out.println("Quiere ir a la YPF? esta a 6 unidades astronomicas de distancia pero solo tiene 30 galones");
        System.out.println("O quiere ir a la Shell? Tiene combustible de sobra pero esta a 25 UA");
        System.out.println("Iremos a la YPF");
        nave.avanzar(6);
        System.out.println("Excelente decision. Carguemos infinia que esta de oferta");
        nave.recargarCombustible(80);
        System.out.println("Excelente");
        System.out.println("Informante, informe el estado de la nave");
        nave.mostrarEstado();


    }
}