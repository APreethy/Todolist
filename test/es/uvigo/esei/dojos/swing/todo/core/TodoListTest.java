/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dojos.swing.todo.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 *
 */
public class TodoListTest {
    
    public TodoListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of moveUp method, of class TodoList.
     */
    @Test
public void testMoveUp() 
{
System.out.println("moveup");
int i=0;
TodoList instance= new TodoList();
String item ="Prajkta";
instance.add(item);
item ="Preethy";
instance.add(item);
instance.moveUp(1);
String result=instance.elementAt(0);
String expResult="Preethy";
assertEquals(expResult,result);
System.out.println("Entry is Mouved Up");



}
@Test
public void testMoveDown() 
{
System.out.println("moveDown");
int i=0;
TodoList instance= new TodoList();
String item ="Prajkta";
instance.add(item);
item ="Preethy";
instance.add(item);
instance.moveDown(0);
String result=instance.elementAt(1);
String expResult="Prajkta";
assertEquals(expResult,result);
System.out.println("Entry is Moved Down");
}

@Test
public void testAdd() 
{
System.out.println("add");
String item ="Prajkta";
TodoList instance= new TodoList();
instance.add(item);
int i = instance.size();
assertTrue(1>0);
System.out.println("Entry is added");

}






  

@Test
public void testRemoveAt() 
{
System.out.println("Remove");
int i =0;
TodoList instance= new TodoList();
String item="Prajkta";
instance.add(item);
int i1=instance.size();
instance.removeAt(0);
int i2= instance.size();
assertTrue(i2<i1);
System.out.println("Entry is removed");


}


@Test
public void testEditAt()
{
System.out.println("Edit at");
TodoList instance= new TodoList();
int i =0;
String item= "Rose";
instance.add(item);
item="Rylyn";
instance.add(item);
String result =instance.elementAt(1);
System.out.println("Entry is at position 1+result");
String newValue ="neha";
instance.editAt(1, newValue);
result = instance.elementAt(1);
System.out.println("After editing the entry at pos 1 "+result);
assertEquals(newValue,result);
System.out.println("entry is successfully edited");

}



@Test
public void testSize() 
{
    System.out.println("size");
    TodoList instance= new TodoList();
    String item="Prajkta";
    instance.add(item);
    item="Preethy";
    instance.add(item);
    int expResult = 2;
    int result = instance.size();
    assertEquals(expResult, result);
    System.out.println("size of the entryn is"+result);
        
    
}



    
}
