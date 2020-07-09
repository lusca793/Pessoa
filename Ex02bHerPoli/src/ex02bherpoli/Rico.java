package ex02bherpoli;

public class Rico extends Pessoa {
    private double dinheiro = 200000;
    
    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    public void fazCompras(){
        System.out.println("\nRico: -Eu comprei um carro de R$"+ dinheiro);
    }
}
