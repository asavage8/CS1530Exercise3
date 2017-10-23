import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;



public class ExTest{
	
	@Test
	public void TriTest0(){
		assertEquals(Ex.Tri(0),0);
	}
	
	@Test
	public void TriTest2(){
		assertEquals(Ex.Tri(2),3);
	}
	
	@Test
	public void TriTest5(){
		assertEquals(Ex.Tri(5),15);
	}
	
	@Test
	public void LazyTest0(){
		assertEquals(Ex.Lazy(0),1);
	}
	
	@Test
	public void LazyTest2(){
		assertEquals(Ex.Lazy(2),4);
	}
	@Test
	public void LazyTest5(){
		assertEquals(Ex.Lazy(5),16);
	}
}
