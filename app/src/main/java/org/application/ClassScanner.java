package org.application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class ClassScanner {

    private ClassScanner() {
    }

    public static List<Class<?>> getClasses(String packageName) {
        List<Class<?>> classes = new ArrayList<>();

        String path = packageName.replace('.', '/');

        try {
            var resources = Thread.currentThread()
                    .getContextClassLoader()
                    .getResources(path);

            while (resources.hasMoreElements()) {
                URL resource = resources.nextElement();

                if (resource.getProtocol().equals("file")) {
                    File directory = new File(resource.toURI());

                    for (File file : directory.listFiles()) {
                        if (file.getName().endsWith(".class")) {
                            String className = packageName + "." +
                                    file.getName().replace(".class", "");

                            classes.add(Class.forName(className));
                        }
                    }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return classes;
    }
}
