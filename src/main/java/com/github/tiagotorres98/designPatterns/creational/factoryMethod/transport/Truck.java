package com.github.tiagotorres98.designPatterns.creational.factoryMethod.transport;

import org.springframework.stereotype.Service;

import com.github.tiagotorres98.designPatterns.creational.factoryMethod.Transport;
import com.github.tiagotorres98.designPatterns.creational.factoryMethod.TransportType;

@Service
public class Truck implements Transport {

	@Override
	public String transport() {
		// TODO Auto-generated method stub
		return new String("Transportando via Caminhão");
	}

	@Override
	public TransportType type() {
		// TODO Auto-generated method stub
		return TransportType.TRUCK;
	}

}
