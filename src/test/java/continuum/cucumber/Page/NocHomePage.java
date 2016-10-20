package continuum.cucumber.Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import continuum.cucumber.DriverFactory;
import continuum.cucumber.Locator;
import continuum.cucumber.Utilities;
import continuum.cucumber.WebdriverWrapper;

public class NocHomePage {

	
	WebdriverWrapper wd=new WebdriverWrapper();
	
	public Locator closeBtnPopup= new Locator("Close btn on popup","//div[@id='highslide-wrapper-0']/div/div/div/div/ul/li[4]/a"); 
	public Locator managementTab=new Locator("management Tab","//table[@id='dm0m0i1it']//td[@id='dm0m0i1tdT']");
	public Locator ticketsTab= new Locator("Tickets tab ","//table[@id='dm0m4tbl']//td[@id='dm0m4i2tdT']");
	public Locator ticketsTabHighlighted= new Locator("Tickets tab ","//table[@id='dm0m0i1it']//td[@class='dmText2']");
	public Locator generateTicket=new Locator("Generate New ticket btn","//table[@id='dm0m6i2it']/tbody/tr/td[2]");
	public Locator management= new Locator("Management dropdown", ".//*[@id='dm0m0i8tdT']/div");
	public Locator quickreports= new Locator("Quick reports", "//table[@id='dm0m0i5it']//td[@id='dm0m0i5tdT']/div");
	public Locator ticketreport=new Locator("Ticket Report link","//table[@class='dmSubmenu']//td[@id='dm0m30i0tdT']");
	public Locator ticketidbox=new Locator("Ticket Id input box","//td[8]//input");
	public Locator ticketStatus=new Locator("Ticket status","//");
	public Locator ticketLink=new Locator("Ticket link","//table");
	public Locator view=new Locator("View Button","Button1","id");
	public Locator FrameName=new Locator("Click on Frame","frameTaskComments","Name");
	public Locator NewLink=new Locator("New Link","//tr[2]/td//tr[2]/td[1]//td[1]/a");
	public Locator manualTriag= new Locator("Manual Triage Link", ".//*[@id='dm0m12i0tdT']");
	public Locator clickChkbox=new Locator("Click on Check box","//html//tr[1]/td/input[1]");
	public Locator clickSubmit=new Locator("Click on Submit button","buttReadNotes","id");
	public Locator tabManagement=new Locator("Click on Management link","//table//td[2]/div[contains(text(),'Management')]");
    public Locator editUserframe=new Locator("Edit user frame","frmEditUser","id");
    public Locator emailId= new Locator("Login email id textbox", "//input[@name='txtUser']");
	public Locator password= new Locator("Login password text box", "//input[@name='txtPassword']");
	public Locator loginBtn= new Locator("Login button", "Submit","id");
	
	//ITS247 tools//
	public Locator ITS247=new Locator("ITS247 Tools", "//table[@id='dm0m0i7it']/tbody/tr/td[2]");
	public Locator ITS247tools=new Locator ("ITS247submenu","//table[@id='dm0m39i0it']/tbody/tr/td[2]" );   
	public Locator ITS247toolsAdvanced = new Locator ("ITS247submenu", "//table[@id='dm0m39i1it']/tbody/tr/td[2]");
	
	
	
	
	public Locator Analysis = new Locator ("Analysis", "//table[@id='dm0m0i6it']/tbody/tr/td[2]");
	public Locator TicketPerformancereport = new  Locator ("TicketPerformancereport", "//table[@id='dm0m38i0it']/tbody/tr/td[2]");
	public Locator Liveuserreport = new  Locator ("Liveuserreport", "//table[@id='dm0m38i1it']/tbody/tr/td[2]");
	public Locator Alertfluctuation = new  Locator ("Alertfluctuation", "//table[@id='dm0m38i2it']/tbody/tr/td[2]");
	public Locator WorlloadAlert = new  Locator ("WorlloadAlert", "//table[@id='dm0m38i3it']/tbody/tr/td[2]");
	public Locator TicketAnalysisReport = new  Locator ("TicketAnalysisReport", "//table[@id='dm0m38i4it']/tbody/tr/td[2]");
	public Locator Last24Devicedown = new  Locator ("Last24Devicedown", "//table[@id='dm0m38i5it']/tbody/tr/td[2]");
	public Locator LmiRescueAnalysis = new  Locator ("LmiRescueAnalysis", "//table[@id='dm0m38i6it']/tbody/tr/td[2]");
	
	
	//Settings//
	public Locator Settings = new  Locator ("Settings", "//table[@id='dm0m0i3it']/tbody/tr/td[2]");
	public Locator Usersettings = new  Locator ("Usersettings", "//table[@id='dm0m17i0it']/tbody/tr/td[2]");
	public Locator MessageBoard = new  Locator ("MessageBoard", "//table[@id='dm0m17i1it']/tbody/tr/td[2]");
	public Locator ViewFAQ = new  Locator ("ViewFAQ", "//table[@id='dm0m17i2it']/tbody/tr/td[2]");
	public Locator Scheduledticketdue = new  Locator ("Scheduledticketdue", "//table[@id='dm0m17i3it']/tbody/tr/td[2]");
	public Locator Closedalertreminder = new  Locator ("Closedalertreminder", "//table[@id='dm0m17i4it']/tbody/tr/td[2]");
	public Locator Handoverrequest = new  Locator ("Handoverrequest", "//table[@id='dm0m17i5it']/tbody/tr/td[2]"); 
	public Locator Handoverrecive = new  Locator ("Handoverrecive", "//table[@id='dm0m17i6it']/tbody/tr/td[2]");
	
	
	// Activity Tab //
	public Locator Activity = new  Locator ("Activity", "//table[@id='dm0m0i0it']/tbody/tr/td[2]");
	public Locator MenuAccessManagement = new  Locator ("MenuAccessManagement", "//table[@id='dm0m1i0it']/tbody/tr/td[2]");
	public Locator SwtichGroup = new  Locator ("SwtichGroup", "//table[@id='dm0m1i1it']/tbody/tr/td[2]");
	public Locator UserManagement = new  Locator ("UserManagement", "//table[@id='dm0m1i2it']/tbody/tr/td[2]");
	public Locator OldEventManagement = new  Locator ("OldEventManagement", "//table[@id='dm0m1i3it']/tbody/tr/td[2]");
	public Locator AutoTicketRuleVeritas = new  Locator ("AutoTicketRuleVeritas", "//table[@id='dm0m1i4it']/tbody/tr/td[2]");
	public Locator AllowbypassTL = new  Locator ("AllowbypassTL", "//table[@id='dm0m1i5it']/tbody/tr/td[2]");
	public Locator Addknowledgebase = new  Locator ("Addknowledgebase", "//table[@id='dm0m1i6it']/tbody/tr/td[2]");
	public Locator ManageFAQKBArticle = new  Locator ("ManageFAQKBArticle", "//table[@id='dm0m1i7it']/tbody/tr/td[2]");
	public Locator UpdateUser = new  Locator ("UpdateUser", "//table[@id='dm0m1i8it']/tbody/tr/td[2]");
	public Locator MainDashboardConfig = new  Locator ("MainDashboardConfig", "//table[@id='dm0m1i9it']/tbody/tr/td[2]");
	public Locator EscalationCategoryRelationship = new  Locator ("EscalationCategoryRelationship", "//table[@id='dm0m1i10it']/tbody/tr/td[2]");
	public Locator PartnerNOCSupportconfig = new  Locator ("PartnerNOCSupportconfig", "//table[@id='dm0m1i11it']/tbody/tr/td[2]");
	public Locator ReasonAssigntoMSP = new  Locator ("ReasonAssigntoMSP", "//table[@id='dm0m1i12it']/tbody/tr/td[2]");
	public Locator ManageAutoTicketTemplate = new  Locator ("ManageAutoTicketTemplate", "//table[@id='dm0m1i13it']/tbody/tr/td[2]");
	public Locator ManageSubStatus = new  Locator ("ManageSubStatus", "//table[@id='dm0m1i14it']/tbody/tr/td[2]");
	
	// Management Tab //
	public Locator Management = new  Locator ("Management", "//table[@id='dm0m0i1it']/tbody/tr/td[2]");
	public Locator IntellimonAlerts = new  Locator ("IntellimonAlerts", "//table[@id='dm0m4i0it']/tbody/tr/td[2]");
	public Locator Alerts = new  Locator ("Alerts", "//table[@id='dm0m4i1it']/tbody/tr/td[2]");
	public Locator Tickets = new  Locator ("Tickets", "//table[@id='dm0m4i2it']/tbody/tr/td[2]");
	public Locator TamIndiaDashboard = new  Locator ("TamIndiaDashboard", "//table[@id='dm0m4i3it']/tbody/tr/td[2]");
	public Locator PartnerFeedback = new  Locator ("PartnerFeedback", "//table[@id='dm0m4i4it']/tbody/tr/td[2]");
	public Locator PartnerFlag = new  Locator ("PartnerFlag", "//table[@id='dm0m4i5it']/tbody/tr/td[2]");
	public Locator ManagedCustomerSurvetDetails = new  Locator ("ManagedCustomerSurvetDetails", "//table[@id='dm0m4i6it']/tbody/tr/td[2]");
	public Locator ConnectwiseSiteMapping = new  Locator ("ConnectwiseSiteMapping", "//table[@id='dm0m4i7it']/tbody/tr/td[2]");
	public Locator ContinuumContinuty = new  Locator ("ConnectwiseSiteMapping", "//table[@id='dm0m4i8it']/tbody/tr/td[2]");
	public Locator ManagedPSAPartnetUser = new  Locator ("ManagedPSAPartnetUser", "//table[@id='dm0m4i9it']/tbody/tr/td[2]");
	public Locator SLADashboardConditionMapping = new  Locator ("SLADashboardConditionMapping", "//table[@id='dm0m4i10it']/tbody/tr/td[2]");
	public Locator Priotization = new  Locator ("Priotization", "//table[@id='dm0m4i11it']/tbody/tr/td[2]");
	public Locator NOCWorkflowRedesign = new  Locator ("NOCWorkflowRedesign", "//table[@id='dm0m4i12it']/tbody/tr/td[2]");
	public Locator EmailtoTicket = new  Locator ("EmailtoTicket", "//table[@id='dm0m4i13it']/tbody/tr/td[2]");
	
	
	//Reports//
	public Locator Report = new  Locator ("Report", "//table[@id='dm0m0i2it']/tbody/tr/td[2]");
	public Locator MNList = new  Locator ("MNList", "//table[@id='dm0m12i0it']/tbody/tr/td[2]");
	public Locator Alert = new  Locator ("Alert", "//table[@id='dm0m12i1it']/tbody/tr/td[2]");
	public Locator ReportTicket = new  Locator ("ReportTicket", "//table[@id='dm0m12i2it']/tbody/tr/td[2]");
	public Locator NOCUsersReport = new  Locator ("NOCUsersReport", "//table[@id='dm0m12i3it']/tbody/tr/td[2]");
	public Locator ReportITS247Tools = new  Locator ("ReportITS247Tools", "//table[@id='dm0m12i4it']/tbody/tr/td[2]");
	public Locator EscalationAuditReport = new  Locator ("EscalationAuditReport", "//table[@id='dm0m12i5it']/tbody/tr/td[2]");
	public Locator PartnerDefinedMonitoring = new  Locator ("PartnerDefinedMonitoring", "//table[@id='dm0m12i6it']/tbody/tr/td[2]");
	public Locator PartnerSupportPortal = new  Locator ("PartnerSupportPortal", "//table[@id='dm0m12i7it']/tbody/tr/td[2]");
	public Locator PerformanceReport = new  Locator ("PerformanceReport", "//table[@id='dm0m12i8it']/tbody/tr/td[2]");
	public Locator PSAReport = new  Locator ("PSAReport", "//table[@id='dm0m12i9it']/tbody/tr/td[2]");
	public Locator PartnetAlertCQTicketDetails = new  Locator ("PartnetAlertCQTicketDetails", "//table[@id='dm0m12i10it']/tbody/tr/td[2]");
	public Locator NOCMISReport = new  Locator ("NOCMISReport", "//table[@id='dm0m12i11it']/tbody/tr/td[2]");
	public Locator RealTimePlayStatusManagement = new  Locator ("RealTimePlayStatusManagement", "//table[@id='dm0m12i12it']/tbody/tr/td[2]");
	public Locator FalseAlarmReport = new  Locator ("FalseAlarmReport", "//table[@id='dm0m12i13it']/tbody/tr/td[2]");
	public Locator SMSSummaryReport = new  Locator ("SMSSummaryReport", "//table[@id='dm0m12i14it']/tbody/tr/td[2]");
	public Locator IntellimonKnowledgebaseReport = new  Locator ("IntellimonKnowledgebaseReport", "//table[@id='dm0m12i15it']/tbody/tr/td[2]");
	public Locator CustomerFeedbackSurveyReport = new  Locator ("CustomerFeedbackSurveyReport", "//table[@id='dm0m12i16it']/tbody/tr/td[2]");
	public Locator TechAdvantageReport = new  Locator ("TechAdvantageReport", "//table[@id='dm0m12i17it']/tbody/tr/td[2]");
	public Locator MSPUserDetails = new  Locator ("MSPUserDetails", "//table[@id='dm0m12i18it']/tbody/tr/td[2]");
	public Locator ManualSurverDetails = new  Locator ("ManualSurverDetails", "//table[@id='dm0m12i19it']/tbody/tr/td[2]");
	
	
	//Dashboard/Inbox//
	public Locator DashboardInbox = new  Locator ("DashboardInbox", "//table[@id='dm0m0i4it']/tbody/tr/td[2]");
	public Locator PartnetCommunicationInbox = new  Locator ("PartnetCommunicationInbox", "//table[@id='dm0m18i0it']/tbody/tr/td[2]");
	public Locator TeamboxShort = new  Locator ("TeamboxShort", "//table[@id='dm0m18i1it']/tbody/tr/td[2]");
	public Locator GlobalServiceDeskInbox = new  Locator ("GlobalServiceDeskInbox", "//table[@id='dm0m18i2it']/tbody/tr/td[2]");
	public Locator NocWorkflowRedesignBeta = new  Locator ("NocWorkflowRedesignBeta", "//table[@id='dm0m18i3it']/tbody/tr/td[2]");
	public Locator ContinuumVaultDashboard = new  Locator ("ContinuumVaultDashboard", "//table[@id='dm0m18i4it']/tbody/tr/td[2]");
	public Locator OffHRmaint = new  Locator ("OffHRmaint", "//table[@id='dm0m18i5it']/tbody/tr/td[2]");
	public Locator ServerAlerts = new  Locator ("ServerAlerts", "//table[@id='dm0m18i6it']/tbody/tr/td[2]");
	public Locator VeritasBackupAlert = new  Locator ("VeritasBackupAlert", "//table[@id='dm0m18i7it']/tbody/tr/td[2]");
	public Locator CommonAlert = new  Locator ("CommonAlert", "//table[@id='dm0m18i8it']/tbody/tr/td[2]");
	public Locator DeviceDownPreprocessing = new  Locator ("DeviceDownPreprocessing", "//table[@id='dm0m18i9it']/tbody/tr/td[2]");
	public Locator AgentMalfunctionInbox = new  Locator ("AgentMalfunctionInbox", "//table[@id='dm0m18i10it']/tbody/tr/td[2]");
	public Locator ApplicationMonitoring = new  Locator ("ApplicationMonitoring", "//table[@id='dm0m18i11it']/tbody/tr/td[2]");
	public Locator CallingQueue = new  Locator ("CallingQueue", "//table[@id='dm0m18i12it']/tbody/tr/td[2]");
	public Locator PreventiveMaintenanceInbox = new  Locator ("PreventiveMaintenanceInbox", "//table[@id='dm0m18i13it']/tbody/tr/td[2]");
	public Locator EmergencyLowDiskSpace = new  Locator ("EmergencyLowDiskSpace", "//table[@id='dm0m18i14it']/tbody/tr/td[2]");
	public Locator EmailTransactionMonitoring = new  Locator ("EmailTransactionMonitoring", "//table[@id='dm0m18i15it']/tbody/tr/td[2]");
	public Locator VSSWriterAlerts = new  Locator ("VSSWriterAlerts", "//table[@id='dm0m18i16it']/tbody/tr/td[2]");
	public Locator PCService = new  Locator ("PCService", "//table[@id='dm0m18i17it']/tbody/tr/td[2]");
	public Locator ServerProjects = new  Locator ("ServerProjects", "//table[@id='dm0m18i18it']/tbody/tr/td[2]");
	public Locator LinuxDashboard = new  Locator ("LinuxDashboard", "//table[@id='dm0m18i19it']/tbody/tr/td[2]");
	public Locator TechAdvantageDesktop = new  Locator ("TechAdvantageDesktop", "//table[@id='dm0m18i20it']/tbody/tr/td[2]");
	public Locator TechAdvantageServer = new  Locator ("TechAdvantageServer", "//table[@id='dm0m18i21it']/tbody/tr/td[2]");
	public Locator PSAMonitoringDashboard = new  Locator ("PSAMonitoringDashboard", "//table[@id='dm0m18i22it']/tbody/tr/td[2]");
	public Locator SLADashboardAlert = new  Locator ("SLADashboardAlert", "//table[@id='dm0m18i23it']/tbody/tr/td[2]");
	public Locator SLADashboardTickets = new  Locator ("SLADashboardTickets", "//table[@id='dm0m18i24it']/tbody/tr/td[2]");
	public Locator PSTInbox = new  Locator ("PSTInbox", "//table[@id='dm0m18i25it']/tbody/tr/td[2]");
	
	//QuickReports//
	public Locator QuickReports = new  Locator ("QuickReports", "//table[@id='dm0m0i5it']/tbody/tr/td[2]");
	public Locator TicketReport = new  Locator ("TicketReport", "//table[@id='dm0m30i0it']/tbody/tr/td[2]");
	public Locator AlertReport = new  Locator ("AlertReport", "//table[@id='dm0m30i1it']/tbody/tr/td[2]");
	public Locator QRMNList = new  Locator ("QRMNList", "//table[@id='dm0m30i2it']/tbody/tr/td[2]");
	public Locator AlertsCount = new  Locator ("AlertsCount", "//table[@id='dm0m30i3it']/tbody/tr/td[2]");
	public Locator EmergencyAlert = new  Locator ("EmergencyAlert", "//table[@id='dm0m30i4it']/tbody/tr/td[2]");
	public Locator NOCDefinedApplication = new  Locator ("NOCDefinedApplication", "//table[@id='dm0m30i5it']/tbody/tr/td[2]");
	public Locator UserPresenceAllocation = new  Locator ("UserPresenceAllocation", "//table[@id='dm0m30i6it']/tbody/tr/td[2]");
	public Locator QRCallingQueue = new  Locator ("QRCallingQueue", "//table[@id='dm0m30i7it']/tbody/tr/td[2]");
	public Locator ConditionalMonitoringReport = new  Locator ("ConditionalMonitoringReport", "//table[@id='dm0m30i8it']/tbody/tr/td[2]");
	public Locator UserReview = new  Locator ("UserReview", "//table[@id='dm0m30i9it']/tbody/tr/td[2]");
	public Locator MSOQuickSearch = new  Locator ("MSOQuickSearch", "//table[@id='dm0m30i10it']/tbody/tr/td[2]");
	public Locator MACAgentReport = new  Locator ("MACAgentReport", "//table[@id='dm0m30i11it']/tbody/tr/td[2]");
	public Locator RMMAgentReport = new  Locator ("RMMAgentReport", "//table[@id='dm0m30i12it']/tbody/tr/td[2]");
	public Locator VaultAgentReport = new  Locator ("VaultAgentReport", "//table[@id='dm0m30i13it']/tbody/tr/td[2]");
	public Locator MSPReasonCodesReport = new  Locator ("MSPReasonCodesReport", "//table[@id='dm0m30i14it']/tbody/tr/td[2]");
	public Locator HistoricalData = new  Locator ("HistoricalData", "//table[@id='dm0m30i15it']/tbody/tr/td[2]");
	public Locator TicketSynclog = new  Locator ("TicketSynclog", "//table[@id='dm0m30i16it']/tbody/tr/td[2]");
	public Locator RMMVaultC247Reports = new  Locator ("RMMVaultC247Reports", "//table[@id='dm0m30i17it']/tbody/tr/td[2]");
	public Locator AlertTicketAgingReport = new  Locator ("AlertTicketAgingReport", "//table[@id='dm0m30i18it']/tbody/tr/td[2]");
	public Locator SLAMissedHourlyFlowReport = new  Locator ("SLAMissedHourlyFlowReport", "//table[@id='dm0m30i19it']/tbody/tr/td[2]");
	public Locator RightAnswersReport = new  Locator ("RightAnswersReport", "//table[@id='dm0m30i20it']/tbody/tr/td[2]");
	public Locator ContinuumContinuityReport = new  Locator ("RightAnswersReport", "//table[@id='dm0m30i21it']/tbody/tr/td[2]");
	public Locator SubStatusReport = new  Locator ("SubStatusReport", "//table[@id='dm0m30i22it']/tbody/tr/td[2]");
	public Locator ServerProjectSubStatusReport = new  Locator ("ServerProjectSubStatusReport", "//table[@id='dm0m30i23it']/tbody/tr/td[2]");
	public Locator RightAnswerUtilization = new  Locator ("RightAnswerUtilization", "//table[@id='dm0m30i24it']/tbody/tr/td[2]");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//
	//public Locator rememberMeCheckbox=new Locator("Remember me checkbox","//span[@class='cust_checkbox checkbox cust_checkbox_off']");
	
public void startNOCApplication(String url){
		wd.openApplication(url);
	
	}

	public void loginToNocPortal(String emaild, String pwd){
		          
         wd.waitFor(3000);
		
         Reporter.log("Enter login credentials  to ITS portal");
        
	 	 wd.sendKeys(emaild, emailId);
		 wd.sendKeys(pwd, password);

		 wd.clickElement(loginBtn);
		 wd.waitFor(2000);
		 closePopup();
		}		
         

	
	

	
	
		public void closePopup() {
			wd.waitFor(9000);
		//	wd.switchToFrame(editUserframe);
			//wd.waitForElementToBeClickable(closeBtnPopup, 3000);
			wd.clickElement(closeBtnPopup);
			wd.waitFor(2000);
			if(wd.findElementPresent(closeBtnPopup))
				wd.clickUsingJavaScript(closeBtnPopup);
			
		}
		
		
		public void ITS247tools(){
		
			wd.mouseHover(ITS247);
			wd.waitFor(1000);
			Assert.assertEquals(wd.findElementPresent(ITS247),true,"ITS247 Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(ITS247tools),true,"ITS247tools Tools sub menu Main menu is present");
			Assert.assertEquals(wd.findElementPresent(ITS247toolsAdvanced),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
		}
		
		public void Analysis(){
			
			wd.mouseHover(Analysis);
			wd.waitFor(1000);
			Assert.assertEquals(wd.findElementPresent(Analysis),true,"Analysis Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(TicketPerformancereport),true,"TicketPerformancereport Tools sub menu Main menu is present");
			Assert.assertEquals(wd.findElementPresent(Liveuserreport),true,"Liveuserreport Tools sub menu Main menu is present");
			Assert.assertEquals(wd.findElementPresent(Alertfluctuation),true,"Alertfluctuation Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(WorlloadAlert),true,"WorlloadAlert Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(TicketAnalysisReport),true,"TicketAnalysisReport Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(Last24Devicedown),true,"Last24Devicedown Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(LmiRescueAnalysis),true,"LmiRescueAnalysis Tools Main menu is present");
			
			
		}
		
		
		
public void Settings(){
			
			wd.mouseHover(Settings);
			wd.waitFor(1000);
			Assert.assertEquals(wd.findElementPresent(Settings),true,"Settings Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(Usersettings ),true,"Usersettings Tools sub menu Main menu is present");
			Assert.assertEquals(wd.findElementPresent(MessageBoard ),true,"MessageBoard Tools sub menu Main menu is present");
			Assert.assertEquals(wd.findElementPresent(ViewFAQ ),true,"ViewFAQ Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(Scheduledticketdue ),true,"Scheduledticketdue Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(Closedalertreminder ),true,"Closedalertreminder Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(Handoverrequest ),true,"Handoverrequest Tools Main menu is present");
			Assert.assertEquals(wd.findElementPresent(Handoverrecive ),true,"Handoverrecive Tools Main menu is present");
			
			
		}
		


public void Activity(){

	wd.mouseHover(Activity);
	wd.waitFor(1000);
	Assert.assertEquals(wd.findElementPresent(Activity ),true,"ITS247 Tools Main menu is present");
	Assert.assertEquals(wd.findElementPresent(MenuAccessManagement ),true,"ITS247tools Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(SwtichGroup ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(UserManagement  ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(OldEventManagement  ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(AutoTicketRuleVeritas  ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(AllowbypassTL  ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(Addknowledgebase   ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ManageFAQKBArticle   ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(UpdateUser   ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(MainDashboardConfig   ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(EscalationCategoryRelationship    ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PartnerNOCSupportconfig    ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ReasonAssigntoMSP     ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ManageAutoTicketTemplate     ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ManageSubStatus     ),true,"ITS247toolsAdvanced Tools sub menu Main menu is present");
	
}
		

public void Management(){

	wd.mouseHover(Management);
	wd.waitFor(1000);
	Assert.assertEquals(wd.findElementPresent(Management),true,"Management Main menu is present");
	Assert.assertEquals(wd.findElementPresent(IntellimonAlerts  ),true,"IntellimonAlerts Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(Alerts  ),true,"Alerts Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(Tickets   ),true,"Tickets Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(TamIndiaDashboard    ),true,"TamIndiaDashboard  Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PartnerFeedback   ),true,"PartnerFeedback Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PartnerFlag   ),true,"PartnerFlag Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ManagedCustomerSurvetDetails    ),true,"ManagedCustomerSurvetDetails Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ConnectwiseSiteMapping    ),true,"ConnectwiseSiteMapping Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ContinuumContinuty    ),true,"ContinuumContinuty Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(SLADashboardConditionMapping    ),true,"SLADashboardConditionMapping Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ManagedPSAPartnetUser     ),true,"ManagedPSAPartnetUser Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(Priotization     ),true,"Priotization Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(NOCWorkflowRedesign      ),true,"NOCWorkflowRedesign Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(EmailtoTicket      ),true,"EmailtoTicket Tools sub menu Main menu is present");
	
	

}


public void Report(){

	wd.mouseHover(Report);
	wd.waitFor(1000);
	Assert.assertEquals(wd.findElementPresent(Report ),true,"Report Main menu is present");
	Assert.assertEquals(wd.findElementPresent(MNList   ),true,"MNList Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(Alert   ),true,"Alert Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ReportTicket ),true,"ReportTicket Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(NOCUsersReport),true,"NOCUsersReport Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ReportITS247Tools),true,"ReportITS247Tools Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(EscalationAuditReport),true,"EscalationAuditReport Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PartnerDefinedMonitoring     ),true,"PartnerDefinedMonitoring Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PartnerSupportPortal),true,"PartnerSupportPortal Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PerformanceReport),true,"PerformanceReport Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PSAReport ),true,"PSAReport Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PartnetAlertCQTicketDetails      ),true,"PartnetAlertCQTicketDetails Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(NOCMISReport  ),true,"NOCMISReport Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(RealTimePlayStatusManagement       ),true,"RealTimePlayStatusManagement Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(FalseAlarmReport   ),true,"FalseAlarmReport Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(SMSSummaryReport ),true,"SMSSummaryReport Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(IntellimonKnowledgebaseReport        ),true,"IntellimonKnowledgebaseReport Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(CustomerFeedbackSurveyReport        ),true,"CustomerFeedbackSurveyReport Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(TechAdvantageReport ),true,"TechAdvantageReport Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(MSPUserDetails),true,"MSPUserDetails Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ManualSurverDetails),true,"ManualSurverDetails Tools sub menu Main menu is present");
	
	

}

public void DashboardInbox(){

	wd.mouseHover(DashboardInbox);
	wd.waitFor(1000);
	Assert.assertEquals(wd.findElementPresent(DashboardInbox ),true,"DashboardInbox Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PartnetCommunicationInbox ),true,"PartnetCommunicationInbox Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(TeamboxShort    ),true,"TeamboxShort Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(GlobalServiceDeskInbox  ),true,"GlobalServiceDeskInbox Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(NocWorkflowRedesignBeta ),true,"NocWorkflowRedesignBeta Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ContinuumVaultDashboard ),true,"ContinuumVaultDashboard Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(OffHRmaint ),true,"OffHRmaint Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ServerAlerts      ),true,"ServerAlerts Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(VeritasBackupAlert ),true,"VeritasBackupAlert Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(CommonAlert ),true,"CommonAlert Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(DeviceDownPreprocessing  ),true,"DeviceDownPreprocessing Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(AgentMalfunctionInbox       ),true,"AgentMalfunctionInbox Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ApplicationMonitoring   ),true,"ApplicationMonitoring Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(CallingQueue        ),true,"CallingQueue Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PreventiveMaintenanceInbox    ),true,"PreventiveMaintenanceInbox Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(EmergencyLowDiskSpace  ),true,"EmergencyLowDiskSpace Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(EmailTransactionMonitoring         ),true,"EmailTransactionMonitoring Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(VSSWriterAlerts         ),true,"VSSWriterAlerts Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PCService  ),true,"PCService Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ServerProjects ),true,"ServerProjects Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(LinuxDashboard ),true,"LinuxDashboard Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(TechAdvantageDesktop  ),true,"TechAdvantageDesktop Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(TechAdvantageServer  ),true,"TechAdvantageServer Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PSAMonitoringDashboard  ),true,"PSAMonitoringDashboard Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(SLADashboardAlert  ),true,"SLADashboardAlert Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(SLADashboardTickets  ),true,"SLADashboardTickets Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(PSTInbox  ),true,"PSTInbox Tools sub menu Main menu is present");
	
	

}


public void QuickReports(){

	wd.mouseHover(QuickReports);
	wd.waitFor(1000);
	Assert.assertEquals(wd.findElementPresent(QuickReports  ),true,"DashboardInbox Main menu is present");
	Assert.assertEquals(wd.findElementPresent(TicketReport  ),true,"PartnetCommunicationInbox Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(AlertReport     ),true,"TeamboxShort Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(QRMNList   ),true,"GlobalServiceDeskInbox Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(AlertsCount  ),true,"NocWorkflowRedesignBeta Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(EmergencyAlert  ),true,"ContinuumVaultDashboard Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(NOCDefinedApplication  ),true,"OffHRmaint Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(UserPresenceAllocation       ),true,"ServerAlerts Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(QRCallingQueue  ),true,"VeritasBackupAlert Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ConditionalMonitoringReport  ),true,"CommonAlert Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(UserReview   ),true,"DeviceDownPreprocessing Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(MSOQuickSearch        ),true,"AgentMalfunctionInbox Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(MACAgentReport    ),true,"ApplicationMonitoring Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(RMMAgentReport         ),true,"CallingQueue Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(VaultAgentReport     ),true,"PreventiveMaintenanceInbox Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(MSPReasonCodesReport   ),true,"EmergencyLowDiskSpace Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(HistoricalData          ),true,"EmailTransactionMonitoring Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(TicketSynclog          ),true,"VSSWriterAlerts Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(RMMVaultC247Reports   ),true,"PCService Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(AlertTicketAgingReport  ),true,"ServerProjects Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(SLAMissedHourlyFlowReport  ),true,"LinuxDashboard Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(RightAnswersReport   ),true,"TechAdvantageDesktop Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ContinuumContinuityReport   ),true,"TechAdvantageServer Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(SubStatusReport   ),true,"PSAMonitoringDashboard Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(ServerProjectSubStatusReport   ),true,"SLADashboardAlert Tools sub menu Main menu is present");
	Assert.assertEquals(wd.findElementPresent(RightAnswerUtilization   ),true,"SLADashboardTickets Tools sub menu Main menu is present");
	
	
	

}




public void gotToGenerateTicket(){
	wd.waitFor(2000);
	
//	 wd.mouseHoverAndClick(managementTab);
//	wd.waitFor(3000);
//	//  ((JavascriptExecutor)wd.getWebdriver()).executeScript(javaScript,wd.getWebElement(ticketsTab));
//	wd.mouseHoverAndClick(ticketsTab); 
//	wd.waitFor(3000);
	wd.mouseHover(managementTab);
	wd.waitFor(100);
	wd.mouseHover(Tickets);
	wd.waitFor(200);
	//System.out.print("Clicking on generate ticket tab");
	wd.clickElement(generateTicket);
	wd.waitFor(2000);
}

		public void goToQuickReports() {
			wd.waitFor(2000);
//			wd.clickElement(quickreports);
//			wd.waitFor(500);
//	    	wd.mouseHover(ticketreport);
//	    	wd.clickElement(ticketreport);
			wd.mouseHoverAndClick(quickreports);
			wd.waitFor(1000);
			wd.clickElement(ticketreport);
			wd.waitFor(3000);
	    	wd.switchToNewWindow();
	    	wd.waitFor(3000);
	    	
	    	
		}
		
		public void verifyTicketonNoc(String ticketId)
		{
			wd.waitFor(5000);
	    	wd.sendKeys(ticketId, ticketidbox);
	    	  wd.clickElement(view);
	    	wd.waitFor(3000);
	        Assert.assertEquals(wd.findElementPresent(ticketLink),true,"Ticket is present on NOC");
	        wd.getWebdriver().close();
	        
	       
			
		}

		public void verifyStatusOnNOC(String nocTicket,String nocStatus) {
			
			wd.waitFor(5000);
			wd.sendKeys(nocTicket, ticketidbox);
	        wd.clickElement(view);
	        wd.waitFor(2000);
	        wd.switchToFrame(FrameName);
	        wd.waitFor(2000);
	        wd.clickElement(NewLink);
	        wd.waitImplicit(3000);
	        wd.switchToNewWindow();
	        wd.waitFor(2000);
	        wd.clickElement(ticketLink);
	        wd.waitFor(2000);
	        wd.switchToNewWindow();
	      //  wd.clickElement(clickChkbox);
	        wd.waitFor(2000);
	        //wd.clickElement(clickSubmit);
	        wd.dismissAlert(3000);
	        String ticket_status=wd.getText(ticketStatus);
	        if(nocStatus.contains(","))
	        {
	        	String[] status=Utilities.splitString(nocStatus);
	        	if(status[0].equalsIgnoreCase(ticket_status) ||status[1].equalsIgnoreCase(ticket_status) )
	        	    Reporter.log("Ticket Status is correctly updated on NOC");
	        	else
	        		Assert.fail("Ticket Status is not correctly updated on NOC");
	        }
	        else
			{
	        	Assert.assertEquals(ticket_status, nocStatus,"Ticket Status is correctly updated on NOC");
			}
		}

		public void openApplication(String url) {
			wd.openApplication(url);
			
		}

}