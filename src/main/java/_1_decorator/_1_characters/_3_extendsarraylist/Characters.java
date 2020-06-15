package _1_decorator._1_characters._3_extendsarraylist;

import _1_decorator._1_characters.MobileElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// le choix de l'implémentation est figé par la structure de la class
public class Characters extends ArrayList<MobileElement> {

    public List<MobileElement> find(int x, int y) {
        // est ce qu'il y a un characters en (10;2) ?
        List<MobileElement> found = new ArrayList<MobileElement>();
        for (MobileElement character : this) {
            if (character.getX() == x && character.getY() == y) {
                found.add(character);
            }
        }
        // => found

        // version avec lambda
        List<MobileElement> found2 = this.stream().filter(c -> c.getX() == 10 && c.getY() == 2).collect(Collectors.toList());

        return found2;
    }

    //les autres méthodes sont directement héritées

}
