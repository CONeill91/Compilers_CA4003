package assignment_two;

import java.util.*;

/**
 * Created by Conor on 5/12/2015.
 */
public class FunctionCheckVisitor implements BasicLParserVisitor {
     /*
    * Semantic Checks in this file:
    * Check if all functions are called
    * Check if functions called with correct number of arguments
    * Is there a function for every invoked identifier.
    * */

    private static HashSet<String> definedFunc = new HashSet<String>();
    private static HashSet<String> calledFunc = new HashSet<String>();
    private static HashMap<String,Integer> definedParams = new HashMap<String,Integer>();
    private static HashMap<String,Integer> calledParams = new HashMap<String,Integer>();
    @Override
    public Object visit(SimpleNode node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }

    @Override
    public Object visit(ASTprogram node, Object data) {
        node.childrenAccept(this,data);

        System.out.println("Function Checks");
        System.out.println("************");
        System.out.println("************");
        checkAllFunctionsCalled(definedFunc,calledFunc);
        System.out.println("************");
        checkAllInvokedAreDefined(calledFunc,definedFunc);
        System.out.println("************");
        checkAllFunctionsInvokedWithCorrectNumberParams(calledParams,definedParams);



        return null;
    }

    public static void checkAllFunctionsCalled(HashSet<String> definedFunc, HashSet<String> calledFunc){
        System.out.println("Check all functions were called:");
        if(definedFunc.size() != calledFunc.size()){

            System.out.println("    Error: All declared functions were not called");
        }
        else{
            System.out.println("    All declared functions were called");
        }
    }

    public static void checkAllInvokedAreDefined(HashSet<String> called, HashSet<String> definedFunc){
        System.out.println("Check there is a function for every invoked identifier:");

        for(String call : called){
            if(definedFunc.contains((String)call)){
                System.out.println("Method defined for " + call);
            }
            else{
                System.out.println("No method defined for this call");
            }
        }
    }

    public static void checkAllFunctionsInvokedWithCorrectNumberParams(HashMap<String,Integer> calledParams,HashMap<String,Integer> definedParams){
        System.out.println("Check all functions called with correct number of arguments:");
        Iterator it = calledParams.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                String func = (String)pair.getKey();
                int num = (Integer) pair.getValue();
                if(definedParams.get(func) != num){
                    System.out.println(func + " invoked with wrong number of arguments");
                }
                else{
                    System.out.println(func + " invoked with correct number of arguments");
                }

            }

    }

    @Override
    public Object visit(ASTvar_decl node, Object data) {
        node.childrenAccept(this,data);

        return null;
    }

    @Override
    public Object visit(ASTconst_decl node, Object data) {
        node.childrenAccept(this,data);



        return null;
    }

    @Override
    public Object visit(ASTfunction node, Object data) {
        node.childrenAccept(this,data);
        Token identifier = (Token) ((SimpleNode) node.jjtGetChild(1)).jjtGetValue();
        int numParams = (node.jjtGetChild(2).jjtGetNumChildren() / 2);
        definedParams.put(identifier.image,numParams);
        definedFunc.add(identifier.image);




        return null;
    }

    @Override
    public Object visit(ASTparam_list node, Object data) {
        node.childrenAccept(this,data);
        //System.out.println("ParamList");
        return null;
    }

    @Override
    public Object visit(ASTtype node, Object data) {
        node.childrenAccept(this,data);

        return null;
    }

    @Override
    public Object visit(ASTmain_prog node, Object data) {
        node.childrenAccept(this,data);
        System.out.println("Main");
        return null;
    }

    @Override
    public Object visit(ASTstatement node, Object data) {
        node.childrenAccept(this,data);
        //System.out.println("Statement");
        return null;
    }

    @Override
    public Object visit(ASTassignment node, Object data) {
        node.childrenAccept(this,data);
        //System.out.println("Assignment");
        return null;
    }

    @Override
    public Object visit(ASTaddExpr node, Object data) {
        node.childrenAccept(this,data);
        //System.out.println("Add Expression");
        return null;
    }

    @Override
    public Object visit(ASTminusExpr node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }

    @Override
    public Object visit(ASTmultExpr node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }

    @Override
    public Object visit(ASTdivExpr node, Object data) {
        node.childrenAccept(this,data); return null;
    }

    @Override
    public Object visit(ASTFunctionCall node, Object data) {
        node.childrenAccept(this,data);

        SimpleNode convertedNode = (SimpleNode) node.jjtGetChild(0);
        Token identifier = (Token) convertedNode.jjtGetValue();
        calledFunc.add(identifier.image);

        int numArgs =  node.jjtGetChild(1).jjtGetNumChildren();
        calledParams.put(identifier.image,numArgs);







        return null;
    }

    @Override
    public Object visit(ASTbool node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }

    @Override
    public Object visit(ASTnumber node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }

    @Override
    public Object visit(ASTcondition node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }

    @Override
    public Object visit(ASTident_list node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }



    @Override
    public Object visit(ASTarg_list node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }

    @Override
    public Object visit(ASTidentifier node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }
}
