import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        menu();
    }
    public static void menu(){
        String [][] matrizCartas = crearMatrizCartas();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            imprimir();

            int opcion = scanner.nextInt();

            if (opcion == 1){
                System.out.println("Seleccionó inicializar el juego");
                inicializarCartasJuego(matrizCartas);
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
        System.out.println("1.- Inicializar el juego");
        System.out.println("2.- Opción 2");
        System.out.println("3.- Salir");
        System.out.println("Seleccione una opción");
    }
    public static String [][] crearMatrizCartas(){
        String [][] matrizCartas = new String [12][2];
    return matrizCartas;}
    public static void agregarCartas(String[][] matriz, String nombreCarta, String puntaje) {
        int numCartas = contarCartas(matriz);

        if (numCartas < matriz.length) {
            matriz[numCartas][0] = nombreCarta;
            matriz[numCartas][1] = puntaje;
        } else {
            System.out.println("La matriz de cartas está llena, no se pueden agregar más cartas.");
        }
    }
    public static int contarCartas(String[][] matriz) {
        int contador = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            if (matriz[fila][0] != null) {
                contador++;
            }
        }
        return contador;
    }
    public static void inicializarCartasJuego(String[][] matriz){
        String[] nombresCartas = {"A","2","3","4","5","6","7","8","9","10","Q","J","K"};
        String[] valoresCartas = {"11","2","3","4","5","6","7","8","9","10","10","10","10"};

        for (int i = 0; i < matriz.length; i++){
            matriz[i][0] = nombresCartas[i];
            matriz[i][1] = valoresCartas[i];
        }
    }
    public static String [][] obtenerCartas() {
        String[][] matriz = crearMatrizCartas();
        inicializarCartasJuego(matriz);
        String[] jugador1 = {};
        String[] jugador2 = {};
    return matriz;}
}
