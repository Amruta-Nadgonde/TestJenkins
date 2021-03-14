package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import demo.App;

public class AppTest {
  @Test
  public void addTest() {
	  
	  int exp = 10;
	  int act = App.add(8, 2);
	  assertEquals(act, exp);
  }
  
  @Test
  public void subTest() {
	  
	  int exp = 10;
	  int act = App.sub(18, 8);
	  assertEquals(act, exp);
  }
  
  @Test
  public void mulTest() {
	  
	  int exp = 10;
	  int act = App.sub(5, 2);
	  assertEquals(act, exp);
  }
}
