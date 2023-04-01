package br.com.alurafood.pagamentos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class ItemPedidoDTO {
	
	private Long id;
    private Integer quantidade;
    private String descricao;
    
    

}
