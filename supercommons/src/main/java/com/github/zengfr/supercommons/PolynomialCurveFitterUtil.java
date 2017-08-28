package com.github.zengfr.supercommons;
import org.apache.commons.math3.fitting.PolynomialCurveFitter;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PolynomialCurveFitterUtil{ 
public static org.apache.commons.math3.fitting.PolynomialCurveFitter create(int p0){
return PolynomialCurveFitter.create(p0);
}
}
