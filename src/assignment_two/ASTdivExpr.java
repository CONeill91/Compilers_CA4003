package assignment_two;

/* Generated By:JJTree: Do not edit this line. ASTdivExpr.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTdivExpr extends SimpleNode {
  public ASTdivExpr(int id) {
    super(id);
  }

  public ASTdivExpr(BasicLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(BasicLParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d6b00d26fdbb4e12e3cf861c1492d5b6 (do not edit this line) */
