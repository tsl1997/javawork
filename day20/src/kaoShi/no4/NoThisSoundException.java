package kaoShi.no4;

public class NoThisSoundException extends Exception{
	/**无参*/
	public NoThisSoundException() {
		super();
	}
	/**有参*/
	public NoThisSoundException(String message) {
		super(message);
	}
}
