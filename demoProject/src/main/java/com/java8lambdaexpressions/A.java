package com.java8lambdaexpressions;
@FunctionalInterface
public interface A {
    public void m1();
}
@FunctionalInterface
 interface B extends A
{
    public void m1();

}
