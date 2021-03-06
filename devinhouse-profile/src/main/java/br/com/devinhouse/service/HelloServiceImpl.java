package br.com.devinhouse.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String forWho) {
		return String.format("Hello: %s!", forWho);
	}

}
