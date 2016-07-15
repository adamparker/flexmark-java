package com.vladsch.flexmark.ext.tables;

import com.vladsch.flexmark.internal.util.sequence.BasedSequence;
import com.vladsch.flexmark.node.CustomNode;

/**
 * Body part of a {@link TableBlock} containing {@link TableRow TableRows}.
 */
public class TableBody extends CustomNode<TableVisitor> {
    @Override
    public BasedSequence[] getSegments() {
        return EMPTY_SEGMENTS;
    }

    public TableBody() {
    }

    public TableBody(BasedSequence chars) {
        super(chars);
    }

    @Override
    public void accept(TableVisitor visitor) {
        visitor.visit(this);
    }
}
