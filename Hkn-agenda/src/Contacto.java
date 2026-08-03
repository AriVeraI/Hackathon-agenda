public class Contacto {
    private String nombre;
    private Integer numero;
    private Tipo tipo;
    //constructor

    public Contacto(String nombre, Integer numero, Tipo tipo) {
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
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
