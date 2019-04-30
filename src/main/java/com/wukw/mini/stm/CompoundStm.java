package com.wukw.mini.stm;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompoundStm extends  Stm {
    private  Stm  stm1, stm2;
}
