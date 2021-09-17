package com.desafioibm.apirest.controller;

import com.desafioibm.apirest.model.ExpectativasMensais;
import com.desafioibm.apirest.repository.ExpectativasMensaisRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class ExpectativasMensaisController {

	@Autowired
	ExpectativasMensaisRepository expectativasMensalRepository;


	@GetMapping("/lista")
	public List<ExpectativasMensais> mostrarMensal() {
		return expectativasMensalRepository.findAll();
	}

	@GetMapping("/lista/{id}")
	public ExpectativasMensais mostrarMensal(@PathVariable(value = "id") Long id) {
		return expectativasMensalRepository.findById(id).get();
	}


	@PutMapping("/lista")
	public ExpectativasMensais colocarMensais(@RequestBody ExpectativasMensais mensal){
		return expectativasMensalRepository.save(mensal);
	}
	@PostMapping ("/lista")
	public ExpectativasMensais publicar(@RequestBody ExpectativasMensais mensal){
		return expectativasMensalRepository.save(mensal);
	}

	@DeleteMapping("/lista/{id}")
	public void deletarMensal(@PathVariable(value = "id")Long id){
		expectativasMensalRepository.deleteById(id);
	}



}
