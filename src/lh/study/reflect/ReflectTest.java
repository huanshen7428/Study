package lh.study.reflect;

import java.lang.reflect.*;

import org.junit.Test;

public class ReflectTest {
public static void main(String[] args) throws Exception {
	Class class0 = Class.forName("lh.study.reflect.Person");
	Class class1 = new Person().getClass();
	Class class2 = Person.class;
	
	//��ȡ�ض���ĳ������
	Method sayhello = class1.getMethod("sayHello");
	class1.getConstructors();
	class1.getField("name");
	
	//��ȡ��������з���
	Method[] methods = class1.getDeclaredMethods();
	System.out.println(methods[0]);
	
	
	//ִ�л�ȡ�ķ���
	Object obj  = sayhello.invoke(class1.newInstance(), null);//��һ�����������÷����Ķ��󣻺�ߵĿɱ���������ú��������
	
	
	//�������main����
	Method mainMethod = class1.getMethod("main", String[].class);
	mainMethod.invoke(null, new Object[] {new String[] {"aa","bb"}});
	mainMethod.invoke(null, (Object)new String[] {"aa","bb"});
	
	
	//��������
	Constructor c = class1.getConstructor(null);
	Person person = (Person)c.newInstance();
	person.sayHello();
	
	//��������
	person = (Person)class1.newInstance();
	
	//�����ֶ�
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
