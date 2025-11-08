public class PlataformaPagos implements TransaccionPagosServicios{
    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pagando " + monto + " para el servicio " + servicio);
    }
}
