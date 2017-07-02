/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Basic_HTML_Developer;

import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Standard
 */

    class FontCellRenderer extends DefaultListCellRenderer {

    public Component getListCellRendererComponent(
        JList list,
        Object value,
        int index,
        boolean isSelected,
        boolean cellHasFocus) {
        JLabel label = (JLabel)super.getListCellRendererComponent(
            list,value,index,isSelected,cellHasFocus);
        Font font = new Font((String)value, Font.PLAIN, 20);
        label.setFont(font);
        return label;
    }
}

