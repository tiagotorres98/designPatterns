package com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.water;

import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IWaterPokemon;

public class Totodile implements IWaterPokemon {

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
