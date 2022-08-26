package JavaOOPs;

public class Browser {

	public void launchBrowser()
	{
		System.out.println("Launching browser");
		checkVersion();
		System.out.println("Browser launched");
	}

	private void checkVersion()
	{
		System.out.println("checking Version");
	}
}
