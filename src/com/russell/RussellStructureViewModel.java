package com.russell;

import com.intellij.ide.structureView.*;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;
import com.russell.psi.RussellFile;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellStructureViewModel extends StructureViewModelBase implements
        StructureViewModel.ElementInfoProvider {
    public RussellStructureViewModel(PsiFile psiFile) {
        super(psiFile, new RussellStructureViewElement(psiFile));
    }

    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[]{Sorter.ALPHA_SORTER};
    }


    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element instanceof RussellFile;
    }
}
