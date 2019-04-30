package com.wukw.mini.stm;

import com.wukw.mini.exp.Exp;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/**
 * 变量声明语句
 */
public class AssignStm extends  Stm {
    private String id;
    private Exp exp;
}
