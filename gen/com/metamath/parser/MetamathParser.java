// This is a generated file. Not intended for manual editing.
package com.metamath.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.metamath.psi.MetamathTypes.*;
import static com.metamath.parser.MetamathParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MetamathParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == AXIOM) {
      r = axiom(b, 0);
    }
    else if (t == BLOCK) {
      r = block(b, 0);
    }
    else if (t == COMMENT) {
      r = comment(b, 0);
    }
    else if (t == CONSTANT) {
      r = constant(b, 0);
    }
    else if (t == DISJOINTED) {
      r = disjointed(b, 0);
    }
    else if (t == ESSENTIAL) {
      r = essential(b, 0);
    }
    else if (t == FLOATING) {
      r = floating(b, 0);
    }
    else if (t == INCLUDE) {
      r = include(b, 0);
    }
    else if (t == THEOREM) {
      r = theorem(b, 0);
    }
    else if (t == VARIABLE) {
      r = variable(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return metamathFile(b, l + 1);
  }

  /* ********************************************************** */
  // LAB AX SYMB* END
  public static boolean axiom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "axiom")) return false;
    if (!nextTokenIs(b, LAB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LAB, AX);
    r = r && axiom_2(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, AXIOM, r);
    return r;
  }

  // SYMB*
  private static boolean axiom_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "axiom_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SYMB)) break;
      if (!empty_element_parsed_guard_(b, "axiom_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // BLOCK_BEGIN element_* BLOCK_END
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, BLOCK_BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BLOCK_BEGIN);
    r = r && block_1(b, l + 1);
    r = r && consumeToken(b, BLOCK_END);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // element_*
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!element_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // COMMENT_BEGIN COMMENT_CHAR* COMMENT_END
  public static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    if (!nextTokenIs(b, COMMENT_BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT_BEGIN);
    r = r && comment_1(b, l + 1);
    r = r && consumeToken(b, COMMENT_END);
    exit_section_(b, m, COMMENT, r);
    return r;
  }

  // COMMENT_CHAR*
  private static boolean comment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMENT_CHAR)) break;
      if (!empty_element_parsed_guard_(b, "comment_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // CONST SYMB* END
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    if (!nextTokenIs(b, CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST);
    r = r && constant_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, CONSTANT, r);
    return r;
  }

  // SYMB*
  private static boolean constant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SYMB)) break;
      if (!empty_element_parsed_guard_(b, "constant_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // DISJ SYMB* END
  public static boolean disjointed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjointed")) return false;
    if (!nextTokenIs(b, DISJ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISJ);
    r = r && disjointed_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, DISJOINTED, r);
    return r;
  }

  // SYMB*
  private static boolean disjointed_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjointed_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SYMB)) break;
      if (!empty_element_parsed_guard_(b, "disjointed_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // comment | disjointed | essential | theorem | block | axiom | constant | variable | floating | include
  static boolean element_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comment(b, l + 1);
    if (!r) r = disjointed(b, l + 1);
    if (!r) r = essential(b, l + 1);
    if (!r) r = theorem(b, l + 1);
    if (!r) r = block(b, l + 1);
    if (!r) r = axiom(b, l + 1);
    if (!r) r = constant(b, l + 1);
    if (!r) r = variable(b, l + 1);
    if (!r) r = floating(b, l + 1);
    if (!r) r = include(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LAB ESS SYMB* END
  public static boolean essential(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "essential")) return false;
    if (!nextTokenIs(b, LAB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LAB, ESS);
    r = r && essential_2(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, ESSENTIAL, r);
    return r;
  }

  // SYMB*
  private static boolean essential_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "essential_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SYMB)) break;
      if (!empty_element_parsed_guard_(b, "essential_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LAB FLO SYMB SYMB END
  public static boolean floating(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating")) return false;
    if (!nextTokenIs(b, LAB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LAB, FLO, SYMB, SYMB, END);
    exit_section_(b, m, FLOATING, r);
    return r;
  }

  /* ********************************************************** */
  // INCLUDE_BEGIN LAB INCLUDE_END
  public static boolean include(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include")) return false;
    if (!nextTokenIs(b, INCLUDE_BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INCLUDE_BEGIN, LAB, INCLUDE_END);
    exit_section_(b, m, INCLUDE, r);
    return r;
  }

  /* ********************************************************** */
  // element_*
  static boolean metamathFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metamathFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!element_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "metamathFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LAB PR SYMB* EQ LAB* END
  public static boolean theorem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "theorem")) return false;
    if (!nextTokenIs(b, LAB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LAB, PR);
    r = r && theorem_2(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && theorem_4(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, THEOREM, r);
    return r;
  }

  // SYMB*
  private static boolean theorem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "theorem_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SYMB)) break;
      if (!empty_element_parsed_guard_(b, "theorem_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LAB*
  private static boolean theorem_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "theorem_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LAB)) break;
      if (!empty_element_parsed_guard_(b, "theorem_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // VAR SYMB* END
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && variable_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, VARIABLE, r);
    return r;
  }

  // SYMB*
  private static boolean variable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SYMB)) break;
      if (!empty_element_parsed_guard_(b, "variable_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

}
