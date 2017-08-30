package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EscaperUtil{ 
/**
*public static com.google.common.escape.Escaper com.google.common.escape.Escapers.nullEscaper()
*/ 
public static com.google.common.escape.Escaper nullEscaper(){
	return com.google.common.escape.Escapers.nullEscaper();
}
/**
*public static com.google.common.escape.Escaper com.google.common.html.HtmlEscapers.htmlEscaper()
*/ 
public static com.google.common.escape.Escaper htmlEscaper(){
	return com.google.common.html.HtmlEscapers.htmlEscaper();
}
/**
*public static com.google.common.escape.Escaper com.google.common.net.UrlEscapers.urlFragmentEscaper()
*/ 
public static com.google.common.escape.Escaper urlFragmentEscaper(){
	return com.google.common.net.UrlEscapers.urlFragmentEscaper();
}
/**
*public static com.google.common.escape.Escaper com.google.common.net.UrlEscapers.urlPathSegmentEscaper()
*/ 
public static com.google.common.escape.Escaper urlPathSegmentEscaper(){
	return com.google.common.net.UrlEscapers.urlPathSegmentEscaper();
}
/**
*public static com.google.common.escape.Escaper com.google.common.net.UrlEscapers.urlFormParameterEscaper()
*/ 
public static com.google.common.escape.Escaper urlFormParameterEscaper(){
	return com.google.common.net.UrlEscapers.urlFormParameterEscaper();
}
/**
*public static com.google.common.escape.Escaper com.google.common.xml.XmlEscapers.xmlAttributeEscaper()
*/ 
public static com.google.common.escape.Escaper xmlAttributeEscaper(){
	return com.google.common.xml.XmlEscapers.xmlAttributeEscaper();
}
/**
*public static com.google.common.escape.Escaper com.google.common.xml.XmlEscapers.xmlContentEscaper()
*/ 
public static com.google.common.escape.Escaper xmlContentEscaper(){
	return com.google.common.xml.XmlEscapers.xmlContentEscaper();
}
}
