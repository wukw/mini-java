package com.wukw.mini.exp;

import com.wukw.mini.stm.Stm;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EseqExp extends  Exp {
    private Stm stm;
    private Exp exp;

}
