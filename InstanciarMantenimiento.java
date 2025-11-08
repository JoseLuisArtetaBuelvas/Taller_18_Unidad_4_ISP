public class InstanciarMantenimiento {
    public static void main(String[] args) {
        TecnicoMecanico tecnicoMecanico = new TecnicoMecanico();
        tecnicoMecanico.reparar();
        OperarioGeneral operarioGeneral = new OperarioGeneral();
        operarioGeneral.reparar();
        operarioGeneral.limpiar();
    }
}
