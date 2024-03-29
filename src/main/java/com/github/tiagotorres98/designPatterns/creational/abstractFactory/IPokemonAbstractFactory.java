package com.github.tiagotorres98.designPatterns.creational.abstractFactory;

public interface IPokemonAbstractFactory {

	public IInitialsPokemonsFactory getFactory(PokemonCity city);
	public IInitialsPokemonsFactory getInjectedFactory(PokemonCity city);
	
}
