package _5_factory_method._99_excerice;

import _5_factory_method._99_excerice.implementation.GifReader;
import _5_factory_method._99_excerice.implementation.JpegReader;

import java.io.InputStream;

public class ImageReaderFactory {
  public static ImageReader getImageReader(InputStream inputStream) {
    ImageType imageType = ImageUtil.getImageType(inputStream);

    switch (imageType) {
      case JPEG:
        return new JpegReader(inputStream);
      case GIF:
        return new GifReader(inputStream);
      default:
        throw new IllegalArgumentException("Type d'image incompatible");
    }
  }
}
