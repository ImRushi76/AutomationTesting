public class DragAndDropAll 
{
    public static void main(String []args) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver.exe");
 	   
 	   WebDriver driver = new ChromeDriver();
 	   driver.manage().deleteAllCookies();
 	   driver.manage().window().maximize();
 	   
 	   driver.get("https://demoqa.com/automation-practice-form");
 	   
 	   JavascriptExecutor js = (JavascriptExecutor)driver;
 	   js.executeScript("scrollBy(0,500)");
 	   
 	   driver.findElement(By.xpath("(//div[@class=\"header-wrapper\"])[5]")).click();
 	   
 	   Thread.sleep(2000);
 	   
 	   JavascriptExecutor js1 = (JavascriptExecutor)driver;
 	   js1.executeScript("scrollBy(0,200)");
 	   
 	   driver.findElement(By.xpath("(//li[@id=\"item-3\"])[4]")).click();
 	   
 	   //******Simple***********
 	   
 	  Thread.sleep(2000);
 	   
 	   WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	   
	   WebElement drop = driver.findElement(By.xpath("(//div[@id=\"droppable\"])[1]"));
	   
	   Actions a = new Actions(driver);
	   
	   a.dragAndDrop(drag, drop).build().perform();
	   
	   Thread.sleep(2000);
 	   
 	   //************Accept**************************
	   
	   driver.findElement(By.xpath("//a[@id=\"droppableExample-tab-accept\"]")).click();
	   
       WebElement accept = driver.findElement(By.xpath("//div[@id=\"acceptable\"]"));
	   
	   WebElement drop1 = driver.findElement(By.xpath("(//div[@id=\"droppable\"])[2]"));
 	   
 	   a.dragAndDrop(accept, drop1).build().perform();
 	   
 	   //****************** Prevent pro *****************************
 	   
 	   Thread.sleep(2000);
 	   
 	   driver.findElement(By.xpath("//a[@id=\"droppableExample-tab-preventPropogation\"]")).click();
 	   
 	   WebElement drag2 = driver.findElement(By.xpath("//div[@id=\"dragBox\"]"));
 	   
 	   WebElement drop2 = driver.findElement(By.xpath("//div[@id=\"notGreedyDropBox\"]"));
 	   
 	   WebElement drop3 = driver.findElement(By.xpath("//div[@id=\"greedyDropBoxInner\"]"));
 	   
 	   a.dragAndDrop(drag2, drop2).build().perform();
 	   
 	  Thread.sleep(2000);
 	  
 	  a.dragAndDrop(drag2, drop3).build().perform();
  
    }
}
