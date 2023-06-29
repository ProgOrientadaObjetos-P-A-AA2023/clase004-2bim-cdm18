/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia trans = new TransporteTransvia();
        trans.establecerCooperativaTransvia("Rutas Loja");
        trans.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        ArrayList <Transporte> transportes = new ArrayList();
        
        transportes.add(bus);
        transportes.add(taxi);
        transportes.add(trans);
        
        tipos.establecerTransportes(transportes);
      
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
