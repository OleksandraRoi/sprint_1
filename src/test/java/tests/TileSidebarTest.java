package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ApplyPage;
import pages.TileSidebar_Page;
import pages.WoodSection_Page;
import pages.oneTitlePage;
import utils.Driver;

import java.util.List;

public class TileSidebarTest extends TestBase {
    TileSidebar_Page tileSidebar_page = new TileSidebar_Page();

    @Test
    public void tile() throws InterruptedException {

        tileSidebar_page.clickTileButton();
        Assert.assertEquals(tileSidebar_page.urlActual(), "https://www.flooranddecor.com/tile");
        //Thread.sleep(2000);

    }
    @Test
    public void color() throws InterruptedException {
        tileSidebar_page.clickTileButton();
        tileSidebar_page.acceptAllCookiesButton.click();
       // Thread.sleep(2000);
        tileSidebar_page.clickColorTab();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Color"));
    }
}