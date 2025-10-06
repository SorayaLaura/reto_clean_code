package paso_1_de_procedural_a_OOP.refactorizado;

/**
 * Encapsula la información de una cuenta bancaria y protege el saldo.
 */
class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

/**
 * Clase que realiza transferencias entre cuentas.
 */
class Transferencia {
    public void realizar(CuentaBancaria origen, CuentaBancaria destino, double monto) {
        if (origen.retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia de " + monto + " de " + origen.getTitular() + " a " + destino.getTitular());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}

public class Step1OOP {
    public static void main(String[] args) {
        CuentaBancaria cuentaA = new CuentaBancaria("A", 1000);
        CuentaBancaria cuentaB = new CuentaBancaria("B", 500);

        Transferencia transferencia = new Transferencia();
        transferencia.realizar(cuentaA, cuentaB, 200);

        System.out.println("Saldo A: " + cuentaA.getSaldo() + ", Saldo B: " + cuentaB.getSaldo());
    }
}
