# Scala 笔记
- Scala版本

## Scala 算子笔记

### foldLeft

- foldLeft 第一个参数作为第一个元素
- (_+_) 函数是用于从第一个元素开始，两两进行计算(从左到右)
- 结果为  2 + 1 +6 = 3 + 6 =9

```aidl
scala> Seq(1,6).foldLeft(2)(_+_)
res11: Int = 9
```

- foldRight 第一个参数作为第一个元素
- (_+_) 函数是用于从第一个元素开始，两两进行计算(从右到左)
- 结果为  2 +6 +1 = 8 +1 =9

```aidl
scala> Seq(1,6).foldRight(2)(_+_)
res11: Int = 9
```