package stud.anna;


import stud.anna.data.Card;
import stud.anna.data.UnionPayCard;
import stud.anna.data.VisaCard;

import java.util.ArrayList;
import java.util.List;

import static stud.anna.data.Country.RU;

public class Main {
//    public static void main(String[] args){
//        Card visaCard = new VisaCard();
//        visaCard.setBalance(100);
//        visaCard.payInCountry(RU, 75);
//        System.out.println(visaCard.getBalance());
//
//    }

    public static void main(String[] args) {
        invoke(new UnionPayCard());
        List<String> aList = new ArrayList<>();
    }

    public static void invoke(Card card){
        card.setBalance(100);
        card.payInCountry(RU, 75);
        System.out.println(card.getBalance());

    }

}