
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoEstudiante{
    private  Scanner lectura;
    
    public Integer Menu(){

        lectura= new Scanner(System.in);
 
        System.out.println("Menú");
        System.out.println("1-Agregar estudiante");
        System.out.println("2-Borrar estudiante");
        System.out.println("3-Modificar estudiante");
        System.out.println("4-Desplegar Lista");
        System.out.println("5-Desplegar un Estudiante");
        System.out.println("6-Salir");
        System.out.print("Opción :");
        return lectura.nextInt();
     }
 
     public Integer pedirMatricula(){
         
         lectura = new Scanner(System.in);
         System.out.println("Matricula del estudiante ");
         return lectura.nextInt();
 
     }

     public Integer MenuModificarEst(){

        lectura= new Scanner(System.in);
 
        System.out.println("Menú-Modificación");
        System.out.println("1-Nombre estudiante");
        System.out.println("2-Edad estudiante");
        System.out.println("3-Calificación estudiante");
        System.out.println("4-Salir");
        System.out.print("Opción :");
        return lectura.nextInt();
     }

     public void MsgNoRegistro(){ 
         System.out.println("No se encuentra el elemento");  
           }

    public void MsgBajaExitosa(){

        System.out.println("Baja existosa");  
    }       

    public void MsgModificacionExitosa(){
        System.out.println("Modificación existosa");  
    }

  public Integer solicitarMatricula(){
        System.out.println("Escribe matricula del estudiante ");  
       lectura= new Scanner(System.in);
       return lectura.nextInt();
}

   public String SolicitarNombreEst(){
        System.out.println("Escribe nombre del estudiante ");  
       lectura= new Scanner(System.in);
       lectura.useDelimiter("\n");
       return lectura.next();
   } 

   public Integer SolicitarEdadEst(){
    System.out.println("Escribe edad del estudiante ");  
   lectura= new Scanner(System.in);
   return lectura.nextInt();
} 

public Double SolicitarCalificacionEst(){
    System.out.println("Escribe Calificación del estudiante ");  
   lectura= new Scanner(System.in);
   return lectura.nextDouble();
} 


   public void imprimirNombreEst(String nombre){
       System.out.println("Nombre del estudiante " + nombre);
   }

   public void imprimirEdadEst(Integer edad){
    System.out.println("Edad del estudiante " + edad);
}

   public void imprimirCalifEst(Double calificacion){
    System.out.println("Calificación del estudiante " + calificacion);
}
   public void MsgError()
   {
       System.out.println("Error");
   }

   public void imprimirInfoEst(Estudiante obj1)
   {
      if (obj1 != null) {
         System.out.println("El nombre del estudiante es  " + obj1.getNombre());
         System.out.println("La edad  del estudiante es  " + obj1.getEdad());
         System.out.println("La calificación del estudiante es  " + obj1.getCalificacion());
         
         } 
      else
         {
            System.out.println("Error");
         }
   }

   public void imprimirInfoTotal(ArrayList<Estudiante> estudiantes)
   {
    estudiantes.forEach(System.out::println);
   }

   public void imprimeInfodeBorrado(boolean e){
       if (e) {
           MsgBajaExitosa();
       } else {
           MsgNoRegistro();
       }
   }

   public void imprimeInfodeActualizacion(boolean e){
         if (e) {
            MsgModificacionExitosa();
        } else {
            MsgError();
        }

   }

}
