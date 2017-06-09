package com.russell;

import com.intellij.codeInsight.lookup.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.russell.psi.RussellProperty;
import org.jetbrains.annotations.*;

import java.util.*;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
    private String key;

    public RussellReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);
        key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        final List<RussellProperty> properties = RussellUtil.findProperties(project, key);
        List<ResolveResult> results = new ArrayList<ResolveResult>();
        for (RussellProperty property : properties) {
            results.add(new PsiElementResolveResult(property));
        }
        return results.toArray(new ResolveResult[results.size()]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        Project project = myElement.getProject();
        List<RussellProperty> properties = RussellUtil.findProperties(project);
        List<LookupElement> variants = new ArrayList<LookupElement>();
        for (final RussellProperty property : properties) {
            if (property.getKey() != null && property.getKey().length() > 0) {
                variants.add(LookupElementBuilder.create(property).
                        withIcon(RussellIcons.FILE).
                        withTypeText(property.getContainingFile().getName())
                );
            }
        }
        return variants.toArray();
    }
}
