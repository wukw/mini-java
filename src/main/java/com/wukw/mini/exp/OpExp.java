package com.wukw.mini.exp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OpExp extends  Exp {
    private  Exp left ;
    private  int oper;
    private  Exp right ;
    public final static  int Plus=1,Minus=2,Times=3,Div=4;
}
