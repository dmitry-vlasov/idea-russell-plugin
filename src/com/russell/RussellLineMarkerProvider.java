package com.russell;

import com.intellij.codeInsight.daemon.*;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.russell.psi.RussellProperty;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellLineMarkerProvider extends RelatedItemLineMarkerProvider {
    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element, Collection<? super RelatedItemLineMarkerInfo> result) {
        if (element instanceof PsiLiteralExpression) {
            PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
            String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
            if (value != null && value.startsWith("russell" + ":")) {
                Project project = element.getProject();
                final List<RussellProperty> properties = RussellUtil.findProperties(project, value.substring(8));
                if (properties.size() > 0) {
                    NavigationGutterIconBuilder<PsiElement> builder =
                            NavigationGutterIconBuilder.create(RussellIcons.FILE).
                                    setTargets(properties).
                                    setTooltipText("Navigate to a simple property");
                    result.add(builder.createLineMarkerInfo(element));
                }
            }
        }
    }
}
