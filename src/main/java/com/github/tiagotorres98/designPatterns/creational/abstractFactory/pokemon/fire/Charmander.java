package com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.fire;

import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IFirePokemon;

public class Charmander implements IFirePokemon {

	@Override
	public String getNome() {
		return this.getClass().getSimpleName();
	}

}
