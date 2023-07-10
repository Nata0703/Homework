package Model.score;

import Model.account.Account;
import Model.money.Money;

public class CreditScore  extends Score {
    public CreditScore(Money balance, Account owner, Integer number){
        super(balance, owner, number);
    }
}


