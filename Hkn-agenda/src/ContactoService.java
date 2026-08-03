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

        if (existeContactoPorTelefono()) {
            return false;
            //opcional
        }

        //validación de que contacto no es vacío
        if (c == null) {
            return false;
        } else {
            // validación de campos
            String nomVal = c.getNombre();
            String numVal = c.getNumero();
            Tipo tipoVal = c.getTipo();

            if (!nomVal.isEmpty() && nomVal.length() < 25) { //la longitud del nombre, debe ser menor a 25
                if (numVal.length() == 10) { // es un numero de exactamente 10 dígitos
                    if (tipoVal != null) {
                        this.contactos.add(c);
                        return true;
                    } else {
                        return false;
                        // System.out.println("Ese tipo de contacto no está definido");
                    }
                } else {
                    return false;
                    //System.out.println("Verifica el número/número inválido");
                }
            } else {
                return false;
                //System.out.println("Verifica el nombre");
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

    //Listar contactos
    //usando for each
    public void listarContactos() {
        if(contactos.isEmpty()){
            System.out.println("Aún no tienes contactos");
        }else {
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }

}