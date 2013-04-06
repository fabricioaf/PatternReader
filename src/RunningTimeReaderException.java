
public class RunningTimeReaderException extends Exception {

	String message;
	
	public RunningTimeReaderException(String message) {
		super(message);
		this.message=message;
	}
	
	public String getMessage(){
		return this.message;
	}
}
