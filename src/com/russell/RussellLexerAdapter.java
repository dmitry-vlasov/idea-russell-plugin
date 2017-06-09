package com.russell;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

/**
 * Created by dvlasov on 07.06.17.
 */
public class RussellLexerAdapter extends FlexAdapter {
    public RussellLexerAdapter() {
        super(new RussellLexer((Reader) null));
    }
}
