import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ItemBiblioteca> coleccion = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Mostrar catálogo");
            System.out.println("2. Añadir nuevo item");
            System.out.println("3. Modificar título");
            System.out.println("4. Prestar item");
            System.out.println("5. Devolver item");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } else {
                System.out.println("Error: Debes ingresar un número.");
                sc.next();
            }
        } while (!salir);
        sc.close();
    }
}
