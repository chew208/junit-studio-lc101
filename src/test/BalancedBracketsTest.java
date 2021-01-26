package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

     @Test
    public void bracketsWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
     }

     @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
     }

     @Test
    public void doubleBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
     }


}
