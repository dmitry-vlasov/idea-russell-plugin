package com.metamath.psi;

import com.intellij.psi.tree.IElementType;
import com.metamath.MetamathLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dvlasov on 07.06.17.
 */
public class MetamathTokenType extends IElementType {
    public MetamathTokenType(@NotNull String debugName) {
        super(debugName, MetamathLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MetamathTokenType." + super.toString();
    }
}

