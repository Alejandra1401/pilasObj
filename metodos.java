import java.util.Stack;

import javax.swing.JOptionPane;

public class metodos 
{
    public Stack<Vehiculo> llenarpila()
    {
        Stack<Vehiculo> pila = new Stack<>();//declara variable pila de tipo obj, la pila es una coleccion de objeto
        boolean continuar = true;
        String agregar = "";
        while (continuar) 
        {
            Vehiculo o = new Vehiculo();
            o.setMarca(JOptionPane.showInputDialog("Ingrese la marca "));
            o.setColor(JOptionPane.showInputDialog("Ingrese el color "));
            o.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio")));//esto con dooble, int, float. debo convertirlo al tipo de dato
            pila.push(o);//Aqui llevo los datos a la pila 
            agregar = JOptionPane.showInputDialog(null, "Desea ingresar mas registros: S/N");
            if ( agregar.equalsIgnoreCase("N"))
            {
                continuar = false;
            }
        }
        return pila;
    }
    public void MostrarPila(Stack<Vehiculo> pila)
    {
        for (Vehiculo o : pila)//Deshapilando para mostrar(es lo mismo que un for normal)
        {
            System.out.println( "Marca:" + o.getMarca());
            System.out.println("Color: " + o.getColor());
            System.out.println("Precio:" + o.getPrecio());
            System.out.println();
        }
        Eliminar(pila);

    }
    public Stack<Vehiculo> Eliminar (Stack<Vehiculo> pila)
    {
        
        String dato; 
        dato = JOptionPane.showInputDialog("Ingrese el registro que desea eliminar");
        for (Vehiculo o : pila)//Deshapilando 
        {
            if(o.getMarca().equalsIgnoreCase(dato))
            {
                pila.pop();
            }
        }
        return pila;
    }
    
    
}
