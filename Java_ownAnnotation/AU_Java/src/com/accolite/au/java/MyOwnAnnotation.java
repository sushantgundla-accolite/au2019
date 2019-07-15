package com.accolite.au.java;
import java.lang.annotation.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyOwnAnnotation {

	public static void main(String[] args) throws IOException {
		Test obj = new Test();
		Servlet ann = obj.getClass().getAnnotation(Servlet.class);
		
		File file = new File("C:\\Users\\sushant.gundla\\Desktop\\Annotation.xml");
		FileWriter writer = new FileWriter(file);
		writer.write("Servlet");
		writer.write(String.format("<name> %s </name>\n",ann.name()));
		writer.write(String.format("<url> %s </url>\n",ann.url()));
		writer.write(String.format("<class_name> %s </class_name>\n",obj.getClass().getName()));
		writer.write("</Servlet>\n");
		writer.close();
	}

}

@Servlet(name="Sushant",url="www.google.com")
class Test{
	static int value = 10;
}

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE)
@interface Servlet{  
String name();  
String url();  
} 
