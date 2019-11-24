package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@IdClass(ProductoId.class)
@Table(name = "productos_distribuidora")
public class Producto {
	// CLAVES
	@Id
	@Column(name="bar_code")
	private String barCode;
	// Generalmente las listas son numericas pero puede haber listas como 'empleado' o 'lista_calle'
	@Id
	private String lista;
	// CLAVES
	
	
	// Nombre del producto  'Caramelo Masticable MISKY' 
	private String product;
	// Descripcion: 'x 400 GR'
	private String briefing;
	// Seteo precio como string para no tener problemas de tipos
	// Manejar esta inconsistencia a futuro
	private String precio;
	
	private String imagen;
	
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getBriefing() {
		return briefing;
	}
	public void setBriefing(String briefing) {
		this.briefing = briefing;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getLista() {
		return lista;
	}
	public void setLista(String lista) {
		this.lista = lista;
	}
	
}
