package com.loda.myImplicits

/**
 * 隐式参数-手动导入
 */
object ImplicitDemo03 {
	// 定义一个 show 方法，实现将传入的值使用指定的前缀字符串和后缀字符串进行包裹
	def show(name: String)(implicit delimit: (String, String)): String = delimit._1 + name + delimit._2

	// 在`object`单例对象中使用隐式参数定义分隔符
	object ImplicitDemo {
		implicit val delimit_default: (String, String) = ("【" -> "】")
	}

	def main(args: Array[String]): Unit = {
		// 手动导入隐式参数
		import ImplicitDemo.delimit_default
		// 当需要用到隐式参数时，程序会自动调用
		println(show("张三"))
		// 也可以正常调用
		println(show("李四")("[", "]"))
	}
}