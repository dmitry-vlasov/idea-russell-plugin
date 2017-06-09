package com.russell.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import com.russell.RussellLanguage;

/**
 * Created by dvlasov on 07.06.17.
 */
public class RussellTokenType extends IElementType {
    public RussellTokenType(@NotNull String debugName) {
        super(debugName, RussellLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "RussellTokenType." + super.toString();
    }
}

