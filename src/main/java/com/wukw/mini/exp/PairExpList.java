package com.wukw.mini.exp;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 处理表达式列表
 */
@Data
@AllArgsConstructor
public class PairExpList extends  ExpList {
    private Exp head;
    private ExpList tail;

}
