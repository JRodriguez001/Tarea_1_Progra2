/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg12.pkg10.pkg23.sistema;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Tarea121023Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        ArrayList<Producto> produ = new ArrayList();
        boolean flag = true;
        while (flag == true) {

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            int opt = 0;
            opt = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                    + "1. Agregar Producto\n"
                    + "2. Listar Producto\n"
                    + "3. Buscar Producto\n"
                    + "4. Modificar Producto\n"
                    + "5. Eliminar Producto\n"
                    + "6. Salir"));

            if (opt == 1) {

                if (produ.size() <= 500) {

                    String codi = JOptionPane.showInputDialog("Ingrese el codigo del producto: ");
                    String descri = JOptionPane.showInputDialog("Escriba la descripcion: ");
                    Color color = JColorChooser.showDialog(null, "Seleccione el color: ", Color.yellow);
                    long precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));
                    Date fecha = df.parse(JOptionPane.showInputDialog("Ingrese la Fecha de expiracion de la forma (DD/MM/YYYY): "));
                    JOptionPane.showMessageDialog(null, "Producto agregado con exito");
                    produ.add(new Producto(codi, descri, color, precio, fecha));
                } else {
                    JOptionPane.showMessageDialog(null, "No se pueden agregar mas producto");
                }

            } else if (opt == 2) {
                JOptionPane.showMessageDialog(null, "Lista de productos");
                listar(produ);

            } else if (opt == 3) {
                String buscar = JOptionPane.showInputDialog("Ingrese el codigo a buscar del producto: ");
                for (int i = 0; i < produ.size(); i++) {
                    if (produ.get(i).getCodigo().equals(buscar)) {
                        JOptionPane.showMessageDialog(null, "Codigo encontrado" + listar(produ));
                    } else {
                        JOptionPane.showMessageDialog(null, "Producto no existe");
                    }
                }
            } else if (opt == 4) {
                String co = JOptionPane.showInputDialog("Ingrese el codigo de producto a modificar");
                for (int i = 0; i < produ.size(); i++) {
                    if (produ.get(i).getCodigo().equals(co)) {
                        String cod = JOptionPane.showInputDialog("Ingrese el nuevo codigo: ");
                        String des = JOptionPane.showInputDialog("Ingrese la nueva descripcion: ");
                        Color color = JColorChooser.showDialog(null, "Seleccione el nuevo color", Color.yellow);
                        long precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio: "));
                        Date fecha = df.parse(JOptionPane.showInputDialog("Ingrese la Fecha de expiracion de la forma (DD/MM/YYYY): "));
                        produ.get(i).setCodigo(cod);
                        produ.get(i).setDescrip(des);
                        produ.get(i).setColor(color);
                        produ.get(i).setPrecio(precio);
                        produ.get(i).setFecha(fecha);
                        JOptionPane.showMessageDialog(null, "Producto modificado con exito " + listar(produ));
                    }
                }
            } else if (opt == 5) {
                String elim = JOptionPane.showInputDialog("Ingrese el codigo del producto a eliminar");
                for (int i = 0; i < produ.size(); i++) {
                    if (produ.get(i).getCodigo().equals(elim)) {
                        produ.remove(i);
                        JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
                    }
                }

            } else if (opt == 6) {
                JOptionPane.showMessageDialog(null, "Saliendo......");
                flag = false;
            }

        }

    }

    public static String listar(ArrayList produc) {
        String salida = "";
        for (Object p : produc) {
            salida += produc.indexOf(p) + ":" + p + "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
        return salida;
    }

}
