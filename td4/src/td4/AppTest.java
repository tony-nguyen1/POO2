package td4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AppTest {

	public static void main(String[] args) {
//		Annotation[] a = Personne.class.getAnnotations();
		Method[] b = Personne.class.getDeclaredMethods();
//				
//		for(Annotation an : a) {
//			System.out.println(an);
//		}
//		
//		System.out.println(Personne.class.getName());
		
		afficheAnnotations(Personne.class);
	}
	
	public static void afficheAnnotations(Class <?> c) {
		System.out.println("Nom de la classe : ");
		System.out.println("	"+c.getName());
		System.out.println("	"+c.getSimpleName());
		System.out.println();
		
		
		System.out.println("Annotations liées aux méthodes :");
		Method[] listMethod = Personne.class.getDeclaredMethods();
		for (Method m : listMethod) {
			System.out.print("	"+m.getName()+"()");
			for(RefactoringOperation a : m.getAnnotationsByType(RefactoringOperation.class)) {
				System.out.println(" --- "+a.nom());
			}
		}
		System.out.println();
		
		System.out.println("Annotations liées aux attributs :");
		Field[] listFields = Personne.class.getFields();
		for (Field f : listFields) {
			System.out.print("	"+f.getName()+" ");
			for(RefactoringOperation a : f.getAnnotationsByType(RefactoringOperation.class)) {
				System.out.print(" --- "+a.nom());
			}
			System.out.println();
		}
		System.out.println();
	}
}
