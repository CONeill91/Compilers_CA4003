package assignment_two;

/* Generated By:JJTree: Do not edit this line. ASTassignment.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTassignment extends SimpleNode {
  public ASTassignment(int id) {
    super(id);
  }

  public ASTassignment(BasicLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(BasicLParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=242816a6dee5a08b21e555de8d923160 (do not edit this line) */
