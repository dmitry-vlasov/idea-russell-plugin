// This is a generated file. Not intended for manual editing.
package com.russell.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.russell.psi.RussellTypes.*;
import com.russell.psi.*;
import com.intellij.navigation.ItemPresentation;

public class RussellPropertyImpl extends RussellNamedElementImpl implements RussellProperty {

  public RussellPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RussellVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RussellVisitor) accept((RussellVisitor)visitor);
    else super.accept(visitor);
  }

  public String getKey() {
    return RussellPsiImplUtil.getKey(this);
  }

  public String getValue() {
    return RussellPsiImplUtil.getValue(this);
  }

  public String getName() {
    return RussellPsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return RussellPsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return RussellPsiImplUtil.getNameIdentifier(this);
  }

  public ItemPresentation getPresentation() {
    return RussellPsiImplUtil.getPresentation(this);
  }

}
