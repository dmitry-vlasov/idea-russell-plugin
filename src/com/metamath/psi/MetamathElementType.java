package com.metamath.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.metamath.MetamathLanguage.INSTANCE;

/**
 * Created by dvlasov on 07.06.17.
 */
public class MetamathElementType extends IElementType {
    public MetamathElementType(@NotNull String debugName) {
        super(debugName, INSTANCE);
    }
}
