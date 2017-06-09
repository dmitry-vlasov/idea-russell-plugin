package com.russell;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import com.russell.psi.RussellElementType;

/**
 * Created by dvlasov on 07.06.17.
 */
public interface RussellTokenTypes {
    IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
    IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;

    IElementType END_OF_LINE_COMMENT = new RussellElementType("END_OF_LINE_COMMENT");
    IElementType KEY_CHARACTERS = new RussellElementType("KEY_CHARACTERS");
    IElementType VALUE_CHARACTERS = new RussellElementType("VALUE_CHARACTERS");
    IElementType KEY_VALUE_SEPARATOR = new RussellElementType("KEY_VALUE_SEPARATOR");

    TokenSet COMMENTS = TokenSet.create(END_OF_LINE_COMMENT);

    TokenSet WHITESPACES = TokenSet.create(WHITE_SPACE);
}
