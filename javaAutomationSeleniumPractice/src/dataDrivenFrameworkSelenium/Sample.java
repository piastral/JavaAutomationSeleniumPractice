package dataDrivenFrameworkSelenium;
 abstract class WokBook {

	public abstract void rubel();
}	
	public class Sample extends WokBook{

		@Override
		public void rubel() {
			System.out.println("hello sir");
			
		}
		
		public static void main(String[] args) {
			WokBook obj = new Sample();
			obj.rubel();
		}
		
	}
	

