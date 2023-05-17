/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

/**
 *
 * @author Escola
 */
public class Caminhao extends Veiculo{
    
   private Double CapacidadeCarga;
    
    public Caminhao(Marca marca, int ano) {
        super(marca, ano);
    }

    @Override
    public String TipoVeiculo() {
        return "Caminhao{" + "CapacidadeCarga=" + CapacidadeCarga + '}' + super.TipoVeiculo();
    }
    
    
}
