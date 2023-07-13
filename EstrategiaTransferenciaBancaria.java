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
// Implementación de la estrategia de pago con transferencia bancaria
class EstrategiaTransferenciaBancaria implements EstrategiaPago {
    private String cuentaBancaria;
    private String codigoSeguridad;

    public EstrategiaTransferenciaBancaria(String cuentaBancaria, String codigoSeguridad) {
        this.cuentaBancaria = cuentaBancaria;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void pagar(double monto) {
        // Lógica para procesar el pago con transferencia bancaria
        System.out.println("Pagando $" + monto + " con transferencia bancaria");
        // Aquí iría el código real para procesar el pago con transferencia bancaria
    }
}
