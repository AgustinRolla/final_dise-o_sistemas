package ar.edu.davinci.dvds20212cg7.exception;

public class BusinessException extends Exception {
	

	private static final long serialVersionUID = 8873351920972862226L;

	public BusinessException(String mensaje) {
		super(mensaje);
	}

}
