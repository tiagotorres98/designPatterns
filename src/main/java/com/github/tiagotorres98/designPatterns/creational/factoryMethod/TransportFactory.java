package com.github.tiagotorres98.designPatterns.creational.factoryMethod;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.tiagotorres98.designPatterns.creational.factoryMethod.transport.Airplane;
import com.github.tiagotorres98.designPatterns.creational.factoryMethod.transport.Ship;
import com.github.tiagotorres98.designPatterns.creational.factoryMethod.transport.Truck;

@Service
public class TransportFactory implements ITransportFactory {

	@Autowired
	private List<Transport> transportList;
	
	@Override
	public Transport getTransport(TransportType type) {
		// TODO Auto-generated method stub
		List<Transport> result = new ArrayList<Transport>();
		result.add(new Ship());
		result.add(new Truck());
		result.add(new Airplane());
		
		return result.stream()
				.filter(f->f.type().equals(type))
				.findFirst()
				.orElseThrow(NullPointerException::new);
	}

	@Override
	public Transport getTransportBySpringInjection(TransportType type) {
		return transportList.stream()
				.filter(f->f.type().equals(type))
				.findFirst()
				.orElseThrow(NullPointerException::new);
	}

}
