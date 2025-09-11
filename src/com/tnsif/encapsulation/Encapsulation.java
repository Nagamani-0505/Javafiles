package com.tnsif.encapsulation;

public class Encapsulation {
	
	int serialnumber;
	String name;
	int age;

void show() {
	System.out.println(serialnumber +""+name+""+age);
}

public static void main(String[] args) {
	Encapsulation e=new Encapsulation ();
	
	e.serialnumber=1;
	e.name="Sudheer";
	e.age=25;
	
	e.show();
}
}
