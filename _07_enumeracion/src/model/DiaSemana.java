package model;

public enum DiaSemana {
	//Valores-Identificadores
	Lunes(1),Martes(2),Miercoles(3),Jueves(4),Viernes(5),Sabado(6),Domingo(7);
	int valorDia;
	//asociamos la variable con el parametro en el contructor
	//esto diaSemana son private
	//toda enumeracion hereda enum
	DiaSemana(int valorDia) {
		this.valorDia=valorDia;
	}
	//para saber que valor asocioado tiene cada dia 
	public int getValor() {
		return valorDia;
	}
	public DiaSemana getConstant(int V) {
		switch (V) {
		case 1:
			return DiaSemana.Lunes;
		}
		return null;
	}
}