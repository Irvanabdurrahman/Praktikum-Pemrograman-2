import org.junit.Assert;
import org.junit.Test;

public class KalkulatorTest{

	@Test
	public void testTambah(){
		Kalkulator k = new Kalkulator();
		int hasil = k.tambah(4,5);
		int seharusnya = 9;
		
		Assert.assertEquals(seharusnya, hasil);
	}
}