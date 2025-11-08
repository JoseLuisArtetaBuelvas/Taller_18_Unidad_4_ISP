public class Remolque implements TransporteCarga{
    public void cargarMercancias(double peso) {
        System.out.println("Cargando " + peso + " kg en el remolque.");
    }
    public void descargarMercancias() {
        System.out.println("Descargando todas los mercancias.");
    }
}
