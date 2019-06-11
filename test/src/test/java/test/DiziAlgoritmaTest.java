package test;

import org.junit.Test;

import junit.framework.Assert;

public class DiziAlgoritmaTest {
	int[] dizi = new int[] {1,5,4,6};
	
	@Test
	public void testOrtalamaHesaplaWithArray() {
		Assert.assertEquals(4d, DiziAlgoritma.ortalamaHesapla(dizi));
	}
	
	@Test(expected = NullPointerException.class)
	public void testOrtalamaWithNull() {
		DiziAlgoritma.ortalamaHesapla(null);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testOrtalamaWithEmptyString() {
		DiziAlgoritma.ortalamaHesapla(new int[] {});
	}

}
