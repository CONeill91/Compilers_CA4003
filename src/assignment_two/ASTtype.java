package assignment_two;

/* Generated By:JJTree: Do not edit this line. ASTtype.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTtype extends SimpleNode {
  public ASTtype(int id) {
    super(id);
  }

  public ASTtype(BasicLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(BasicLParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6b913fa52a186dace7c5602aeaee06f8 (do not edit this line) */
