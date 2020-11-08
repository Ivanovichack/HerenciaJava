//20 de octubre del 2020
package Herencia;

/**
 *
 * @author FASARLJP
 */
public class Alumno extends Persona {
    private String  matricula;
    private float beca;
    private String carrera;

    public Alumno(String nombre, int edad,String matricula, float beca, String carrera) {
        super(nombre, edad);
        this.matricula=matricula;
        this.beca = beca;
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getBeca() {
        return beca;
    }

    public void setBeca(float beca) {
        this.beca = beca;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
}
