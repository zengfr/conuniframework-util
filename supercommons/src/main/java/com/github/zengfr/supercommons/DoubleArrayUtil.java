package com.github.zengfr.supercommons;
import com.google.common.primitives.Doubles;
import org.apache.commons.math3.ml.neuralnet.MapUtils;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformUtils;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.doubles.DoubleBigArrayBigList;
import it.unimi.dsi.fastutil.doubles.DoubleBigArrays;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleArrayUtil{ 
public static double[] concat(double[]... p0){
return Doubles.concat(p0);
}
public static double[][] computeU(org.apache.commons.math3.ml.neuralnet.twod.NeuronSquareMesh2D p0,org.apache.commons.math3.ml.distance.DistanceMeasure p1){
return MapUtils.computeU(p0,p1);
}
public static org.apache.commons.math3.linear.RealMatrix createRealMatrix(double[][] p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException{
return MatrixUtils.createRealMatrix(p0);
}
public static double[][] toBlocksLayout(double[][] p0) throws org.apache.commons.math3.exception.DimensionMismatchException{
return BlockRealMatrix.toBlocksLayout(p0);
}
public static double[][] createBlocksLayout(int p0,int p1){
return BlockRealMatrix.createBlocksLayout(p0,p1);
}
public static org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution estimate(double[][] p0,int p1) throws org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException{
return MultivariateNormalMixtureExpectationMaximization.estimate(p0,p1);
}
public static double[] concatenate(double[]... p0){
return MathArrays.concatenate(p0);
}
public static void sortInPlace(double[] p0,double[]... p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NullArgumentException{
 MathArrays.sortInPlace(p0,p1);
}
public static void sortInPlace(double[] p0,OrderDirection p1,double[]... p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException{
 MathArrays.sortInPlace(p0,p1,p2);
}
public static void transformInPlace(double[][] p0,org.apache.commons.math3.transform.DftNormalization p1,org.apache.commons.math3.transform.TransformType p2){
 FastFourierTransformer.transformInPlace(p0,p1,p2);
}
public static org.apache.commons.math3.complex.Complex[] createComplexArray(double[][] p0) throws org.apache.commons.math3.exception.DimensionMismatchException{
return TransformUtils.createComplexArray(p0);
}
public static double[][] createRealImaginaryArray(org.apache.commons.math3.complex.Complex[] p0){
return TransformUtils.createRealImaginaryArray(p0);
}
public static void radixSort(double[][] p0){
 DoubleArrays.radixSort(p0);
}
public static void radixSort(double[][] p0,int p1,int p2){
 DoubleArrays.radixSort(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigArrayBigList wrap(double[][] p0){
return DoubleBigArrayBigList.wrap(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigArrayBigList wrap(double[][] p0,long p1){
return DoubleBigArrayBigList.wrap(p0,p1);
}
public static void add(double[][] p0,long p1,double p2){
 DoubleBigArrays.add(p0,p1,p2);
}
public static long length(double[][] p0){
return DoubleBigArrays.length(p0);
}
public static double[][] trim(double[][] p0,long p1){
return DoubleBigArrays.trim(p0,p1);
}
public static double[][] copy(double[][] p0){
return DoubleBigArrays.copy(p0);
}
public static void copy(double[][] p0,long p1,double[][] p2,long p3,long p4){
 DoubleBigArrays.copy(p0,p1,p2,p3,p4);
}
public static double[][] copy(double[][] p0,long p1,long p2){
return DoubleBigArrays.copy(p0,p1,p2);
}
public static void set(double[][] p0,long p1,double p2){
 DoubleBigArrays.set(p0,p1,p2);
}
public static double[][] wrap(double[] p0){
return DoubleBigArrays.wrap(p0);
}
public static void fill(double[][] p0,long p1,long p2,double p3){
 DoubleBigArrays.fill(p0,p1,p2,p3);
}
public static void fill(double[][] p0,double p1){
 DoubleBigArrays.fill(p0,p1);
}
public static double[][] ensureCapacity(double[][] p0,long p1,long p2){
return DoubleBigArrays.ensureCapacity(p0,p1,p2);
}
public static double[][] ensureCapacity(double[][] p0,long p1){
return DoubleBigArrays.ensureCapacity(p0,p1);
}
public static double[][] setLength(double[][] p0,long p1){
return DoubleBigArrays.setLength(p0,p1);
}
public static double[][] grow(double[][] p0,long p1,long p2){
return DoubleBigArrays.grow(p0,p1,p2);
}
public static double[][] grow(double[][] p0,long p1){
return DoubleBigArrays.grow(p0,p1);
}
public static long binarySearch(double[][] p0,long p1,long p2,double p3){
return DoubleBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(double[][] p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return DoubleBigArrays.binarySearch(p0,p1,p2);
}
public static long binarySearch(double[][] p0,long p1,long p2,double p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(double[][] p0,double p1){
return DoubleBigArrays.binarySearch(p0,p1);
}
public static double[][] shuffle(double[][] p0,long p1,long p2,java.util.Random p3){
return DoubleBigArrays.shuffle(p0,p1,p2,p3);
}
public static double[][] shuffle(double[][] p0,java.util.Random p1){
return DoubleBigArrays.shuffle(p0,p1);
}
public static void swap(double[][] p0,long p1,long p2){
 DoubleBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(double[][] p0,long p1,long p2){
 DoubleBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(double[][] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
 DoubleBigArrays.quickSort(p0,p1);
}
public static void quickSort(double[][] p0,long p1,long p2){
 DoubleBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(double[][] p0){
 DoubleBigArrays.quickSort(p0);
}
public static void quickSort(double[][] p0,long p1,long p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleBigArrays.quickSort(p0,p1,p2,p3);
}
public static double[][] newBigArray(long p0){
return DoubleBigArrays.newBigArray(p0);
}
public static void copyToBig(double[] p0,int p1,double[][] p2,long p3,long p4){
 DoubleBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(double[][] p0,long p1,double[] p2,int p3,int p4){
 DoubleBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void mul(double[][] p0,long p1,double p2){
 DoubleBigArrays.mul(p0,p1,p2);
}
public static void decr(double[][] p0,long p1){
 DoubleBigArrays.decr(p0,p1);
}
public static void incr(double[][] p0,long p1){
 DoubleBigArrays.incr(p0,p1);
}
public static void radixSort(double[][] p0,long p1,long p2){
 DoubleBigArrays.radixSort(p0,p1,p2);
}
public static void radixSort(double[][] p0,double[][] p1,long p2,long p3){
 DoubleBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(double[][] p0,double[][] p1){
 DoubleBigArrays.radixSort(p0,p1);
}
public static void ensureOffsetLength(double[][] p0,long p1,long p2){
 DoubleBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static long loadDoubles(java.io.File p0,double[][] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static long loadDoubles(java.io.DataInput p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.io.DataInput p0,double[][] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static long loadDoubles(java.io.File p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.lang.CharSequence p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.lang.CharSequence p0,double[][] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static double[][] loadDoublesBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadDoublesBig(p0);
}
public static double[][] loadDoublesBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadDoublesBig(p0);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.io.BufferedReader p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.io.BufferedReader p0,double[][] p1) throws java.io.IOException{
return TextIO.loadDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,java.io.PrintStream p1){
 TextIO.storeDoubles(p0,p1);
}
}
