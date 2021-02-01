package org.freedesktop.xcb;

import org.freedesktop.xcb.internal.X;

public class XcbQueryTreeReply extends Pointer {

    public XcbQueryTreeReply(long p) {
        super(p);
    }

    public XID getParent() {
        if (this.p == 0) throw new NullPointerException();
        int parent = X.QueryTreeReply.parent(p);
        return parent == 0 ? null : new XID(parent);
    }

    public XID getRoot() {
        if (this.p == 0) throw new NullPointerException();
        int root = X.QueryTreeReply.root(p);
        return root == 0 ? null : new XID(root);
    }

    public XID[] getChildren() {
        if (this.p == 0) throw new NullPointerException();
        int n = X.query_tree_children_length(this.p);
        if (n == 0) {
            return new XID[0];
        }

        int[] children = new int[n];
        X.query_tree_children(this.p, children, n);

        XID[] array = new XID[n];
        for (int i = 0; i < n; i++) {
            array[i] = new XID(children[i]);
        }

        return array;
    }

}
