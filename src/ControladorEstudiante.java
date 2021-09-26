import java.util.ArrayList;

public class ControladorEstudiante{
    ArrayList <Estudiante> estList;
    CatalogoEstudiante vista;
    Estudiante obj1;
    
    ControladorEstudiante(CatalogoEstudiante vista){
         estList =  new ArrayList<Estudiante>();
         this.vista=vista;
         
    }

    public void addEstudiante(){
        obj1 = new Estudiante(vista.solicitarMatricula(),vista.SolicitarNombreEst(),vista.SolicitarCalificacionEst(), vista.SolicitarEdadEst());
        estList.add(obj1); 
       
        // obj1.pedirDatos();  //pregunta de diseño
      // estList.add(0, new Estudiante());
      // estList.get(0).pedirDatos();
    }

    public ArrayList<Estudiante> obtenerEstudiantes(){
        return estList;
    }

    public Estudiante obtenerEstudiante(Integer matricula){
         Integer indiceEst=buscarEst(matricula);
         if (indiceEst != -1) {
            return estList.get(indiceEst);
           } else {
            return null;
          }
        //for (int i = 0; i < estList.size(); i++) {
          // if (matricula == estList.get(i).getMatricula()) {
           //    return estList.get(i);
          // }
      // }
       //return null; 
    }


    public boolean borrarEstudiante(Integer matricula){ 

        Integer indiceEst=buscarEst(matricula);
        if (indiceEst != -1) {
            estList.remove((int)indiceEst);
            return true;
        } else {
            return false;
        }
       /*  for (int i = 0; i < estList.size(); i++) {
            if (matricula == estList.get(i).getMatricula()) {
                estList.remove(i);
                return true;
            }
        }
        return false; */
}


   private Integer buscarEst(Integer matricula){
    for (int i = 0; i < estList.size(); i++) {
        if (matricula == estList.get(i).getMatricula()) {            
            return i;
        }
    }
    return -1;  ///si no hay estudiante
   }

   public boolean modificarNombreEst(Integer matricula){
        Integer indiceEst=buscarEst(matricula);
        if (indiceEst != -1) {
          //obj1=estList.get(indiceEst);
          vista.imprimirNombreEst(estList.get(indiceEst).getNombre());
          estList.get(indiceEst).setNombre(vista.SolicitarNombreEst());            
           return true;
        } else {
           return false;
        }
   }

   public boolean modificarCalEst(Integer matricula){
    Integer indiceEst=buscarEst(matricula);
    if (indiceEst != -1) {
      //obj1=estList.get(indiceEst);
      vista.imprimirCalifEst(estList.get(indiceEst).getCalificacion());
      estList.get(indiceEst).setCalificacion(vista.SolicitarCalificacionEst());            
       return true;
    } else {
       return false;
    }
}

public boolean modificarEdadEst(Integer matricula){
    Integer indiceEst=buscarEst(matricula);
    if (indiceEst != -1) {
     /// obj1=estList.get(indiceEst);
      vista.imprimirEdadEst(estList.get(indiceEst).getEdad());
      estList.get(indiceEst).setEdad(vista.SolicitarEdadEst());            
       return true;
    } else {
       return false;
    }
}


    public void MenuEstudiante(){

        Integer opcion=0,aux=0;

        while (opcion != 6) {
             switch (vista.Menu()) {
                 case 1:
                     addEstudiante();
                     break;
                 case 2:
                     aux = vista.pedirMatricula();
                     vista.imprimeInfodeBorrado(borrarEstudiante(aux));
                     break;  
                 case 3:
                      MenuModificarEst(); 
                      break;
                 case 4:
                      vista.imprimirInfoTotal(estList); 
                      break;
                 case 5:
                      aux = vista.pedirMatricula();
                      vista.imprimirInfoEst(obtenerEstudiante(aux));
                      break;     
                 case 6:
                     opcion = 6;
                     break;
             }
         }
    }

   private void MenuModificarEst(){
            Integer opcion=0,aux=0;

            while (opcion != 4) {
                 switch (vista.MenuModificarEst()) {
                     case 1:
                         aux = vista.pedirMatricula();
                         vista.imprimeInfodeActualizacion(modificarNombreEst(aux));
                         break;
                     case 2:
                         aux = vista.pedirMatricula(); 
                         vista.imprimeInfodeActualizacion(modificarEdadEst(aux));
                        break;
                     case 3:
                         aux = vista.pedirMatricula(); 
                         vista.imprimeInfodeActualizacion(modificarCalEst(aux));
                         break;    
                     case 4:
                         opcion = 4;
                         break;
                 }
            }
  } 

}
