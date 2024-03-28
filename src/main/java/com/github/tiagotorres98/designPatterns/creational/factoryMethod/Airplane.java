package com.github.tiagotorres98.designPatterns.creational.factoryMethod;

import org.springframework.stereotype.Service;

@Service
public class Airplane implements Transport {

	@Override
	public String transport() {
		// TODO Auto-generated method stub
		return new String("Transportando via Avião");
	}

	@Override
	public TransportType type() {
		// TODO Auto-generated method stub
		return TransportType.AIRPLANE;
	}

}
