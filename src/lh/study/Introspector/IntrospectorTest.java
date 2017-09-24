package lh.study.Introspector;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Enumeration;
import java.util.Iterator;

import org.junit.Test;

/**
 * 使用内省api操作bean的属性
 * @author Administrator
 *
 */
public class IntrospectorTest {

	@Test
	public void test1() throws Exception{
		BeanInfo info = Introspector.getBeanInfo(Person.class);
		PropertyDescriptor[] pds = info.getPropertyDescriptors();
		for(PropertyDescriptor pd:pds) {
			System.out.println(pd.getName());
		}
		BeanDescriptor bdscript = info.getBeanDescriptor();
		Enumeration<String> it = bdscript.attributeNames();
		System.out.println("=="+it.toString());
		
	}
}
