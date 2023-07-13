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
// Implementación de la estrategia de pago con tarjeta de crédito
class EstrategiaTarjetaCredito implements EstrategiaPago {
    private String numeroTarjeta;
    private String fechaExpiracion;
    private String cvv;

    public EstrategiaTarjetaCredito(String numeroTarjeta, String fechaExpiracion, String cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    @Override
    public void pagar(double monto) {
        // Lógica para procesar el pago con tarjeta de crédito
        System.out.println("Pagando $" + monto + " con tarjeta de crédito");
        // Aquí iría el código real para procesar el pago con tarjeta de crédito
    }
}
