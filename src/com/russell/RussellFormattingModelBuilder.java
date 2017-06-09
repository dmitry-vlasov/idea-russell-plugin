package com.russell;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.russell.psi.RussellTypes;
import org.jetbrains.annotations.*;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellFormattingModelBuilder implements FormattingModelBuilder {
    @NotNull
    @Override
    public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
        return FormattingModelProvider.createFormattingModelForPsiFile(element.getContainingFile(),
                new RussellBlock(element.getNode(),
                        Wrap.createWrap(WrapType.NONE,
                                false),
                        Alignment.createAlignment(),
                        createSpaceBuilder(settings)),
                settings);
    }

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings, RussellLanguage.INSTANCE).
                around(RussellTypes.SEPARATOR)
                .spaceIf(settings.SPACE_AROUND_ASSIGNMENT_OPERATORS)
                .
                        before(RussellTypes.PROPERTY)
                .none();
    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
    }
}
