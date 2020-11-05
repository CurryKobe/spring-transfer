package com.sc.edu.service;

/**
 * @author Hx
 */
public interface TransferService {

    void transfer(String fromCardNo,String toCardNo,int money) throws Exception;
}
