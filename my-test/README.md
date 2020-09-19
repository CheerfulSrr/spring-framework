# spring framework源码阅读
## 编译
1. 添加`gradle`仓库
```groovy
maven { url "https://maven.aliyun.com/repository/gradle-plugin/" }
maven { url "https://maven.aliyun.com/repository/public" }
maven { url "https://maven.aliyun.com/repository/google" }
maven { url "https://maven.aliyun.com/repository/spring" }
maven { url "https://maven.aliyun.com/repository/spring-plugin" }
maven { url "https://maven.aliyun.com/repository/grails-core" }
```
2. 修改spring-beans的最后三行为
```groovy
def deps = compileGroovy.taskDependencies.immutableValues + compileGroovy.taskDependencies.mutableValues
compileGroovy.dependsOn = deps - "compileJava"
compileKotlin.dependsOn(compileGroovy)
compileKotlin.classpath += files(compileGroovy.destinationDir)
```
3. 新建模块
   * 将新模块的`build.gradle`文件修改为`${module-name}.gradle`
   * 修改根目录下的`settings.gradle`, 在最后一行`include`后添加`include '${module-name}'`
