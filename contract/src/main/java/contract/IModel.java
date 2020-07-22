package contract;

import java.util.Observable;

import entity.HelloWorld;

/**
 * The Interface IModel.
 *
 * @author Darol Kom
 */
public interface IModel {

	/**
	 * Gets the hello world
	 *
	 * @return the helloworld entity
	 */
	HelloWorld getHelloWorld();

	/**
	 * Load the message.
	 *
	 * @param code
	 *         
	 */
	void loadHelloWorld(String code);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}
