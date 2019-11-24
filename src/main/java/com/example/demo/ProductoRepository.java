package com.example.demo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, ProductoId>{
	
	//@Query("SELECT p FROM Producto p WHERE p.barCode = ?1 AND p.lista = ?2 LIMIT 1")
	ArrayList<Producto> findByBarCodeAndLista(String barCode, String lista);
	
}
