# javacode
## java基础

- window命令
```
dir :    列出当前目录下的文件以及文件夹
   md :   创建目录
   rd :     删除目录
   cd :    进入指定目录
   cd .. :  退回到上一级目录
   cd\:    退回到根目录
   del :    删除文件
   exit :   退出 dos 命令行
```
- java命令
``` shell
javac –version
javac Hello.java > Hello.class 编译过程
java Hello 执行程序
javadoc -d  mydoc -auther -version Hello.java

```


- java编译
```text
开发并运行一个java程序的步骤:
  1)编写java源文件, 在目录中先创建一个新的文本文件, 改名为类名.java, 编辑这个文件
  注意点 : 大小写敏感, 标点符号必须使用英文状态的, 缩进使用tab键
  2) 对源文件进行编译, 在命令行中, 以刚才的目录为当前工作目录进行编译, 命令 : javac 空格 源文件名.java,
   编译完成后会自动生成一个文件 “类名.class”
  3) 运行编译好的字节码, 还是以刚才的目录为当前工作目录执行程序, 命令 : java 类名
```

- java注释
```text
单行注释
格式： //注释文字 
多行注释
格式： 	/*  注释文字 */
文档注释（java特有）
格式：/**
	   	* @author  指定java程序的作者
	 	*@version  指定源文件的版本
        *@param   方法的参数说明信息
        */
注释内容可以被JDK提供的工具 javadoc 所解析，生成一套以网页文件形式体现的该程序的说明文档
```
- Java中的名称命名规范：
```text
包名：多单词组成时所有字母都小写：xxxyyyzzz
类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ
```

![1636033964283](C:\Users\wanghui\AppData\Roaming\Typora\typora-user-images\1636033964283.png)

- 数据类型长度

| **类  型** | **占用存储空间** | **数据范围**           |
| ---------- | ---------------- | ---------------------- |
| byte       | 1字节=8bit       | -128 ~ 127             |
| short      | 2字节            | -215 ~215-1            |
| int        | 4字节            | -231 ~ 231-1           |
| long       | 8字节            | -263 ~ 263-1           |
| float      | 4字节            | -3.403E38 ~ 3.403E38   |
| double     | 8字节            | -1.798E308 ~ 1.798E308 |
| char       | 2字节            |                        |
| boolean    | 1字节            | true和false            |
| String     |                  |                        |





