package pkHerencia;

public class Hijo extends Padre { //Hereda los metodos de Padre.java
    
    //constructor
    public Hijo (String nombreHijo)
    {
        super(nombreHijo); //Salta hacia el Padre.java
    }

    public Hijo (String nombre, String ocupacion, String sexo, int Edad)
    {
        super(nombre, ocupacion, sexo, Edad); //Salta hacia el Padre.java
    }
    

}


