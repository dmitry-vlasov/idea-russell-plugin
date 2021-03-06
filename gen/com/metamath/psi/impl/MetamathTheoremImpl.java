// This is a generated file. Not intended for manual editing.
package com.metamath.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.metamath.psi.MetamathTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.metamath.psi.*;

public class MetamathTheoremImpl extends ASTWrapperPsiElement implements MetamathTheorem {

  public MetamathTheoremImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MetamathVisitor visitor) {
    visitor.visitTheorem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MetamathVisitor) accept((MetamathVisitor)visitor);
    else super.accept(visitor);
  }

}
