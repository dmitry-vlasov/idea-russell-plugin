// This is a generated file. Not intended for manual editing.
package com.russell.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class RussellLanguageVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull RussellLanguageProperty o) {
    visitRussellNamedElement(o);
  }

  public void visitRussellNamedElement(@NotNull RussellNamedElement o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
