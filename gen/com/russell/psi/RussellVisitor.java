// This is a generated file. Not intended for manual editing.
package com.russell.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class RussellVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull RussellProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull RussellNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
