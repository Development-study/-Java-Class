package kr.hs.dgsw.java.dept23.d0421;

public class CardReader {

    protected int income;

    public CardReader() {
        this.income = 0;
    }

    public void contact(Card card) {

        String type = card.getType();
        int fee = 0;

        if("성인".equals(type)) {
            fee = 1500;
        } else if("학생".equals(type)) {
            fee = 800;
        } else if("어르신".equals(type)) {
            fee = 0;
        } else {
            throw new RuntimeException("잘못된 카드입니다.");
        }

        boolean enough = card.canPayable(fee);

        if(enough) {
            System.out.println(card.getType() + "입니다.");
            card.payment(fee);
            income += fee;
        } else {
            System.out.println("잔액이 부족합니다. 당장 내리세요.");
        }

    }

    public int getIncome() {
        return this.income;
    }

    public static void main(String[] args) {
        CardReader reader = new CardReader();

        StudentCard student = new StudentCard(2000);
        AdultCard adult = new AdultCard(6000);
        ElderCard elder = new ElderCard(0);

        reader.contact(student);
        reader.contact(adult);
        reader.contact(elder);

        System.out.println("오늘의 수입은 " + reader.getIncome() + "원 입니다.");
    }

}
