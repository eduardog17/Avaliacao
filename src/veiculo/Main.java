
package veiculo;
 class Main {

    public static void main(String[] args) {
    
        Veiculo MotoDoMoa = new Moto(Marca.FERRARI, 2016);
        Veiculo MotoDoProfeLe = new Moto(Marca.SUZUKI, 2006);
        Veiculo MotoDoKaiser = new Moto(Marca.ROLLSROYCE, 2022);
        Veiculo MotoDoPai = new Moto(Marca.PORSCHE, 2016);
        Veiculo MotoDoluan = new Moto(Marca.RENAULT, 1983);
        Veiculo CaminhaDoTauhan = new Caminhao(Marca.MERCEDES, 1972);
        Veiculo CaminhaoDoVini = new Caminhao(Marca.NISSAN, 1964);
        Veiculo CaminhaoDaElve = new Caminhao(Marca.RAM, 1962);
        Veiculo CarroDoProfeMauri = new Carro(Marca.FORD, 2016);
        Veiculo CarroDoProfeSeco = new Carro(Marca.AUDI, 2016);
        Veiculo CarroDoProfeNelson = new Carro(Marca.FIAT,2008);
        
        System.out.println(MotoDoluan.TipoVeiculo());
        System.out.println(MotoDoKaiser.TipoVeiculo());
        System.out.println(MotoDoMoa.TipoVeiculo());
        System.out.println(MotoDoPai.TipoVeiculo());
        System.out.println(MotoDoProfeLe.TipoVeiculo());
        System.out.println(CaminhaDoTauhan.TipoVeiculo());
        System.out.println(CaminhaoDaElve.TipoVeiculo());
        System.out.println(CaminhaoDoVini.TipoVeiculo());
        System.out.println(CarroDoProfeMauri.TipoVeiculo());
        System.out.println(CarroDoProfeNelson.TipoVeiculo());
        System.out.println(CarroDoProfeSeco.TipoVeiculo());
    }
    
}
