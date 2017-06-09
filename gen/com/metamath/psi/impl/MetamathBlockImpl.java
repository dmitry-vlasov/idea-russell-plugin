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

public class MetamathBlockImpl extends ASTWrapperPsiElement implements MetamathBlock {

  public MetamathBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MetamathVisitor visitor) {
    visitor.visitBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MetamathVisitor) accept((MetamathVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MetamathAxiom> getAxiomList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MetamathAxiom.class);
  }

  @Override
  @NotNull
  public List<MetamathBlock> getBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MetamathBlock.class);
  }

  @Override
  @NotNull
  public List<MetamathComment> getCommentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MetamathComment.class);
  }

  @Override
  @NotNull
  public List<MetamathConstant> getConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MetamathConstant.class);
  }

  @Override
  @NotNull
  public List<MetamathDisjointed> getDisjointedList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MetamathDisjointed.class);
  }

  @Override
  @NotNull
  public List<MetamathEssential> getEssentialList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MetamathEssential.class);
  }

  @Override
  @NotNull
  public List<MetamathFloating> getFloatingList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MetamathFloating.class);
  }

  @Override
  @NotNull
  public List<MetamathInclude> getIncludeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MetamathInclude.class);
  }

  @Override
  @NotNull
  public List<MetamathTheorem> getTheoremList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MetamathTheorem.class);
  }

  @Override
  @NotNull
  public List<MetamathVariable> getVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MetamathVariable.class);
  }

}
