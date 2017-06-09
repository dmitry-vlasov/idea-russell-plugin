package com.russell;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.*;
import com.russell.RussellIcons;
import com.russell.psi.*;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellPsiImplUtil {
    public static String getKey(RussellProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(RussellTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to Russell spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(RussellProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(RussellTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(RussellProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(RussellProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(RussellTypes.KEY);
        if (keyNode != null) {
            RussellProperty property = RussellElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(RussellProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(RussellTypes.KEY);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final RussellProperty element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return RussellIcons.FILE;
            }
        };
    }
}
