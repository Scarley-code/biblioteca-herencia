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
                        if (coleccion.isEmpty()) {
                            System.out.println("No hay items.");
                        } else {
                            for (ItemBiblioteca item : coleccion) {
                                System.out.println(item);
                            }
                        }
                        break;

                    case 2:
                        sc.nextLine();
                        System.out.println("Tipo (1-Libro, 2-Revista, 3-DVD): ");
                        int tipo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("ID: ");
                        String id = sc.nextLine();

                        System.out.print("Título: ");
                        String titulo = sc.nextLine();

                        switch (tipo) {
                            case 1:
                                System.out.print("Autor: ");
                                String autor = sc.nextLine();
                                coleccion.add(new Libro(id, titulo, false, autor));
                                break;

                            case 2:
                                System.out.print("Número de edición: ");
                                int edicion = sc.nextInt();
                                coleccion.add(new Revista(id, titulo, false, edicion));
                                break;

                            case 3:
                                sc.nextLine();
                                System.out.print("Director: ");
                                String director = sc.nextLine();
                                coleccion.add(new DVD(id, titulo, false, director));
                                break;
                        }
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.print("Introduce ID: ");
                        String idBuscar = sc.nextLine();

                        for (ItemBiblioteca item : coleccion) {
                            if (item.getId().equals(idBuscar)) {
                                System.out.print("Nuevo título: ");
                                String nuevoTitulo = sc.nextLine();
                                item.setTitulo(nuevoTitulo);
                                System.out.println("Título actualizado.");
                                break;
                            }
                        }
                        break;

                    case 4:
                        sc.nextLine();
                        System.out.print("ID: ");
                        String idPrestar = sc.nextLine();

                        for (ItemBiblioteca item : coleccion) {
                            if (item.getId().equals(idPrestar)) {
                                if (!item.isEstadoPrestado()) {
                                    item.prestar();
                                    System.out.println("Prestado. Días máximos: " + item.getDiasMaximosPrestamo());
                                } else {
                                    System.out.println("Ya está prestado.");
                                }
                            }
                        }
                        break;

                    case 5:
                        sc.nextLine();
                        System.out.print("ID: ");
                        String idDev = sc.nextLine();

                        for (ItemBiblioteca item : coleccion) {
                            if (item.getId().equals(idDev)) {
                                if (item.isEstadoPrestado()) {
                                    item.devolver();

                                    System.out.print("Días de retraso: ");
                                    int dias = sc.nextInt();

                                    if (dias > 0) {
                                        double multa = item.calcularMulta(dias);
                                        System.out.println("Multa: " + multa + "€");
                                    } else {
                                        System.out.println("Sin multa.");
                                    }
                                } else {
                                    System.out.println("No estaba prestado.");
                                }
                            }
                        }
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