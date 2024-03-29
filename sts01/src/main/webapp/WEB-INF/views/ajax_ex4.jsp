<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ajax_ex4</title>
	<script src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script>
</head>

<body>
	<table border="1">
		<thead>
			<tr>
				<th>아이디</th>
				<th>나이</th>
			</tr>
		</thead>
		<tbody id="tbody"></tbody>
	</table>
	
	<script>
		$(function(){
			$.get('http://127.0.0.1:3000/json/ex4.json', function(retdata){
				var data = retdata.data;
				var len = data.list.length;
				for(var i=0; i<len; i++){
					$('#tbody').append(
						'<tr>'+
							'<td>'+data.list[i].id+'</td>'+
							'<td>'+data.list[i].age+'</td>'+
						'</tr>'
					);
				}
			},'json');	
		});
	</script>
</body>
</html>