# cicoding-thymeleaf
项目介绍：     
------  
cicoding-thymeleaf基于SpringBoot,目标是实现自动办公,现阶段整合springmvc + shiro + mybatis + Thymeleaf等常见框架，包含用户管理、部门管理、通知管理、日志管理等。

欢迎fork，star；

欢迎加群学习架构：   [点此加入QQ群：](https://jq.qq.com/?_wv=1027&k=5Y6g2lR) **415777345** 
           
默认管理员账号：admin  密码：111111
------
功能介绍：
------       
1.用户管理 
2.部门管理模块 
3.通知管理 
4.修改密码 
5.登陆日志 
6.操作日志 
7.便签 
8.角色管理 
9.请假 
10.假期审核 
11.代码生成       
        ★添加用户后，密码默认为111111    
        ★用户密码重置后，密码默认为111111         
        ★部门解散后，此部门用户自动设置部门为 未分配    
        ★删除角色后，之前此角色用户自动配置为 用户       
        ★可通过角色来配置要显示的菜单      
  
项目特点
------
1.项目基于SpringBoot，简化了大量的配置和Maven依赖。   
2.日志记录系统，记录用户的登陆、登出，用户执行的操作，通过@BizLog注解以及Spring中的AOP功能，记录了具体到用户的业务操作、登入登出，并且可以下载excel格式，方便查看。     
3.利用Thymeleaf使得前端html代码看起来更加清晰。     
4.通过角色管理来配置菜单，达到菜单为不同部门显示的目的，间接实现了权限的管理。   
5.创建表后，通过CicodingGenerater类可生成包括html、js、Dao、Service、Controller等代码，复制进项目可直接使用。

所用框架
------
### 前端

 1. Bootstrap
 2. jQuery
 3. jqGrid
 4. jstree
 5. SweetAlert
    

### 后端

 1. SpringBoot
 2. MyBatis Plus
 3. Spring
 4. Thymeleaf
 5. Ehcache
 6. Kaptcha
 7. Shiro
 8. Velocity

项目截图: 
![输入图片说明](https://gitee.com/uploads/images/2018/0519/093118_e5a3b1e4_591515.png "屏幕截图.png")
![输入图片说明](https://gitee.com/uploads/images/2018/0216/114003_0749aed5_591515.png "屏幕截图.png")
![输入图片说明](https://gitee.com/uploads/images/2018/0216/114049_147f5c21_591515.png "屏幕截图.png")
![输入图片说明](https://gitee.com/uploads/images/2018/0216/114117_a1a59eac_591515.png "屏幕截图.png")
![输入图片说明](https://gitee.com/uploads/images/2018/0216/114134_5be0c143_591515.png "屏幕截图.png")
![输入图片说明](https://gitee.com/uploads/images/2018/0216/114158_f792a177_591515.png "屏幕截图.png")
![输入图片说明](https://gitee.com/uploads/images/2018/0216/114223_56b6baac_591515.png "屏幕截图.png")

欢迎加群学习架构：   [点此加入QQ群：](https://jq.qq.com/?_wv=1027&k=5Y6g2lR) **415777345** 
