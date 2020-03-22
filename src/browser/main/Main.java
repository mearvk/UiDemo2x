package browser.main;

import browser.build.Builder;
import browser.system.*;
import browser.system.System;

import javax.swing.*;

public class Main
{
    public static void main(String...args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                System system = new System("//system", "//memory");

                //

                Builder builder = new Builder();

                builder.step001 = new Builder.Builder___Step001("memory");

                builder.step002 = new Builder.Builder___Step002("hierarchy");

                builder.step003 = new Builder.Builder___Step003("setters");

                builder.step004 = new Builder.Builder___Step004("listeners");

                builder.step005 = new Builder.Builder___Step005("miscellany");

                builder = null;
            }
        });
    }
}
