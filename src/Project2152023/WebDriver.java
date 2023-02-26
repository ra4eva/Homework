package Project2152023;

public interface WebDriver {
    void open();
    void close();
    String getTitle();

}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{
    void navigate();

    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{

    public void getScreenshot() {
        System.out.println("screenshot");
    }

    @Override
    public void open() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate browser");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    public void getScreenshot() {
        System.out.println("screenshot");
    }

    @Override
    public void open() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate browser");
    }
}
class SafariDriver implements RemoteWebDriver{
    public void getScreenshot() {
        System.out.println("screenshot");

    }

    @Override
    public void open() {
        System.out.println("Open Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari browser");

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate browser");
    }
}

