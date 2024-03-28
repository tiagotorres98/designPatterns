package com.github.tiagotorres98.designPatterns.creational.factoryMethod;

public interface ITransportFactory {

	public Transport getTransport(TransportType type);

	public Transport getTransportBySpringInjection(TransportType type);
}
