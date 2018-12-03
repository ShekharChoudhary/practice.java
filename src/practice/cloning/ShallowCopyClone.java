package practice.cloning;

/**
 * The class whose object’s copy is to be made must have a public clone method in it or in one 
 * of its parent class.
 * Every class that implements clone() should call super.clone() to obtain the cloned object reference.
 * The class must also implement java.lang.Cloneable interface whose object clone we want to create 
 * otherwise it will throw CloneNotSupportedException when clone method is called on that class’s 
 * object.
 * 
 * Cloning can be done in two ways :-
 * - Shallow Copy
 * - Deep copy
 * 
 * https://www.geeksforgeeks.org/clone-method-in-java-2/
 * @author choudshe
 *
 */
public class ShallowCopyClone {

	
}


class Temp implements Cloneable {
	
}
