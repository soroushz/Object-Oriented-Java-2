/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @modifier Muharrem Kaya, 03/25/2020
 * @modifier Derya Kaya, 03/25/2020
 * @modifier Mostafa Soroush Zadeh, 03/25/2020
 */
public class GroupOfCards
{

    //The group of cards, stored in an ArrayList
    //@modifier Muharrem, 2020
    //private ArrayList <Card> cards; 
    private ArrayList<goCard> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }

    /**
     * @param givenSize
     * @param newCards this is a reference type variable it get 52 cars
     * @modifier Muharrem, 2020
     */
    public GroupOfCards(int givenSize, goDeck newCards)
    {
        size = givenSize;

        Collections.shuffle(newCards.getAllCards());

        cards = new ArrayList<goCard>();

        for (int i = 0; i < givenSize; i++)
        {
            cards.add(newCards.getNewCard());
        }

        shuffle();

        for (goCard num : cards)
        {
            System.out.print(num.toString() + ", ");
        }

    }

    /**
     * @return cards
     * @modifier Muharrem, 2020
     */
    public ArrayList<goCard> showCards()
    {
        return cards;
    }

    /**
     * @modifier Muharrem, 2020
     */
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     * @modifier Muharrem, 2020
     */
    public int getSize()
    {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     * @modifier Muharrem, 2020
     */
    public void setSize(int givenSize)
    {
        size = givenSize;
    }

}//end class
