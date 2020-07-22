package contract;

import java.io.IOException;

/**
 * The Interface IView.
 *
 * @author Darol Kom
 */
public interface IView {

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
	void printMessage(final String message);
	void update();
	public void displayPlayer();
	/**
	 * 
	 * @throws IOException
	 */
	public void rockFall() throws IOException;
}
