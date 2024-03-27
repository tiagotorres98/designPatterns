package com.github.tiagotorres98.designPatterns.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.tiagotorres98.designPatterns.controller.CreationalPatterns;
import com.github.tiagotorres98.designPatterns.creational.singleton.Singleton;

@RestController
public class SingletonController extends CreationalPatterns{

	@GetMapping("/singleton")
	public String getCreational() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Buscando instancia Singleton. Com nome 'bob'.").append(BREAK_LINE);
		Singleton singleton1 = Singleton.getInstance();
		singleton1.setName("bob");
		builder.append("O nome do singleton1 é: ").append(singleton1.getName()).append(BREAK_LINE);
		
		builder.append(BREAK_LINE);

		builder.append("Buscando novamente instancia Singleton. Com nome 'patrick'. ").append(BREAK_LINE);
		Singleton singleton2 = Singleton.getInstance();
		singleton1.setName("patrick");
		builder.append("O nome do singleton2 é: ").append(singleton2.getName()).append(BREAK_LINE);
		
		builder.append(BREAK_LINE);
		
		builder.append("Teoricamente, como o singleton tem um único objeto instanciado, ao comparar as variaveis que armazenei o singleton, elas devem ser iguais.").append(BREAK_LINE);
		builder.append("As variáveis são iguais em relação ao objeto?").append(BREAK_LINE);
		builder.append(singleton1.equals(singleton2)).append(BREAK_LINE);
		
		builder.append(BREAK_LINE);
		
		builder.append("O nome do singleton1 é: ").append(singleton1.getName()).append(BREAK_LINE);
		builder.append("O nome do singleton2 é: ").append(singleton2.getName()).append(BREAK_LINE);
		builder.append("Como o singleton sempre vai retornar o mesmo objeto, o bob se tornou patrick. Apesar de estar armazenado em uma nova variável, o objeto é o mesmo;").append(singleton2.getName()).append(BREAK_LINE);
		
		return builder.toString();
	}
	
}
