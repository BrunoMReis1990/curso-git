package br.com.empresa.banco.conta;

import javaiialura.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public void atualiza(double taxa) {
		this.saldo += (this.saldo * taxa * 3);

	}

	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 0.01;
	}
}