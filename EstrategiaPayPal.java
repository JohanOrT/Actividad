/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstrategy;

/**
 *
 * @author Johan
 */
// Implementación de la estrategia de pago con PayPal
class EstrategiaPayPal implements EstrategiaPago {
    private String email;
    private String contraseña;

    public EstrategiaPayPal(String email, String contraseña) {
        this.email = email;
        this.contraseña = contraseña;
    }

    @Override
    public void pagar(double monto) {
        // Lógica para procesar el pago con PayPal
        System.out.println("Pagando $" + monto + " con PayPal");
        // Aquí iría el código real para procesar el pago con PayPal
    }
}
