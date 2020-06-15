package _1_decorator._1_characters._1_list;

import _1_decorator._1_characters.SampleMobileElement;

import java.util.ArrayList;
import java.util.List;

public class SampleUsage {

    public static void main(String... args) {
        List<MobileElement> characters = new ArrayList<>();
        MobileElement mobileElement = new SampleMobileElement(10, 2);

        CharactersUtils.add(characters, mobileElement);
        List<MobileElement> atPositionX10Y2 = CharactersUtils.find(characters, 10, 2);
        int size = CharactersUtils.size(characters);
        CharactersUtils.remove(characters, mobileElement);

    }

}
