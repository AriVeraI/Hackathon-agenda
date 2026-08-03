public class Main {
    public static void main(String[] args) {
        //Agenda de prueba
        ContactoService agendaPrueba = new ContactoService(2);
        Contacto c1 = new Contacto("Mariana", 55123458, Tipo.PERSONAL);
        Contacto c2 = new Contacto("Dante", 55345670, Tipo.EMPRESA);

        // Prueba 1 si esta llena al crearse, debe dar "false"
        System.out.println("Prueba 1");
        agendaPrueba.agendaLlena();
        agendaPrueba.getContactos().add(c1); //agregar manialmente los dos contactos suponiendo que hay un getter o un método para añadirlos
        agendaPrueba.getContactos().add(c2);
        // Prueba 2, si es que esta llena
        System.out.println("\n Prueba 2");
        agendaPrueba.agendaLlena();


    }
}
