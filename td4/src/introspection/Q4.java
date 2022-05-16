package introspection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class Q4 {
	
	private Class<?> c1;
	private static String iprefix = "I";
	
	
	
	public Q4(Class<?> c1) {
		super();
		this.c1 = c1;
	}

	private String getInterfaceName() {
		return iprefix+c1.getSimpleName();
	}
	
	private String getFirstImplementedInterfaceName() {	
		return iprefix+this.c1.getSuperclass().getSimpleName();
	}
	
	private boolean hasOtherInterfacesToImplement() {
		return  c1.getInterfaces().length > 0;
	}
	
	public String troisiemePetitTiret() {
		ArrayList<Method> listMethodAGarder = new ArrayList<>();
		
		for (Method uneMethod : c1.getMethods()) {
			
			int mod = uneMethod.getModifiers();
			if (Modifier.isStatic(mod) || Modifier.isPublic(mod)) {
				for (Method methodDuParent : c1.getSuperclass().getMethods()) {
					if (methodDuParent.equals(uneMethod)) {
						//uneMethod déjà dans les interfaces de c1
					} else {
						if (methodDuParent.getParameterCount() == uneMethod.getParameterCount()) {
							boolean memeParametre = true;
							for (Parameter typ : methodDuParent.getParameters()) {
								for (Parameter typ2 : uneMethod.getParameters()) {
									if (typ.equals(typ2)) {
										//rien
									} else {
										memeParametre = false;
									}
								}
							}
							if (memeParametre) {								
								listMethodAGarder.add(uneMethod);
							}
						}
					}	
				}	
			}
		}
		String result = "";
		for (Method m : listMethodAGarder) {
			result += m.toGenericString() + ";\n";
		}
		return result;
	}
}
