package com.sc.edu.dao;

import com.sc.edu.pojo.Account;

/**
 * @author Hx
 */
public interface AccountDao {

    Account queryAccountByCardNo(String cardNo) throws Exception;

    int updateAccountByCardNo(Account account) throws Exception;
}
