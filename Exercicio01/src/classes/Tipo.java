/* Defina uma classe chamada TIPO com os seguintes atributos: código do tipo e percentual do tipo. Os
percentuais devem seguir a tabela abaixo.

Tipo % de imposto
1. Alimentação 10
2. Limpeza 20

Defina uma classe chamada PRODUTO com os seguintes atributos: descrição, tipo (que deve existir
na classe TIPO), preço e imposto e o método calcular o preço final, ou seja, preço mais imposto. Faça um
programa que carregue os dados de um produto e mostre seu preço final. */

package classes;

public class Tipo {
	
	private int codigoTipo;
	private int percentualTipo;
	
	public int getCodigoTipo() {
		return codigoTipo;
	}
	public void setCodigoTipo(int codigoTipo) {
		this.codigoTipo = codigoTipo;
	}
	public int getPercentualTipo() {
		return percentualTipo;
	}
	public void setPercentualTipo(int percentualTipo) {
		this.percentualTipo = percentualTipo;
	}
	
	
	
	
	
}
