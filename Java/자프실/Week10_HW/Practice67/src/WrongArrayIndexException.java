
public class WrongArrayIndexException extends ArrayIndexOutOfBoundsException {
	public WrongArrayIndexException() {}
	
	public WrongArrayIndexException(String msg) {
		System.out.print(msg);
	}
}
