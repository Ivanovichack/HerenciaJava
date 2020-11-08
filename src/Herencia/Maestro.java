//20 de 0ctubre del 2020
package Herencia;

/**
 *
 * @author FASARLJP
 */
public class Maestro extends Persona {
    private String id;
    private float salario;
    private String categoria;

    public Maestro(String id,  String nombre, int edad,float salario, String categoria) {
        super(nombre, edad);
        this.id = id;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
