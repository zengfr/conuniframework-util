package com.github.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.summary.Product;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ProductUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.summary.Product p0,org.apache.commons.math3.stat.descriptive.summary.Product p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Product.copy(p0,p1);
}
}
