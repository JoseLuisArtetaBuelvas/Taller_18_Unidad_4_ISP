public class Camion implements Conducible, TransporteCarga{
    public void conducir() {
        System.out.println("Conduciendo el camión...");
    }
    public void cargarMercancias(double peso) {
        System.out.println("Cargando " + peso + " kg en el camión.");
    }
    public void descargarMercancias() {
        System.out.println("Descargando mercancias...");
    }
}
