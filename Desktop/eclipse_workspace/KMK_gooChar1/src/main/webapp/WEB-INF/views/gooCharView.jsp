<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
	<!-- 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!-- 부가적인 테마 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<!-- css -->
	<link rel="stylesheet" type="text/css" href="/resources/css/gc.css">
	
    
    <script>
    	function search(){
    		//var searchForm = $("#searchForm").serialize();
    		//alert(searchForm);
    		//var rollUp = $('input[name=rollUp]').val();
    		
    		var aaa = "qweasd";
    		var area = $('#area').val();
  			var rollUp = $(":input:radio[name=rollUp]:checked").val();
  			var rollUpOrder = $(":input:radio[name=rollUpOrder]:checked").val();
  			var gbg = $('#gbg').val();
  			
  			var areaOrder_seoul = $('input[name=areaOrder_seoul]').val();
  			var areaOrder_busan = $('input[name=areaOrder_busan]').val();
  			var areaOrder_gwangju = $('input[name=areaOrder_gwangju]').val();
  			var areaOrder_daejeon = $('input[name=areaOrder_daejeon]').val();
  			var areaOrder_gangwon = $('input[name=areaOrder_gangwon]').val();
  			var areaOrder_pyeongtaek = $('input[name=areaOrder_pyeongtaek]').val();
  			var areaOrder_incheon = $('input[name=areaOrder_incheon]').val();
  			var areaOrder_asan = $('input[name=areaOrder_asan]').val();
  			var areaOrder_anyang = $('input[name=areaOrder_anyang]').val();
  			var areaOrder_paju = $('input[name=areaOrder_paju]').val();
  			
  			
  			console.log("area : " + area);
  			console.log("rollUp : " + rollUp);
  			console.log("rollUpOrder : " + rollUpOrder);
  			console.log("gbg : " + gbg);
  			console.log("areaOrder_seoul : " + areaOrder_seoul);
  			console.log("areaOrder_busan : " + areaOrder_busan);
  			console.log("areaOrder_gwangju : " + areaOrder_gwangju);
  			console.log("areaOrder_daejeon : " + areaOrder_daejeon);
  			console.log("areaOrder_gangwon : " + areaOrder_gangwon);
  			console.log("areaOrder_pyeongtaek : " + areaOrder_pyeongtaek);
  			console.log("areaOrder_incheon : " + areaOrder_incheon);
  			console.log("areaOrder_asan : " + areaOrder_asan);
  			console.log("areaOrder_anyang : " + areaOrder_anyang);
  			console.log("areaOrder_paju : " + areaOrder_paju);
  			console.log("-------------");
  			
    		$.ajax({
    			type : 'post',
    			url : '/search/aj',
    			data : JSON.stringify({area : area, rollUp : rollUp, rollUpOrder : rollUpOrder,
    				gbg : gbg, areaOrder_seoul : areaOrder_seoul, areaOrder_busan : areaOrder_busan,
    				areaOrder_gwangju : areaOrder_gwangju, areaOrder_daejeon : areaOrder_daejeon,
    				areaOrder_gangwon : areaOrder_gangwon, areaOrder_pyeongtaek : areaOrder_pyeongtaek,
    				areaOrder_incheon : areaOrder_incheon, areaOrder_asan : areaOrder_asan, areaOrder_anyang : areaOrder_anyang,
    				areaOrder_paju : areaOrder_paju}),
    			dataType : "json",
    			contentType : "application/json",
    			success : function(result){
    				var list = result;
    				
    			}
    		});
    	}
    </script>
	
	<title>GOOGLE CHART</title>
</head>
<body>
	<center><font size="9em">GOOGLE CHART</font></center>
	<hr align="center" style="border: solid 2px; width: 90%;">
	
	<form id = "searchForm">
		
		<div class="btn-group area">
			<select id="area" name="area" class="btn btn-default dropdown-toggle">
				<option value="">전체</option>
				<option value="10">서울</option>
				<option value="20">부산</option>
				<option value="30">광주</option>
				<option value="40">대전</option>
				<option value="50">강원</option>
				<option value="60">평택</option>
				<option value="70">인천</option>
				<option value="80">아산</option>
				<option value="90">안양</option>
				<option value="95">파주</option>
			</select>
		</div>
		
		<div class="radioRollUp">
			<input type="radio" name="rollUp" value="all" checked = "checked">전체
			<input type="radio" name="rollUp" value="data">DATA
			<input type="radio" name="rollUp" value="median">중간총계
			<input type="radio" name="rollUp" value="total">총계
		</div>
		
		<div class="areaNum">
			서울<input type ="text" name="areaOrder_seoul" style="width:30px;">
			부산<input type ="text" name="areaOrder_busan" style="width:30px;">
			광주<input type ="text" name="areaOrder_gwangju" style="width:30px;">
			대전<input type ="text" name="areaOrder_daejeon" style="width:30px;">
			강원<input type ="text" name="areaOrder_gangwon" style="width:30px;">
			<br>
			평택<input type ="text" name="areaOrder_pyeongtaek" style="width:30px;">
			인천<input type ="text" name="areaOrder_incheon" style="width:30px;">
			아산<input type ="text" name="areaOrder_asan" style="width:30px;">
			안양<input type ="text" name="areaOrder_anyang" style="width:30px;">
			파주<input type ="text" name="areaOrder_paju" style="width:30px;">
		</div><br>
		
		<div class="order">
			<input type="radio" name="rollUpOrder" value="F" checked = "checked" > DATA 우선
			<br>
			<input type="radio" name="rollUpOrder" value="a"> 총계 우선
		</div>
		
		<div class = "many">
			건수 <input type="text" id="gbg" name="gbg" style="width:90px;">
		</div>
		
		<input type="button" value="검색" class="btn btn-default searchBtn"
		onclick="search();">
		
	</form><br><br><br><br>
 
 	<hr align="center" style="border: solid 1px; width: 100%;">
 	<div class= "proxyTime"> 경과시간 : <span class="proxySec">23 Sec</span> </div> <br>
 	
 	<div id="chart">
 		<table align="center" border="1" width="1300">
 			<tr bgcolor= #E2E2E2>
 				<td align="center" width="5%">NM</td>
 				<td align="center" width="5%">REGION</td>
 				<td align="center" width="10%">안마기</td>
 				<td align="center" width="10%">냉장고</td>
 				<td align="center" width="10%">TV</td>
 				<td align="center" width="10%">세탁기</td>
 				<td align="center" width="10%">김치냉장고</td>
 				<td align="center" width="10%">오디오</td>
 				<td align="center" width="10%">청소기</td>
 				<td align="center" width="10%">전자렌지</td>
 				<td align="center" width="10%">가스렌지</td>
 			</tr>
 			<c:forEach items="${list}" var = "list">
 			<tr>
 				<td align="center" ><c:out value="${list.area_cd}" /></td>
				<td align="center" ><c:out value="${list.region_area}" /></td>
				<td align="center" ><c:out value="${list.p0}" /></td>
				<td align="center" ><c:out value="${list.p1}" /></td>
				<td align="center" ><c:out value="${list.p2}" /></td>
				<td align="center" ><c:out value="${list.p3}" /></td>
				<td align="center" ><c:out value="${list.p4}" /></td>
				<td align="center" ><c:out value="${list.p5}" /></td>
				<td align="center" ><c:out value="${list.p6}" /></td>
				<td align="center" ><c:out value="${list.p7}" /></td>
				<td align="center" ><c:out value="${list.p8}" /></td>
			</tr>
			</c:forEach>
 			
 		</table>
 	</div>
 	
</body>
</html>