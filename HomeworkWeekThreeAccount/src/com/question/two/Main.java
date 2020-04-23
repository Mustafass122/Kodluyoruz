package com.question.two;

import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		
        LinkedList<String> list = new LinkedList<>();
        
        list.add("t");
        
        DoublyLinkedList<String> testLinked = new DoublyLinkedList<>();
        testLinked.addElement("Ali");
        testLinked.addElement("Veli");
        testLinked.writeListElements();        
        System.out.println(testLinked.size());
        
        testLinked.removeElement("Kadir");
        testLinked.writeListElements();        
        System.out.println(testLinked.size());
        
        testLinked.addElement("Yusuf");
        testLinked.addElement("Derya");
        testLinked.addElement("Nimet");
        testLinked.writeListElements();        
        System.out.println(testLinked.size());
        
        testLinked.removeElement("Burcu");
        testLinked.writeListElements();        
        System.out.println(testLinked.size());


    }
}
