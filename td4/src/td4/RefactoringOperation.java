package td4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //accesible à l'exécution
//anottation accesible aux classes, attributs et methodes
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD}) //pas de ElementType.PARAMETER
@Repeatable(RefactoringOperations.class)
public @interface RefactoringOperation {

	public abstract String actorName();
	public abstract RefactoringName nom();
	public abstract String comment();
	public abstract boolean isInEclipse();
	public abstract int nbCases();
	
}
