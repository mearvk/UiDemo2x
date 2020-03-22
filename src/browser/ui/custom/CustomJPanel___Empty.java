package browser.ui.custom;

import browser.memory.Bodhi;

import javax.swing.*;
import java.awt.*;

public class CustomJPanel___Empty extends JPanel
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Bodhi.ref.pull("//jframe");

        int width = jframe.getWidth();

        int height = jframe.getHeight()-100;

        return new Dimension(width, height);
    }
}
