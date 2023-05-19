package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSavingsAccount {
    @Test
    public void testSavingsAccount() {
        SavingsAccount savingsAcc = new SavingsAccount("NDBK-0000-0002", "Aidan", "van Geest", "ROT001");
        Assertions.assertEquals("NDBK-0000-0001", savingsAcc.accountNumber);
        Assertions.assertEquals("Aidan", savingsAcc.accountHolderFirstName);
        Assertions.assertEquals("van Geest", savingsAcc.accountHolderLastName);
        Assertions.assertEquals("ROT001", savingsAcc.branchCode);
    }
}
