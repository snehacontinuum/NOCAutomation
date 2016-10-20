package continuum.cucumber.Page;

import java.sql.Connection;

import org.openqa.selenium.By;
import org.testng.Reporter;

import continuum.cucumber.DatabaseUtility;
import continuum.cucumber.Locator;
import continuum.cucumber.Utilities;
import continuum.cucumber.WebdriverWrapper;

public class NOCGenerateTicketPage {
	
	 WebdriverWrapper wd=new WebdriverWrapper();
	 
	 public Locator mspSearch= new Locator(" MSP Partner search", "//input[@id='memberlike']");
	 public Locator resourceDropdown= new Locator(" Resource dropdown", "//select[@id='cboResource']");
	 public Locator familyDropdown= new Locator(" Family dropdown", "//select[@id='cboJobCat']");
	 public Locator ticketTypeDropdown= new Locator(" Ticket type dropdown", "//select[@id='CbotaskType']");
	 public Locator subjectTB= new Locator(" subject text box", "//input[@id='txtJobName']");
	 public Locator descriptionTB= new Locator(" description text box", "//textarea[@id='txtjobdesc']");
	 public Locator priority= new Locator(" priority", "//input[@id='txtPriorityLevel']");
	 public Locator statusDropdown= new Locator(" sub status dropdown", "//select[@id='cboStatus']");
	 public Locator submitBtn= new Locator(" submit btn", "//input[@id='cmdOK']");
	 public Locator subStatusDropdown= new Locator(" sub statsu dropdown", "cboSubStatusList","id");
	public Locator memberList= new Locator(" member list","//tr[@class='header_TR']");
	 public Locator memberSearchBtn= new Locator(" Memeber Search btn", "//img[@alt='select Member']");
	 
	public String createTicket(String member, String site, String resource, String datasheet) {
		String TicketNo=null;
		
		wd.waitFor(3000);
		wd.switchToNewWindow();
		wd.waitFor(5000);
		String generateTicketWindowHnd=wd.getWindowHandle();
		System.out.println("Window handle of generate ticket"+generateTicketWindowHnd);
		wd.clearandSendKeys(member, mspSearch);
		wd.clickElement(memberSearchBtn);
		wd.waitFor(8000);
		Reporter.log("Switching to member search window");
		wd.switchToNewWindow();
		wd.waitFor(5000);
		String memberSearchWindowHnd=wd.getWindowHandle();
		System.out.println("Window handle of member search"+memberSearchWindowHnd);
		wd.waitForElementToBeDisplayed(memberList, 3000);
		wd.getWebdriver().findElement(By.xpath("//tr/td[contains(text(),'"+ member+"')][1]")).click();
		wd.waitFor(3000);
		wd.switchToWindow(generateTicketWindowHnd);
		wd.waitFor(5000);
		Reporter.log("Select corresponding site");
		wd.getWebdriver().findElement(By.xpath("//input[contains(@value,'"+site+"')]")).click();
		wd.waitFor(2000);
		wd.clearandSendKeys("Automation test ticket", subjectTB);
		wd.clearandSendKeys("Description:automation test ticket", descriptionTB);
		wd.clearandSendKeys("99", priority);

		wd.selectByTextFromDropDown(familyDropdown,"Antivirus");
		wd.selectValueByIndexFromDropDown(ticketTypeDropdown, 0);
		
	    String status=wd.getSelectedValue(statusDropdown);
	    if(status.equalsIgnoreCase("New"))
		        wd.selectByValueFromDropDown(statusDropdown, "New");
		wd.waitForAjax();
		wd.selectValueByIndexFromDropDown(subStatusDropdown, 1);
		wd.selectByValueFromDropDown(resourceDropdown, resource);
		wd.clickElement(submitBtn);
		Reporter.log("Get ticket no from popup");
		String ticMsg=wd.getAlertMessage(3000);
		System.out.println("Ticket msg"+ticMsg);
		wd.acceptAlert();
		int last=ticMsg.length();
		TicketNo=ticMsg.substring(last-18,last);
		TicketNo=TicketNo.replace("/","").replace("-","").trim();
		Reporter.log("Generated Ticket no"+TicketNo);
		System.out.println("Ticket no"+TicketNo);
		return TicketNo;
	}

	public String TicketNoFromDB(String nocTicket) {
		    Reporter.log("Verify Ticket  generated in DB");
		   
		    wd.waitFor(60000);
		   String databaseName= Utilities.getMavenProperties("DBName");
		   String sqlServerURL= Utilities.getMavenProperties("DBServerUrl");
		   String username= Utilities.getMavenProperties("DBUsername");
		   String password= Utilities.getMavenProperties("DBPwd");
		    Connection conn=DatabaseUtility.createConnection(databaseName, sqlServerURL, username, password);
		    String query="Select status,Assignto,assigntocell,Assigntogroup,Assigntouser,* from jmgttaskmanagement with(NOLOCK) where taskid in "+nocTicket;
		    String result=DatabaseUtility.executQuery(conn, query);
		    Reporter.log("Ticket details from DB :"+result);
		    System.out.println("Result ="+result);
		    return result;
	}

}
