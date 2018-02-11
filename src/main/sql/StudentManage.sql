-- Host: localhost   Database: studentmanage
--
-- Author：woneway   Date: 2018-1-26
-- ------------------------------------------------------------------

--
-- Database structure for database `studentmanage`
--
DROP DATABASE IF EXISTS `studentmanage` ;
CREATE DATABASE `studentmanage` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;


--
-- Table structure for table `StudentInfo`
--
DROP TABLE IF EXISTS `studentmanage`.`StudentInfo`;
CREATE TABLE `studentmanage`.`StudentInfo` ( 
  `StuID` nVarchar(50) NOT NULL  COMMENT '学生学号',
  `StuName` nVarchar(50) NOT NULL COMMENT '学生姓名',
  `Profession` nvarchar(50) NOT NULL COMMENT '专业代号',
  `Date` datetime NOT NULL COMMENT '入学时间',
  `Sex` int NOT NULL COMMENT '性别',
  `IDNum` nvarchar(20) NOT NULL COMMENT '身份证号',
  `TotalScore` int NOT NULL COMMENT '总学分',
  `Note` nvarchar(100) COMMENT '其他说明',
  PRIMARY KEY (`StuID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生基本信息表';


--
-- Table structure for table `StuMarkInfo`
--
DROP TABLE IF EXISTS `studentmanage`.`StuMarkInfo`;
CREATE TABLE `studentmanage`.`StuMarkInfo` ( 
  `MarkID` nVarchar(50) NOT NULL  COMMENT '成绩编号',
  `StuID` nVarchar(50) NOT NULL COMMENT '学生学号',
  `CourseName` nVarchar(50) NOT NULL COMMENT '课程名称',
  `BaseScore` Numeric(18,2) NOT NULL COMMENT '平时成绩',
  `Testscore` Numeric(18,2) NOT NULL COMMENT '考核成绩',
  `FinalScore` Numeric(18,2) NOT NULL COMMENT '最终成绩',
  `AddDate` Datetime NOT NULL COMMENT '添加日期',
  `Note` nvarchar(100) COMMENT '其他说明',
  PRIMARY KEY (`MarkID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生成绩信息表';



--
-- Table structure for table `Profession`
--
DROP TABLE IF EXISTS `studentmanage`.`Profession`;
CREATE TABLE `studentmanage`.`Profession`(
  `ProfID` nVarchar(50) NOT NULL  COMMENT '专业编号',
  `ProfName` nVarchar(50) NOT NULL COMMENT '专业名称',
  PRIMARY KEY (`ProfID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专业信息表';    



--
-- Table structure for table `Course`
--
DROP TABLE IF EXISTS `studentmanage`.`Course`;
CREATE TABLE `studentmanage`.`Course`(
  `CourseID` nVarchar(50) NOT NULL  COMMENT '课程编号',
  `CourseName` nVarchar(50) NOT NULL COMMENT '课程名称',
  PRIMARY KEY (`CourseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程信息表';    



--
-- INSERT TABLE Profession
--
INSERT INTO `studentmanage`.`Profession` (`ProfID`, `ProfName`) VALUES 
	('PS1250001', '计算机科学与技术'), 
    ('PS1250002', '信息安全'),
    ('PS1250003', '软件工程'),
    ('PS1250004', '通信工程'),
    ('PS1250005', '自动化');

--
-- INSERT TABLE Course
--
INSERT INTO `studentmanage`.`Course` (`CourseID`, `CourseName`) VALUES 
	('CS1250001', 'C++'), 
    ('CS1250002', '计算机网络'),
    ('CS1250003', 'Java编程'),
    ('CS1250004', '数据结构'),
    ('CS1250005', '算法导论');
    
--
-- INSERT TABLE StudentInfo
--
INSERT INTO `studentmanage`.`StudentInfo`
(`StuID`,`StuName`,`Profession`,`Date`,`Sex`,`IDNum`,`TotalScore`,`Note`) VALUES 
('B14010001','戚紫君','PS1250001','2014-9-1',0,'410402199508313000',0,''),
('B14010002','朱慧娟','PS1250001','2014-9-1',0,'32100019950411165X',0,''),
('B14010003','卫欣悦','PS1250001','2014-9-1',0,'45102119951201325X',0,''),
('B14010004','赵武琴','PS1250001','2014-9-1',0,'513227199512058000',0,''),
('B14010005','钱丽红','PS1250001','2014-9-1',1,'110116199504168000',0,''),
('B14010006','褚绮菱','PS1250001','2014-9-1',1,'610922199510048000',0,''),
('B14010007','吕晓云','PS1250001','2014-9-1',1,'420922199510304000',0,''),
('B14010008','金雪','PS1250001','2014-9-1',1,'654326199501059000',0,''),
('B14010009','魏冰彤','PS1250001','2014-9-1',1,'220381199511296000',0,''),
('B14010010','沈小兰','PS1250001','2014-9-1',1,'532624199501045000',0,''),
('B14010011','魏寻南','PS1250002','2014-9-1',0,'510304199504073000',0,''),
('B14010012','冯菁','PS1250002','2014-9-1',0,'141081199511067000',0,''),
('B14010013','贲翠翠','PS1250002','2014-9-1',0,'632525199506270000',0,''),
('B14010014','华梓涵','PS1250002','2014-9-1',0,'433100199502168000',0,''),
('B14010015','卫南莲','PS1250002','2014-9-1',1,'140221199505166000',0,''),
('B14010016','姜兰燕','PS1250002','2014-9-1',1,'130984199503111000',0,''),
('B14010017','尤月','PS1250002','2014-9-1',1,'140600199512285000',0,''),
('B14010018','戚卿','PS1250002','2014-9-1',1,'511524199505101000',0,''),
('B14010019','水园','PS1250002','2014-9-1',0,'370724199509010000',0,''),
('B14010020','戚易梦','PS1250003','2014-9-1',0,'632121199510203000',0,''),
('B14010021','褚亚梅','PS1250003','2014-9-1',0,'371202199504133000',0,''),
('B14010022','郑菲','PS1250003','2014-9-1',0,'440811199510182000',0,''),
('B14010023','尤琴','PS1250003','2014-9-1',1,'45020319950323084X',0,''),
('B14010024','沈丹珍','PS1250003','2014-9-1',1,'500234199505306000',0,''),
('B14010025','周文静','PS1250003','2014-9-1',1,'42030019950716801X',0,''),
('B14010026','何之山','PS1250003','2014-9-1',1,'371625199505146000',0,''),
('B14010027','赵胜英','PS1250003','2014-9-1',1,'421100199501312000',0,''),
('B14010028','施姚','PS1250003','2014-9-1',1,'330212199502261000',0,''),
('B14010029','冯庆黎','PS1250003','2014-9-1',0,'370830199512178000',0,''),
('B14010030','许景玉','PS1250003','2014-9-1',0,'411602199508201000',0,''),
('B14010031','安山柳','PS1250004','2014-9-1',0,'411600199502131000',0,''),
('B14010032','李丽','PS1250004','2014-9-1',0,'130131199507039000',0,''),
('B14010033','金梦','PS1250004','2014-9-1',1,'431230199508274000',0,''),
('B14010034','钱松','PS1250004','2014-9-1',1,'500107199510284000',0,''),
('B14010035','花霄','PS1250004','2014-9-1',1,'320103199508166000',0,''),
('B14010036','蒋霄','PS1250004','2014-9-1',1,'371525199506042000',0,''),
('B14010037','华光兰','PS1250004','2014-9-1',1,'210882199511295000',0,''),
('B14010038','秦琦','PS1250004','2014-9-1',1,'35082119950904752X',0,''),
('B14010039','潘静雯','PS1250004','2014-9-1',0,'350304199508260000',0,''),
('B14010040','章世兰','PS1250004','2014-9-1',0,'511425199503128000',0,''),
('B14010041','戚亚梅','PS1250004','2014-9-1',0,'420822199510258000',0,''),
('B14010042','王念念','PS1250005','2014-9-1',0,'130600199506116000',0,''),
('B14010043','吕小珍','PS1250005','2014-9-1',1,'320831199503013000',0,''),
('B14010044','戚彩艳','PS1250005','2014-9-1',1,'654225199505169000',0,''),
('B14010045','伏珊','PS1250005','2014-9-1',1,'130404199504264000',0,''),
('B14010046','严雨祺','PS1250005','2014-9-1',1,'530112199501083000',0,''),
('B14010047','许子鑫','PS1250005','2014-9-1',1,'44132319951016609X',0,''),
('B14010048','许溶艳','PS1250005','2014-9-1',1,'22030319951125668X',0,''),
('B14010049','何明珠','PS1250005','2014-9-1',1,'130929199510097000',0,''),
('B14010050','孔倩','PS1250005','2014-9-1',1,'320703199508154000',0,''),
('B15010001','沈婷','PS1250001','2015-9-1',1,'220221199503037000',0,''),
('B15010002','尹梦','PS1250001','2015-9-1',1,'433100199504129000',0,''),
('B15010003','冯丽','PS1250001','2015-9-1',1,'130630199503023000',0,''),
('B15010004','朱沛文','PS1250001','2015-9-1',1,'533100199509284000',0,''),
('B15010005','孔睿婕','PS1250001','2015-9-1',1,'441623199506213000',0,''),
('B15010006','鲍亚梅','PS1250001','2015-9-1',1,'35080219950414791X',0,''),
('B15010007','尤子鑫','PS1250001','2015-9-1',1,'542430199511195000',0,''),
('B15010008','沈纨','PS1250001','2015-9-1',0,'410381199502058000',0,''),
('B15010009','郑枫','PS1250001','2015-9-1',0,'431221199504062000',0,''),
('B15010010','陶胜英','PS1250001','2015-9-1',0,'131100199512168000',0,''),
('B15010011','蒋玉晶','PS1250001','2015-9-1',0,'360782199506281000',0,''),
('B15010012','云锦','PS1250001','2015-9-1',0,'131000199510109000',0,''),
('B15010013','彭娜','PS1250002','2015-9-1',0,'350783199506283000',0,''),
('B15010014','陈梅香','PS1250002','2015-9-1',0,'610632199507153000',0,''),
('B15010015','韩银姣','PS1250002','2015-9-1',0,'610429199511157000',0,''),
('B15010016','赵媛元','PS1250002','2015-9-1',1,'441781199507021000',0,''),
('B15010017','越玉晶','PS1250002','2015-9-1',1,'360425199512125000',0,''),
('B15010018','魏苑','PS1250002','2015-9-1',1,'640181199510308000',0,''),
('B15010019','戚倩倩','PS1250002','2015-9-1',1,'653127199507208000',0,''),
('B15010020','金丽红','PS1250002','2015-9-1',1,'522325199503181000',0,''),
('B15010021','陶莉','PS1250002','2015-9-1',1,'340802199501280000',0,''),
('B15010022','朱宛海','PS1250002','2015-9-1',1,'510626199509081000',0,''),
('B15010023','杨荔','PS1250003','2015-9-1',1,'511421199512203000',0,''),
('B15010024','尤夏雪','PS1250003','2015-9-1',1,'330600199503101000',0,''),
('B15010025','华孝洁','PS1250003','2015-9-1',1,'211224199507286000',0,''),
('B15010026','陈德群','PS1250003','2015-9-1',1,'140581199506167000',0,''),
('B15010027','陈寻南','PS1250003','2015-9-1',1,'441702199502034000',0,''),
('B15010028','陶念梅','PS1250003','2015-9-1',0,'632123199503129000',0,''),
('B15010029','李火英','PS1250003','2015-9-1',0,'42120019950830711X',0,''),
('B15010030','秦瑞','PS1250003','2015-9-1',0,'445122199509277000',0,''),
('B15010031','华朱娇','PS1250003','2015-9-1',0,'53332119950614880X',0,''),
('B15010032','秦大芬','PS1250003','2015-9-1',0,'230713199508204000',0,''),
('B15010033','杨安琪','PS1250003','2015-9-1',0,'130283199502098000',0,''),
('B15010034','钱章洪','PS1250003','2015-9-1',0,'330109199511085000',0,''),
('B15010035','蒋灵竹','PS1250003','2015-9-1',0,'61092719950915674X',0,''),
('B15010036','魏睿婕','PS1250004','2015-9-1',1,'610303199506160000',0,''),
('B15010037','蒋元珊','PS1250004','2015-9-1',1,'422825199501040000',0,''),
('B15010038','曹良翠','PS1250004','2015-9-1',1,'331122199512230000',0,''),
('B15010039','张缘双','PS1250004','2015-9-1',1,'533324199506305000',0,''),
('B15010040','施醉薇','PS1250004','2015-9-1',1,'360102199510185000',0,''),
('B15010041','蒋冬灵','PS1250005','2015-9-1',1,'411724199510015000',0,''),
('B15010042','滕庆黎','PS1250005','2015-9-1',1,'320324199506097000',0,''),
('B15010043','秦黛','PS1250005','2015-9-1',1,'210881199505168000',0,''),
('B15010044','张心敏','PS1250005','2015-9-1',1,'32010319950329622X',0,''),
('B15010045','施代云','PS1250005','2015-9-1',1,'610126199507308000',0,''),
('B15010046','陶书同','PS1250005','2015-9-1',1,'140525199504249000',0,''),
('B15010047','沃梦','PS1250005','2015-9-1',1,'451028199503085000',0,''),
('B15010048','沈茜','PS1250005','2015-9-1',0,'533123199508300000',0,''),
('B15010049','姜莺','PS1250005','2015-9-1',0,'530500199506090000',0,''),
('B15010050','陈明露','PS1250005','2015-9-1',0,'411222199505292000',0,''),
('B16010001','周粤','PS1250001','2016-9-1',0,'522326199508275000',0,''),
('B16010002','韩之柔','PS1250001','2016-9-1',0,'371426199510153000',0,''),
('B16010003','韩花长','PS1250001','2016-9-1',0,'511681199503179000',0,''),
('B16010004','尤蓉','PS1250001','2016-9-1',0,'411102199501100000',0,''),
('B16010005','张静','PS1250001','2016-9-1',0,'410727199505213000',0,''),
('B16010006','孔悦明','PS1250001','2016-9-1',1,'430611199505234000',0,''),
('B16010007','钱二丫','PS1250001','2016-9-1',1,'420324199504019000',0,''),
('B16010008','韩溶艳','PS1250001','2016-9-1',1,'510522199502022000',0,''),
('B16010009','褚花长','PS1250001','2016-9-1',1,'330521199509200000',0,''),
('B16010010','孙丽丽','PS1250001','2016-9-1',1,'420804199504282000',0,''),
('B16010011','王飘','PS1250001','2016-9-1',1,'500113199501153000',0,''),
('B16010012','赵书同','PS1250001','2016-9-1',0,'451228199509261000',0,''),
('B16010013','韦玉亭','PS1250002','2016-9-1',0,'320582199509238000',0,''),
('B16010014','何珊','PS1250002','2016-9-1',0,'231182199506271000',0,''),
('B16010015','卫黛','PS1250002','2016-9-1',0,'620104199512074000',0,''),
('B16010016','周岚','PS1250002','2016-9-1',0,'130432199511189000',0,''),
('B16010017','钱昭东','PS1250002','2016-9-1',0,'450330199512071000',0,''),
('B16010018','许柳','PS1250002','2016-9-1',0,'130622199509282000',0,''),
('B16010019','周彩艳','PS1250002','2016-9-1',0,'360825199512155000',0,''),
('B16010020','吕敏','PS1250002','2016-9-1',1,'450303199508134000',0,''),
('B16010021','何香秀','PS1250002','2016-9-1',1,'150726199512046000',0,''),
('B16010022','冯夏雪','PS1250002','2016-9-1',1,'410205199511265000',0,''),
('B16010023','王小珍','PS1250003','2016-9-1',1,'430525199501121000',0,''),
('B16010024','陈茜','PS1250003','2016-9-1',1,'230203199502106000',0,''),
('B16010025','沈光桃','PS1250003','2016-9-1',0,'511322199506193000',0,''),
('B16010026','金珊','PS1250003','2016-9-1',0,'610626199511148000',0,''),
('B16010027','陶桂花','PS1250003','2016-9-1',0,'411625199507292000',0,''),
('B16010028','蒋红萍','PS1250003','2016-9-1',0,'632823199508283000',0,''),
('B16010029','钱婷','PS1250003','2016-9-1',0,'500233199502257000',0,''),
('B16010030','严雅瑄','PS1250003','2016-9-1',0,'445281199503281000',0,''),
('B16010031','褚菲','PS1250003','2016-9-1',1,'220102199506179000',0,''),
('B16010032','凤婷','PS1250003','2016-9-1',1,'222401199507047000',0,''),
('B16010033','钱美丽','PS1250003','2016-9-1',1,'330683199503140000',0,''),
('B16010034','魏婉','PS1250003','2016-9-1',1,'430503199505187000',0,''),
('B16010035','卫嘉','PS1250003','2016-9-1',1,'421224199504272000',0,''),
('B16010036','郑春文','PS1250004','2016-9-1',0,'511700199511305000',0,''),
('B16010037','岑文涛','PS1250004','2016-9-1',0,'542127199511218000',0,''),
('B16010038','罗心菲','PS1250004','2016-9-1',0,'360313199505018000',0,''),
('B16010039','鲁傲文','PS1250004','2016-9-1',0,'450503199511020000',0,''),
('B16010040','萧程燕','PS1250004','2016-9-1',0,'150626199504049000',0,''),
('B16010041','姜天春','PS1250005','2016-9-1',0,'341124199512302000',0,''),
('B16010042','严涵菡','PS1250005','2016-9-1',0,'331181199510062000',0,''),
('B16010043','姜涛','PS1250005','2016-9-1',0,'350429199509066000',0,''),
('B16010044','韦醉薇','PS1250005','2016-9-1',0,'131121199508205000',0,''),
('B16010045','曹银姣','PS1250005','2016-9-1',1,'430521199509052000',0,''),
('B16010046','褚筠','PS1250005','2016-9-1',1,'230522199507263000',0,''),
('B16010047','褚红','PS1250005','2016-9-1',1,'45102719951004718X',0,''),
('B16010048','蒋月珍','PS1250005','2016-9-1',1,'130302199501132000',0,''),
('B16010049','华桂花','PS1250005','2016-9-1',1,'610700199502181000',0,''),
('B16010050','许丽','PS1250005','2016-9-1',1,'620521199511063000',0,'');


--
-- INSERT TABLE StuMarkInfo
--