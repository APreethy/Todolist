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
fail("Not yet implemented");
}

@Test
public void testAdd() 
{
fail("Not yet implemented");
}

@Test
public void testEditAt() 
{
fail("Not yet implemented");
}

@Test
public void testRemoveAt() 
{
fail("Not yet implemented");
}

@Test
public void testSize() 
{
fail("Not yet implemented");
}
    
}
