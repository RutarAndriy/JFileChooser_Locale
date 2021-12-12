package com.rutar.jfilechooser_locale;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

// ............................................................................

public class JFileChooserLocaleDemo {

private static JFileChooser jFileChooser = null;

///////////////////////////////////////////////////////////////////////////////

public static void main (String[] args) {

    try { UIManager.setLookAndFeel("javax.swing.plaf"
                                + ".nimbus.NimbusLookAndFeel"); }
    catch (Exception e) {}
    
    JOptionPane.showMessageDialog(null, "JFileChooser із стандартною локаллю",
                                 "Повідомлення", INFORMATION_MESSAGE);

    jFileChooser = new JFileChooser();
    jFileChooser.showDialog(null, null);
    
    // ........................................................................
    // Ініціалізуємо українську локаль
    
    JFileChooserLocale.initLocale(JFileChooserLocale.Locale.uk_UA);
    
    JOptionPane.showMessageDialog(null, "JFileChooser із українською локаллю",
                                 "Повідомлення", INFORMATION_MESSAGE);

    jFileChooser = new JFileChooser();
    jFileChooser.showDialog(null, null);

}

///////////////////////////////////////////////////////////////////////////////

}