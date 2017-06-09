package com.russell;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.russell.psi.RussellTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellCompletionContributor extends CompletionContributor {
    public RussellCompletionContributor() {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(RussellTypes.VALUE).withLanguage(RussellLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("Hello"));
                    }
                }
        );
    }
}
