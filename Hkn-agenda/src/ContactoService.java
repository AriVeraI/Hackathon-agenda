import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ContactoService {
    private List<Contacto> contactos;
    public int limiteAgenda = 20;

    public ContactoService() {
        this.contactos = new ArrayList<>();
    }

    //metodo añadir contacto
    public boolean agregarContacto(Contacto c) {
        if (agendaLlena()) {
            return false;
        }

        if (c == null) {
            return false;
        } else {
            // validación de campos
            String nomVal = c.getNombre();
            String numVal = String.valueOf(c.getNumero());
            Tipo tipoVal = c.getTipo();

            if (!nomVal.isEmpty() && nomVal.length() < 25) {
                if (numVal.length() == 10) {
                    if (tipoVal != null) {
                        this.contactos.add(c);
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }


    public Optional<Contacto> existeContactoPorTelefono(Integer numero){
        if (numero == null) return Optional.empty();

        return this.contactos.stream()
                .filter(contacto -> Objects.equals(contacto.getNumero(), numero))
                .findFirst();
    }

    public Optional<Contacto> existeContactoPorNombre(String nombre){
        if (nombre == null) return Optional.empty();

        return this.contactos.stream()
                .filter(contacto -> contacto.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }

    public void listarContactos() {
        if(contactos.isEmpty()){
            System.out.println("Aún no tienes contactos");
        }else {
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }

    public static ArrayList<Contacto> buscarContactosPorNombre(ArrayList<Contacto> listaContactos, String textoBuscado) {
        ArrayList<Contacto> encontrados = new ArrayList<>();

        for (Contacto c : listaContactos) {
            if (c.getNombre().toLowerCase().contains(textoBuscado.toLowerCase())) {
                encontrados.add(c);
            }
        }
        return encontrados;
    }

    public static void imprimirResultadosBusqueda(ArrayList<Contacto> resultados) {
        if (resultados.isEmpty()) {
            System.out.println("No se encontraron contactos coincidentes.");
        } else {
            System.out.println("Contactos encontrados: " + resultados.size());
            for (Contacto c : resultados) {
                System.out.println("Nombre: " + c.getNombre() + " | Teléfono: " + c.getNumero() + " (" + c.getTipo() + ")");
            }
        }
    }

    // OJO IMPORTANTE NO TOCAR, GRACIAS :)
    // Metodos de eliminacion creados by el Deivid ;)
    // Si tienes dudas prguntame POR FAVOR!!!

    public boolean eliminarContactoPorNombre(String nombre) {
        Optional<Contacto> contactoEncontrado = existeContactoPorNombre(nombre);

        if (contactoEncontrado.isPresent()) {
            contactos.remove(contactoEncontrado.get());
            return true; // Se eliminó con éxito
        }
        return false; // No se encontró el contacto
    }

    public boolean eliminarContactoPorTelefono(Integer numero) {
        Optional<Contacto> contactoEncontrado = existeContactoPorTelefono(numero);

        if (contactoEncontrado.isPresent()) {
            contactos.remove(contactoEncontrado.get());
            return true; // Se eliminó con éxito
        }
        return false; // No se encontró el contacto
    }

    /**
     * Método agendaLlena: Verifica si la agenda alcanzó su capacidad máxima e informa al usuario.
     */
    public boolean agendaLlena() {
        if (this.contactos.size() >= this.limiteAgenda) {
            System.out.println("⚠️ La agenda está llena (" + this.contactos.size() + "/" + this.limiteAgenda + "). No hay espacio para nuevos contactos.");
            return true;
        } else {
            System.out.println("ℹ️ La agenda aún tiene espacio disponible (" + this.contactos.size() + "/" + this.limiteAgenda + ").");
            return false;
        }
    }
}