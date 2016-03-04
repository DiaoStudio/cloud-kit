# Cloud Kit: 云计算基础套件
*Diao Studio*

**v0.1**

## 简介
这是一个关于云计算设计模式的工具库或者说是一个基础套件。这个项目来源于微软的关于云计算设计模式的[论文集](https://msdn.microsoft.com/en-us/library/dn568099.aspx)。  
我们将把所有的论文翻译为简体中文，然后尽力实现一下里面的各个模式，并把它们打包为这个套件，以方便其他用户使用。  
我们坚信技术将改变世界，云计算亦是如此，这几篇文章写的很好，所以自身学习后也希望能学以致用。

你可以在`document`目录下看到所有文章及翻译及排版进度，然后在`cloud-common`目录下找到套件源码。套件使用Scala开发。

## Introduction
This is a utils library of cloud design patterns inspired by the idea behind [microsoft's paper](https://msdn.microsoft.com/en-us/library/dn568099.aspx) about cloud design patterns.  
We will translate all paper to simplified Chinese and try to achieve each pattern to pick up them into a library for other users.  
We believe that technology will change the world, and we love cloud :)

You can find the paper in `document` fold with each language, and find util library in `cloud-common` folder.

## Version

version is built in this format: vx.y[.z]

x: API version changed, tech stack changed.  
y: New feature/api introduced, Code architecture changed.  
z: bug fixed, small feature/improvment.

## Change Log

| Ver | Description |
| --- | --- |
| v0.1 | 建立`cloud-common`文档结构，增加Logging支持 |

## LICENSE

Copyright 2016 Diao Studio([Github](https://github.com/DiaoStudio))

Released under the MIT and GPL (version 2 or later) Licenses.
