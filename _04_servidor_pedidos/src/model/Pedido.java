package model;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	private int idPedido;
	private String producto;
	private int unidades;
	private LocalDate fecha;
	private String tienda;
}
