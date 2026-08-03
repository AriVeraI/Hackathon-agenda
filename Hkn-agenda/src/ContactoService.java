import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ContactoService {
    private List<Contacto> contactos;

    public ContactoService() {
        this.contactos = new ArrayList<>();
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
}
