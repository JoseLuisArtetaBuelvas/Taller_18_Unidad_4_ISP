public class CajeroAutomático implements TransaccionRetiro{
    @Override
    public void retirar(double monto) {
        System.out.println("Retirando " + monto + " del cajero.");
    }
}
