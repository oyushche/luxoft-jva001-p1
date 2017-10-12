package com.luxoft.jva001p1.mess.objects;

import com.luxoft.jva001p1.mess.Drawable;

import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;

public class Swatter implements Drawable
{
    private static final String IMAGE_PATH = "jva-001-p1/images/swatter-100.jpg";
    private BufferedImage image;

    public Swatter()
    {
        try
        {
            image = ImageIO.read(new File(IMAGE_PATH));
        }
        catch (IOException e)
        {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void draw(Graphics graphics)
    {
        graphics.drawImage(image, 10, 10, (img, infoflags, x, y, width, height) -> false);
    }
}
