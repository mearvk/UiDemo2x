package browser.ui.custom;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;

public class ButtonTabComponent extends JPanel
{
    private final JTabbedPane pane;

    public ButtonTabComponent(final JTabbedPane pane)
    {

        super(new FlowLayout(FlowLayout.LEFT, 0, 0));

        if (pane == null)
        {
            throw new NullPointerException("TabbedPane is null");
        }

        this.pane = pane;

        this.setOpaque(false);

        JLabel label = new JLabel()
        {
            public String getText()
            {
                int i = pane.indexOfTabComponent(ButtonTabComponent.this);

                if (i != -1)
                {
                    return pane.getTitleAt(i);
                }

                return null;
            }
        };

        this.add(label);

        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));

        this.add(new TabButton());

        this.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
    }

    private class TabButton extends JButton implements ActionListener
    {
        public TabButton()
        {
            int size = 17;

            this.setPreferredSize(new Dimension(size, size));

            this.setToolTipText("Close this tab");

            this.setUI(new BasicButtonUI());

            this.setContentAreaFilled(false);

            this.setFocusable(false);

            this.setBorder(BorderFactory.createEtchedBorder());

            this.setBorderPainted(false);

            this.addMouseListener(buttonMouseListener);

            this.setRolloverEnabled(true);

            this.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e)
        {
            int i = pane.indexOfTabComponent(ButtonTabComponent.this);

            if (i != -1)
            {
                pane.remove(i);
            }
        }

        @Override
        public void updateUI()
        {

        }

        //paint the cross
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g.create();


            if (getModel().isPressed())
            {
                g2.translate(1, 1);
            }

            g2.setStroke(new BasicStroke(2));

            g2.setColor(Color.BLACK);

            if (getModel().isRollover())
            {
                g2.setColor(Color.MAGENTA);
            }

            int delta = 6;

            g2.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta - 1);

            g2.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta - 1);

            g2.dispose();
        }
    }

    private final static MouseListener buttonMouseListener = new MouseAdapter()
    {
        public void mouseEntered(MouseEvent e)
        {
            Component component = e.getComponent();

            if (component instanceof AbstractButton)
            {
                AbstractButton button = (AbstractButton) component;

                button.setBorderPainted(true);
            }
        }

        public void mouseExited(MouseEvent e)
        {
            Component component = e.getComponent();

            if (component instanceof AbstractButton)
            {
                AbstractButton button = (AbstractButton) component;

                button.setBorderPainted(false);
            }
        }
    };
}
