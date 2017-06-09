package com.russell;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import com.russell.psi.RussellProperty;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellRefactoringSupportProvider extends RefactoringSupportProvider {
    @Override
    public boolean isMemberInplaceRenameAvailable(PsiElement element, PsiElement context) {
        return element instanceof RussellProperty;
    }
}
