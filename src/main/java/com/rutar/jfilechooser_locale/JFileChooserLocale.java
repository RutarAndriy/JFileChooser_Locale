package com.rutar.jfilechooser_locale;

import javax.swing.*;

// ............................................................................

public class JFileChooserLocale {

public enum Locale { uk_UA }

// ............................................................................

private static final Object[][] locale_uk_UA = {
    
    { "FileChooser.openButtonText",          "Вибрати"       },
    { "FileChooser.openButtonToolTipText",   "Вибрати файл"  },
    { "FileChooser.cancelButtonText",        "Відміна"       },
    { "FileChooser.cancelButtonToolTipText", "Закрити вікно" },

    { "FileChooser.openDialogTitleText",  "Вибір файлу" },
    { "FileChooser.lookInLabelText",      "Шукати в:"   },
    { "FileChooser.fileNameLabelText",    "Ім'я файлу:" },
    { "FileChooser.filesOfTypeLabelText", "Тип файлів:" },
    
    { "FileChooser.upFolderAccessibleName", "Перейти на рівень вверх" },
    { "FileChooser.upFolderToolTipText",    "Перейти на рівень вверх" },  

    { "FileChooser.homeFolderToolTipText",    "Домашня директорія" },
    { "FileChooser.homeFolderAccessibleName", "Домашня директорія" },
    
    { "FileChooser.listViewButtonToolTipText",    "Список" },
    { "FileChooser.listViewButtonAccessibleName", "Список" },
    
    { "FileChooser.detailsViewButtonToolTipText",    "Детальний список" },
    { "FileChooser.detailsViewButtonAccessibleName", "Детальний список" },
    
    { "FileChooser.fileNameHeaderText", "Ім'я"     },
    { "FileChooser.fileSizeHeaderText", "Розмір"   },
    { "FileChooser.fileTypeHeaderText", "Тип"      },
    { "FileChooser.fileDateHeaderText", "Дата"     },
    { "FileChooser.fileAttrHeaderText", "Атрибути" },
    
    { "FileChooser.readOnly", Boolean.TRUE },

};
    
///////////////////////////////////////////////////////////////////////////////

/**
 * Метод ініціалізує вибрану локаль для JFileChoser'а
 * @param locale необхідна локаль
 */

public static void initLocale (Locale locale) {

    Object[][] custom_locale = null;
    
    switch (locale) {
        case uk_UA: custom_locale = locale_uk_UA; break;
    }
    
    if (custom_locale == null) { return; }
    
    for (Object[] parameter : custom_locale) {
        UIManager.put(parameter[0], parameter[1]);
    }
}

///////////////////////////////////////////////////////////////////////////////

}