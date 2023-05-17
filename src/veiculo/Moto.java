
package veiculo;

public class Moto extends Veiculo{
    
    private int Velocidade;

    public Moto(Marca marca, int ano) {
        super(marca, ano);
    }

    @Override
    public String TipoVeiculo() {
        return "Moto{" + "Velocidade=" + Velocidade + '}' + super.TipoVeiculo();
    }
    
    
}
