package browser.ui.custom;

import browser.memory.Bodhi;

import javax.swing.*;
import java.awt.*;

public class CustomJTextField___URL extends JTextField
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Bodhi.ref.pull("//jframe");

        int width = jframe.getWidth();

        int height = 20;

        return new Dimension(width-190, height);
    }
}
