//public class Main {
//    public static void main(String[] args) {
//        // 52�� ���Ĵٵ� ī�� �� ����
//        Deck standardDeck = new Deck();
//
//        for (int suit = 1; suit <= 4; suit++) {
//            for (int rank = 1; rank <= 13; rank++) {
//                Card newCard = new Card(suit, rank);
//
//                standardDeck.addCard(newCard);
//            }
//        }
//
//        // ī�� ����
//        standardDeck.shuffle();
//
//        // ����
//        Deck hand1 = standardDeck.deal(5);
//        Deck hand2 = standardDeck.deal(5);
//
//        // �� �ڵ� ���
//        hand1.print();
//        System.out.println("----------");
//        hand2.print();
//    }
//}

public class Main {
    public static void main(String[] args) {
        BlackjackCard card1 = new BlackjackCard(1, 1);
        BlackjackCard card2 = new BlackjackCard(2, 6);
        BlackjackCard card3 = new BlackjackCard(4, 12);

        System.out.println(card1.getValue());
        System.out.println(card1.isAce());
        System.out.println(card2.getValue());
        System.out.println(card2.isAce());
        System.out.println(card3.getValue());
        System.out.println(card3.isAce());
    }
}