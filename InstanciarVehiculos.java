public class InstanciarVehiculos {
    public static void main(String[] args) {
        CocheDerportivo cocheDerportivo = new CocheDerportivo();
        cocheDerportivo.conducir();
        Remolque remolque = new Remolque();
        remolque.cargarMercancias(200);
        remolque.descargarMercancias();
        Camion camion = new Camion();
        camion.conducir();
        camion.cargarMercancias(300);
        camion.descargarMercancias();
    }
}
