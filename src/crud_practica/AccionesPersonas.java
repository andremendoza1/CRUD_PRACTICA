
package crud_practica;

import java.util.ArrayList;

/**
 *
 * @author HUAWEI
 */
public class AccionesPersonas {
    
     //sirven principalmente para realizar un CRUD
    
    /*
    vamos a necesitar un objeto capaz de ser dinamico
    para poder almacenar diferentes tipos de variables
    que pertenecen al objeto de persona
    
    ArrayList
    */
    public ArrayList<Persona> listaPersonas = 
            new ArrayList<Persona>();
    
    //los metodos del crud
    
    //listar a las personas
    public ArrayList<Persona> mostrarPersonas(){
        return listaPersonas;
    }
    
    //metodo para agregar persona
    public void agregarPersona(Persona p){
        listaPersonas.add(p);
    }
    
    //como voy a buscar a una persona
    public Persona buscarPersona(int id){
        //necesito mi instancia de persona
        Persona encontrada = new Persona();
        for(Persona p : listaPersonas){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("Persona no encontrada");
            }
        }
        return encontrada;
    }
    
        public Persona buscarpukamon(String nombre){
        //necesito mi instancia de persona
        Persona encontradaN = new Persona();
        for(Persona p : listaPersonas){
            if(nombre == null ? p.getNombre() == null : nombre.equals(p.getNombre())){
                encontradaN = p;
            }else{
                System.out.println("Persona no encontrada");
            }
        }
        return encontradaN;
    }
        
                public Persona buscarpukamonA(String Apellido_Paterno){
        //necesito mi instancia de persona
        Persona encontradaN = new Persona();
        for(Persona p : listaPersonas){
            if(Apellido_Paterno == null ? p.getApellido_Paterno() == null : Apellido_Paterno.equals(p.getApellido_Paterno())){
                encontradaN = p;
            }else{
                System.out.println("Persona no encontrada");
            }
        }
        return encontradaN;
    }
    
    //actualizar a la persona
    public void actualizarPersona(Persona actualizada){
        //primero debo de buscarla
        Persona actualizar = buscarPersona(actualizada.getId());
        //primero borro lo que existe
        listaPersonas.remove(actualizar);
        //agrego lo nuevo
        listaPersonas.add(actualizar);
    }

        
    
    //ahi hacen los metodos de busqueda por nombre y appat
    public void eliminarPersona(Persona eliminar){
    listaPersonas.remove(eliminar);
    
    }
    
    
    
    
    
    
}
