import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        crearMatrizCartas();
        agregarCartas(matrizCartas, "A", "11");
        menu();
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            imprimir();

            int opcion = scanner.nextInt();

            if (opcion == 1){
                System.out.println("Seleccionó la opción 1");
                break;
            } else if (opcion == 2){
                System.out.println("Seleccionó la opción 2");
                break;
            } else if (opcion == 3){
                System.out.println("Saliendo del programa");
                scanner.close();
                break;
            } else {
                System.out.println("La opción ingresada no es valida");
            }
        }
    }
    public static void imprimir(){
        System.out.println("---Menú---");
        System.out.println("1.- Opción 1");
        System.out.println("2.- Opción 2");
        System.out.println("3.- Salir");
        System.out.println("Seleccione una opción");
    }
    public static String [][] crearMatrizCartas(){
        String [][] matrizCartas = new String [12][2];
    return matrizCartas;}
    public static void agregarCartas(String[][] matriz, String nombreCarta, String puntaje){
        for (int columna = 0; columna < 12; columna++){
            matriz[0][columna] = nombreCarta;
            matriz[1][columna] = puntaje;
        }
    }
}
