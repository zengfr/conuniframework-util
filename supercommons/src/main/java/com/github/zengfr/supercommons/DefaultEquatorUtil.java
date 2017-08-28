package com.zengfr.supercommons;
import org.apache.commons.collections4.functors.DefaultEquator;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DefaultEquatorUtil{ 
public static <T> org.apache.commons.collections4.functors.DefaultEquator<T> defaultEquator(){
return DefaultEquator.defaultEquator();
}
}
