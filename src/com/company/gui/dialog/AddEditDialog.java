package com.company.gui.dialog;

import com.company.exception.ModelException;
import com.company.gui.MainButtom;
import com.company.gui.MainFrame;
import com.company.model.Common;
import com.company.settings.HandlerCode;
import com.company.settings.Style;
import com.company.settings.Text;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
abstract public class AddEditDialog extends JDialog {

    protected LinkedHashMap<String, JComponent> components = new LinkedHashMap<>();
    protected LinkedHashMap<String, ImageIcon> icons = new LinkedHashMap<>();
    protected LinkedHashMap<String, Object> values = new LinkedHashMap<>();
    protected  Common c;

    public AddEditDialog(MainFrame frame) {
        super(frame, Text.get("ADD"), true);
        setResizable(false);
    }

    public Common getCommon() {
        return c;
    }

    public void setCommon(Common c) {
        this.c = c;
    }

    public final void showDialog() {
        setVisible(true);
        setDialog();
    }

    public final void closeDialog() {
        setVisible(false);
        this.c = null;
        components.clear();
        icons.clear();
        values.clear();
        dispose();
    }

    public boolean isAdd() {
        return c == null;
    }

    abstract protected void init();

    abstract protected void setValues();

    abstract protected Common getCommonFromForm() throws ModelException;

    private void setDialog() {
        init();
        if (isAdd()) {
            setTitle(Text.get("ADD"));
            setIconImage(Style.ICON_ADD.getImage());
        } else {
            setValues();
            setTitle(Text.get("EDIT"));
            setIconImage(Style.ICON_EDIT.getImage());
        }
        getContentPane().removeAll();
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        ((JPanel) getContentPane()).setBorder(Style.BORDER_DIALOG);
        for (Map.Entry<String, JComponent> entry : components.entrySet()) {
            String key = entry.getKey();
            JLabel label = new JLabel(Text.get(key));
            label.setIcon(icons.get(key));
            label.setFont(Style.FONT_DIALOG_LABEL);

            JComponent component = entry.getValue();
            if (component instanceof JTextField) {
                component.setPreferredSize(Style.DIMENSION_DIALOG_TEXTFIELD_SIZE);
                if (values.containsKey(key)) ((JTextField) component).setText("" + values.get(key));
            } else if (component instanceof JComboBox) {
                if (values.containsKey(key)) ((JComboBox) component).setSelectedItem(values.get(key));
            } else if (component instanceof JDatePickerImpl) {
                if (values.containsKey(key))
                    ((UtilDateModel) ((JDatePickerImpl) component).getModel()).setValue((Date) values.get(key));
            }

            component.setAlignmentX(JComponent.LEFT_ALIGNMENT);
            add(label);
            add(Box.createVerticalStrut(Style.PADDING_DIALOG));
            add(component);
            add(Box.createVerticalStrut(Style.PADDING_DIALOG));

        }

        MainButtom ok = new MainButtom(Text.get("ADD"), Style.ICON_OK, null, HandlerCode.ADD);
        if (!isAdd()) {
            ok.setActionCommand(HandlerCode.EDIT);
            ok.setText(Text.get("EDIT"));
        }

        MainButtom cancel = new MainButtom(Text.get("CANCEL"), Style.ICON_CANCEL, null, HandlerCode.CANCEL);

        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new BorderLayout());
        panelButtons.setAlignmentX(JPanel.LEFT_ALIGNMENT);
        panelButtons.add(ok, BorderLayout.WEST);
        panelButtons.add(Box.createRigidArea(Style.DIMENSION_DIALOG_PADDING_BUTTON), BorderLayout.CENTER);
        panelButtons.add(cancel, BorderLayout.EAST);

        add(panelButtons);
        pack();
        setLocationRelativeTo(null);
    }

    protected class CommonComboBox extends JComboBox {
        public CommonComboBox(Object[] objs) {
            super(objs);
            setRenderer(new DefaultListCellRenderer(){
                @Override
                public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
                    DefaultListCellRenderer renderer = (DefaultListCellRenderer) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                    Common c = (Common) value;
                    if(c != null) renderer.setText(c.getValueForComboBox());
                    return renderer;
                }
            });
        }
    }
}
