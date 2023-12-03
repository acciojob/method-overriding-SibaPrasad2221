package com.driver;

public class Main {
  public static void main(String[] args){
      A obj = new B();
      System.out.println(obj.meth());
  }
}

class A{

    A(){

    }
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{

    B(){

    }
    @Override
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}