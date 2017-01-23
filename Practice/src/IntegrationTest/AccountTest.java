package IntegrationTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account account;

	@Before
	public void setUp() throws Exception {
		account = new Account("John", 100);
	}

	@Test
	public void testGetBalance() {
		assertEquals(100, account.getBalance());;
	}

	@Test
	public void testGetHolder() {
		assertNotNull(account.getHolder());
	}

	@Test
	public void testDeposit() {
		fail("Not yet implemented");
	}

	@Test
	public void testWithdraw() {
		fail("Not yet implemented");
	}

}
