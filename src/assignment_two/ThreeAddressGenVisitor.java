package assignment_two;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Conor on 5/12/2015.
 */
public class ThreeAddressGenVisitor implements BasicLParserVisitor {
    private static List<String> temporaryVars = new ArrayList<String>();
    String temp1 = "";
    String temp2 = "";

    @Override
    public Object visit(SimpleNode node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }

    @Override
    public Object visit(ASTprogram node, Object data) {
        node.childrenAccept(this,data);
        try{
            PrintWriter writer = new PrintWriter("threeaddresscode.ir", "UTF-8");
            for(int i = 0; i < temporaryVars.size(); i++){
                writer.print("t"+ i + ":\t");
                writer.println(temporaryVars.get(i));
            }


            writer.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();

        }
        catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return null;
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
        return null;
    }

    @Override
    public Object visit(ASTFunctionCall node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }

    @Override
    public Object visit(ASTparam_list node, Object data) {
        node.childrenAccept(this,data);
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

        return null;
    }

    @Override
    public Object visit(ASTstatement node, Object data) {
        node.childrenAccept(this,data);
        return null;
    }

    @Override
    public Object visit(ASTassignment node, Object data) {
        node.childrenAccept(this,data);
        Token left = (Token) ((SimpleNode) node.jjtGetChild(0)).jjtGetValue();
        Token right = (Token) ((SimpleNode) node.jjtGetChild(1)).jjtGetValue();
        //left hand side
        if ((node.jjtGetChild(0).jjtGetNumChildren()) > 1)
        {
            Token left_in = (Token) ((SimpleNode) node.jjtGetChild(0).jjtGetChild(0)).jjtGetValue();
            Token right_in = (Token) ((SimpleNode) node.jjtGetChild(0).jjtGetChild(1)).jjtGetValue();

            temp1 = left_in.image;
            temp2 = right_in.image;

            String combinedtemp = temp1 + " + " + temp2;
            temporaryVars.add(combinedtemp);
        }
        //right hand side
        if ((node.jjtGetChild(1).jjtGetNumChildren()) > 1)
        {
            Token left_in = (Token) ((SimpleNode) node.jjtGetChild(1).jjtGetChild(0)).jjtGetValue();
            Token right_in = (Token) ((SimpleNode) node.jjtGetChild(1).jjtGetChild(1)).jjtGetValue();

            temp1 = left_in.image;
            temp2 = right_in.image;

            String combinedtemp = temp1 + " + " + temp2;
            temporaryVars.add(combinedtemp);
        }

        temp1 = left.image;
        temp2 = right.image;

        String combinedtemp = temp1 + " := " + temp2;
        temporaryVars.add(combinedtemp);


        return null;
    }

    @Override
    public Object visit(ASTaddExpr node, Object data) {
        node.childrenAccept(this,data);
        Token left = (Token) ((SimpleNode) node.jjtGetChild(0)).jjtGetValue();
        Token right = (Token) ((SimpleNode) node.jjtGetChild(1)).jjtGetValue();
        //left hand side
        if ((node.jjtGetChild(0).jjtGetNumChildren()) > 1)
        {
            Token left_in = (Token) ((SimpleNode) node.jjtGetChild(0).jjtGetChild(0)).jjtGetValue();
            Token right_in = (Token) ((SimpleNode) node.jjtGetChild(0).jjtGetChild(1)).jjtGetValue();

            temp1 = left_in.image;
            temp2 = right_in.image;

            String combinedtemp = temp1 + " + " + temp2;
            temporaryVars.add(combinedtemp);
        }
        //right hand side
        if ((node.jjtGetChild(1).jjtGetNumChildren()) > 1)
        {
            Token left_in = (Token) ((SimpleNode) node.jjtGetChild(1).jjtGetChild(0)).jjtGetValue();
            Token right_in = (Token) ((SimpleNode) node.jjtGetChild(1).jjtGetChild(1)).jjtGetValue();

            temp1 = left_in.image;
            temp2 = right_in.image;

            String combinedtemp = temp1 + " + " + temp2;
            temporaryVars.add(combinedtemp);
        }

        temp1 = left.image;
        temp2 = right.image;

        String combinedtemp = temp1 + " := " + temp2;
        temporaryVars.add(combinedtemp);

        return null;
    }

    @Override
    public Object visit(ASTminusExpr node, Object data) {
        node.childrenAccept(this,data);
        Token left = (Token) ((SimpleNode) node.jjtGetChild(0)).jjtGetValue();
        Token right = (Token) ((SimpleNode) node.jjtGetChild(1)).jjtGetValue();
        //left hand side
        if ((node.jjtGetChild(0).jjtGetNumChildren()) > 1)
        {
            Token left_in = (Token) ((SimpleNode) node.jjtGetChild(0).jjtGetChild(0)).jjtGetValue();
            Token right_in = (Token) ((SimpleNode) node.jjtGetChild(0).jjtGetChild(1)).jjtGetValue();

            temp1 = left_in.image;
            temp2 = right_in.image;

            String combinedtemp = temp1 + " + " + temp2;
            temporaryVars.add(combinedtemp);
        }
        //right hand side
        if ((node.jjtGetChild(1).jjtGetNumChildren()) > 1)
        {
            Token left_in = (Token) ((SimpleNode) node.jjtGetChild(1).jjtGetChild(0)).jjtGetValue();
            Token right_in = (Token) ((SimpleNode) node.jjtGetChild(1).jjtGetChild(1)).jjtGetValue();

            temp1 = left_in.image;
            temp2 = right_in.image;

            String combinedtemp = temp1 + " + " + temp2;
            temporaryVars.add(combinedtemp);
        }

        temp1 = left.image;
        temp2 = right.image;

        String combinedtemp = temp1 + " := " + temp2;
        temporaryVars.add(combinedtemp);

        return null;
    }

    @Override
    public Object visit(ASTmultExpr node, Object data) {
        node.childrenAccept(this,data);
        Token left = (Token) ((SimpleNode) node.jjtGetChild(0)).jjtGetValue();
        Token right = (Token) ((SimpleNode) node.jjtGetChild(1)).jjtGetValue();
        //left hand side
        if ((node.jjtGetChild(0).jjtGetNumChildren()) > 1)
        {
            Token left_in = (Token) ((SimpleNode) node.jjtGetChild(0).jjtGetChild(0)).jjtGetValue();
            Token right_in = (Token) ((SimpleNode) node.jjtGetChild(0).jjtGetChild(1)).jjtGetValue();

            temp1 = left_in.image;
            temp2 = right_in.image;

            String combinedtemp = temp1 + " + " + temp2;
            temporaryVars.add(combinedtemp);
        }
        //right hand side
        if ((node.jjtGetChild(1).jjtGetNumChildren()) > 1)
        {
            Token left_in = (Token) ((SimpleNode) node.jjtGetChild(1).jjtGetChild(0)).jjtGetValue();
            Token right_in = (Token) ((SimpleNode) node.jjtGetChild(1).jjtGetChild(1)).jjtGetValue();

            temp1 = left_in.image;
            temp2 = right_in.image;

            String combinedtemp = temp1 + " + " + temp2;
            temporaryVars.add(combinedtemp);
        }

        temp1 = left.image;
        temp2 = right.image;

        String combinedtemp = temp1 + " := " + temp2;
        temporaryVars.add(combinedtemp);

        return null;
    }

    @Override
    public Object visit(ASTdivExpr node, Object data)  {
        node.childrenAccept(this,data);
        Token left = (Token) ((SimpleNode) node.jjtGetChild(0)).jjtGetValue();
        Token right = (Token) ((SimpleNode) node.jjtGetChild(1)).jjtGetValue();
        //left hand side
        if ((node.jjtGetChild(0).jjtGetNumChildren()) > 1)
        {
            Token left_in = (Token) ((SimpleNode) node.jjtGetChild(0).jjtGetChild(0)).jjtGetValue();
            Token right_in = (Token) ((SimpleNode) node.jjtGetChild(0).jjtGetChild(1)).jjtGetValue();

            temp1 = left_in.image;
            temp2 = right_in.image;

            String combinedtemp = temp1 + " + " + temp2;
            temporaryVars.add(combinedtemp);
        }
        //right hand side
        if ((node.jjtGetChild(1).jjtGetNumChildren()) > 1)
        {
            Token left_in = (Token) ((SimpleNode) node.jjtGetChild(1).jjtGetChild(0)).jjtGetValue();
            Token right_in = (Token) ((SimpleNode) node.jjtGetChild(1).jjtGetChild(1)).jjtGetValue();

            temp1 = left_in.image;
            temp2 = right_in.image;

            String combinedtemp = temp1 + " + " + temp2;
            temporaryVars.add(combinedtemp);
        }

        temp1 = left.image;
        temp2 = right.image;

        String combinedtemp = temp1 + " := " + temp2;
        temporaryVars.add(combinedtemp);

        return null;
    }

    @Override
    public Object visit(ASTbool node, Object data) {
        return null;
    }

    @Override
    public Object visit(ASTnumber node, Object data) {
        return null;
    }

    @Override
    public Object visit(ASTcondition node, Object data) {
        return null;
    }

    @Override
    public Object visit(ASTident_list node, Object data) {
        return null;
    }

    @Override
    public Object visit(ASTarg_list node, Object data) {
        return null;
    }

    @Override
    public Object visit(ASTidentifier node, Object data) {
        return null;
    }
}
