
package veiculo;


    public abstract class Veiculo {
    private Marca marca;
    private int ano;

    public Veiculo(Marca marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }
           
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public String TipoVeiculo () {
        return "Veiculo{" + "marca=" + marca + ", ano=" + ano + '}';
    }
    
    }
