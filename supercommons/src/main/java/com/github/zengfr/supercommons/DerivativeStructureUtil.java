package com.github.zengfr.supercommons;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DerivativeStructureUtil{ 
public static org.apache.commons.math3.analysis.differentiation.DerivativeStructure atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure p0,org.apache.commons.math3.analysis.differentiation.DerivativeStructure p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
return DerivativeStructure.atan2(p0,p1);
}
public static org.apache.commons.math3.analysis.differentiation.DerivativeStructure pow(double p0,org.apache.commons.math3.analysis.differentiation.DerivativeStructure p1){
return DerivativeStructure.pow(p0,p1);
}
public static org.apache.commons.math3.analysis.differentiation.DerivativeStructure hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure p0,org.apache.commons.math3.analysis.differentiation.DerivativeStructure p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
return DerivativeStructure.hypot(p0,p1);
}
}
