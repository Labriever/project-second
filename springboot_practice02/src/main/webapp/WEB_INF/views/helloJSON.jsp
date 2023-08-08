<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="myForm">
<input name="ID"><br>
  <input name="password"><br>
  <input name="title"><br>
  <input name="context"><br>
  <button type="submit">Submit</button>
</form>

<script>
//Form submit 이벤트 핸들러 등록
document.getElementById("myForm").addEventListener("submit", function(event) {
  event.preventDefault(); // 폼의 기본 동작 방지

  // Form 데이터 가져오기
  var formData = new FormData(event.target); //이벤트 타겟 = myForm
  var data = {}; //배열
  formData.forEach(function(value, key) {
    data[key] = value;
  });
  console.log(data);

  // 기존 JSON 파일 읽어오기
  var xhr = new XMLHttpRequest();
  xhr.open("GET", "data.json", true);
  xhr.onreadystatechange = function() {
    if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
      var jsonData = JSON.parse(xhr.responseText);

      // 새로운 정보 추가
      jsonData.push(data);

      // JSON 파일 저장
      var jsonStr = JSON.stringify(jsonData);
      var fileBlob = new Blob([jsonStr], {type: "application/json"});
      var fileUrl = URL.createObjectURL(fileBlob);
      var downloadLink = document.createElement("a");
      downloadLink.href = fileUrl;
      downloadLink.download = "data.json";
      downloadLink.click();
    }
  };
  xhr.send();
});

</script>
</body>
</html>