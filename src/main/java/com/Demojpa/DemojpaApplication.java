package com.Demojpa;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Demojpa.models.Categoria;

@SpringBootApplication
public class DemojpaApplication implements CommandLineRunner {

	private static final String repoCategoria = null;

	public static void main(String[] args) {
		SpringApplication.run(DemojpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//testConexion(); 
	    //guardar();
		//buscarPorId();
		//modificar();	
	}	
		
	private void testConexion() {
		System.out.println("Probando conexion");
	}
	
	private void guardar() {
        Categoria categoria = new Categoria();
        categoria.setNombre("Trips en la playa");
        categoria.setDescripcion("Todo tipo de paseos en la playa");
        repoCategoria.save(categoria);
    }
	
	private void buscarPorId() {
		Optional<Categoria> optional = repoCategoria.findById(1);
		if (optional.isPresent ())
			System.out.printeln(optional.get() .getNombre());
		else 
			System.out.println("Categoria no encontrada");
	}
	
	private void modificar() {
		Optional<Categoria> optional = repoCategoria.findById(1);
		if (optional.isPresent()) {
			Categoria catTemp = new Categoria();
			catTemp = optional.get();
			catTemp.setNombre("Caminatas en el volcan");
			catTemp.setNombre("Exigentes caminatas al crater del volcan de San Salvador");
			repoCategoria.save(catTemp);
			System.out.println(optional.get());
		}else
			System.out.println("Categoria no encontrada");
		
	}
	
}
