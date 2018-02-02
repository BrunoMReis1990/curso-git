package br.com.empresa.banco.conta;

public abstract class Conta {
	private int numero;
	protected double saldo;

	public void deposita(double saldo) throws ValorInvalidoExption {
		if (saldo < 0) {
			throw new ValorInvalidoExption(saldo);
		} else {
			this.saldo += saldo;
		}
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(int saca) {
		if (this.saldo >= saca && saca > 0) {
			this.saldo -= saca;
		} else
			System.out.println("Saque não realizado!");
	}

	abstract public void atualiza(double taxa);

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Esse objeto é uma conta\n" + "Com Saldo: R$" + this.saldo;
	}

	@Override
	public boolean equals(Object conta) {
		Conta outraconta = (Conta) conta;
		return this.getNumero() == outraconta.getNumero();
		}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}////////////// fim//////////////////
