package com.zengfr.supercommons;
import org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class UnivariateFunctionUtil{ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer function(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2){
return FeatureInitializerFactory.function(p0,p1,p2);
}
public static org.apache.commons.math3.analysis.UnivariateFunction add(org.apache.commons.math3.analysis.UnivariateFunction... p0){
return FunctionUtils.add(p0);
}
public static org.apache.commons.math3.analysis.UnivariateFunction combine(org.apache.commons.math3.analysis.BivariateFunction p0,org.apache.commons.math3.analysis.UnivariateFunction p1,org.apache.commons.math3.analysis.UnivariateFunction p2){
return FunctionUtils.combine(p0,p1,p2);
}
public static org.apache.commons.math3.analysis.UnivariateFunction compose(org.apache.commons.math3.analysis.UnivariateFunction... p0){
return FunctionUtils.compose(p0);
}
public static org.apache.commons.math3.analysis.UnivariateFunction multiply(org.apache.commons.math3.analysis.UnivariateFunction... p0){
return FunctionUtils.multiply(p0);
}
public static double[] sample(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,int p3) throws org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.NotStrictlyPositiveException{
return FunctionUtils.sample(p0,p1,p2,p3);
}
public static org.apache.commons.math3.analysis.MultivariateFunction collector(org.apache.commons.math3.analysis.BivariateFunction p0,org.apache.commons.math3.analysis.UnivariateFunction p1,double p2){
return FunctionUtils.collector(p0,p1,p2);
}
public static org.apache.commons.math3.analysis.UnivariateFunction fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
return FunctionUtils.fix2ndArgument(p0,p1);
}
public static org.apache.commons.math3.analysis.UnivariateFunction fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
return FunctionUtils.fix1stArgument(p0,p1);
}
public static double forceSide(int p0,org.apache.commons.math3.analysis.UnivariateFunction p1,org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver<org.apache.commons.math3.analysis.UnivariateFunction> p2,double p3,double p4,double p5,org.apache.commons.math3.analysis.solvers.AllowedSolution p6) throws org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.forceSide(p0,p1,p2,p3,p4,p5,p6);
}
public static double[] bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3,int p4) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.bracket(p0,p1,p2,p3,p4);
}
public static double[] bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3,double p4,double p5,int p6) throws org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.bracket(p0,p1,p2,p3,p4,p5,p6);
}
public static double[] bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.bracket(p0,p1,p2,p3);
}
public static boolean isBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException{
return UnivariateSolverUtils.isBracketing(p0,p1,p2);
}
public static void verifyBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException{
 UnivariateSolverUtils.verifyBracketing(p0,p1,p2);
}
public static double solve(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.solve(p0,p1,p2);
}
public static double solve(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.solve(p0,p1,p2,p3);
}
}
