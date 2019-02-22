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
public final class RealFieldElementUtil{ 
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D) throws org.apache.commons.math3.exception.MathArithmeticException
*angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1) throws org.apache.commons.math3.exception.MathArithmeticException{
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>) throws org.apache.commons.math3.exception.MathArithmeticException
*angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1) throws org.apache.commons.math3.exception.MathArithmeticException{
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>) throws org.apache.commons.math3.exception.MathArithmeticException
*angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1) throws org.apache.commons.math3.exception.MathArithmeticException{
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldRotation#distance(org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldRotation#distance(org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.distance(org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T>)
*distance(org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.distance(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)}
*@see org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D#dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*<code>public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(p0,p1);
}
/**
*{@link org.apache.commons.math3.util.MathUtils#max(T,T)}
*@see org.apache.commons.math3.util.MathUtils#max(T,T)
*<code>public static <T> T org.apache.commons.math3.util.MathUtils.max(T,T)
*max(T p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T max(T p0,T p1){
	return org.apache.commons.math3.util.MathUtils.max(p0,p1);
}
/**
*{@link org.apache.commons.math3.util.MathUtils#min(T,T)}
*@see org.apache.commons.math3.util.MathUtils#min(T,T)
*<code>public static <T> T org.apache.commons.math3.util.MathUtils.min(T,T)
*min(T p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T min(T p0,T p1){
	return org.apache.commons.math3.util.MathUtils.min(p0,p1);
}
}
