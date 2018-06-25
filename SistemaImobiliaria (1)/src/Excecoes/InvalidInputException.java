package Excecoes;

public class InvalidInputException extends Exception {
	private static final long serialVersionUID = 2000L;
	private String msg;
	
	public InvalidInputException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public InvalidInputException(String msg, Throwable cause) {
		super(msg,cause);
	}

	public String getUserMessage() {
		return msg;
	}
}
