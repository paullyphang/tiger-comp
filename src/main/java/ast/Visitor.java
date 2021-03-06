package ast;

import ast.Ast.Class;
import ast.Ast.Dec;
import ast.Ast.Exp.Add;
import ast.Ast.Exp.And;
import ast.Ast.Exp.ArraySelect;
import ast.Ast.Exp.Call;
import ast.Ast.Exp.False;
import ast.Ast.Exp.Id;
import ast.Ast.Exp.Length;
import ast.Ast.Exp.Lt;
import ast.Ast.Exp.NewIntArray;
import ast.Ast.Exp.NewObject;
import ast.Ast.Exp.Not;
import ast.Ast.Exp.Num;
import ast.Ast.Exp.Sub;
import ast.Ast.Exp.This;
import ast.Ast.Exp.Times;
import ast.Ast.Exp.True;
import ast.Ast.MainClass.MainClassSingle;
import ast.Ast.Method.MethodSingle;
import ast.Ast.Stm.Assign;
import ast.Ast.Stm.AssignArray;
import ast.Ast.Stm.Block;
import ast.Ast.Stm.If;
import ast.Ast.Stm.Print;
import ast.Ast.Stm.While;
import ast.Ast.Type.Boolean;
import ast.Ast.Type.ClassType;
import ast.Ast.Type.Int;
import ast.Ast.Type.IntArray;

public interface Visitor {
    // expressions
    void visit(Add e);

    void visit(And e);

    void visit(ArraySelect e);

    void visit(Call e);

    void visit(False e);

    void visit(Id e);

    void visit(Length e);

    void visit(Lt e);

    void visit(NewIntArray e);

    void visit(NewObject e);

    void visit(Not e);

    void visit(Num e);

    void visit(Sub e);

    void visit(This e);

    void visit(Times e);

    void visit(True e);

    // statements
    void visit(Assign s);

    void visit(AssignArray s);

    void visit(Block s);

    void visit(If s);

    void visit(Print s);

    void visit(While s);

    // type
    void visit(Boolean t);

    void visit(ClassType t);

    void visit(Int t);

    void visit(IntArray t);

    // dec
    void visit(Dec.DecSingle d);

    // method
    void visit(MethodSingle m);

    // class
    void visit(Class.ClassSingle c);

    // main class
    void visit(MainClassSingle c);

    // program
    void visit(ast.Ast.Program.ProgramSingle p);
}
