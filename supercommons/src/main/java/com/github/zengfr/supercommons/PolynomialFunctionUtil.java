package com.zengfr.supercommons;
import org.apache.commons.math3.analysis.polynomials.PolynomialsUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PolynomialFunctionUtil{ 
public static org.apache.commons.math3.analysis.polynomials.PolynomialFunction createJacobiPolynomial(int p0,int p1,int p2){
return PolynomialsUtils.createJacobiPolynomial(p0,p1,p2);
}
public static org.apache.commons.math3.analysis.polynomials.PolynomialFunction createHermitePolynomial(int p0){
return PolynomialsUtils.createHermitePolynomial(p0);
}
public static org.apache.commons.math3.analysis.polynomials.PolynomialFunction createLaguerrePolynomial(int p0){
return PolynomialsUtils.createLaguerrePolynomial(p0);
}
public static org.apache.commons.math3.analysis.polynomials.PolynomialFunction createChebyshevPolynomial(int p0){
return PolynomialsUtils.createChebyshevPolynomial(p0);
}
public static org.apache.commons.math3.analysis.polynomials.PolynomialFunction createLegendrePolynomial(int p0){
return PolynomialsUtils.createLegendrePolynomial(p0);
}
}
