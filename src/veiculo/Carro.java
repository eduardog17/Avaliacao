
package veiculo;

    public class Carro extends Veiculo {
        
    private String Modelo;

    public Carro(Marca marca, int ano) {
        super(marca, ano);
    }

    @Override
    public String TipoVeiculo() {
        return "Carro{" + "Modelo=" + Modelo + '}' + super.TipoVeiculo();
    }
    
    
}
