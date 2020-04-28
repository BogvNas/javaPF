package com.company.gui.dialog;

import com.company.settings.Style;
import com.company.settings.Text;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class AboutDialog extends JDialog {

    public AboutDialog() {
        super();
        init();
        setTitle(Text.get("DIALOG_ABOUT_TITLE"));
        setIconImage(Style.ICON_ABOUT.getImage());
        setResizable(false);
    }

    private void init() {
       JEditorPane pane = new JEditorPane("text/html", Text.get("ABOUT"));
       pane.setEditable(false);
       pane.setOpaque(false);

       pane.addHyperlinkListener(new HyperlinkListener() {
           @Override
           public void hyperlinkUpdate(HyperlinkEvent he) {
               if (HyperlinkEvent.EventType.ACTIVATED.equals(he.getEventType())){
                   try {
                       Desktop.getDesktop().browse(he.getURL().toURI());
                   } catch (IOException e) {
                       e.printStackTrace();
                   } catch (URISyntaxException e) {
                       e.printStackTrace();
                   }
               }
           }
       });

       add(pane);
       pack();
       setLocationRelativeTo(null);
    }
}
