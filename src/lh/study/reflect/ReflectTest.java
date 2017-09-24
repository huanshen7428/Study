package lh.study.reflect;

import java.lang.reflect.*;

import org.junit.Test;

public class ReflectTest {
public static void main(String[] args) throws Exception {
	Class class0 = Class.forName("lh.study.reflect.Person");
	Class class1 = new Person().getClass();
	Class class2 = Person.class;
	
	//获取特定的某个方法
	Method sayhello = class1.getMethod("sayHello");
	class1.getConstructors();
	class1.getField("name");
	
	//获取定义的所有方法
	Method[] methods = class1.getDeclaredMethods();
	System.out.println(methods[0]);
	
	
	//执行获取的方法
	Object obj  = sayhello.invoke(class1.newInstance(), null);//第一个参数，调用方法的对象；后边的可变参数，调用函数的入参
	
	
	//反射类的main方法
	Method mainMethod = class1.getMethod("main", String[].class);
	mainMethod.invoke(null, new Object[] {new String[] {"aa","bb"}});
	mainMethod.invoke(null, (Object)new String[] {"aa","bb"});
	
	
	//创建对象
	Constructor c = class1.getConstructor(null);
	Person person = (Person)c.newInstance();
	person.sayHello();
	
	//创建对象
	person = (Person)class1.newInstance();
	
	//反射字段
	Object[] fields = class1.getDeclaredFields();
	for(Object aobj:fields) {
		System.out.println("go"+aobj);
	}
	Object personObj = class1.newInstance();
	Field afield = class1.getField("name");
	Object name = afield.get(class1.newInstance());
	Class type = afield.getType();
	System.out.println("=="+type);
	System.out.println("=="+name);
	afield.set(personObj, "kangkang");
	System.out.println("=="+afield.get(personObj));
	
}

@Test
public void test1() {
	System.out.println("hello,world");
}
}
