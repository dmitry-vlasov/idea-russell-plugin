package com.russell;

import com.intellij.lang.cacheBuilder.*;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.*;
import com.intellij.psi.tree.TokenSet;
import com.russell.psi.*;
import org.jetbrains.annotations.*;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellFindUsagesProvider implements FindUsagesProvider {
    @Nullable
    @Override
    public WordsScanner getWordsScanner() {
        return new DefaultWordsScanner(new RussellLexerAdapter(),
                TokenSet.create(RussellTypes.KEY),
                TokenSet.create(RussellTypes.COMMENT),
                TokenSet.EMPTY);
    }

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof PsiNamedElement;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @NotNull
    @Override
    public String getType(@NotNull PsiElement element) {
        if (element instanceof RussellProperty) {
            return "Russell property";
        } else {
            return "";
        }
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull PsiElement element) {
        if (element instanceof RussellProperty) {
            return ((RussellProperty) element).getKey();
        } else {
            return "";
        }
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof RussellProperty) {
            return ((RussellProperty) element).getKey() + ":" + ((RussellProperty) element).getValue();
        } else {
            return "";
        }
    }
}
