package com.frace.thinking.ninthChapter;

/**
 * Created by frace on 2019/11/18 14:42
 */
class A {
    interface B {
        void f();
    }

    public class BImp implements B {
        @Override
        public void f() {
            System.out.println("A BImp f()");
        }
    }

    public class BImp2 implements B {
        @Override
        public void f() {
            System.out.println("A BImp2 f()");
        }
    }

    public interface C {
        void f();
    }

    public class CImp implements C {
        @Override
        public void f() {
            System.out.println("A CImp f()");
        }
    }

    private interface D {
        void f();
    }

    public class DImp implements D {
        @Override
        public void f() {
            System.out.println("A DImp f()");
        }
    }

    public class DImpl2 implements D {
        @Override
        public void f() {
            System.out.println("A DImpl2 f()");
        }
    }

    public D getD() {
        return new DImpl2();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }

    public interface H {
        void f();
    }

    void g();
//     private interface I{}//嵌套接口中的接口不能为private
}

public class NestingInterfaces {
    public class BImp implements A.B {

        @Override
        public void f() {
            System.out.println("BImp BImp f()");
        }

        class CImp implements A.C {
            @Override
            public void f() {
                System.out.println("BImp CImp f()");
            }
        }

        //    class DImpl implements A.D{}//除了在该接口的定义类内，无法实现私有接口
        class EImp implements E {
            @Override
            public void g() {
                System.out.println("BImp EImp g()");
            }
        }
        class EImp2 implements E.G{
            @Override
            public void f() {
                System.out.println("BImp EImp2 f()");
            }
        }
        class EImpl2 implements E{
            @Override
            public void g() {
                System.out.println("BImp EImpl2 g()");
            }
            class EG implements E.G{
                @Override
                public void f() {
                    System.out.println("BImp EImpl2 EG");
                }
            }
        }

    }

    public static void main(String[] args) {
        A a=new A();
//        A.D ad =a.getD();
//        A.DImp2 di2=a.getD();
//        a.getD().f();
        A a2=new A();
        a2.receiveD(a.getD());
    }
}