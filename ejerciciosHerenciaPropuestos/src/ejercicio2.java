// Clase base
abstract class Cuenta {
    protected String titular;
    protected double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarDatos() {
        System.out.println("No implementado");
    }
}

// Subclase CuentaAhorro
class CuentaAhorro extends Cuenta {
    private double interesAnual;

    public CuentaAhorro(String titular, double saldo, double interesAnual) {
        super(titular, saldo);
        this.interesAnual = interesAnual;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cuenta Ahorro:");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + "€");
        System.out.println("Interés anual: " + interesAnual + "%");
        System.out.println("-------------------------");
    }
}

// Subclase CuentaCorriente
class CuentaCorriente extends Cuenta {
    private double limiteDescubierto;

    public CuentaCorriente(String titular, double saldo, double limiteDescubierto) {
        super(titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cuenta Corriente:");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + "€");
        System.out.println("Límite de descubierto: " + limiteDescubierto + "€");
        System.out.println("-------------------------");
    }
}

// Clase principal
public class ejercicio2 {
    public static void main(String[] args) {
        Cuenta[] cuentas = new Cuenta[4];
        cuentas[0] = new CuentaAhorro("Eva", 2100, 1.3);
        cuentas[1] = new CuentaCorriente("Luis Alfonso", 3500, 500);
        cuentas[2] = new CuentaAhorro("Rosa", 3009, 2.0);
        cuentas[3] = new CuentaCorriente("Paola", 1020, 1000);

        for (Cuenta cuenta : cuentas) {
            cuenta.mostrarDatos(); // POLIMORFISMO
        }
    }
}
