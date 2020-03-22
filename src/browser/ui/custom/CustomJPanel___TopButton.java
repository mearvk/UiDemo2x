package browser.ui.custom;

import browser.memory.Bodhi;

import javax.swing.*;
import java.awt.*;

public class CustomJPanel___TopButton extends JPanel
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Bodhi.ref.pull("//jframe");

        int width = jframe.getWidth();

        return new Dimension(width, 50);
    }
}
