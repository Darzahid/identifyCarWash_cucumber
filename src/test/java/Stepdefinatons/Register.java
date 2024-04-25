package Stepdefinatons;
import io.cucumber.java.en.Given;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Register1;



public class Register {
WebDriver driver;
	
	
Register1 rg=new Register1((BaseClass.getDriver()));
	
	
	
	@Given("the user should click on the Register")
	public void the_user_should_click_on_the_register() {
		 
		rg.reg1();
	}

	@When("the User  should enter their Firstname")
	public void the_user_should_enter_their_firstname() {
		 
		rg.name1();
	}

	@When("the User should enter the invalid Email")
	public void the_user_should_enter_the_invalid_email() {
		
		rg.email();
	   
	}

	@When("User should enter the password")
	public void user_should_enter_the_password() {
		
		rg.pass();
	   
	}

	@When("User should click on SignUp")
	public void user_should_click_on_sign_up() {
		
		rg.signup1();
	   
	}

	@Then("User should capture Error message")
	public void user_should_capture_error_message() throws IOException {
		
		rg.Error();
	}


}
