package principal;

import classes.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto produto01 = new Produto();
		produto01.setCodigoTipo(01);
		produto01.setDescricao("BISCOITO");
		produto01.setImposto(10);
		produto01.setPercentualTipo(10);
		produto01.setPreco(0);

	}

}
