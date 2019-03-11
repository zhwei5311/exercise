package chapter8;

public class TestDerived {
	public static void main(String[] args) {
		ContainTwo c = new Derived();
		c.prints();
	}
}
//结果输出Derived.print() is running
//原因:导出类继承了基类的所有东西，没有重写的方法隐藏了起来
//其实在Derived中还隐含的有void prints()这个方法里调用了自身重写的callprint()
//当Derived调用prints()方法后，它就调用了自身重写的callprint()方法。
//导出类调用基类方法其实不是真的调用，而是调用自身继承自基类的方法，
// 只不过这个方法没重写时，内部形式与基类相同
