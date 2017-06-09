package com.russell.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.russell.psi.RussellNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class RussellNamedElementImpl extends ASTWrapperPsiElement implements RussellNamedElement {
  public RussellNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }
}