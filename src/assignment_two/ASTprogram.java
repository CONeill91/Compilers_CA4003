package assignment_two;

/* Generated By:JJTree: Do not edit this line. ASTprogram.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTprogram extends SimpleNode {
  public ASTprogram(int id) {
    super(id);
  }

  public ASTprogram(BasicLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(BasicLParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ab22258765b7ca57f0a9b77abf30937b (do not edit this line) */