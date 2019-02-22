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
public final class DfpUtil{ 
/**
*{@link org.apache.commons.math3.dfp.DfpMath#acos(org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpMath#acos(org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpMath.acos(org.apache.commons.math3.dfp.Dfp)
*acos(org.apache.commons.math3.dfp.Dfp p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp acos(org.apache.commons.math3.dfp.Dfp p0){
	return org.apache.commons.math3.dfp.DfpMath.acos(p0);
}
/**
*{@link org.apache.commons.math3.dfp.DfpMath#asin(org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpMath#asin(org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpMath.asin(org.apache.commons.math3.dfp.Dfp)
*asin(org.apache.commons.math3.dfp.Dfp p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp asin(org.apache.commons.math3.dfp.Dfp p0){
	return org.apache.commons.math3.dfp.DfpMath.asin(p0);
}
/**
*{@link org.apache.commons.math3.dfp.DfpMath#atan(org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpMath#atan(org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpMath.atan(org.apache.commons.math3.dfp.Dfp)
*atan(org.apache.commons.math3.dfp.Dfp p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp atan(org.apache.commons.math3.dfp.Dfp p0){
	return org.apache.commons.math3.dfp.DfpMath.atan(p0);
}
/**
*{@link org.apache.commons.math3.dfp.DfpField#computeExp(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpField#computeExp(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpField.computeExp(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)
*computeExp(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp computeExp(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1){
	return org.apache.commons.math3.dfp.DfpField.computeExp(p0,p1);
}
/**
*{@link org.apache.commons.math3.dfp.DfpField#computeLn(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpField#computeLn(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpField.computeLn(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)
*computeLn(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1,org.apache.commons.math3.dfp.Dfp p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp computeLn(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1,org.apache.commons.math3.dfp.Dfp p2){
	return org.apache.commons.math3.dfp.DfpField.computeLn(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.dfp.Dfp#copysign(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.Dfp#copysign(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.Dfp.copysign(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)
*copysign(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp copysign(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1){
	return org.apache.commons.math3.dfp.Dfp.copysign(p0,p1);
}
/**
*{@link org.apache.commons.math3.dfp.DfpMath#cos(org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpMath#cos(org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpMath.cos(org.apache.commons.math3.dfp.Dfp)
*cos(org.apache.commons.math3.dfp.Dfp p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp cos(org.apache.commons.math3.dfp.Dfp p0){
	return org.apache.commons.math3.dfp.DfpMath.cos(p0);
}
/**
*{@link org.apache.commons.math3.dfp.DfpMath#exp(org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpMath#exp(org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpMath.exp(org.apache.commons.math3.dfp.Dfp)
*exp(org.apache.commons.math3.dfp.Dfp p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp exp(org.apache.commons.math3.dfp.Dfp p0){
	return org.apache.commons.math3.dfp.DfpMath.exp(p0);
}
/**
*{@link org.apache.commons.math3.dfp.DfpMath#log(org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpMath#log(org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpMath.log(org.apache.commons.math3.dfp.Dfp)
*log(org.apache.commons.math3.dfp.Dfp p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp log(org.apache.commons.math3.dfp.Dfp p0){
	return org.apache.commons.math3.dfp.DfpMath.log(p0);
}
/**
*{@link org.apache.commons.math3.dfp.DfpMath#pow(org.apache.commons.math3.dfp.Dfp,int)}
*@see org.apache.commons.math3.dfp.DfpMath#pow(org.apache.commons.math3.dfp.Dfp,int)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpMath.pow(org.apache.commons.math3.dfp.Dfp,int)
*pow(org.apache.commons.math3.dfp.Dfp p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp pow(org.apache.commons.math3.dfp.Dfp p0,int p1){
	return org.apache.commons.math3.dfp.DfpMath.pow(p0,p1);
}
/**
*{@link org.apache.commons.math3.dfp.DfpMath#pow(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpMath#pow(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpMath.pow(org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp)
*pow(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp pow(org.apache.commons.math3.dfp.Dfp p0,org.apache.commons.math3.dfp.Dfp p1){
	return org.apache.commons.math3.dfp.DfpMath.pow(p0,p1);
}
/**
*{@link org.apache.commons.math3.dfp.DfpMath#sin(org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpMath#sin(org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpMath.sin(org.apache.commons.math3.dfp.Dfp)
*sin(org.apache.commons.math3.dfp.Dfp p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp sin(org.apache.commons.math3.dfp.Dfp p0){
	return org.apache.commons.math3.dfp.DfpMath.sin(p0);
}
/**
*{@link org.apache.commons.math3.dfp.DfpMath#tan(org.apache.commons.math3.dfp.Dfp)}
*@see org.apache.commons.math3.dfp.DfpMath#tan(org.apache.commons.math3.dfp.Dfp)
*<code>public static org.apache.commons.math3.dfp.Dfp org.apache.commons.math3.dfp.DfpMath.tan(org.apache.commons.math3.dfp.Dfp)
*tan(org.apache.commons.math3.dfp.Dfp p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.dfp.Dfp tan(org.apache.commons.math3.dfp.Dfp p0){
	return org.apache.commons.math3.dfp.DfpMath.tan(p0);
}
}
