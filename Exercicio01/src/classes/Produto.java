/* Defina uma classe chamada PRODUTO com os seguintes atributos: descrição, tipo (que deve existir
na classe TIPO), preço e imposto e o método calcular o preço final, ou seja, preço mais imposto. Faça um
programa que carregue os dados de um produto e mostre seu preço final. 
*/

package classes;

public class Produto extends Tipo {
	private String descricao;
	private double preco;
	private double imposto;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double precoFinal() {
		return 0;
	}
	
	
}
