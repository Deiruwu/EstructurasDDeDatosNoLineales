import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Arboles arbol = new Arboles();

        int opcion = 0;

        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(2);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(8);

            do {
                try {
                    System.out.println("\n--- Menú ---");
                    System.out.println("1. Insertar un valor");
                    System.out.println("2. Eliminar un valor");
                    System.out.println("3. Imprimir el árbol en orden");
                    System.out.println("4. Salir");
                    System.out.print("Selecciona una opción: ");
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese el valor a insertar: ");
                            int valorInsertar = sc.nextInt();
                            arbol.insertar(valorInsertar);
                            System.out.println("Valor insertado.");
                            break;
                        case 2:
                            System.out.print("Ingrese el valor a eliminar: ");
                            int valorEliminar = sc.nextInt();
                            arbol.eliminar(valorEliminar);
                            break;

                        case 3:
                            System.out.println("Árbol en orden:");
                            arbol.imprimirArbol(arbol.raiz);
                            break;
                        case 4:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción inválida. Inténtalo de nuevo.");
                    }
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.printf("Error: %s\n", e.getMessage());
                }
            } while (opcion != 4);
    }
}
