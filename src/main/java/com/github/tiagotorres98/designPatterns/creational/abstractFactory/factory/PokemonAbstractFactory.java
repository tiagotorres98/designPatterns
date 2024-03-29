package com.github.tiagotorres98.designPatterns.creational.abstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IInitialsPokemonsFactory;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.IPokemonAbstractFactory;
import com.github.tiagotorres98.designPatterns.creational.abstractFactory.PokemonCity;

@Service
public class PokemonAbstractFactory implements IPokemonAbstractFactory {

	@Autowired
	private List<IInitialsPokemonsFactory> listFactory;
	
	@Override
	public IInitialsPokemonsFactory getFactory(PokemonCity city) {
		// TODO Auto-generated method stub
		List<IInitialsPokemonsFactory> listFactory = new ArrayList<IInitialsPokemonsFactory>();
		listFactory.add(new JohtoPokemonsFactory());
		listFactory.add(new KantoPokemonsFactory());
		listFactory.add(new SinnohPokemonsFactory());
		return listFactory.stream().filter(f->f.getCity().equals(city))
				.findFirst().get();
	}

	@Override
	public IInitialsPokemonsFactory getInjectedFactory(PokemonCity city) {
		// TODO Auto-generated method stub
		return listFactory.stream().filter(f->f.getCity().equals(city))
				.findFirst().get();
	}

}
