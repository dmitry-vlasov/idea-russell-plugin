package com.russell;

import com.intellij.navigation.*;
import com.intellij.openapi.project.Project;
import com.russell.psi.RussellProperty;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Created by dvlasov on 09.06.17.
 */
public class RussellChooseByNameContributor implements ChooseByNameContributor {
    @NotNull
    @Override
    public String[] getNames(Project project, boolean includeNonProjectItems) {
        List<RussellProperty> properties = RussellUtil.findProperties(project);
        List<String> names = new ArrayList<String>(properties.size());
        for (RussellProperty property : properties) {
            if (property.getKey() != null && property.getKey().length() > 0) {
                names.add(property.getKey());
            }
        }
        return names.toArray(new String[names.size()]);
    }

    @NotNull
    @Override
    public NavigationItem[] getItemsByName(String name, String pattern, Project project, boolean includeNonProjectItems) {
        // todo include non project items
        List<RussellProperty> properties = RussellUtil.findProperties(project, name);
        return properties.toArray(new NavigationItem[properties.size()]);
    }
}
