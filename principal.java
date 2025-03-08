import java.util.Stack;

public class principal 
{
    public static void main(String[] args) 
    {
        metodos m = new metodos();
        Stack<Vehiculo> pila = m.llenarpila();
        m.MostrarPila(pila);
        
    }
    
}
