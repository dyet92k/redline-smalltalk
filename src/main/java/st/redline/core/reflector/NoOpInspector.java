/* Redline Smalltalk, Copyright (c) James C. Ladd. All rights reserved. See LICENSE in the root of this distribution */
package st.redline.core.reflector;

public class NoOpInspector implements InspectorVisitor {

    public void visitBegin(String suffix, String className) {
        throw new IllegalStateException("This inspector should not be getting this.");
    }

    public void visitEnd(String suffix, String className) {
        throw new IllegalStateException("This inspector should not be getting this.");
    }

    public void visitConstructorBegin(String suffix, String className, String constructorName, int parameterCount) {
        throw new IllegalStateException("This inspector should not be getting this.");
    }

    public void visitConstructorEnd(String suffix, String className, String constructorName, int parameterCount) {
        throw new IllegalStateException("This inspector should not be getting this.");
    }

    public void visitConstructorsBegin(String suffix, String className) {
        throw new IllegalStateException("This inspector should not be getting this.");
    }

    public void visitConstructorsEnd(String suffix, String className) {
        throw new IllegalStateException("This inspector should not be getting this.");
    }

    public void visitParameterTypesBegin(int length) {
        throw new IllegalStateException("This inspector should not be getting this.");
    }

    public void visitParameterTypesEnd(int length) {
        throw new IllegalStateException("This inspector should not be getting this.");
    }

    public void visitParameterType(String parameterType, int index) {
        throw new IllegalStateException("This inspector should not be getting this.");
    }
}
