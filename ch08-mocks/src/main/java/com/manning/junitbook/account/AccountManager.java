package com.manning.junitbook.account;

public interface AccountManager {

    Account findAccountForUser(String userId);

    void updateAccount(Account account);
}
