package git.raphaelkauan;

import git.raphaelkauan.facade.Facade;
import git.raphaelkauan.singleton.SingletonEager;
import git.raphaelkauan.singleton.SingletonLazy;
import git.raphaelkauan.singleton.SingletonLazyHolder;
import git.raphaelkauan.startegy.Comportamento;
import git.raphaelkauan.startegy.ComportamentoAgressivo;
import git.raphaelkauan.startegy.ComportamentoNormal;
import git.raphaelkauan.startegy.Robo;

public class Main {

	public static void main(String[] args) {

		// Singleton

		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(lazy);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		// Strategy

		Comportamento defensivo = new ComportamentoAgressivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);

		robo.mover();
		robo.mover();

		// Facade

		Facade facade = new Facade();
		facade.migrarCliente("Raphael", "25352352");
	}
}
