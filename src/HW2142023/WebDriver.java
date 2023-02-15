package HW2142023;

public interface WebDriver {

    void openBrowser();
    void maximizeWindow();
    void findElement();
    void closeBrowser();

}
class Chrome implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximized Chrome window");
    }

    @Override
    public void findElement() {
        System.out.println("searching for Elements");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}

class FireFox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening the url in Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximized FireFox window");
    }

    @Override
    public void findElement() {
        System.out.println("searching for Elements");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Firefox");
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        WebDriver [] browswers={new Chrome(),new FireFox()};
        for (WebDriver browser:browswers){
            browser.openBrowser();
            browser.maximizeWindow();
            browser.findElement();
            browser.closeBrowser();
        }
    }
}