package Model.score;

import Model.account.Account;
import Model.money.Money;


    public class DebetScore  extends Score {
        private CreditScore creditScore;

        public DebetScore(Money balance, Account owner, Integer number, CreditScore creditScore) {
            super(balance, owner, number);
            this.creditScore = creditScore;
        }

        @Override
        public Money getMoney(double balanceLess) {
            //1.проверка счёта кредита
            //2. базовая проверка на 30 тр
            checkCreditScore();
            return super.getMoney(balanceLess);
        }
        private void checkCreditScore() {
            if (creditScore.getBalance().getValue() < -20000) {
                throw new IllegalArgumentException("You do not have enough money on you credit account");
            }
        }
}
