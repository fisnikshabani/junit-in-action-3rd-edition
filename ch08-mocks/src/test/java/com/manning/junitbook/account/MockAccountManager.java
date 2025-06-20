package com.manning.junitbook.account;

import java.util.HashMap;
import java.util.Map;

public class MockAccountManager implements AccountManager {

    /**
     * A Map to hold all the <userId, account> values.
     */
    private Map<String, Account> accounts = new HashMap<String, Account>();

    /**
     * A method to add an account to the manager.
     *
     * @param userId
     * @param account
     */
    public void addAccount(String userId, Account account) {
        this.accounts.put(userId, account);
    }

    @Override
    public Account findAccountForUser(String userId) {
        return this.accounts.get(userId);
    }

    @Override
    public void updateAccount(Account account) {
        // do nothing
    }
}
