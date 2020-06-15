package _1_decorator._1_characters._2_simpleclass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Characters {

    private List<MobileElement> characters = new ArrayList<>();

    public List<MobileElement> find(int x, int y) {
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

    public int size() {
        int size = characters.size();
        return size;
    }

    public void add(MobileElement mobileElement) {
        characters.add(mobileElement);
    }

    public void remove(MobileElement mobileElement) {
        characters.remove(mobileElement);
    }
}
