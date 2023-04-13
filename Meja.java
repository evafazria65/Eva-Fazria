public class Meja{
	public int kaki_meja()
	{
	return 70;
	}
	public int alas_meja(){
	return 120;
	}
public static void main(String [] args){
Meja nana = new Meja();
int kaki = nana.kaki_meja();
int alas_meja = nana.alas_meja();
System.out.println(kaki * alas_meja); 
}
}