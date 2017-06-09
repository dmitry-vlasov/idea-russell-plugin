package com.russell;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.*;
import com.intellij.navigation.*;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.russell.psi.*;

import java.util.*;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellStructureViewElement implements StructureViewTreeElement, SortableTreeElement {
    private PsiElement element;

    public RussellStructureViewElement(PsiElement element) {
        this.element = element;
    }

    @Override
    public Object getValue() {
        return element;
    }

    @Override
    public void navigate(boolean requestFocus) {
        if (element instanceof NavigationItem) {
            ((NavigationItem) element).navigate(requestFocus);
        }
    }

    @Override
    public boolean canNavigate() {
        return element instanceof NavigationItem &&
                ((NavigationItem) element).canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return element instanceof NavigationItem &&
                ((NavigationItem) element).canNavigateToSource();
    }

    @Override
    public String getAlphaSortKey() {
        return element instanceof PsiNamedElement ? ((PsiNamedElement) element).getName() : null;
    }

    @Override
    public ItemPresentation getPresentation() {
        return element instanceof NavigationItem ?
                ((NavigationItem) element).getPresentation() : null;
    }

    @Override
    public TreeElement[] getChildren() {
        if (element instanceof RussellFile) {
            RussellProperty[] properties = PsiTreeUtil.getChildrenOfType(element, RussellProperty.class);
            List<TreeElement> treeElements = new ArrayList<TreeElement>(properties.length);
            for (RussellProperty property : properties) {
                treeElements.add(new RussellStructureViewElement(property));
            }
            return treeElements.toArray(new TreeElement[treeElements.size()]);
        } else {
            return EMPTY_ARRAY;
        }
    }
}
