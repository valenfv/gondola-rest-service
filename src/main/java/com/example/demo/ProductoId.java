package com.example.demo;

import java.io.Serializable;

public class ProductoId implements Serializable {
	private String barCode;
	// Generalmente las listas son numericas pero puede haber listas como 'empleado' o 'lista_calle'
	private String lista;
	
	
	public ProductoId() {
		super();
	}
	public ProductoId(String barCode, String lista) {
		super();
		this.barCode = barCode;
		this.lista = lista;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barCode == null) ? 0 : barCode.hashCode());
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoId other = (ProductoId) obj;
		if (barCode == null) {
			if (other.barCode != null)
				return false;
		} else if (!barCode.equals(other.barCode))
			return false;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		return true;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getLista() {
		return lista;
	}
	public void setLista(String lista) {
		this.lista = lista;
	}
}
