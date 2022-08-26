package Abstract;

public abstract class Page {
	
	public Page(){
		System.out.println("Page default constructor");
	}
	
	public Page(String h) {
		System.out.println("Page defined constructor");
	}
	public abstract void title();
	public abstract void url();
	public void header() {
		System.out.println("Page Header");
	
	}
   public final void logo()
   {
	   System.out.println("Page logo...");
   }
}
