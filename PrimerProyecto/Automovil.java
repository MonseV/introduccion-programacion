/**
 * Write a description of class automovil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Automovil
{
    public String marca;
    public int precio;
    public int numPuertas;
    public String color;
    
    /* Contructor */
    public Automovil()
    {
        marca = "Mazda";
        precio = 200000;
        numPuertas = 4;
        color = "Negro";
    }
    
    public Automovil(String m, int p, int nP, String c)
    {
        marca = m;
        precio = p;
        numPuertas = nP;
        color = c;
    }
    
    /* Métodos */
    public void mostrarPropiedades()
    {
        
        System.out.println("El automovil es de marca " + marca +
                           " Su precio es de " + precio +
                           " pesos, Tiene " + numPuertas +
                           " puertas y su color es " + color);
                           
    }
    
    public void encender()
    {
        
        System.out.println("El automovil encendió");
        
    }
    
    public void acelerar()
    {
    
        System.out.println("El automovil aceleró");
    }
}
