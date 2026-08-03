import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ContactoService {
    private List<Contacto> contactos;
    // Capacidad máxima de la agenfa
    private int limiteMaximo;

//    public ContactoService(List<Contacto> contactos) {
    public ContactoService(int limiteMaximo) {
        this.contactos = new ArrayList<>();
        // Constructor con tamaño personalizado:
        this.limiteMaximo = limiteMaximo;
    }
    // Constructor con capacidad de 10 contactos)
    public ContactoService () {
        this (10);
    }

    //Métodos:


    //6. agendaLlena(), regresa "true" si la agenda está llena, y "false" en caso contrario
    public boolean agendaLlena () {
        // contactos.size() nos va a dar el número de los contactos existentes
        if (this.contactos.size() >= this.limiteMaximo) {
            System.out.println("La agenda está llena. No hay más espacio disponible para nuevos contactos. Lo lamento mucho :/");
            return true;
        } else {
            System.out.println("La agenda aún tiene espacio disponible, puedes continuar agregando amigos C:");
            return false;
        }
    }
    // Método extra para probar
    public List<Contacto> getContactos() {
        return contactos;
    }
}

