/* Redline Smalltalk, Copyright (c) James C. Ladd. All rights reserved. See LICENSE in the root of this distribution */
package st.redline.compiler;

class StringConstant extends ValuePrimary implements ArrayElement {

	private int index;

	StringConstant(java.lang.String value, int line) {
		super(homgenize(value), line);
	}

	private static String homgenize(String value) {
		return value.substring(1, value.length()-1).replaceAll("''", "'");
	}

	public int index() {
		return index;
	}

	public void index(int index) {
		this.index = index;
	}

	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visit(this, value(), index, line());
	}
}
