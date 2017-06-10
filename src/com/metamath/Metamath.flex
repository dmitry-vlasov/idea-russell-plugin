package com.metamath;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.metamath.psi.MetamathTypes;
import com.intellij.psi.TokenType;

%%

%class metamathLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

COMMENT    = "$(" !([^]* "$)" [^]*) ("$)")?
WHITESPACE = [\ \n\t\f]
SYMB       = [^$\ \n\t\f\\]
LAB        = [^$\ \n\t\f\\]

%%

<YYINITIAL> {
    "${"            { return MetamathTypes.BLOCK_BEGIN; }
    "$}"            { return MetamathTypes.BLOCK_END; }
    "$["            { return MetamathTypes.INCLUDE_BEGIN; }
    "$]"            { return MetamathTypes.INCLUDE_END; }

    "$c"            { return MetamathTypes.CONST; }
    "$v"            { return MetamathTypes.VAR; }
    "$d"            { return MetamathTypes.DISJ; }
    "$f"            { return MetamathTypes.FLO; }
    "$e"            { return MetamathTypes.ESS; }
    "$a"            { return MetamathTypes.AX; }
    "$p"            { return MetamathTypes.PR; }
    "$="            { return MetamathTypes.EQ; }
    "$."            { return MetamathTypes.END; }

    {SYMB}          { return MetamathTypes.SYMB; }
    {LAB}           { return MetamathTypes.LAB; }
    {COMMENT}       { return MetamathTypes.COMMENT; }
    {WHITESPACE}    { return TokenType.WHITE_SPACE; }
    .               { return TokenType.BAD_CHARACTER; }
}



/*
%state WAITING_VALUE

%%
<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return metamathTypes.COMMENT; }

<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return metamathTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return metamathTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return metamathTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }

*/