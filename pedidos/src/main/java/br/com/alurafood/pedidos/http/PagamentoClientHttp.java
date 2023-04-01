package br.com.alurafood.pedidos.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("pagamentos-ms")
public interface PagamentoClientHttp {
	
	@RequestMapping(method=RequestMethod.GET, value="/pagamentos/{id}")
	void consultaPedido(@PathVariable Long id);
	
}
