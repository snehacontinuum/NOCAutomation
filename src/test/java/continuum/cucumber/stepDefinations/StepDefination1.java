package continuum.cucumber.stepDefinations;

import continuum.cucumber.Page.NocHomePage;
import continuum.cucumber.Page.PageFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination1 extends PageFactory { 

	
	@When("^User clicks on  ITS(\\d+) Tools Main Menu$")
	public void user_clicks_on_ITS_Tools_Main_Menu(int arg1) throws Throwable {
		nocHomePage.ITS247tools();
	    
	}

	@Then("^Verify Correct Sub menus get displayed$")
	public void verify_Correct_Sub_menus_get_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		nocHomePage.ITS247tools();
	   
	}
	
	@When("^User clicks on Analysis  Main Menu$")
	public void user_clicks_on_Analysis_Main_Menu() throws Throwable {
	    nocHomePage.Analysis();
	   
}
	
	
	@When("^User clicks on Settings  Main Menu$")
	public void user_clicks_on_Settings_Main_Menu() throws Throwable {
		nocHomePage.Settings();
	    
	}

	@Then("^Verify Correct Sub menus get displayed  in Settings Main Menu$")
	public void verify_Correct_Sub_menus_get_displayed_in_Settings_Main_Menu() throws Throwable {
		nocHomePage.Settings();
	   
	
}
	
	@When("^User clicks on Activity  Main Menu$")
	public void user_clicks_on_Activity_Main_Menu() throws Throwable {
		nocHomePage.Activity();
	 
	}
	
	@Then("^Verify Correct Sub menus get displayed  in Activity Main Menu$")
	public void verify_Correct_Sub_menus_get_displayed_in_Activity_Main_Menu() throws Throwable {
		nocHomePage.Activity();
	}

	@Then("^Verify Correct Sub menus get displayed in ITS(\\d+)Tools Main Menu$")
	public void verify_Correct_Sub_menus_get_displayed_in_ITS_Tools_Main_Menu(int arg1) throws Throwable {
		nocHomePage.ITS247tools();
	}

	@Then("^Verify Correct Sub menus get displayed in Management Main Menu$")
	public void verify_Correct_Sub_menus_get_displayed_in_Management_Main_Menu() throws Throwable {
		nocHomePage.Management();
	
	}

	@Then("^Verify Correct Sub menus get displayed in Analysis Main Menu$")
	public void verify_Correct_Sub_menus_get_displayed_in_Analysis_Main_Menu() throws Throwable {
		nocHomePage.Analysis();
	}

	@When("^User clicks on Management  Main Menu$")
	public void user_clicks_on_Management_Main_Menu() throws Throwable {
		nocHomePage.Management();
	}

	@When("^User clicks on Report  Main Menu$")
	public void user_clicks_on_Report_Main_Menu() throws Throwable {
		nocHomePage.Report();
	}

	@Then("^Verify Correct Sub menus get displayed in Report Main Menu$")
	public void verify_Correct_Sub_menus_get_displayed_in_Report_Main_Menu() throws Throwable {
		nocHomePage.Report();
	}


	@When("^User clicks on DashboardInbox  Main Menu$")
	public void user_clicks_on_DashboardInbox_Main_Menu() throws Throwable {
		nocHomePage.DashboardInbox();
		
	}

	@Then("^Verify Correct Sub menus get displayed  in DashboardInbox Main Menu$")
	public void verify_Correct_Sub_menus_get_displayed_in_DashboardInbox_Main_Menu() throws Throwable {
		nocHomePage.DashboardInbox();
	}

	@When("^User clicks on Quick Reports  Main Menu$")
	public void user_clicks_on_Quick_Reports_Main_Menu() throws Throwable {
		nocHomePage.QuickReports();
	}
	
	@Then("^Verify Correct Sub menus get displayed in Quick Reports Main Menu$")
	public void verify_Correct_Sub_menus_get_displayed_in_Quick_Reports_Main_Menu() throws Throwable {
	   nocHomePage.QuickReports();
	}
	
	

	
}
