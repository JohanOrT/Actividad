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
class ProcesadorPagos {
    private EstrategiaPago estrategiaPago;

    public void setEstrategiaPago(EstrategiaPago estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    public void procesarPago(double monto) {
        // Procesamiento común del pago
        // ...
        // Invocar la estrategia de pago seleccionada
        estrategiaPago.pagar(monto);
        // ...
        // Otro procesamiento común del pago
        // ...
    }
}
