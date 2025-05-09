package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Administrador administrador = new Administrador(21402483, "Cecilia Molina", "ceci@gmail.com");
        while (true) {
            System.out.println("::::::::bienvenido a la biblioteca Nevermore::::::::");
            System.out.println("para realizar registros escoja alguna de las siguientes opciones:");
            System.out.println("""
                    1.Registro de clientes
                    2.Registro de libros
                    3.Registro de prestamos
                    4.Salir (opcion 1)
                    5.salir (opcion 2)
                    """);
            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1: {
                    ArrayList<Cliente> clientes = new ArrayList<>();
                    while (true) {
                        System.out.println("::::::::Registrar cliente::::::::");
                        System.out.println("ingrese el id del cliente:");
                        int id = entrada.nextInt();
                        System.out.println("ingrese el nombre del cliente:");
                        String nombre = entrada.next();
                        System.out.println("ingrese el correo electronico del cliente");
                        String correo = entrada.next();
                        clientes.add(new Cliente(id, nombre, correo));

                        System.out.println("¿quiere registrar mas clientes?");
                        char respuesta = entrada.next().toLowerCase().charAt(0);
                        entrada.nextLine(); // Limpia el buffer primero
                        if (respuesta != 's') {
                            break;
                        }
                    }
                    administrador.registrarCliente(clientes);
                    break;
                }
                case 2: {
                    ArrayList<Libro> libros = new ArrayList<>();
                    while (true) {
                        System.out.println("::::::::Registrar libro::::::::");

                        System.out.println("ingrese el titulo del libro:");
                        String titulo = entrada.next();

                        System.out.println("ingrese el autor del libro:");
                        String autor = entrada.next();

                        System.out.println("ingrese el isbn del libro:");
                        String isbn = entrada.next();

                        System.out.println("¿se encuentra disponible? (true/false:");
                        boolean disponible = entrada.nextBoolean();
                        libros.add(new Libro(titulo, autor, isbn, disponible));

                        System.out.println("¿quiere registrar mas libros?");
                        entrada.nextLine();
                        char respuesta = entrada.next().toLowerCase().charAt(0);
                        if (respuesta != 's') {
                            break;
                        }
                    }
                    administrador.registrarLibro(libros);
                    break;
                }

                case 3: {
                    Cliente cliente1=new Cliente(1051634330, "santiago", "mling@gmail.com");
                    Libro libro1=new Libro("asdfghj", "La odisea", "Homero", true);
                    LocalDate fechaInicio=LocalDate.now();
                    LocalDate fechaDevolucion=fechaInicio.plusDays(7);
                    boolean estado=true;
                    Prestamo prestamo=new Prestamo(fechaInicio, fechaDevolucion,estado,libro1, cliente1);
                    administrador.realizarPrestamo(prestamo);
                }

                case 4: {
                    System.out.println("gracias por venir a nevermore, hasta pronto");
                    break;
                }
                case 5: {
                        System.out.println("https://www.youtube.com/watch?v=Xj2EFyLq92c");
                        break;
                    }
                }
            }
        }
    }


