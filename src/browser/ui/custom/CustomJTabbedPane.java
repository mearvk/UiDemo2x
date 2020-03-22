package browser.ui.custom;

import browser.memory.Bodhi;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class CustomJTabbedPane extends JTabbedPane
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Bodhi.ref.pull("//jframe");

        int width = jframe.getWidth()-30;

        int height = jframe.getHeight()-100;

        return new Dimension(width, height);
    }

    public static class StateChangeListener implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent changeEvent)
        {
            JTabbedPane source = (JTabbedPane) changeEvent.getSource();

            Integer index =  source.getSelectedIndex();

            String selected_index =  source.getTitleAt(index);

            if(selected_index.equalsIgnoreCase("+"))
            {
                CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) Bodhi.ref.pull("//jtabbedpane");

                jtabbedpane.addTab("title", new CustomJPanel___Empty());

                jtabbedpane.setTabComponentAt(index+1, new ButtonTabComponent(jtabbedpane));

                jtabbedpane.setSelectedIndex(index);

                jtabbedpane.remove(index);

                jtabbedpane.addTab("+", new CustomJPanel___Empty());
            }
        }
    }
}
