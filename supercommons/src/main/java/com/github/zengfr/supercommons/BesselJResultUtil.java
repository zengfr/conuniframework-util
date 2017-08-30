package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BesselJResultUtil{ 
/**
*public static org.apache.commons.math3.special.BesselJ$BesselJResult org.apache.commons.math3.special.BesselJ.rjBesl(double,double,int)
*/ 
public static BesselJResult rjBesl(double p0,double p1,int p2){
	return org.apache.commons.math3.special.BesselJ.rjBesl(p0,p1,p2);
}
}
