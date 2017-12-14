# taiji-work-day1214-mongodb

**MongoDB**：
基于文档的 nosql 数据库，(没有表和表之间的关联)

	show dbs显示所有数据列表
	db 显示当前数据库
	user db 使用数据库

admin，local，config这些数据库不能自定义；
mongoDB不需要先自定义字段

	ps: 文档中键值是有序的

	db.createCollection("mycoll")


链接mongodb服务（C:\opt\MongoDB\data 文件夹先建好）
	
	C:\opt\MongoDB\Server\3.2\bin>	mongod.exe --dbpath C:\opt\MongoDB\data
	
	> show dbs 显示所有数据库
	> use dbname 使用数据库(dbname),若不存在，自动创建
	> db 显示当前所在数据库
	> 
	> 



	limit();从头取数据
		db.col.find({},{"title":1,_id:0}).limit(2)
		补充说明：
		    第一个 {} 放 where 条件，为空表示返回集合中所有文档。
		    第二个 {} 指定那些列显示和不显示 （0表示不显示 1表示显示)。
	skip()；跳过多少条数据
	sort({"字段":-1}) -1为倒叙;1为正序；其他数字报错

	ensureIndex()创建索引
	explain()。hint(xxx) 索引是否执行,必须使用xxx索引
	$exists不会使用索引

管道的概念

	 $project：修改输入文档的结构。可以用来重命名、增加或删除域，也可以用于创建计算结果以及嵌套文档。
	 $match：用于过滤数据，只输出符合条件的文档。$match使用MongoDB的标准查询操作。
	 $limit：用来限制MongoDB聚合管道返回的文档数。
	 $skip：在聚合管道中跳过指定数量的文档，并返回余下的文档。
	 $unwind：将文档中的某一个数组类型字段拆分成多条，每条包含数组中的一个值。
	 $group：将集合中的文档分组，可用于统计结果。
	 $sort：将输入文档排序后输出。
	 $geoNear：输出接近某一地理位置的有序文档


	db.col.aggregate([
	{$limit:3}, 查前三条数据
	{$group:{_id:"$field",keynums:{$sum:1}}} 有field属性的有多少条数据，_id、keynums自定义
	])

