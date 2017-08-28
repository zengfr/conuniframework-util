package com.zengfr.supercommons;
import org.apache.commons.math3.complex.Quaternion;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class QuaternionUtil{ 
public static org.apache.commons.math3.complex.Quaternion add(org.apache.commons.math3.complex.Quaternion p0,org.apache.commons.math3.complex.Quaternion p1){
return Quaternion.add(p0,p1);
}
public static org.apache.commons.math3.complex.Quaternion multiply(org.apache.commons.math3.complex.Quaternion p0,org.apache.commons.math3.complex.Quaternion p1){
return Quaternion.multiply(p0,p1);
}
public static org.apache.commons.math3.complex.Quaternion subtract(org.apache.commons.math3.complex.Quaternion p0,org.apache.commons.math3.complex.Quaternion p1){
return Quaternion.subtract(p0,p1);
}
public static double dotProduct(org.apache.commons.math3.complex.Quaternion p0,org.apache.commons.math3.complex.Quaternion p1){
return Quaternion.dotProduct(p0,p1);
}
}
