package node;

import exception.MissingOperandException;

public final class DivisionNode extends OptNode {
    public DivisionNode(INode left, INode right) {
        super(left, right);
    }

    @Override
    public float evaluate() throws MissingOperandException {
        if (this.left == null || this.right == null)
            throw new MissingOperandException();
        if (result == null) {
            float lValue = this.left.evaluate();
            float rValue = this.right.evaluate();
            result = lValue / rValue;
        }
        return result;
    }
}