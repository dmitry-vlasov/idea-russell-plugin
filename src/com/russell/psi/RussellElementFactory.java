package com.russell.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import com.russell.RussellFileType;

public class RussellElementFactory {
  public static RussellProperty createProperty(Project project, String name, String value) {
    final RussellFile file = createFile(project, name + " = " + value);
    return (RussellProperty) file.getFirstChild();
  }

  public static RussellProperty createProperty(Project project, String name) {
    final RussellFile file = createFile(project, name);
    return (RussellProperty) file.getFirstChild();
  }

  public static PsiElement createCRLF(Project project) {
    final RussellFile file = createFile(project, "\n");
    return file.getFirstChild();
  }

  public static RussellFile createFile(Project project, String text) {
    String name = "dummy.rus";
    return (RussellFile) PsiFileFactory.getInstance(project).
        createFileFromText(name, RussellFileType.INSTANCE, text);
  }
}