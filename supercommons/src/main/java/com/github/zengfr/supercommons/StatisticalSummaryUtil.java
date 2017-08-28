package com.zengfr.supercommons;
import org.apache.commons.math3.stat.inference.TestUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StatisticalSummaryUtil{ 
public static double homoscedasticTTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.homoscedasticTTest(p0,p1);
}
public static boolean tTest(double p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1,p2);
}
public static double tTest(double p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1);
}
public static double tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1);
}
public static boolean tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1,p2);
}
public static double homoscedasticT(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException{
return TestUtils.homoscedasticT(p0,p1);
}
}
