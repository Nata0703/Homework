package Model.score;

import Model.account.Account;
import Model.money.Money;

public class CurrentScore extends Score {

    private DebetScore debetScore;

    public CurrentScore(Money balance, Account owner, Integer number, DebetScore debetScore) {
        super(balance, owner, number);
        this.debetScore = debetScore;

    }

    @Override
    public Money getMoney(double balanceLess) {
        return super.getMoney(balanceLess);
    }

    @Override
    public void addMoney(Money money) {
        if (money.getValue() > 1000000) {
            debetScore.addMoney(new Money(2000, debetScore.getBalance().getCurrency().getName()));
        }

        super.addMoney(money);

    }
}
