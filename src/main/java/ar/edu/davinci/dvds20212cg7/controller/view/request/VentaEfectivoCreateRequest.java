package ar.edu.davinci.dvds20212cg7.controller.view.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VentaEfectivoCreateRequest {

	private Long clienteId;
	
	private String fecha; 
}
