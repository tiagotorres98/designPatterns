package com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.fire;

import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IFirePokemon;

public class Cyndaquil implements IFirePokemon {

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
