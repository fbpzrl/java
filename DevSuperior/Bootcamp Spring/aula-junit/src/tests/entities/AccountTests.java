package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTests {

	@Test
	public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
		double amount = 200.0;
		double expectedValue = 196.0; 
		Account acc = AccountFactory.createEmptyAccount(); //ARRANGE (INSTANTIATE NECESSARY OBJECTS)
		
		acc.deposit(amount); //ACTION (EXECUTE NECESSARY ACTIONS)
		
		Assertions.assertEquals(expectedValue, acc.getBalance()); //ASSERT (EXPECTED RESULT)
	}
	
	@Test
	public void depositShouldDoNothingWhenNegativeAmount() {
		double expectedValue = 100.0; 
		Account acc = AccountFactory.createAccount(expectedValue); //ARRANGE
		double amount = -200.0;
		
		acc.deposit(amount); //ACTION
		
		Assertions.assertEquals(expectedValue, acc.getBalance()); //ASSERT
	}
	
	@Test
	public void fullWithdrawShouldClearBalanceAndReturnFullBalance() {
		double expectedValue = 0.0; 
		double initialBalance = 800.0;
		Account acc = AccountFactory.createAccount(initialBalance); //ARRANGE
		
		double result = acc.fullWithdraw(); //ACTION
		
		Assertions.assertTrue(expectedValue == acc.getBalance());
		Assertions.assertTrue(result == initialBalance); //ASSERT
	}
	
	@Test
	public void withdrawShouldDecreaseBalanceWhenSufficientBalance() {
		Account acc = AccountFactory.createAccount(800.0); //ARRANGE
		
		acc.withdraw(500.0); //ACTION
		
		Assertions.assertEquals(300.0, acc.getBalance()); //ASSERT (EXPECTED RESULT = 300.0)
	}
	
	@Test
	public void withdrawShouldThrowExceptionWhenInsufficientBalance() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> { // ASSERT (EXPECTED RESULT = IllegalArgumentException)
			Account acc = AccountFactory.createAccount(800.0); // ARRANGE
			acc.withdraw(801.0); // ACTION
		}); 
	}
}