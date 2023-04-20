package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewUser_Repo {
	public @FindBy (xpath="//*[@id=\\\"DivUser\\\"]/span/span[2]") WebElement admin;
	public @FindBy (linkText="View users") WebElement viewuser;
	public @FindBy (id="ContentPlaceHolder1_txtInstruction") WebElement Search;
	public @FindBy (id="ContentPlaceHolder1_ddlStatSearch") WebElement statusDD;
	public @FindBy (id="ContentPlaceHolder1_ddlusertype") WebElement status2DD;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnSearch") WebElement searchButton;
	public @FindBy (id="ContentPlaceHolder1_gvUsers_lnkEdit_0") WebElement DDedit;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnadd") WebElement addButton;
	public @FindBy (id="ContentPlaceHolder1_btnlnkSave") WebElement addsaveButton;
	public @FindBy (xpath="//button[@onclick=\"CloseSucess()\"]") WebElement addsavewarButton;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnclear") WebElement clearButton;
	public @FindBy (id="ContentPlaceHolder1_txtFname") WebElement firstname;
	public @FindBy (id="ContentPlaceHolder1_txtLastName") WebElement lastname;
	public @FindBy (id="Hyperlink") WebElement addUsersBackButton;
	public @FindBy (id="ContentPlaceHolder1_txtEmail") WebElement email;
	public @FindBy (id="ContentPlaceHolder1_txtUserRole") WebElement userrole;
	public @FindBy (id="ContentPlaceHolder1_txtPhone") WebElement phonenum;
	public @FindBy (id="ContentPlaceHolder1_LinkButton7") WebElement savecloseButton;
	public @FindBy (id="ContentPlaceHolder1_rblinstalluser") WebElement installeruser;
	public @FindBy (id="ContentPlaceHolder1_ddlinstaller") WebElement installeruserDD;
	public @FindBy (id="ContentPlaceHolder1_lnk_Hyperlink") WebElement emailedit;
	public @FindBy (id="btnupdatemailrst") WebElement emailbackButton;
	public @FindBy (id="ContentPlaceHolder1_LinkButton5") WebElement passwordedit;
	public @FindBy (id="ContentPlaceHolder1_txtNewPwd") WebElement newpassword;
	public @FindBy (id="ContentPlaceHolder1_txtConfirmPwd") WebElement connewpassword;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnUpdPwd") WebElement resetButton;
	public @FindBy (xpath="//*[@id=\"ContentPlaceHolder1_kt_modal_update_password\"]/div/div/div[1]/button") WebElement passwordbackButton;
	public @FindBy (id="ContentPlaceHolder1_LinkButton8") WebElement status;
	public @FindBy (id="ContentPlaceHolder1_rblenablestatus") WebElement Disableyes;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnSaveSUser") WebElement statusupdate;
	public @FindBy (id="ContentPlaceHolder1_Button4") WebElement statusupdatemsg;
	public @FindBy (xpath="//*[@id=\"ContentPlaceHolder1_kt_modal_update_role\"]/div/div/div[1]/button") WebElement statusBackButton;
	public @FindBy (id="ContentPlaceHolder1_LinkButton9") WebElement twofa;
	public @FindBy (id="ContentPlaceHolder1_rblYes") WebElement twofaYEs;
	public @FindBy (id="ContentPlaceHolder1_rblEmail") WebElement emailclick;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnSaveTFAuth") WebElement twofaupdate;
	public @FindBy (id="Back") WebElement twobackButton;
	public @FindBy (id="ContentPlaceHolder1_rblNo") WebElement twofaNO;

	public @FindBy (xpath="/html/body/form/div[3]/div/div[2]/div[2]/div[2]/div/div/div[11]/div/div/div[1]/button/span") WebElement twofaBackButton;
	public @FindBy (id="ContentPlaceHolder1_lnkaccess") WebElement access;
	public @FindBy (id="ContentPlaceHolder1_rptAccRights_chkAccRights_1") WebElement reportcheckBox;
	public @FindBy (xpath="//div[@class=\"btn btn-primary btn-sm\"]") WebElement actionButton;
	public @FindBy (id="ContentPlaceHolder1_btnlnkSave") WebElement submitButton;
	public @FindBy (id="ContentPlaceHolder1_button3") WebElement submitokButton;
	public @FindBy (id="DivReports") WebElement report;
	public @FindBy (id="ContentPlaceHolder1_inktimesheetaccess") WebElement ts;
	public @FindBy (id="ContentPlaceHolder1_rbltimesheetyes") WebElement tsenable;
	public @FindBy (id="ContentPlaceHolder1_ddlreport") WebElement reportingDD;
	public @FindBy (id="ContentPlaceHolder1_lnktimesheetsubmit") WebElement tssubmitButton;
	public @FindBy (id="ContentPlaceHolder1_lblImage") WebElement image;
	public @FindBy (id="ContentPlaceHolder1_btnYes") WebElement imageupload;
	public @FindBy (id="ContentPlaceHolder1_usersecaction") WebElement securityactions;
	public @FindBy (id="ContentPlaceHolder1_lnkback") WebElement backButton;
	public @FindBy (id="ContentPlaceHolder1_LinkButton3") WebElement tssubmitok;



	
	

	
	
	

}
