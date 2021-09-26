

public class App {    

    
    public static void main(String[] args) throws Exception {
        
     CatalogoEstudiante vista = new CatalogoEstudiante();
     ControladorEstudiante Estudiantes = new ControladorEstudiante(vista);
     Estudiantes.MenuEstudiante(); 
  

    }
}
