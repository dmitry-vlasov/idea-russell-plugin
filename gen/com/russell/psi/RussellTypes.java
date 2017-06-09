// This is a generated file. Not intended for manual editing.
package com.russell.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.russell.psi.impl.*;

public interface RussellTypes {

  IElementType PROPERTY = new RussellElementType("PROPERTY");

  IElementType COMMENT = new RussellTokenType("COMMENT");
  IElementType CRLF = new RussellTokenType("CRLF");
  IElementType KEY = new RussellTokenType("KEY");
  IElementType SEPARATOR = new RussellTokenType("SEPARATOR");
  IElementType VALUE = new RussellTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new RussellPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
