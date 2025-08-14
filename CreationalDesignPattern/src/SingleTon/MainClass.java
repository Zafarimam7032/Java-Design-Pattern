package SingleTon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainClass {
	
	public static void main(String[] args) throws Exception{
		
		Constructor<PreventSingleTonDesignPattern> declaredConstructors = PreventSingleTonDesignPattern.class.getDeclaredConstructor();
		
		declaredConstructors.setAccessible(true);
		
		PreventSingleTonDesignPattern newInstance = declaredConstructors.newInstance();
		
		PreventSingleTonDesignPattern getinstance = PreventSingleTonDesignPattern.getinstance();
		
		System.out.println(newInstance.hashCode());
		System.out.println(getinstance.hashCode());
	}

}
