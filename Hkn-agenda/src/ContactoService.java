import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ContactoService {
    private List<Contacto> contactos;
    public int limiteAgenda = 20;
    public ContactoService(List<Contacto> contactos) {
        this.contactos = new ArrayList<>();
    }


    //metodo añadir contacto
    public boolean agregarContacto(Contacto c ){
        if(agendaLlena()){
            return false;
        }
        if(existeContactoPorTelefono()){
            return false;
            //opcional
        }
        //validación de que contacto no es vacío
        if(c == null){
            return false;
        }else{
            // validación de campos
            String nomVal = c.getNombre();
            String numVal = c.getNumero();
            Tipo tipoVal = c.getTipo();

            if(!nomVal.isEmpty() && nomVal.length() < 25){ //la longitud del nombre, debe ser menor a 25
                if(numVal.length() == 10 ){ // es un numero de exactamente 10 dígitos
                    if(tipoVal != null){
                        this.contactos.add(c);
                    }else{
                        return false;
                        // System.out.println("Ese tipo de contacto no está definido");
                    }
                }else{
                    return false;
                    //System.out.println("Verifica el número/número inválido");
                }
            }else{
                return false;
                //System.out.println("Verifica el nombre");
            }


        }
    }



}
