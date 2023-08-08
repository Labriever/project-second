<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>
<table>
        <thead>
            <tr>
                <td>순번</td>
                <td>이름</td>
                <td>전화번호</td>
                <td>주소</td>
                <td>상태</td>
                <td>비고</td>
                <td>날짜</td>
            </tr>
        </thead>
        <tbody class="table_body">

        </tbody>
        <input type="button" onclick="getJSON()" value="json 불러오는 버튼"/>
    </table>
    <script>
    	function getJSON() {
            $.ajax({
            type:"get", //get방식으로 가져오기
            url:"<%= request.getContextPath()%>/resources/json/data.json", //값을 가져올 경로
            dataType:"json", //html, xml, text, script, json, jsonp 등 다양하게 쓸 수 있음
            success: function(data){//요청 성공시 실행될 메서드
                console.log("통신성공");
                console.log(data);
                str = '<TR>'; 
                    $.each(data , function(i){
                        str += '<TD>' + data[i].no + '</TD><TD>' + data[i].name + '</TD><TD>' + data[i].tel + '</TD><TD>' + data[i].addr + '</TD>' +
                               '<TD>' + data[i].status + '</TD><TD>' + data[i].comment + '</TD><TD>'+ data[i].date + '</TD>';
                        str += '</TR>';
                    });
                $('.table_body').append(str);
            },
            error:function(){ //요청 실패시 에러 확인을 위함
                console.log("통신에러");
            }
        })
    }
        
    </script>
</body>
</html>