// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class TryFinally extends stmtType {
    public stmtType[] body;
    public stmtType[] finalbody;

    private final static String[] fields = new String[] {"body", "finalbody"};
    public String[] get_fields() { return fields; }

    public TryFinally(stmtType[] body, stmtType[] finalbody) {
        this.body = body;
        if (body != null) {
            for(int ibody=0;ibody<body.length;ibody++) {
                addChild(body[ibody]);
            }
        }
        this.finalbody = finalbody;
        if (finalbody != null) {
            for(int ifinalbody=0;ifinalbody<finalbody.length;ifinalbody++) {
                addChild(finalbody[ifinalbody]);
            }
        }
    }

    public TryFinally(Token token, stmtType[] body, stmtType[] finalbody) {
        super(token);
        this.body = body;
        if (body != null) {
            for(int ibody=0;ibody<body.length;ibody++) {
                addChild(body[ibody]);
            }
        }
        this.finalbody = finalbody;
        if (finalbody != null) {
            for(int ifinalbody=0;ifinalbody<finalbody.length;ifinalbody++) {
                addChild(finalbody[ifinalbody]);
            }
        }
    }

    public TryFinally(int ttype, Token token, stmtType[] body, stmtType[]
    finalbody) {
        super(ttype, token);
        this.body = body;
        if (body != null) {
            for(int ibody=0;ibody<body.length;ibody++) {
                addChild(body[ibody]);
            }
        }
        this.finalbody = finalbody;
        if (finalbody != null) {
            for(int ifinalbody=0;ifinalbody<finalbody.length;ifinalbody++) {
                addChild(finalbody[ifinalbody]);
            }
        }
    }

    public TryFinally(PythonTree tree, stmtType[] body, stmtType[] finalbody) {
        super(tree);
        this.body = body;
        if (body != null) {
            for(int ibody=0;ibody<body.length;ibody++) {
                addChild(body[ibody]);
            }
        }
        this.finalbody = finalbody;
        if (finalbody != null) {
            for(int ifinalbody=0;ifinalbody<finalbody.length;ifinalbody++) {
                addChild(finalbody[ifinalbody]);
            }
        }
    }

    public String toString() {
        return "TryFinally";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("TryFinally(");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("finalbody=");
        sb.append(dumpThis(finalbody));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitTryFinally(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null)
                    body[i].accept(visitor);
            }
        }
        if (finalbody != null) {
            for (int i = 0; i < finalbody.length; i++) {
                if (finalbody[i] != null)
                    finalbody[i].accept(visitor);
            }
        }
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
