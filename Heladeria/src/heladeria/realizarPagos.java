package heladeria;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.JOptionPane;

public class realizarPagos {

    int numeroDePago[] = new int[10];
    String fecha[] = new String[10];
    String cedula[] = new String[10];
    String nombre[] = new String[10];
    String apellido[] = new String[10];
    String apellido2[] = new String[10];
    int numeroDeCaja[] = new int[10];
    float agua[] = new float[10];
    float luz[] = new float[10];
    String telefono[] = new String[10];
    int numeroDeFactura[] = new int[10];
    float montoAPagar[] = new float[10];
    float comicion[] = new float[10];
    float deducido[] = new float[10];
    float pagaCliente[] = new float[10];
    float vuelto[] = new float[10];
    int opciones[] = new int[10];
    int tipoS = 0;

//int numeroDePago, DateTimeAtCompleted fecha, String cedula, String nombre, String apellido, String apellido2, int numeroDeCaja, float agua, float luz, String telefono, int numeroDeFactura, float montoAPagar, float comicion, float deducido, float pagaCliente, float vuelto
    public void Inicializar() {
        for (int i = 0; i < 10; i++) {
            numeroDePago[i] = 1;
            fecha[i] = "NG";
            cedula[i] = "NG";
            nombre[i] = "NG";
            apellido[i] = "NG";
            apellido2[i] = "NG";
            numeroDeCaja[i] = 0;
            agua[i] = 0;
            luz[i] = 0;
            telefono[i] = "NG";
            numeroDeFactura[i] = 100;
            montoAPagar[i] = 0;
            comicion[i] = 0;
            deducido[i] = 0;
            pagaCliente[i] = 0;
            vuelto[i] = 0;
            opciones[i] = 0;
        }
        JOptionPane.showMessageDialog(null, "La inicialización se realizo con exito");

    }

    public void ingresarDatos() {

        int vector[] = new int[10];
        int incrementar = 100;
        int incrementar2 = 1;

        for (int i = 0; i < vector.length; i++) {

            numeroDeFactura[i] = incrementar;
            incrementar++;

            numeroDePago[i] = incrementar2;
            incrementar2++;

            cedula[i] = JOptionPane.showInputDialog("Digite el numero de cedula");
            nombre[i] = JOptionPane.showInputDialog("Digite el numbre");
            apellido[i] = JOptionPane.showInputDialog("Digite el primer apellido.");
            apellido2[i] = JOptionPane.showInputDialog("Digite el segundo apellido.");
            numeroDeCaja[i] = (int) (Math.random() * 3 + 1);
            JOptionPane.showMessageDialog(null, "El numero de caja es: " + numeroDeCaja[i]);
            opciones[i] = Integer.parseInt(JOptionPane.showInputDialog(" +++++Digite el tipo de servicio+++++\n"
                    + "1.Recibo de Luz\n"
                    + "2.Recibo de Telefono\n"
                    + "3.Recibo de Agua "));

            switch (opciones[i]) {
                case 1:

                    montoAPagar[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a pagar"));
                    comicion[i] = (int) (montoAPagar[i] * 0.04);
                    JOptionPane.showMessageDialog(null, "La comicion es de: " + comicion[i]);
                    deducido[i] = montoAPagar[i] - comicion[i];
                    JOptionPane.showMessageDialog(null, "El deducido es de: " + deducido[i]);
                    pagaCliente[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto con el que va a pagar el cliente:"));
                    vuelto[i] = pagaCliente[i] - montoAPagar[i];
                    JOptionPane.showMessageDialog(null, "El vuelto es de: " + vuelto[i]);
                    JOptionPane.showMessageDialog(null, "Numero de pago: " + numeroDePago[i] + "\nFecha: " + fecha[i] + "\n\nCedula: " + cedula[i] + "          Nombre: " + nombre[i] + "\nApellido 1: " + apellido[i] + "          Apellido 2: " + apellido2[i] + ""
                            + "\n\nTipo de servicio: " + opciones[i] + "     (1: Luz, 2: Telefono, 3: agua)\n\nNumero de factura: " + numeroDeFactura[i] + "          Monto a pagar: " + montoAPagar[i] + "\nComicion autorizada: " + comicion[i] + "          Paga con: " + pagaCliente[i] + ""
                            + "\nMonto deducido: " + deducido[i] + "          Vuelto: " + vuelto[i]);

                    break;

                case 2:
                    montoAPagar[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a pagar"));
                    comicion[i] = (int) (montoAPagar[i] * 0.04);
                    JOptionPane.showMessageDialog(null, "La comicion es de: " + comicion[i]);
                    deducido[i] = montoAPagar[i] - comicion[i];
                    JOptionPane.showMessageDialog(null, "El deducido es de: " + deducido[i]);
                    pagaCliente[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto con el que va a pagar el cliente:"));
                    vuelto[i] = pagaCliente[i] - montoAPagar[i];
                    JOptionPane.showMessageDialog(null, "El vuelto es de: " + vuelto[i]);
                    JOptionPane.showMessageDialog(null, "Numero de pago: " + numeroDePago[i] + "\nFecha: " + fecha[i] + "\n\nCedula: " + cedula[i] + "          Nombre: " + nombre[i] + "\nApellido 1: " + apellido[i] + "          Apellido 2: " + apellido2[i] + ""
                            + "\n\nTipo de servicio: " + opciones[i] + "     (1: Luz, 2: Telefono, 3: agua)\n\nNumero de factura: " + numeroDeFactura[i] + "          Monto a pagar: " + montoAPagar[i] + "\nComicion autorizada: " + comicion[i] + "          Paga con: " + pagaCliente[i] + ""
                            + "\nMonto deducido: " + deducido[i] + "          Vuelto: " + vuelto[i]);

                    break;

                case 3:
                    montoAPagar[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a pagar"));
                    comicion[i] = (int) (montoAPagar[i] * 0.04);
                    JOptionPane.showMessageDialog(null, "La comicion es de: " + comicion[i]);
                    deducido[i] = montoAPagar[i] - comicion[i];
                    JOptionPane.showMessageDialog(null, "El deducido es de: " + deducido[i]);
                    pagaCliente[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto con el que va a pagar el cliente:"));
                    vuelto[i] = pagaCliente[i] - montoAPagar[i];
                    JOptionPane.showMessageDialog(null, "El vuelto es de: " + vuelto[i]);
                    JOptionPane.showMessageDialog(null, "Numero de pago: " + numeroDePago[i] + "\nFecha: " + fecha[i] + "\n\nCedula: " + cedula[i] + "          Nombre: " + nombre[i] + "\nApellido 1: " + apellido[i] + "          Apellido 2: " + apellido2[i] + ""
                            + "\n\nTipo de servicio: " + opciones[i] + "     (1: Luz, 2: Telefono, 3: agua)\n\nNumero de factura: " + numeroDeFactura[i] + "          Monto a pagar: " + montoAPagar[i] + "\nComicion autorizada: " + comicion[i] + "          Paga con: " + pagaCliente[i] + ""
                            + "\nMonto deducido: " + deducido[i] + "          Vuelto: " + vuelto[i]);

                    break;
            }
            int continuar = Integer.parseInt(JOptionPane.showInputDialog("+++++Decea continuar+++++\n"
                    + "1.SI\n"
                    + "2.NO"));
            if (continuar == 2) {
                break;
            }

        }

    }

    public void consultar() {
        int consulta = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de pago que decea buscar"));

        int indice = 0;

        while ((indice < 10) && (consulta != numeroDePago[indice])) {
            indice++;
        }

        if (indice >= 10) {
            JOptionPane.showMessageDialog(null, "El numero de pago ingresado no existe");
        } else {
            JOptionPane.showMessageDialog(null, "El numero de pago [ " + consulta + " ] exite en la posicion [" + indice + " ]");
            JOptionPane.showMessageDialog(null, "Numero de pago: " + numeroDePago[indice] + "\nFecha: " + fecha[indice] + "\n\nCedula: " + cedula[indice] + "          Nombre: " + nombre[indice] + "\nApellido 1: " + apellido[indice] + "          Apellido 2: " + apellido2[indice] + ""
                    + "\n\nTipo de servicio: " + opciones[indice] + "     (1: Luz, 2: Telefono, 3: agua)\n\nNumero de factura: " + numeroDeFactura[indice] + "          Monto a pagar: " + montoAPagar[indice] + "\nComicion autorizada: " + comicion[indice] + "          Paga con: " + pagaCliente[indice] + ""
                    + "\nMonto deducido: " + deducido[indice] + "          Vuelto: " + vuelto[indice]);

        }
    }

    public void modificarPago() {
        int pago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de pago que desea modificar"));
        if (pago < 1 || pago > 10) {
            JOptionPane.showMessageDialog(null, "El número de pago ingresado no es válido");
            return;
        }
        opciones[pago - 1] = Integer.parseInt(JOptionPane.showInputDialog("+++++Digite el tipo de servicio a modificar+++++\n"
                + "1.Recibo de Luz\n"
                + "2.Recibo de Telefono\n"
                + "3.Recibo de Agua "));

        switch (opciones[pago - 1]) {
            case 1:
                montoAPagar[pago - 1] = Float.parseFloat(JOptionPane.showInputDialog("Digite el nuevo monto a pagar"));
                comicion[pago - 1] = (float) (montoAPagar[pago - 1] * 0.04);
                deducido[pago - 1] = montoAPagar[pago - 1] - comicion[pago - 1];
                pagaCliente[pago - 1] = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto con el que va a pagar el cliente:"));
                vuelto[pago - 1] = pagaCliente[pago - 1] - montoAPagar[pago - 1];
                JOptionPane.showMessageDialog(null, "Pago modificado con éxito.\nNuevo monto a pagar: " + montoAPagar[pago - 1]
                        + "\nNueva comisión autorizada: " + comicion[pago - 1] + "\nNuevo monto deducido: " + deducido[pago - 1]
                        + "\nNuevo monto con el que paga el cliente: " + pagaCliente[pago - 1] + "\nNuevo vuelto: " + vuelto[pago - 1]);
                break;

            case 2:
                montoAPagar[pago - 1] = Float.parseFloat(JOptionPane.showInputDialog("Digite el nuevo monto a pagar"));
                comicion[pago - 1] = (float) (montoAPagar[pago - 1] * 0.04);
                deducido[pago - 1] = montoAPagar[pago - 1] - comicion[pago - 1];
                pagaCliente[pago - 1] = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto con el que va a pagar el cliente:"));
                vuelto[pago - 1] = pagaCliente[pago - 1] - montoAPagar[pago - 1];
                JOptionPane.showMessageDialog(null, "Pago modificado con éxito.\nNuevo monto a pagar: " + montoAPagar[pago - 1]
                        + "\nNueva comisión autorizada: " + comicion[pago - 1] + "\nNuevo monto deducido: " + deducido[pago - 1]
                        + "\nNuevo monto con el que paga el cliente: " + pagaCliente[pago - 1] + "\nNuevo vuelto: " + vuelto[pago - 1]);
                break;

            case 3:
                montoAPagar[pago - 1] = Float.parseFloat(JOptionPane.showInputDialog("Digite el nuevo monto a pagar"));
                comicion[pago - 1] = (float) (montoAPagar[pago - 1] * 0.04);
                deducido[pago - 1] = montoAPagar[pago - 1] - comicion[pago - 1];
                pagaCliente[pago - 1] = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto con el que va a pagar el cliente:"));
                vuelto[pago - 1] = pagaCliente[pago - 1] - montoAPagar[pago - 1];
                JOptionPane.showMessageDialog(null, "Pago modificado con éxito.\nNuevo monto a pagar: " + montoAPagar[pago - 1]
                        + "\nNueva comisión autorizada: " + comicion[pago - 1] + "\nNuevo monto deducido: " + deducido[pago - 1]
                        + "\nNuevo monto con el que paga el cliente: " + pagaCliente[pago - 1] + "\nNuevo vuelto: " + vuelto[pago - 1]);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
        }
    }

    public void eliminarPago() {
        int pagoAEliminar = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de pago que desea eliminar:"));

        for (int i = 0; i < numeroDePago.length; i++) {
            if (numeroDePago[i] == pagoAEliminar) {

                numeroDePago[i] = 0;
                fecha[i] = "";
                cedula[i] = "";
                nombre[i] = "";
                apellido[i] = "";
                apellido2[i] = "";
                numeroDeCaja[i] = 0;
                agua[i] = 0;
                luz[i] = 0;
                telefono[i] = "";
                numeroDeFactura[i] = 0;
                montoAPagar[i] = 0;
                comicion[i] = 0;
                deducido[i] = 0;
                pagaCliente[i] = 0;
                vuelto[i] = 0;
                opciones[i] = 0;
                JOptionPane.showMessageDialog(null, "El pago con número " + pagoAEliminar + " ha sido eliminado.");
                break;
            } else {

                JOptionPane.showMessageDialog(null, "No se encontró el pago con número " + pagoAEliminar + ".");
            }
        }

    }

    public void reproducir() {
        String impremir = "";
        for (int i = 0; i < 10; i++) {
            impremir += "Numero de pago: " + numeroDePago[i] + "\nFecha: " + fecha[i] + "\n\nCedula: " + cedula[i] + "          Nombre: " + nombre[i] + "\nApellido 1: " + apellido[i] + "          Apellido 2: " + apellido2[i] + ""
                    + "\n\nTipo de servicio: " + opciones[i] + "     (1: Luz, 2: Telefono, 3: agua)\n\nNumero de factura: " + numeroDeFactura[i] + "          Monto a pagar: " + montoAPagar[i] + "\nComicion autorizada: " + comicion[i] + "          Paga con: " + pagaCliente[i] + ""
                    + "\nMonto deducido: " + deducido[i] + "          Vuelto: " + vuelto[i] + "\n\n\n";
            JOptionPane.showMessageDialog(null, impremir);
            impremir = "";
            if (numeroDePago[i] < 0) {
                break;
            }
        }

    }

    //PARTE DE JORMIAN A PARTIR DE ACÁ    
    public void PagosxServicio() {

        String imprimir2 = "";
        for (int i = 0; i < 10; i++) {

            if (opciones[i] == tipoS) {
                imprimir2 += "Numero de pago: " + numeroDePago[i] + "\nFecha: " + fecha[i] + "\n\nCedula: " + cedula[i] + "          Nombre: " + nombre[i] + "\nApellido 1: " + apellido[i]
                        + "          Apellido 2: " + apellido2[i] + "" + "\n\nTipo de servicio: " + opciones[i]
                        + "     (1: Luz, 2: Telefono, 3: agua) \n\nNumero de factura: " + numeroDeFactura[i]
                        + "          Monto a pagar: " + montoAPagar[i] + "\nComicion autorizada: " + comicion[i]
                        + "          Paga con: " + pagaCliente[i] + "" + "\nMonto deducido: " + deducido[i] + "          Vuelto: " + vuelto[i];

                JOptionPane.showMessageDialog(null, imprimir2);
                imprimir2 = "";

            }

        }

    }

    public void mostrarServicios() {
        tipoS = Integer.parseInt(JOptionPane.showInputDialog(" +++++Digite el tipo de servicio que desea ver+++++\n"
                + "1.Recibo de Luz\n"
                + "2.Recibo de Telefono\n"
                + "3.Recibo de Agua "));

        switch (tipoS) {
            case 1:

                PagosxServicio();

                break;

            case 2:
                PagosxServicio();
                break;

            case 3:
                PagosxServicio();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Servicio inválido");

        }
    }

    public void PagosxCaja() {
        int numeroCajaSeleccionado = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de caja que desea consultar: "));

        for (int i = 0; i < numeroDePago.length; i++) {
            if (numeroDeCaja[i] == numeroCajaSeleccionado) {
                JOptionPane.showMessageDialog(null, "Numero de pago: " + numeroDePago[i] + "\nFecha: " + fecha[i] + "\n\nCedula: " + cedula[i] + "          Nombre: " + nombre[i] + "\nApellido 1: " + apellido[i]
                        + "          Apellido 2: " + apellido2[i] + "" + "\n\n Numero de caja: " + numeroDeCaja[i]
                        + "\n\nNumero de factura: " + numeroDeFactura[i]
                        + "          Monto a pagar: " + montoAPagar[i] + "\nComicion autorizada: " + comicion[i]
                        + "          Paga con: " + pagaCliente[i] + "" + "\nMonto deducido: " + deducido[i] + "         Vuelto: " + vuelto[i]);
            } else {
                if (numeroDeCaja[i] < 0) {
                    JOptionPane.showMessageDialog(null, "No existe registro con ese número de caja");

                }
            }

        }
    }

    public void totalComisionado() {
        float totalLuz = 0;
        float totalTelefono = 0;
        float totalAgua = 0;
        int numLuz = 0;
        int numTelefono = 0;
        int numAgua = 0;
        float totalGeneral = 0;
        int numTransacciones = 0;

        for (int i = 0; i < opciones.length; i++) {
            switch (opciones[i]) {
                case 1:
                    totalLuz += montoAPagar[i];
                    numLuz++;
                    break;
                case 2:
                    totalTelefono += montoAPagar[i];
                    numTelefono++;
                    break;
                case 3:
                    totalAgua += montoAPagar[i];
                    numAgua++;
                    break;
           
            }
            totalGeneral += montoAPagar[i];
            numTransacciones++;
        }

        String mensaje = "Totales por tipo de servicio:\n\n"
                + "Luz: " + numLuz + " transacciones, $" + totalLuz + "\n"
                + "Telefono: " + numTelefono + " transacciones, $" + totalTelefono + "\n"
                + "Agua: " + numAgua + " transacciones, $" + totalAgua + "\n\n"
                + "Total general: " + numTransacciones + " transacciones, $" + totalGeneral;

        JOptionPane.showMessageDialog(null, mensaje);
    }

}
