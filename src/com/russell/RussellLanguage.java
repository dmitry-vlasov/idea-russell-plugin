package com.russell;

import com.intellij.lang.Language;

/**
 * Created by dvlasov on 07.06.17.
 */
public class RussellLanguage extends Language {
    public static final RussellLanguage INSTANCE = new RussellLanguage();

    private RussellLanguage() {
        super("Russell");
    }
}
