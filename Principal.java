/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstrategy;

/**
 *
 * @author JORGE
 */
// Ejemplo de uso del sistema de procesamiento de pagos
public class Principal {
    public static void main(String[] args) {
        // Crear una instancia del procesador de pagos
        ProcesadorPagos procesador = new ProcesadorPagos();

        // Seleccionar una estrategia de pago (tarjeta de crédito, PayPal, transferencia bancaria)
        // y configurar los datos necesarios para esa estrategia
        EstrategiaPago estrategiaPago = new EstrategiaTarjetaCredito("1234567890123456", "12/25", "123");
        // EstrategiaPago estrategiaPago = new EstrategiaPayPal("usuario@example.com", "contraseña");
        // EstrategiaPago estrategiaPago = new EstrategiaTransferenciaBancaria("0123456789", "456");

        // Configurar la estrategia de pago seleccionada en el procesador de pagos
        procesador.setEstrategiaPago(estrategiaPago);

        // Procesar el pago con la estrategia seleccionada
        double monto = 100.0; // Monto del pago
        procesador.procesarPago(monto);
    }
}
