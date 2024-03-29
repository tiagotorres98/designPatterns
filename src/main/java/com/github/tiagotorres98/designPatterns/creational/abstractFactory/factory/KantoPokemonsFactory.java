package com.github.tiagotorres98.designPatterns.creational.abstractFactory.factory;

import org.springframework.stereotype.Service;

import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IFirePokemon;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IGrassPokemon;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IInitialsPokemonsFactory;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IWaterPokemon;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.PokemonCity;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.fire.Charmander;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.grass.Bulbasaur;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.water.Squirtle;

@Service
public class KantoPokemonsFactory implements IInitialsPokemonsFactory {

	@Override
	public IWaterPokemon getWaterPokemon() {
		// TODO Auto-generated method stub
		return new Squirtle();
	}

	@Override
	public IFirePokemon getFirePokemon() {
		// TODO Auto-generated method stub
		return new Charmander();
	}

	@Override
	public IGrassPokemon getGrassPokemon() {
		// TODO Auto-generated method stub
		return new Bulbasaur();
	}

	@Override
	public PokemonCity getCity() {
		// TODO Auto-generated method stub
		return PokemonCity.KANTO;
	}

}
