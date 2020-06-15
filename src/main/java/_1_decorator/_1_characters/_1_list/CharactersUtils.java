package _1_decorator._1_characters._1_list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CharactersUtils {

    public static List<MobileElement> find(List<MobileElement> characters, int x, int y) {
        // est ce qu'il y a un characters en (10;2) ?
        List<MobileElement> found = new ArrayList<MobileElement>();
        for (MobileElement character : characters) {
            if (character.getX() == x && character.getY() == y) {
                found.add(character);
            }
        }
        // => found

        // version avec lambda
        List<MobileElement> found2 = characters.stream().filter(c -> c.getX() == 10 && c.getY() == 2).collect(Collectors.toList());

        return found2;
    }

    public static int size(List<MobileElement> characters) {
        int size = characters.size();
        return size;
    }

    public static void add(List<MobileElement> characters, MobileElement mobileElement) {
        characters.add(mobileElement);
    }

    public static void remove(List<MobileElement> characters, MobileElement mobileElement) {
        characters.remove(mobileElement);
    }
}
