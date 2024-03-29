package com.github.tiagotorres98.designPatterns.creational.abstractFactory.factory;

import org.springframework.stereotype.Service;

import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IFirePokemon;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IGrassPokemon;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IInitialsPokemonsFactory;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IWaterPokemon;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.PokemonCity;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.fire.Cyndaquil;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.grass.Chikorita;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.water.Totodile;

@Service
public class JohtoPokemonsFactory implements IInitialsPokemonsFactory {

	@Override
	public IWaterPokemon getWaterPokemon() {
		// TODO Auto-generated method stub
		return new Totodile();
	}

	@Override
	public IFirePokemon getFirePokemon() {
		// TODO Auto-generated method stub
		return new Cyndaquil();
	}

	@Override
	public IGrassPokemon getGrassPokemon() {
		// TODO Auto-generated method stub
		return new Chikorita();
	}

	@Override
	public PokemonCity getCity() {
		// TODO Auto-generated method stub
		return PokemonCity.JOHTO;
	}

}
