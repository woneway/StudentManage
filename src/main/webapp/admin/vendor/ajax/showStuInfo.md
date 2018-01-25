script(type='text/javascript').
  $(document).ready(function() {
  // 展示用户信息
  $('#showSInfo').DataTable( {
  "ajax": "http://localhost:8080/StudentManage/StuInfo/showStuInfo",
  "fnDrawCallback" : function(){
  this.api().column(0).nodes().each(function(cell, i) {
  cell.innerHTML =  i + 1;
  });
  },
  "columns": [
  { "data": null},
  { "data": "stuid" },
  { "data": "stuname" },
  { "data": "sex" ,
    "render": function(data){
      if(data==1)
      return "男";
      else
      return "女";
    }
  },
  { "data": "date",
  "render":function(data, type, full, meta) {
  //时间格式化
  return  moment(data).format("YYYY-MM-DD");
  }
  },
  { "data": "idnum",
    "render":function(data){
    return GetAge(data);
  }
  },
  { "data": null,
    "render": function(){
      return "<button id='editSInfo' class='btn btn-primary' type='button'><i class='fa fa-edit'></i></button>"+"&nbsp;&nbsp;"+"<button id='delSInfo' class='btn btn-danger' type='button'><i class='fa fa-trash-o'></i></button>";
    }
  }
  ]
  } );

  // 删除用户信息
  
  } );