public class InstanciarOperacionBancaria {
    public static void main(String[] args) {
        CajeroAutomático cajeroAutomático = new CajeroAutomático();
        cajeroAutomático.retirar(20000);
        PlataformaPagos plataformaPagos = new PlataformaPagos();
        plataformaPagos.pagarFactura("Internet", 15000);
        AppBancaria appBancaria = new AppBancaria();
        appBancaria.transferir(30000, "Jose Buelvas");
        appBancaria.retirar(10000);
        appBancaria.pagarFactura("Internet", 15000);
    }
}
