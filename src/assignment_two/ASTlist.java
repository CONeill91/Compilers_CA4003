package assignment_two;

/* Generated By:JJTree: Do not edit this line. ASTlist.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTlist extends SimpleNode {
  public ASTlist(int id) {
    super(id);
  }

  public ASTlist(BasicLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(BasicLParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7672b6fde597e9155ad7c77dec922e36 (do not edit this line) */
