package com.github.zengfr.supercommons;
import org.apache.commons.math3.dfp.Dfp;
import org.apache.commons.math3.dfp.DfpMath;
import org.apache.commons.math3.dfp.DfpField;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DfpUtil{ 
public static org.apache.commons.math3.dfp.Dfp copysign(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1){
return Dfp.copysign(p0,p1);
}
public static org.apache.commons.math3.dfp.Dfp sin(org.apache.commons.math3.dfp.Dfp p0){
return DfpMath.sin(p0);
}
public static org.apache.commons.math3.dfp.Dfp cos(org.apache.commons.math3.dfp.Dfp p0){
return DfpMath.cos(p0);
}
public static org.apache.commons.math3.dfp.Dfp tan(org.apache.commons.math3.dfp.Dfp p0){
return DfpMath.tan(p0);
}
public static org.apache.commons.math3.dfp.Dfp log(org.apache.commons.math3.dfp.Dfp p0){
return DfpMath.log(p0);
}
public static org.apache.commons.math3.dfp.Dfp pow(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1){
return DfpMath.pow(p0,p1);
}
public static org.apache.commons.math3.dfp.Dfp pow(org.apache.commons.math3.dfp.Dfp p0,int p1){
return DfpMath.pow(p0,p1);
}
public static org.apache.commons.math3.dfp.Dfp exp(org.apache.commons.math3.dfp.Dfp p0){
return DfpMath.exp(p0);
}
public static org.apache.commons.math3.dfp.Dfp acos(org.apache.commons.math3.dfp.Dfp p0){
return DfpMath.acos(p0);
}
public static org.apache.commons.math3.dfp.Dfp asin(org.apache.commons.math3.dfp.Dfp p0){
return DfpMath.asin(p0);
}
public static org.apache.commons.math3.dfp.Dfp atan(org.apache.commons.math3.dfp.Dfp p0){
return DfpMath.atan(p0);
}
public static org.apache.commons.math3.dfp.Dfp computeExp(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1){
return DfpField.computeExp(p0,p1);
}
public static org.apache.commons.math3.dfp.Dfp computeLn(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1,org.apache.commons.math3.dfp.Dfp p2){
return DfpField.computeLn(p0,p1,p2);
}
}
