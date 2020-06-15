package _1_decorator._1_characters._2_windows._1_sanspattern;

public class TopRightBorderWindow extends RightBorderWindow {

    @Override
    public void draw() {
        System.out.println(" -----");
        super.draw();
    }
}
