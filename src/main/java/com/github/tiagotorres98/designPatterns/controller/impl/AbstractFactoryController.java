package com.github.tiagotorres98.designPatterns.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.tiagotorres98.designPatterns.controller.CreationalPatterns;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IInitialsPokemonsFactory;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IPokemonAbstractFactory;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.PokemonCity;

@RestController
public class AbstractFactoryController extends CreationalPatterns {

	@Autowired
	private IPokemonAbstractFactory factory;

	@Override
	@GetMapping(value = { "/abstractFactory", "/abstractFactory/{str}" })
	public String getCreational(@PathVariable(required = false) String str) {
		StringBuilder builder = new StringBuilder();
		try {
			if (str == null) {
				builder.append("Selecione a cidade:").append(BREAK_LINE);
				for (PokemonCity t : PokemonCity.values()) {
					String cityName = t.toString();
					builder.append(" - ").append(link("/creational/abstractFactory/" + cityName, cityName))
							.append(BREAK_LINE);
				}
			} else {
				PokemonCity type = PokemonCity.valueOf(str.toUpperCase());
				IInitialsPokemonsFactory pokemonFactory = factory.getInjectedFactory(type);
				builder.append("Nome do pokemon de fogo: ")
						.append(pokemonFactory.getFirePokemon().getNome()).append(BREAK_LINE);
				builder.append("Nome do pokemon de agua: ")
						.append(pokemonFactory.getWaterPokemon().getNome()).append(BREAK_LINE);
				builder.append("Nome do pokemon de grama: ")
						.append(pokemonFactory.getGrassPokemon().getNome()).append(BREAK_LINE);

			}
		} catch (IllegalArgumentException e) {
			builder = new StringBuilder();
			builder.append(String.format("Não existe a cidade com nome '%s'", str));
		}

		return builder.toString();
	}

}
