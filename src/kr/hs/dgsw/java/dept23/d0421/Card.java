package kr.hs.dgsw.java.dept23.d0421;

public class Card {

    protected int money;

    public Card(int money) {
        this.money = money;
    }

    public String getType() {
        return "";
    }

    public boolean canPayable(int fee) {
        if(fee > money) {
            return false;
        } else {
            return true;
        }
    }

    public void payment(int fee) {
        money -= fee;
        System.out.println("현재 남은 금액은 " + money + "입니다.");
    }



}
