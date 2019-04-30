package Test;

import com.wukw.mini.exp.*;
import com.wukw.mini.stm.AssignStm;
import com.wukw.mini.stm.CompoundStm;
import com.wukw.mini.stm.PrintStm;

public class LineTest {
    /**
     * a =5 b = {print(a,a-1),10*a,print b}
     * @param args
     */
    public static void main(String[] args) {
        new CompoundStm(
                new AssignStm("a", new OpExp(new numExp(5), 1, new numExp(3))),
                new CompoundStm(
                        new AssignStm(
                                "b", new EseqExp(
                                new PrintStm(
                                        new PairExpList(new IdExp("a"), new LastExpList(new OpExp(new IdExp("a"), 2, new numExp(1))))
                                ), new OpExp(new numExp(10), 3, new IdExp("a")))
                        ),
                        new PrintStm(new LastExpList(new IdExp("b"))))


        );
    }
}
