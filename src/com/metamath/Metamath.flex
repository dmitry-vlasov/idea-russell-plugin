package com.metamath;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.metamath.psi.metamathTypes;
import com.intellij.psi.TokenType;

%%

%class metamathLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

WHITE_SPACE=[\ \n\t\f]
COMMENT_BEGIN=[$(]
COMMENT_END=[$)]
BLOCK_BEGIN=[${]
BLOCK_END=[$}]
INCLUDE_BEGIN=[$[]]
INCLUDE_END=[$]
CONST=[$c]
VAR=[$v]
DISJ=[$d]
ESS=[$e]
FLO=[$f]
AX=[$a]
PR=[$p]
EQ=[$=]
END=[$.]
SYMB=[^$\ \n\t\f\\]
LAB=[^$\ \n\t\f\\]
COMMENT_CHAR=[^$)]

%%

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