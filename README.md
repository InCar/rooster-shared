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

## 上传到maven仓库
```SHELL
gradle uploadArchives
```

## 各个子项目，请按需求进行依赖引用

### rooster-shared-all 总项目，打包后包含以下五个项目代码
### rooster-shared-common 内部公共项目
### rooster-shared-bigtable-api bigtable操作api接口
### rooster-shared-dataparser-api 协议解析器api接口
### rooster-shared-mq-api 消息队列操作api接口
### rooster-shared-remotecmd-api 远程命令操作api接口


