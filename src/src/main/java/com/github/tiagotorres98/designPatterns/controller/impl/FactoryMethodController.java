package com.github.tiagotorres98.designPatterns.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.tiagotorres98.designPatterns.controller.CreationalPatterns;
import com.github.tiagotorres98.designPatterns.creational.factoryMethod.ITransportFactory;
import com.github.tiagotorres98.designPatterns.creational.factoryMethod.Transport;
import com.github.tiagotorres98.designPatterns.creational.factoryMethod.TransportType;

@RestController
public class FactoryMethodController extends CreationalPatterns {

	@Autowired
	private ITransportFactory factory;

	@GetMapping(value = { "/factoryMethod", "/factoryMethod/{str}" })
	public String getCreational(@PathVariable(required = false) String str) {
		StringBuilder builder = new StringBuilder();
		try {
			if (str == null) {
				builder.append("Selecione o tipo de transporte:").append(BREAK_LINE);
				for (TransportType t : TransportType.values()) {
					builder.append(t.toString()).append(BREAK_LINE);
				}
				builder.append("creational/factoryMethod/suaOpcao").append(BREAK_LINE);
			} else {
				TransportType type = TransportType.valueOf(str.toUpperCase());
				Transport transport = factory.getTransport(type);
				builder.append(transport.transport());
			}
		} catch (IllegalArgumentException e) {
			builder = new StringBuilder();
			builder.append(String.format("Não existe transporte com nome '%s'", str));
		}

		return builder.toString();
	}

}
