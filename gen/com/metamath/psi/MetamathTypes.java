// This is a generated file. Not intended for manual editing.
package com.metamath.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.metamath.psi.impl.*;

public interface MetamathTypes {

  IElementType AXIOM = new MetamathElementType("AXIOM");
  IElementType BLOCK = new MetamathElementType("BLOCK");
  IElementType COMMENT = new MetamathElementType("COMMENT");
  IElementType CONSTANT = new MetamathElementType("CONSTANT");
  IElementType DISJOINTED = new MetamathElementType("DISJOINTED");
  IElementType ESSENTIAL = new MetamathElementType("ESSENTIAL");
  IElementType FLOATING = new MetamathElementType("FLOATING");
  IElementType INCLUDE = new MetamathElementType("INCLUDE");
  IElementType THEOREM = new MetamathElementType("THEOREM");
  IElementType VARIABLE = new MetamathElementType("VARIABLE");

  IElementType AX = new MetamathTokenType("AX");
  IElementType BLOCK_BEGIN = new MetamathTokenType("BLOCK_BEGIN");
  IElementType BLOCK_END = new MetamathTokenType("BLOCK_END");
  IElementType COMMENT_BEGIN = new MetamathTokenType("COMMENT_BEGIN");
  IElementType COMMENT_CHAR = new MetamathTokenType("COMMENT_CHAR");
  IElementType COMMENT_END = new MetamathTokenType("COMMENT_END");
  IElementType CONST = new MetamathTokenType("CONST");
  IElementType DISJ = new MetamathTokenType("DISJ");
  IElementType END = new MetamathTokenType("END");
  IElementType EQ = new MetamathTokenType("EQ");
  IElementType ESS = new MetamathTokenType("ESS");
  IElementType FLO = new MetamathTokenType("FLO");
  IElementType INCLUDE_BEGIN = new MetamathTokenType("INCLUDE_BEGIN");
  IElementType INCLUDE_END = new MetamathTokenType("INCLUDE_END");
  IElementType LAB = new MetamathTokenType("LAB");
  IElementType PR = new MetamathTokenType("PR");
  IElementType SYMB = new MetamathTokenType("SYMB");
  IElementType VAR = new MetamathTokenType("VAR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AXIOM) {
        return new MetamathAxiomImpl(node);
      }
      else if (type == BLOCK) {
        return new MetamathBlockImpl(node);
      }
      else if (type == COMMENT) {
        return new MetamathCommentImpl(node);
      }
      else if (type == CONSTANT) {
        return new MetamathConstantImpl(node);
      }
      else if (type == DISJOINTED) {
        return new MetamathDisjointedImpl(node);
      }
      else if (type == ESSENTIAL) {
        return new MetamathEssentialImpl(node);
      }
      else if (type == FLOATING) {
        return new MetamathFloatingImpl(node);
      }
      else if (type == INCLUDE) {
        return new MetamathIncludeImpl(node);
      }
      else if (type == THEOREM) {
        return new MetamathTheoremImpl(node);
      }
      else if (type == VARIABLE) {
        return new MetamathVariableImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
