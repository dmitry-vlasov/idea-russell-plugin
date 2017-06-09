package com.russell.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.russell.RussellLanguage.*;

/**
 * Created by dvlasov on 07.06.17.
 */
public class RussellElementType extends IElementType {
    public RussellElementType(@NotNull String debugName) {
        super(debugName, INSTANCE);
    }
}
