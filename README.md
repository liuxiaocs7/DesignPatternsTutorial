## principles：
- demo1 开闭原则
- demo2 里氏替换原则
  - `before` 改进之前的代码
  - `after` 改进之后的代码
- demo3 依赖倒转原则
  - `before` 改进之前的代码：依赖于具体的实现
  - `after` 改进之后的代码：依赖于抽象
- demo4 接口隔离原则
  - `before` 改进之前的代码：一个接口中有多个方法
  - `after` 改进之后的代码：每个无关方法一个接口便于扩展
- demo5 迪米特原则
  - `before` 改进之前的代码：一个接口中有多个方法
  - `after` 改进之后的代码：每个无关方法一个接口便于扩展

## pattern:
- singleton 单例设计模式
  - demo1 单例设计模式，饿汉式，静态成员变量
  - demo2 单例设计模式，饿汉式，静态代码块
  - demo3 单例设计模式，懒汉式，线程不安全的方式
  - demo3 单例设计模式，懒汉式，线程安全的方式 方法上添加 `synchronized`
  - demo4 单例设计模式，懒汉式，线程安全的方式 双重检查锁方式 (推荐使用，注意`volatile`可见性)
  - demo5 单例设计模式，懒汉式，线程安全的方式 静态内部类方式 (推荐使用)
  - demo6 单例设计模式，饿汉式，线程安全的方式 枚举类实现 (推荐使用)
  - demo7 序列化反序列化破坏单例模式，通过`readResolve()`方法解决
  - demo8 反射破坏单例模式
  - demo9 `Runtime`实例
- factory 工厂设计模式
  - before 改进之前的代码
  - simple_factory 简单工厂
  