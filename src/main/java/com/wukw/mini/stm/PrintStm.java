package com.wukw.mini.stm;

import com.wukw.mini.exp.ExpList;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PrintStm extends  Stm {
    private ExpList expList;
}
