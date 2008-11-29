// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.adapter.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.Index", base = PyObject.class)
public class Index extends sliceType {
public static final PyType TYPE = PyType.fromClass(Index.class);
    private exprType value;
    public exprType getInternalValue() {
        return value;
    }
    @ExposedGet(name = "value")
    public PyObject getValue() {
        return Py.None;
    }
    @ExposedSet(name = "value")
    public void setValue(Object value) {
        this.value = AstAdapters.to_expr(value);
    }


    private final static String[] fields = new String[] {"value"};
    public String[] get_fields() { return fields; }

    public Index() {
        this(TYPE);
    }
    public Index(PyType subType) {
        super(subType);
    }
    @ExposedNew
    @ExposedMethod
    public void Module___init__(PyObject[] args, String[] keywords) {}
    public Index(Object value) {
        setValue(value);
    }

    public Index(Token token, exprType value) {
        super(token);
        this.value = value;
        addChild(value);
    }

    public Index(Integer ttype, Token token, exprType value) {
        super(ttype, token);
        this.value = value;
        addChild(value);
    }

    public Index(PythonTree tree, exprType value) {
        super(tree);
        this.value = value;
        addChild(value);
    }

    public String toString() {
        return "Index";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Index(");
        sb.append("value=");
        sb.append(dumpThis(value));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitIndex(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (value != null)
            value.accept(visitor);
    }

}
