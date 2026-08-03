public class Contacto {
    private String nombre;
    private String numero;
    private Tipo tipo;
    //constructor

    public Contacto(String nombre, String numero, Tipo tipo) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
    }

    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", tipo=" + tipo +
                '}';
    }

}
