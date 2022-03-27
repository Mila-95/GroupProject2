package com.syntax.GroupProject2;

public interface WebDriver{

    void open();
    void close();
    String getTitle();

}
interface RemoteWebDriver extends com.syntax.Project.WebDriver {

    void navigate();


}
interface TakeScreenShot extends com.syntax.Project.RemoteWebDriver {

    void getScreenShot();
}
class ChromeDriver implements com.syntax.Project.RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}

class FirefoxDriver implements com.syntax.Project.RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
class SafariDriver implements com.syntax.Project.RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}

