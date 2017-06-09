package com.russell;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by dvlasov on 07.06.17.
 */
public class RussellFileType extends LanguageFileType {

    public static final RussellFileType INSTANCE = new RussellFileType();

    protected RussellFileType() {
        super(RussellLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "RussellLanguage";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "RussellLanguage source file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "rus";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return RussellIcons.FILE;
    }
}
