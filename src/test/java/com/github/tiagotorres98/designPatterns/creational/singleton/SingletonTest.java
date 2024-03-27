package com.github.tiagotorres98.designPatterns.creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingletonTest {

	@Test
	public void shouldBeSameInstanceObject() {
	// Preparação
		Singleton singleton1 = null;
		Singleton singleton2 = null;
		
	// Ação
		singleton1 = Singleton.getInstance();
		singleton2 = Singleton.getInstance();
		
		singleton1.setName("Joe");
		singleton2.setName("Bob");
		
	// Afirmação
		assertEquals(singleton1, singleton2);
		assertEquals(singleton1.getName(), "Bob");
		assertEquals(singleton2.getName(), "Bob");
	}

}
