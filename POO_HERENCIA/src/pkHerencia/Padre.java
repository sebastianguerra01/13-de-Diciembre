package pkHerencia;

public class Padre {
    //propiedades
    private String nombre;
    private String ocupacion;
    private String sexo;
    private int Edad;

    // constructor (Inicializa valores)
    public Padre(){
        nombre      = "Pepe";
        ocupacion   = "Programador";
        sexo        = "H";
        Edad        = 20;
    }

    // constructor + sobrecarga (this. se refire a las propiedades de la clase)
    public Padre(String nombre){
        this.nombre = nombre;
        this.ocupacion   = "Programador";
        this.sexo        = "H";
        this.Edad         = 20;
    }

    public Padre(String nombre, String ocupacion, String sexo, int Edad){
        this.nombre      = nombre;
        this.ocupacion   = ocupacion;
        this.sexo        = sexo;
        this.Edad        = Edad;
    }
    // metodos
    public void presentarse()
    {
        System.out.println("  ------------------------- ");
        System.out.println(" Yo me llamo: " + nombre);
        System.out.println(" Soy un: " + ocupacion);
        System.out.println(" Sexo: " + sexo);
        System.out.println(" Edad: " + Edad);

    }

}
