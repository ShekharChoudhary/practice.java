package practice.myAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Java annotations are simple data that we can attach to program elements like 
 * classes, fields or methods. True power of annotations lies in the fact that we are 
 * able to retrieve this information at runtime.
 * Annotations are declared using @interface keyword
 * Annotation declaration is very similar to interface declaration, in fact annotations 
 * are interfaces that are implemented by JVM behind the scene.
 * @author choudshe
 *
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunAtStartup {

	int priority();
	String method() default "run";
}
