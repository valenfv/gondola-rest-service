package com.example.demo;

import java.net.URISyntaxException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {	
	@Autowired
	private ProductoRepository pr;
	
	@RequestMapping("/")
    public String index() {
        return "Whattaudoing";
    }
	
	@RequestMapping("/barcode/{barCode}/lista/{lista}")
    public Producto get(@PathVariable String barCode, @PathVariable String lista) throws URISyntaxException{		
		return pr.findById(new ProductoId(barCode, lista)).orElse(null);
    }
	@PostMapping("/nuevo")
	public Producto nuevo(@RequestBody Producto nuevoProducto) {
		return pr.save(nuevoProducto);
	} 

}
