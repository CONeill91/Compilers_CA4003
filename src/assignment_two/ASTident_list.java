package assignment_two;

/* Generated By:JJTree: Do not edit this line. ASTident_list.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTident_list extends SimpleNode {
  public ASTident_list(int id) {
    super(id);
  }

  public ASTident_list(BasicLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(BasicLParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4d936148d53472514ab01f7ddf9fdb77 (do not edit this line) */
