package _5_factory_method._99_excerice;

import java.io.InputStream;

public class ImageUtil {

    public static ImageType getImageType(InputStream inputStream) {
        return ImageType.GIF;
    }
}
