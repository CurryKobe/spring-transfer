package com.sc.edu.service.impl;

import com.sc.edu.annotation.MyAutowired;
import com.sc.edu.annotation.MyService;
import com.sc.edu.annotation.MyTransactional;
import com.sc.edu.dao.AccountDao;
import com.sc.edu.pojo.Account;
import com.sc.edu.service.TransferService;

/**
 * @author Hx
 */
@MyService("transferService")
@MyTransactional
public class TransferServiceImpl implements TransferService {

    // 最佳状态
    @MyAutowired
    private AccountDao accountDao;

    // 构造函数传值/set方法传值

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }



    @Override
    public void transfer(String fromCardNo, String toCardNo, int money) throws Exception {
            Account from = accountDao.queryAccountByCardNo(fromCardNo);
            Account to = accountDao.queryAccountByCardNo(toCardNo);

            from.setMoney(from.getMoney()-money);
            to.setMoney(to.getMoney()+money);

            accountDao.updateAccountByCardNo(to);
            int c = 1/0;
            accountDao.updateAccountByCardNo(from);

    }
}
