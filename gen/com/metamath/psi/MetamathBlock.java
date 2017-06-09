// This is a generated file. Not intended for manual editing.
package com.metamath.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MetamathBlock extends PsiElement {

  @NotNull
  List<MetamathAxiom> getAxiomList();

  @NotNull
  List<MetamathBlock> getBlockList();

  @NotNull
  List<MetamathComment> getCommentList();

  @NotNull
  List<MetamathConstant> getConstantList();

  @NotNull
  List<MetamathDisjointed> getDisjointedList();

  @NotNull
  List<MetamathEssential> getEssentialList();

  @NotNull
  List<MetamathFloating> getFloatingList();

  @NotNull
  List<MetamathInclude> getIncludeList();

  @NotNull
  List<MetamathTheorem> getTheoremList();

  @NotNull
  List<MetamathVariable> getVariableList();

}
