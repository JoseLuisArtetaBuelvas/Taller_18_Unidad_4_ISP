public class OperarioGeneral implements Limpiable, Reparable{
    @Override
    public void limpiar() {
        System.out.println("Limpiando el área de trabajo.");
    }

    @Override
    public void reparar() {
        System.out.println("Realizando reparaciones menores.");
    }
}
