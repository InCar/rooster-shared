# rooster-shared
![rooster-shared](https://travis-ci.org/InCar/rooster-shared.svg?branch=master)

共享类型

## 前提条件
- [JDK 1.8+](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Gradle 3.4+](http://gradle.org/gradle-download/)
```shell
# 执行以下命令检查环境
java -version
gradle --version
```

## 配置文件
中国内地用户可以把[gradle-sample.properties](https://github.com/InCar/rooster-shared/blob/master/gradle-sample.properties)复制为`gradle.properties`,以使用位于内地的阿里云镜像来提高下载速度

## 编译
```SHELL
gradle assemble
```