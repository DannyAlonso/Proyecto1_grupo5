
package heladeria;

import javax.swing.JOptionPane;
public class Menu {

   
    private realizarPagos datos = new realizarPagos();
    
   public  void mostrarMenu()
   {
   int opciones;
   
       do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("+++++Menu Principal+++++\n"
                    + "1.Inicializar Vectores\n"
                    + "2.Realizar Pagos\n"
                    + "3.Consultar Pagos\n"
                    + "4.Modificar Pagos\n"
                    + "5.Eliminar Pagos\n"
                    + "6.Submenú Reportes\n"
                    + "7.Salir"));
           switch (opciones) {
               case 1:
                   datos.Inicializar();
                   mostrarMenu();

                   break;
               case 2:     
                  datos.ingresarDatos();
                  mostrarMenu();
                   
                   break;
               case 3:
                   datos.consultar();
                   mostrarMenu();
                   break;
               case 4:
                   datos.modificarPago();
                   break;
               case 5:
                   datos.eliminarPago();
                   
                   break;
     case 6:
                   subMenu();                  
                   break;
               case 7:
                   System.exit(0);
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Entrada no válida");
                   mostrarMenu();

           }
            
           
       } while (false);
   }
   
   //PARTE DE JORMAIN
   public void subMenu(){
        
        int opciones2;
   
       do {
            opciones2 = Integer.parseInt(JOptionPane.showInputDialog("+++++SubMenú+++++\n"
                    + "1.Ver todos los pagos\n"
                    + "2.Ver Pagos por tipo de Servicio\n"
                    + "3.Ver Pagos por código de caja\n"
                    + "4.Ver Dinero Comisionado por servicios\n"
                    + "5.Regresar Menú Principal"));
           switch (opciones2) {
               case 1:
                  datos.reproducir();
                  subMenu();

                   break;
               case 2:     
                 datos.mostrarServicios();
                 subMenu();
                   break;
               case 3:
                   datos.PagosxCaja();
                   subMenu();
                   break;
               case 4:
                   datos.totalComisionado();
                   subMenu();
                   break;
               case 5:
                   mostrarMenu();
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Entrada no válida");
                   subMenu();
                   
    }
} while (false);
       
       
 }
    
}
