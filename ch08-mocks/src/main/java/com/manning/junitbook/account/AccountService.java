package com.manning.junitbook.account;

public class AccountService {

    private AccountManager accountManager;

    public void setAccountManager(AccountManager manager) {
        this.accountManager = manager;
    }

    /**
     * A transfer method which transfers the amount of money
     * from the account with the senderId to the account of
     * beneficiaryId.
     *
     * @param senderId
     * @param beneficiaryId
     * @param amount
     */
   public void transfer(String senderId, String beneficiaryId, long amount) {
        Account sender = accountManager.findAccountForUser(senderId);
        Account beneficiary = accountManager.findAccountForUser(beneficiaryId);

        sender.debit(amount);
        beneficiary.credit(amount);

        this.accountManager.updateAccount(sender);
        this.accountManager.updateAccount(beneficiary);
   }
}
