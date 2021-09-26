import java.util.Scanner;

public class Estudiante {
    //atributos
    private String nombre;
    private Double calificacion;
    private Integer edad;
    private Integer matricula;
    private Scanner lectura;
    
   //métodos
   //
   Estudiante(){}

   Estudiante(Integer matricula,String nombre, Double calificacion,Integer edad){
      setNombre(nombre);
      setCalificacion(calificacion);
      setEdad(edad);
      setMatricula(matricula);
   }
 

   ///setter y getter

   public void setNombre(String nombre){
       this.nombre = nombre;
   }

   public String getNombre(){
      return this.nombre;
   }
   
   public void setCalificacion(Double calificacion) {
       this.calificacion = calificacion;
   }

   public Double getCalificacion (){
       return this.calificacion;
   }

   public void setEdad(Integer edad){
       this.edad = edad;
   }

   public Integer getEdad(){
       return this.edad;
   }

   public void setMatricula(Integer matricula){
       this.matricula = matricula;
   }

   public Integer getMatricula(){
       return this.matricula;
   }

   public void imprimirDatos(){
     System.out.println("matricula " +getMatricula() +" nombre " + getNombre()+ " edad " + this.edad + " cal " + getCalificacion());
  }

  @Override
  public String toString() {
      return "Matricula " + getMatricula() + "\n" + " Nombre: "+getNombre()+ "\n" + " Edad " +  getEdad() + "\n "+ "Cal: " + getCalificacion();
  }

  public void pedirDatos(){
      
      lectura = new Scanner(System.in);
     
      System.out.println("Matricula del estudiante ");
      setMatricula(lectura.nextInt());

      System.out.println("Nombre del estudiante ");
      setNombre(lectura.next());

      System.out.println("Edad ");
      setEdad(lectura.nextInt());

      System.out.println("calificacion ");
      setCalificacion(lectura.nextDouble());
    
  }



}
