package com.example.estudo.certificacao;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.estudo.certificacao.components.ServiceToMock;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EstudoCertificacaoApplicationTests {

	@Test
	public void contextLoads() {
	}

	//dá pra mockar com xml também, obviamente o mock abaixo não faz nada
	@Test
	public void testServiceToMock() {
		ServiceToMock dataServiceMock = mock(ServiceToMock.class);

		int i = dataServiceMock.somar(1, 1);

		assertEquals(2, i);
	}

}
