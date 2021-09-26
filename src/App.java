

public class App {    

    
    public static void main(String[] args) throws Exception {
        
        VistaEstudiante vista = new VistaEstudiante();
     ControladorEstudiante Estudiantes = new ControladorEstudiante(vista);
     Estudiantes.MenuEstudiante(); 
  

    }
}
