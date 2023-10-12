/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yash
 */
public class AccountDirectory {

    private ArrayList<Account> accountList;

    public AccountDirectory() {
        this.accountList = new ArrayList<>();
    }

    
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    public Account addAccount(){
        Account acc = new Account();
        this.accountList.add(acc);
        return acc;
    }
    
    public void deleteAccount(Account acc){
        this.accountList.remove(acc);
    }
    
    public Account searchAccount(String accountNumber){
        for(Account a: this.accountList){
            if(a.getAccountNumber().equals(accountNumber)){
                return a;
            }
        }
        return null;
    }
}

