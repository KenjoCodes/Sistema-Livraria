package livraria.model;

import java.math.BigDecimal;

public class Caixa {

    private BigDecimal saldo;

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void deposito(BigDecimal dinheiro) {
        this.saldo.add(dinheiro);
    }

    public void saque(BigDecimal dinheiro) {
        this.saldo.subtract(dinheiro);
    }

    public void compra(BigDecimal dinheiro) {

    }
}
