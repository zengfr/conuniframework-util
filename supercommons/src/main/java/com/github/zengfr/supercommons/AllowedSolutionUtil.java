package com.github.zengfr.supercommons;
import org.apache.commons.math3.analysis.solvers.AllowedSolution;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AllowedSolutionUtil{ 
public static org.apache.commons.math3.analysis.solvers.AllowedSolution valueOf(java.lang.String p0){
return AllowedSolution.valueOf(p0);
}
public static double forceSide(int p0,org.apache.commons.math3.analysis.UnivariateFunction p1,org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver<org.apache.commons.math3.analysis.UnivariateFunction> p2,double p3,double p4,double p5,org.apache.commons.math3.analysis.solvers.AllowedSolution p6) throws org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.forceSide(p0,p1,p2,p3,p4,p5,p6);
}
}
