
package crud_practica;

/**
 *
 * @author HUAWEI
 */
public class Persona {
    
    
       
    private int id;
    private String nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private String direccion;
    private String Colonia;
    private int edad;
    //appat
    //apmat
    //dir
    //colonia

    public void setApellido_Paterno(String Apellido_Paterno) {
        this.Apellido_Paterno = Apellido_Paterno;
    }

    public void setApellido_Materno(String Apellido_Materno) {
        this.Apellido_Materno = Apellido_Materno;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getColonia() {
        return Colonia;
    }
    
    //constructor
    public Persona(){
    }
    
    //este construtor posee sobrecarga
    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    
    
}
