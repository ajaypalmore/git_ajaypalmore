var webdriver = require('selenium-webdriver'),
By = require('selenium-webdriver').By,
until = require('selenium-webdriver').until;
//var driver = new webdriver.Builder().withCapabilities(webdriver.Capabilities.chrome()).build();
var driver = new webdriver.Builder().forBrowser('chrome').build();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
	
driver.get("https://www.freecrm.com");
var promise = driver.getTitle();
promise.then(function(title){
	console.log('Title is :::: '+title);
	
});
driver.findElement(By.name("username")).sendKeys("ajaypalmore");
driver.findElement(By.name("password")).sendKeys("ajay1234");
driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(webdriver.Key.ENTER);

promise.then(function(title){
	console.log('Title is :::: '+title);
	driver.quit();
});