import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest extends TestCase {
    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount();
        account.deposit(100);
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        account = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testDeposit() {
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }
    @Test
    public void testWithdraw() {
        account.withdraw(40);
        assertEquals(60, account.getBalance());
    }

}