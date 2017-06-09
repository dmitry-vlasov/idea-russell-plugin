package com.russell;

import com.intellij.lang.annotation.*;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.russell.psi.RussellProperty;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (element instanceof PsiLiteralExpression) {
            PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
            String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;

            if (value != null && value.startsWith("russell" + ":")) {
                Project project = element.getProject();
                String key = value.substring(8);
                List<RussellProperty> properties = RussellUtil.findProperties(project, key);
                if (properties.size() == 1) {
                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 8,
                            element.getTextRange().getStartOffset() + 8);
                    Annotation annotation = holder.createInfoAnnotation(range, null);
                    annotation.setTextAttributes(DefaultLanguageHighlighterColors.LINE_COMMENT);
                } else if (properties.size() == 0) {
                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 9,
                            element.getTextRange().getEndOffset());
                    holder.createErrorAnnotation(range, "Unresolved property").
                            registerFix(new CreatePropertyQuickFix(key));
                }
            }
        }
    }
}
