package service;

import utilidades.Operaciones;

public class Calculadora {
	Operaciones oper=new Operaciones();
	public int sumar(int x, int y) {
		return x+y;
	}
	//utilizamos meotodos de la otra clase 
	//por que tenemos que saber cual es menor mayor
	public int restar(int x, int y) {
		return oper.mayor(x, y)-oper.menor(x, y);
	}
	public int dividir(int x, int y ) {
		return oper.mayor(x, y)/oper.menor(x, y);
	}
}