package com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.grass;

import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IGrassPokemon;

public class Chikorita implements IGrassPokemon {

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
