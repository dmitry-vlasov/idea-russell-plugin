package com.metamath;

import com.intellij.lang.Language;

/**
 * Created by dvlasov on 07.06.17.
 */
public class MetamathLanguage extends Language {
    public static final MetamathLanguage INSTANCE = new MetamathLanguage();

    private MetamathLanguage() {
        super("Metamath");
    }
}
