package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) {

          if (types == ImageTypes.BMP)
              return new BmpReader();
          if (types == ImageTypes.PNG)
              return new PngReader();
          if (types == ImageTypes.JPG)
              return new JpgReader();
          else throw  new IllegalArgumentException();

    }
}
