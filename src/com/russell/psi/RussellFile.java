package com.russell.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.russell.RussellLanguage;
import com.russell.RussellFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by dvlasov on 07.06.17.
 */
public class RussellFile extends PsiFileBase {
    public RussellFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, RussellLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return RussellFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
