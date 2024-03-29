package com.github.tiagotorres98.designPatterns.creational.factoryMethod;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.tiagotorres98.designPatterns.creational.factoryMethod.transport.Airplane;
import com.github.tiagotorres98.designPatterns.creational.factoryMethod.transport.Ship;
import com.github.tiagotorres98.designPatterns.creational.factoryMethod.transport.Truck;

@SpringBootTest
public class FactoryMethodTest {

	@Test
	public void shouldFactoryByTransportType() {
		// Preparação
		TransportFactory factory = new TransportFactory();
		
		// Ação
		Transport transportAirplane = factory.getTransport(TransportType.AIRPLANE);
		Transport transportShip = factory.getTransport(TransportType.SHIP);
		Transport transportTruck = factory.getTransport(TransportType.TRUCK);
		
		// Afirmação
		assertTrue(transportAirplane instanceof Airplane);
		assertTrue(transportShip instanceof Ship);
		assertTrue(transportTruck instanceof Truck);
	}

}
