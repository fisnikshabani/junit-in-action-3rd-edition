package com.manning.junitbook.account;

import com.manning.junitbook.configurations.Configuration;
import com.manning.junitbook.configurations.DefaultConfiguration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DefaultAccountManager2 implements AccountManager {

    private Log logger;
    private Configuration configuration;

    public DefaultAccountManager2() {
        this(LogFactory.getLog(DefaultAccountManager2.class),
                new DefaultConfiguration("technical"));
    }

    public DefaultAccountManager2(Log logger, Configuration configuration) {
        this.logger = logger;
        this.configuration = configuration;
    }

    @Override
    public Account findAccountForUser(String userId) {
        this.logger.debug("Getting account for user ["
                + userId + "]");
        this.configuration.getSQL("FIND_ACCOUNT_FOR_USER");

        // Some code logic to load a user account using JDBC
        return null;
    }

    @Override
    public void updateAccount(Account account) {
        // Perform database access here
    }
}
