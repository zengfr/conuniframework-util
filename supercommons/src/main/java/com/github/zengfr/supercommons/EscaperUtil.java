package com.zengfr.supercommons;
import com.google.common.escape.Escapers;
import com.google.common.html.HtmlEscapers;
import com.google.common.net.UrlEscapers;
import com.google.common.xml.XmlEscapers;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EscaperUtil{ 
public static com.google.common.escape.Escaper nullEscaper(){
return Escapers.nullEscaper();
}
public static com.google.common.escape.Escaper htmlEscaper(){
return HtmlEscapers.htmlEscaper();
}
public static com.google.common.escape.Escaper urlFragmentEscaper(){
return UrlEscapers.urlFragmentEscaper();
}
public static com.google.common.escape.Escaper urlPathSegmentEscaper(){
return UrlEscapers.urlPathSegmentEscaper();
}
public static com.google.common.escape.Escaper urlFormParameterEscaper(){
return UrlEscapers.urlFormParameterEscaper();
}
public static com.google.common.escape.Escaper xmlAttributeEscaper(){
return XmlEscapers.xmlAttributeEscaper();
}
public static com.google.common.escape.Escaper xmlContentEscaper(){
return XmlEscapers.xmlContentEscaper();
}
}
