package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Usuario;
import com.example.demo.repositories.UsuarioRepository;

@RestController
@CrossOrigin("*") 

/*http://localhost:8080/pagina*/
@RequestMapping( value = "/pagina")
public class MinhaController {
	
	
	@Autowired
	private UsuarioRepository repository;
	
	
	/*http://localhost:8080/pagina */
	/* esta url você usa la  no metodo do javascript */
	
	@PostMapping
	public Usuario inserirPessoa (@RequestBody Usuario pessoa){
		Usuario result = repository.save(pessoa);
		return result;
	}
	
	
	/*http://localhost:8080/pagina*/
	/* esta url você usa la  no metodo do javascript */
	
	@GetMapping 
	public List<Usuario> findAll(){
		List<Usuario> result = repository.findAll();
		return result;
	}
	
	

	/*http://localhost:8080/pagina/1( esse numero 1 é o id  ) */
	
	@DeleteMapping("/{id}")
	public Optional<Usuario> excluirUsuario (@PathVariable Long id) {
		Optional<Usuario>  result = repository.findById(id);
		repository.deleteById(id);
		return result;
	}
		
	

}
