import pkHerencia.Padre;
import pkHerencia.Hijo;

public class App {
    public static void main(String[] args) throws Exception {
        Padre p1 = new Padre(); //Llama al objeto
        Padre p2 = new Padre("Lucho");
        Padre p3 = new Padre("Pepe", "Quimico", "H", 23 );

        Hijo h1 = new Hijo("Ana");
        Hijo h2 = new Hijo("Jorge", "Policia", "H", 30);
        h1.presentarse();
        h2.presentarse();
        
        // p1.presentarse();
        // p2.presentarse();
        // p3.presentarse();
    }
}
