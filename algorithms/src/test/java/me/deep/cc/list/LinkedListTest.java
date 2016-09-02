package me.deep.cc.list;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Linked list implementation.
 *
 * @author Gagandeep Singh
 */
public class LinkedListTest {

    @Test
    public void testGreet() throws Exception {
        LinkedList list = new LinkedList();
        Assert.assertEquals("Expected and actual object are not same.", list.greet(), "Hello World!");
    }
}