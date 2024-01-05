
package atividade4;


class IPI extends Imposto {
    private double valor;
    private double frete;
    private double seguro;
    private double outrasDespesas;
    private double aliquota;

    public IPI(double valor, double frete, double seguro, double outrasDespesas, double aliquota) {
        super("IPI");
        this.valor = valor;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }

    @Override
    public double calcularImposto() {
        double baseCalculo = valor + frete + seguro + outrasDespesas;
        return baseCalculo * aliquota;
    }
}










