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
// Interfaz para las estrategias de pago
interface EstrategiaPago {
    void pagar(double monto);
}