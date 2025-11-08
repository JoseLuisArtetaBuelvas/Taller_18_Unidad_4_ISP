public class AppBancaria implements TransaccionRetiro, TransaccionPagosServicios, TransaccionTransferencia{
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transfiriendo " + monto +  "a " + cuentaDestino);
    }
    public void retirar(double monto) {
        System.out.println("Retirando " + monto + " del cajero.");
    }
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pagando " + monto + " para el servicio " + servicio);
    }
}
