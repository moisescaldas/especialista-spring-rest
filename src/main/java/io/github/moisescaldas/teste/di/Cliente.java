package io.github.moisescaldas.teste.di;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
	public Cliente() {
		System.out.println("Cliente Carregado");
	}
}
