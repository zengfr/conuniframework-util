package com.zengfr.supercommons;
import org.apache.commons.math3.special.BesselJ;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BesselJResultUtil{ 
public static BesselJResult rjBesl(double p0,double p1,int p2){
return BesselJ.rjBesl(p0,p1,p2);
}
}
