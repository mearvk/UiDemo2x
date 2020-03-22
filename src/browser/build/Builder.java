package browser.build;

import browser.memory.Bodhi;
import browser.ontology.Ontology;
import browser.ui.custom.ButtonTabComponent;
import browser.ui.custom.CustomJPanel___Empty;
import browser.ui.custom.CustomJTabbedPane;

import javax.swing.*;
import java.awt.*;

public class Builder
{
    public Builder___Step001 step001;

    public Builder___Step002 step002;

    public Builder___Step003 step003;

    public Builder___Step004 step004;

    public Builder___Step005 step005;

    /**
     * Add components to Memory.ref map
     */
    public static class Builder___Step001
    {
        public Builder___Step001(String description)
        {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run()
                {
                    Bodhi.ref.push("//jframe", Ontology.jframe);

                    Bodhi.ref.push("//jpanel/top", Ontology.jpanel_top);

                    Bodhi.ref.push("//jbutton/back", Ontology.jbutton_back);

                    Bodhi.ref.push("//jbutton/go", Ontology.jbutton_go);

                    Bodhi.ref.push("//jbutton/forward", Ontology.jbutton_forward);

                    Bodhi.ref.push("//jtextfield/url", Ontology.jtextfield_url);

                    Bodhi.ref.push("//jpanel/bottom", Ontology.jpanel_bottom);

                    Bodhi.ref.push("//jtabbedpane", Ontology.jtabbedpane);

                    Bodhi.ref.push("//jeditorpane", Ontology.jeditorpane);
                }
            });
         }
    }

    /**
     * Add components to each other per hierarchical arrangement
     */
    public static class Builder___Step002
    {
        public Builder___Step002(String description)
        {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run()
                {
                    Ontology.jframe.add(Ontology.jpanel_top);

                    Ontology.jpanel_top.add(Ontology.jbutton_back);

                    Ontology.jpanel_top.add(Ontology.jbutton_go);

                    Ontology.jpanel_top.add(Ontology.jbutton_forward);

                    Ontology.jpanel_top.add(Ontology.jtextfield_url);

                    Ontology.jframe.add(Ontology.jpanel_bottom);

                    Ontology.jpanel_bottom.add(Ontology.jtabbedpane);

                    Ontology.jtabbedpane.addTab("title", new CustomJPanel___Empty());

                    Ontology.jtabbedpane.addTab("+", new CustomJPanel___Empty());

                    Ontology.jtabbedpane.setTabComponentAt(0, new ButtonTabComponent(Ontology.jtabbedpane));
                }
            });
        }
    }

    public static class Builder___Step003
    {
        public Builder___Step003(String description)
        {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run()
                {
                    Ontology.jframe.setSize(new Dimension(1000,600));

                    Ontology.jframe.setLayout(new FlowLayout());

                    Ontology.jframe.setMinimumSize(new Dimension(1000,600));

                    Ontology.jframe.setVisible(true);

                    //

                    Ontology.jpanel_top.setLayout(new FlowLayout());

                    Ontology.jpanel_top.setBackground(Color.GRAY);

                    //

                    Ontology.jpanel_bottom.setLayout(new FlowLayout());

                    Ontology.jpanel_top.setBackground(Color.GRAY);
                }
            });
        }
    }

    public static class Builder___Step004
    {
        public Builder___Step004(String description)
        {
            Ontology.jtabbedpane.addChangeListener(new CustomJTabbedPane.StateChangeListener());
        }
    }

    public static class Builder___Step005
    {
        public Builder___Step005(String description)
        {

        }
    }
}

