package com.russell;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.russell.psi.*;

import java.util.*;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellUtil {
    public static List<RussellProperty> findProperties(Project project, String key) {
        List<RussellProperty> result = null;
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, RussellFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            RussellFile RussellFile = (RussellFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (RussellFile != null) {
                RussellProperty[] properties = PsiTreeUtil.getChildrenOfType(RussellFile, RussellProperty.class);
                if (properties != null) {
                    for (RussellProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            if (result == null) {
                                result = new ArrayList<RussellProperty>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<RussellProperty>emptyList();
    }

    public static List<RussellProperty> findProperties(Project project) {
        List<RussellProperty> result = new ArrayList<RussellProperty>();
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, RussellFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            RussellFile RussellFile = (RussellFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (RussellFile != null) {
                RussellProperty[] properties = PsiTreeUtil.getChildrenOfType(RussellFile, RussellProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}
