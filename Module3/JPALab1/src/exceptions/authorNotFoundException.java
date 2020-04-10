package exceptions;

public class authorNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public authorNotFoundException(String str){
		super(str);
	}
}
