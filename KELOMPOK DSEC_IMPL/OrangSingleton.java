/**
*
* @author Kelompok DSEC
*
*/
public class OrangSingleton {
	private String nama = null;
	private static OrangSingleton instance = null;
	private OrangSingleton (String inputNama) {
		this.nama = inputNama;
	}
	public void setNama(String inputNama)
	{
		this.nama = inputNama;
	}
	public String getNama()
	{
		return this.nama;
	}
	public static OrangSingleton getInstance(String inputNama)
	{
		if (instance == null)
	{
		instance = new OrangSingleton(inputNama);
	}
	return instance;
	}
}