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
        int opt = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 encontrar, 2 eliminar, 3 modificar"));
        accionesRegistro(pila, opt);

    }
    public Stack<Vehiculo> accionesRegistro (Stack<Vehiculo> pila, int opt)
    {
        String dato;
        if (opt ==1)
        {
            dato = JOptionPane.showInputDialog("Ingrese el registro que desea consultar");
        }
        else if (opt ==2)
        {
            dato = JOptionPane.showInputDialog("Ingrese el registro que desea eliminar");
        }
        else
        {
            dato = JOptionPane.showInputDialog("Ingrese el registro que desea modificar");
        }
       
        for (Vehiculo carrito : pila)//Deshapilando 
        {
            if(carrito.getMarca().equalsIgnoreCase(dato))
            {
              if(opt == 1)
              {
                System.out.println(
                    "El registro se encuentra y es: " + carrito.getMarca() + " " + carrito.getPrecio());
              }
              else if (opt == 2)
              {
                pila.remove(carrito);
              } 
              else
              {
                carrito.setMarca(JOptionPane.showInputDialog("Ingrese la marca"));
              }
            }
        }
        return pila;
    }
    
    
}
