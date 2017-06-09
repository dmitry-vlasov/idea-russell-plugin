package com.russell;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;

import com.russell.psi.RussellTypes;
import com.russell.parser.RussellParser;
import com.russell.psi.RussellFile;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dvlasov on 07.06.17.
 */
public class RussellParserDefinition implements ParserDefinition {

    private final static Logger log = LoggerFactory.getLogger(RussellParserDefinition.class);

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(RussellTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(RussellLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        log.info("createLexer");
        return new RussellLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        log.info("createParser");
        return new RussellParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        log.info("getFileNodeType");
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        log.info("createElement");
        return RussellTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        log.info("createFile");
        return new RussellFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
        return SpaceRequirements.MAY;
    }
}
