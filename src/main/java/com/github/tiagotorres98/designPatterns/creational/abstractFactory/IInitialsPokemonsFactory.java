package com.github.tiagotorres98.designPatterns.creational.abstractFactory;

public interface IInitialsPokemonsFactory {

	public IWaterPokemon getWaterPokemon();
	public IFirePokemon getFirePokemon();
	public IGrassPokemon getGrassPokemon();
	public PokemonCity getCity();
}
