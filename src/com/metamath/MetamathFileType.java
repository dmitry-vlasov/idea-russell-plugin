package com.metamath;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.metamath.MetamathIcons;
import com.metamath.MetamathLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by dvlasov on 07.06.17.
 */
public class MetamathFileType extends LanguageFileType {

    public static final MetamathFileType INSTANCE = new MetamathFileType();

    protected MetamathFileType() {
        super(MetamathLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "MetamathLanguage";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "MetamathLanguage source file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mm";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MetamathIcons.FILE;
    }
}
