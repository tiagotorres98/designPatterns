package com.github.tiagotorres98.designPatterns.creational.abstractFactory.factory;

import org.springframework.stereotype.Service;

import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IFirePokemon;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IGrassPokemon;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IInitialsPokemonsFactory;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IWaterPokemon;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.PokemonCity;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.fire.Chimchar;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.grass.Turtwig;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.pokemon.water.Piplup;

@Service
public class SinnohPokemonsFactory implements IInitialsPokemonsFactory {

	@Override
	public IWaterPokemon getWaterPokemon() {
		// TODO Auto-generated method stub
		return new Piplup();
	}

	@Override
	public IFirePokemon getFirePokemon() {
		// TODO Auto-generated method stub
		return new Chimchar();
	}

	@Override
	public IGrassPokemon getGrassPokemon() {
		// TODO Auto-generated method stub
		return new Turtwig();
	}

	@Override
	public PokemonCity getCity() {
		// TODO Auto-generated method stub
		return PokemonCity.SINNOH;
	}

}
