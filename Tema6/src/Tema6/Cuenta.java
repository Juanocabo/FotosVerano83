package Tema6;

import java.util.Arrays;

import tema5.CuentaCorriente;

public class Cuenta {
	int cont=0;
	CuentaCorriente[] corrientes = new CuentaCorriente[100];
	float [] saldos = new float [100];
	public Cuenta() {
	}
	public void ADD(String codigo, String titular,float Saldo) {
			corrientes[cont]=new CuentaCorriente();
			corrientes[cont].setCodigo(codigo);
			corrientes[cont].setTitular(titular);
			corrientes[cont].setSaldo(Saldo);
		++cont;
	}
	public void Rico() {
		for(int i = 0 ;i< cont ;++i ) {
			saldos[i]=corrientes[i].getSaldo();
		}
		Arrays.sort(saldos);
		for(int i = 0;i<cont;++i) {
			if(saldos[saldos.length-1]==corrientes[i].getSaldo())System.out.println(corrientes[i].getTitular()+" "
					+corrientes[i].getCodigo()+" "+corrientes[i].getSaldo());;
		}
	}
}
