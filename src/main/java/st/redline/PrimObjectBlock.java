/* Redline Smalltalk, Copyright (c) James C. Ladd. All rights reserved. See LICENSE in the root of this distribution */
package st.redline;

// Adds block functionality

public class PrimObjectBlock extends PrimObject {

	static PrimObject blockClosure;

	private boolean methodBlock = false;

	public PrimObjectBlock() {
		this(0);
	}

	PrimObjectBlock(int basicSize) {
		super(basicSize);
		cls(resolveBlockClosure());
	}

	PrimObject resolveBlockClosure() {
		if (blockClosure != null)
			return blockClosure;
		if (PrimObject.BOOTSTRAPPING)
			return PRIM_NIL;
		blockClosure = resolveObject("st.redline.BlockClosure");
		return blockClosure;
	}

	public void markAsMethodBlock() {
		methodBlock = true;
	}

	public boolean isMethodBlock() {
		return methodBlock;
	}

    public boolean notMethodBlock() {
        return !isMethodBlock();
    }

    public PrimObject answer(PrimObject answer, String blockReturnType) {
        if (notMethodBlock())
            throwAnswer(answer, blockReturnType);
        return answer;
    }

    public void throwAnswer(PrimObject answer, String blockReturnType) {
        throw new RedlineException("Subclass should implement: " + blockReturnType);
    }
}
