
/**
 * Write a description of class AutoElectrico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutoElectrico extends Automovil
{
    private int nivelCarga;

    /**
     * Constructor for objects of class AutoElectrico
     */
    public AutoElectrico()
    {
        super();
        nivelCarga = 50;
    }

    
    public void recargar ()
    {
        nivelCarga = 100;
    }
    
    public void mostrarCarga()
    {
        System.out.println("El nivel de carga es: " + nivelCarga);
    }
}
