package com.alexandroreis.curso.entities.enums;

public enum StatusDoPedido {
	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int cod;
	
	private StatusDoPedido(int cod) {
		this.cod = cod;
	}
	public int getCod() {
		
		return cod;
		
	}
	public static StatusDoPedido valueOf(int cod) {
		for(StatusDoPedido valor : StatusDoPedido.values()) {
			if(valor.getCod() == cod) {
				return valor;
			}
			throw new IllegalArgumentException("Código de status inválido");
		}
		return null;
	}

}
