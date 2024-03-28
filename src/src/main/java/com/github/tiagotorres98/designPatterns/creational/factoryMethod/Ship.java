package com.github.tiagotorres98.designPatterns.creational.factoryMethod;

import org.springframework.stereotype.Service;

@Service
public class Ship implements Transport {

	@Override
	public String transport() {
		// TODO Auto-generated method stub
		return new String("Transportando via Barco");
	}

	@Override
	public TransportType type() {
		// TODO Auto-generated method stub
		return TransportType.SHIP;
	}

}
