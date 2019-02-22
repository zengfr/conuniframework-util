package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class UnivariateFunctionUtil{ 
/**
*{@link org.apache.commons.math3.analysis.FunctionUtils#add(org.apache.commons.math3.analysis.UnivariateFunction...)}
*@see org.apache.commons.math3.analysis.FunctionUtils#add(org.apache.commons.math3.analysis.UnivariateFunction...)
*<code>public static org.apache.commons.math3.analysis.UnivariateFunction org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.UnivariateFunction...)
*add(org.apache.commons.math3.analysis.UnivariateFunction... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.analysis.UnivariateFunction add(org.apache.commons.math3.analysis.UnivariateFunction... p0){
	return org.apache.commons.math3.analysis.FunctionUtils.add(p0);
}
/**
*{@link org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#bracket(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double,int)}
*@see org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#bracket(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double,int)
*<code>public static double[] org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.bracket(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double,int) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.NoBracketingException
*bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3,int p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double[] bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3,int p4) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.NoBracketingException{
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.bracket(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#bracket(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double)}
*@see org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#bracket(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double)
*<code>public static double[] org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.bracket(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.NoBracketingException
*bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double[] bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.NoBracketingException{
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.bracket(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#bracket(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double,double,double,int)}
*@see org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#bracket(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double,double,double,int)
*<code>public static double[] org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.bracket(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double,double,double,int) throws org.apache.commons.math3.exception.NoBracketingException
*bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3,double p4,double p5,int p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double[] bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3,double p4,double p5,int p6) throws org.apache.commons.math3.exception.NoBracketingException{
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.bracket(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link org.apache.commons.math3.analysis.FunctionUtils#collector(org.apache.commons.math3.analysis.BivariateFunction,org.apache.commons.math3.analysis.UnivariateFunction,double)}
*@see org.apache.commons.math3.analysis.FunctionUtils#collector(org.apache.commons.math3.analysis.BivariateFunction,org.apache.commons.math3.analysis.UnivariateFunction,double)
*<code>public static org.apache.commons.math3.analysis.MultivariateFunction org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction,org.apache.commons.math3.analysis.UnivariateFunction,double)
*collector(org.apache.commons.math3.analysis.BivariateFunction p0,org.apache.commons.math3.analysis.UnivariateFunction p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.analysis.MultivariateFunction collector(org.apache.commons.math3.analysis.BivariateFunction p0,org.apache.commons.math3.analysis.UnivariateFunction p1,double p2){
	return org.apache.commons.math3.analysis.FunctionUtils.collector(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.analysis.FunctionUtils#combine(org.apache.commons.math3.analysis.BivariateFunction,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.analysis.UnivariateFunction)}
*@see org.apache.commons.math3.analysis.FunctionUtils#combine(org.apache.commons.math3.analysis.BivariateFunction,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.analysis.UnivariateFunction)
*<code>public static org.apache.commons.math3.analysis.UnivariateFunction org.apache.commons.math3.analysis.FunctionUtils.combine(org.apache.commons.math3.analysis.BivariateFunction,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.analysis.UnivariateFunction)
*combine(org.apache.commons.math3.analysis.BivariateFunction p0,org.apache.commons.math3.analysis.UnivariateFunction p1,org.apache.commons.math3.analysis.UnivariateFunction p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.analysis.UnivariateFunction combine(org.apache.commons.math3.analysis.BivariateFunction p0,org.apache.commons.math3.analysis.UnivariateFunction p1,org.apache.commons.math3.analysis.UnivariateFunction p2){
	return org.apache.commons.math3.analysis.FunctionUtils.combine(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.analysis.FunctionUtils#compose(org.apache.commons.math3.analysis.UnivariateFunction...)}
*@see org.apache.commons.math3.analysis.FunctionUtils#compose(org.apache.commons.math3.analysis.UnivariateFunction...)
*<code>public static org.apache.commons.math3.analysis.UnivariateFunction org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.UnivariateFunction...)
*compose(org.apache.commons.math3.analysis.UnivariateFunction... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.analysis.UnivariateFunction compose(org.apache.commons.math3.analysis.UnivariateFunction... p0){
	return org.apache.commons.math3.analysis.FunctionUtils.compose(p0);
}
/**
*{@link org.apache.commons.math3.analysis.FunctionUtils#fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction,double)}
*@see org.apache.commons.math3.analysis.FunctionUtils#fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction,double)
*<code>public static org.apache.commons.math3.analysis.UnivariateFunction org.apache.commons.math3.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction,double)
*fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.analysis.UnivariateFunction fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
	return org.apache.commons.math3.analysis.FunctionUtils.fix1stArgument(p0,p1);
}
/**
*{@link org.apache.commons.math3.analysis.FunctionUtils#fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction,double)}
*@see org.apache.commons.math3.analysis.FunctionUtils#fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction,double)
*<code>public static org.apache.commons.math3.analysis.UnivariateFunction org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction,double)
*fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.analysis.UnivariateFunction fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
	return org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(p0,p1);
}
/**
*{@link org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#forceSide(int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver<org.apache.commons.math3.analysis.UnivariateFunction>,double,double,double,org.apache.commons.math3.analysis.solvers.AllowedSolution)}
*@see org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#forceSide(int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver<org.apache.commons.math3.analysis.UnivariateFunction>,double,double,double,org.apache.commons.math3.analysis.solvers.AllowedSolution)
*<code>public static double org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.forceSide(int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver<org.apache.commons.math3.analysis.UnivariateFunction>,double,double,double,org.apache.commons.math3.analysis.solvers.AllowedSolution) throws org.apache.commons.math3.exception.NoBracketingException
*forceSide(int p0,org.apache.commons.math3.analysis.UnivariateFunction p1,org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver<org.apache.commons.math3.analysis.UnivariateFunction> p2,double p3,double p4,double p5,org.apache.commons.math3.analysis.solvers.AllowedSolution p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double forceSide(int p0,org.apache.commons.math3.analysis.UnivariateFunction p1,org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver<org.apache.commons.math3.analysis.UnivariateFunction> p2,double p3,double p4,double p5,org.apache.commons.math3.analysis.solvers.AllowedSolution p6) throws org.apache.commons.math3.exception.NoBracketingException{
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.forceSide(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory#function(org.apache.commons.math3.analysis.UnivariateFunction,double,double)}
*@see org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory#function(org.apache.commons.math3.analysis.UnivariateFunction,double,double)
*<code>public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.function(org.apache.commons.math3.analysis.UnivariateFunction,double,double)
*function(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer function(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2){
	return org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.function(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#isBracketing(org.apache.commons.math3.analysis.UnivariateFunction,double,double)}
*@see org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#isBracketing(org.apache.commons.math3.analysis.UnivariateFunction,double,double)
*<code>public static boolean org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isBracketing(org.apache.commons.math3.analysis.UnivariateFunction,double,double) throws org.apache.commons.math3.exception.NullArgumentException
*isBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isBracketing(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.analysis.FunctionUtils#multiply(org.apache.commons.math3.analysis.UnivariateFunction...)}
*@see org.apache.commons.math3.analysis.FunctionUtils#multiply(org.apache.commons.math3.analysis.UnivariateFunction...)
*<code>public static org.apache.commons.math3.analysis.UnivariateFunction org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.UnivariateFunction...)
*multiply(org.apache.commons.math3.analysis.UnivariateFunction... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.analysis.UnivariateFunction multiply(org.apache.commons.math3.analysis.UnivariateFunction... p0){
	return org.apache.commons.math3.analysis.FunctionUtils.multiply(p0);
}
/**
*{@link org.apache.commons.math3.analysis.FunctionUtils#sample(org.apache.commons.math3.analysis.UnivariateFunction,double,double,int)}
*@see org.apache.commons.math3.analysis.FunctionUtils#sample(org.apache.commons.math3.analysis.UnivariateFunction,double,double,int)
*<code>public static double[] org.apache.commons.math3.analysis.FunctionUtils.sample(org.apache.commons.math3.analysis.UnivariateFunction,double,double,int) throws org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.NotStrictlyPositiveException
*sample(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double[] sample(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,int p3) throws org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.NotStrictlyPositiveException{
	return org.apache.commons.math3.analysis.FunctionUtils.sample(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#solve(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double)}
*@see org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#solve(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double)
*<code>public static double org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.solve(org.apache.commons.math3.analysis.UnivariateFunction,double,double,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException
*solve(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double solve(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException{
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.solve(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#solve(org.apache.commons.math3.analysis.UnivariateFunction,double,double)}
*@see org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#solve(org.apache.commons.math3.analysis.UnivariateFunction,double,double)
*<code>public static double org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.solve(org.apache.commons.math3.analysis.UnivariateFunction,double,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException
*solve(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double solve(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException{
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.solve(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#verifyBracketing(org.apache.commons.math3.analysis.UnivariateFunction,double,double)}
*@see org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#verifyBracketing(org.apache.commons.math3.analysis.UnivariateFunction,double,double)
*<code>public static void org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.verifyBracketing(org.apache.commons.math3.analysis.UnivariateFunction,double,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException
*verifyBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void verifyBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException{
	 org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.verifyBracketing(p0,p1,p2);
}
}
