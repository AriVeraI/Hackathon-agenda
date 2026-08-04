import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactoService servicio = new ContactoService();
        int opcion = 0;
        String nombre;
        String numero;
        Tipo tipo;

        // OJO, IMPORTANTE, By el Deivid
        // Ya cree una pequeña lista pueden editarla de ser necesario :)

        do {
            System.out.println("\n--- MENÚ AGENDA ---");
            System.out.println("1. Listar contactos");
            System.out.println("2. Buscar contacto por nombre");
            System.out.println("3. Eliminar contacto por nombre");
            System.out.println("4. Verificar si la agenda está llena");
            System.out.println("5. Agregar un nuevo contacto");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        servicio.listarContactos();
                        break;

                    case 2:
                        System.out.print("Escribe el nombre a buscar: ");
                        String busqueda = scanner.nextLine();
                        var resultados = ContactoService.buscarContactosPorNombre(
                                // OJO a lo siguiente by el Deivid ;)
                                // Nota: Si usaremos una lista publica o gether favor de ponerla AQUI, pásala aquí.
                                // O bien, pueden usar servicio.existeContactoPorNombre(busqueda)
                                null, busqueda
                        );
                        ContactoService.imprimirResultadosBusqueda(resultados);
                        break;

                    case 3:
                        System.out.print("Escribe el nombre del contacto que deseas eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        boolean eliminado = servicio.eliminarContactoPorNombre(nombreEliminar);

                        if (eliminado) {
                            System.out.println("¡Contacto eliminado con éxito!");
                        } else {
                            System.out.println("No se encontró ningún contacto con ese nombre.");
                        }
                        break;

                    case 4:
                        servicio.agendaLlena();
                        break;

                    case 5:
                        System.out.println("Introduce los datos de tu nuevo contacto");
                        System.out.println("Nombre: ");
                        nombre = scanner.nextLine();
                        System.out.println("Numero: ");
                        numero = scanner.nextLine();
                        System.out.println("Tipo (PERSONAL/EMPRESA): ");
                        tipo = Tipo.valueOf(scanner.nextLine());
                        Contacto c = new Contacto();
                        c.setNombre(nombre);
                        c.setNumero(numero);
                        c.setTipo(tipo);
                        servicio.agregarContacto(c);

                        break;

                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next();
            }

        } while (opcion != 6);



        scanner.close();
    }
    //ContactoService agenda = new ContactoService();

//        agenda.agregarContacto(new Contacto("Juan", 123, Tipo.PERSONAL));
//        agenda.agregarContacto(new Contacto("Maria", 456, Tipo.EMPRESA));

//        agenda.mostrarEspaciosLibres();
//
//    }
}