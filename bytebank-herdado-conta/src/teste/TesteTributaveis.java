package teste;

import modelo.CalculadorDeImposto;
import modelo.ContaCorrente;
import modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		modelo.ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		modelo.SeguroDeVida seguro = new SeguroDeVida();
		
		modelo.CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
